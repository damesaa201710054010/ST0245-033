package laboratorio5;

/**
 *
 * @author Kevin Parra
 */
public class BinaryTree {

    Node root;

    /**
     * Constructor del árbol familiar, requiere un primer descendiente que será
     * la raiz del árbol, es decir la persona a la cual se le hará su arbol
     * familiar
     *
     * @param descendiente Nombre de la persona para la cual será el árbol
     * familiar
     * @param sexo Sexo del descendiente
     */
    public BinaryTree(String descendiente, int sexo) {
        root = new Node(descendiente, sexo);
    }

    /**
     * Método para saber si un ancestro existe o no
     *
     * @param nombre Nombre del ancestro a buscar
     * @return true si existe; false si no existe
     */
    public boolean search(String nombre) {
        boolean respuesta = search(root, nombre);
        if (respuesta) {
            System.out.println("El ancestro existe");
        } else {
            System.out.println("El ancestro no existe");
        }
        return respuesta;
    }

    private boolean search(Node nodo, String nombre) {
        if (nodo == null) {
            return false;
        }
        if (nodo.nombre.equals(nombre)) {
            return true;
        }

        return search(nodo.left, nombre) || search(nodo.right, nombre);
    }

    private Node searchForAncestor(String nombre) {
        Node ancestro = searchForAncestorAux(root, nombre);
        if (ancestro == null) {
            System.out.println("No hay ese ancestro");
            return null;
        } else {
            return ancestro;
        }
    }

    private Node searchForAncestorAux(Node nodo, String ancestro) {
        if (nodo == null) {
            return null;
        }
        if (nodo.nombre.equals(ancestro)) {
            return nodo;
        } else if (true) {
            Node respuesta = searchForAncestorAux(nodo.left, ancestro);
            if (respuesta != null) {
                return respuesta;
            }
        }

        return searchForAncestorAux(nodo.right, ancestro);

    }

    /**
     * Método para insertar un ancestro, requiere saber el descendiente del
     * ancestro que se quiere insertar.
     *
     * @param descendiente Descendiente del ancestro que se quiere insertar en
     * el árbol
     * @param ancestro Nombre del ancestro que se quiere insertar
     * @param sexo Sexo del ancestro que se quiere insertar
     */
    public void insert(String descendiente, String ancestro, int sexo) {
        Node decen = searchForAncestor(descendiente);
        if (decen != null) {
            insertPrivate(decen, ancestro, sexo);
        } else {
            System.out.println("No se pudo hacer la operación");
        }
    }

    private Node insertPrivate(Node nodo, String nombre, int sexo) {

        if (sexo == 0) {
            if (nodo.right == null) {
                Node nodito = new Node(nombre, sexo);
                nodo.right = nodito;
                return nodito;
            } else {
                System.out.println("No se puede agregar el ancestro materno");
            }
        }

        if (sexo == 1) {
            if (nodo.left == null) {
                Node nodito = new Node(nombre, sexo);
                nodo.left = nodito;
                return nodito;
            } else {
                System.out.println("No se puede agregar el ancestro paterno");
            }
        }
        return null;
    }

    private void recursivePrintAUX(Node node) {
        if (node != null) {
            recursivePrintAUX(node.left);
            recursivePrintAUX(node.right);
            System.out.println(node.nombre);
        }

    }

    private void recursivePrintAUX(Node node, String msg) {
        if (node != null) {
            recursivePrintAUX(node.left, "Izquierdo:");
            recursivePrintAUX(node.right, "Derecho: ");
            System.out.println(msg + node.nombre);
        }

    }

    /**
     * Método para buscar las abuelas maternas
     */
    public void searchForGrand() {
        Node gran1 = root.left.right;
        Node gran2 = root.right.right;
        System.out.println("Abuelas: ");
        if (gran1 != null) {
            System.out.println(gran1.nombre);
        }

        if (gran2 != null) {
            System.out.println(gran2.nombre);
        }

    }

    /**
     * Método para "imprimir" el árbol
     */
    public void recursivePrint() {
        recursivePrintAUX(root, "raiz: ");
    }

    /**
     * Los siguientes métodos han sido creados por el profesor Mauricio Toro y
     * están disponibles en:
     * https://github.com/mauriciotoro/ST0245-Eafit/blob/master/laboratorios/lab05/codigo/java/Laboratorio5/src/BinaryTree.java
     */
//No borre está linea daniel
    private int max2(int i, int j) {
        if (i > j) {
            return i;
        }
        return j;
    }

    private int maxheightAUX(Node node) {
        if (node == null) {
            return 0;
        } else {
            return max2(maxheightAUX(node.left), maxheightAUX(node.right)) + 1;
        }
    }

    public int maxheight() {
        return maxheightAUX(root);
    }

   

    

    
}
