package laboratorio4;

/**
 * Una lista simplemente enlazada.
 * @author Kevin Parra Ft Daniel Mesa
 */
public class SinEllasList {

    private Node first;
    private int size;
/**
 * Método constructor, inicializa la lista con un tamaño (size) de cero y el 
 * primer (first) nodo con valor de null.
 */
    public SinEllasList() {
        size = 0;
        first = null;
    }

    /**
     * Retorna un nodo de una posición específica en la lista.
     * 
     * @param index índice del nodo a retornar
     * @return el nodo en la posición específica
     * @throws IndexOutOfBoundsException
     */
    private Node getNode(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            Node temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Retorna el valor de una posición específica en la lista.
     *
     * @param index índice del nodo donde esta el valor a retornar
     * @return el valor en la posción específico en la lista
     */
    public int get(int index) {
        Node temp = null;
        try {
            temp = getNode(index);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        return temp.data;
    }

    /**
     * Retorna el valor en la última posición de la lista.
     *
     * @return el valor en la última posición de la lista
     */
    public int getLast() {
        return get(size - 1);
    }

    /**
     * Retorna el tamaño (número de elementos) de la lista
     * 
     * @return el tamaño de la lista
     */
    public int size() {
        return size;
    }

    /**
     * Inserta un valor en una posición específica de la lista
     * 
     * @param data valor a insertar
     * @param index posición en la cual se quiere insertar
     * @return true, si se realizó con éxito; false, si hubo error
     */
    public boolean insert(int data, int index) {
        try {
            if (index == 0) {
                Node nuevo = new Node(data);
                if (first != null) {
                    nuevo.next = first;
                    first = nuevo;
                    size++; 
                } else {
                    first = nuevo;
                    size++;
                }
                return true;
            } else if (index == size) {
                Node nuevo = new Node(data);
                Node temp = getNode(index);
                temp.next = nuevo;
                size++;
                return true;
            } else if (index != 0) {
                Node temp = getNode(index - 1);
                Node nuevo = new Node(data);
                nuevo.next = temp.next;
                temp.next = nuevo;
                size++;
                return true;
            }

        } catch (IndexOutOfBoundsException e) {
            return false;
        }
        return false;
    }
    /**
     * Borra el último elemento
     * @return true, si se realizó con éxito; false, si hubo error
     */
    public boolean removeLast() {
        return remove(size);
    }
    
    /**
     * Inserta un valor en la última posición
     * @param data el valor a insertar
     * @return true, si se realizó con éxito; false, si hubo error
     */
    public boolean insertLast(int data) {
        return insert(data, size);
    }


    /**
     * Borra un valor en una posición específica de la lista.
     * 
     * @param index posición del valor a eliminar
     * @return true, si se realizó con éxito; false, si hubo error
     * @throws IndexOutOfBoundsException
     * @throws NullPointerException 
     */
    public boolean remove(int index) throws IndexOutOfBoundsException, NullPointerException {
        try {
            if (index == 0) {
                System.out.println("ENTRA");
                Node temp = first;
                if (temp.next != null) {
                    System.out.println("ENTRA");
                    first = temp.next;
                    size--;
                } else {
                    first = null;
                }
                return true;
            }
            if (index == size) {
                Node temp = getNode(index - 1);
                temp = null;
                size--;
                return true;
            } else {
                Node temp = getNode(index - 1);
                temp.next = temp.next.next;
                size--;
                return true;
            }
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            return false;
        }
    }

    /**
     * Verifica un valor está en la lista
     * 
     * @param data el valor a verificar
     * @return true, si el valor está; false si el valor no está
     */
    public boolean contains(int data) {
        try {
            for (int i = 0; i < size; ++i) {
                if (get(i) == data) {
                    return true;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return false;
    }

}
