package taller7;

public class Laboratorio3 {

    public static int maximo(LinkedListLuisa lista) {
        return maximoAux(lista.first);
    }
    
    private static int maximoAux(Node nodo) {
        if(nodo.next == null)
        {
            return nodo.data;
        }else
        {
            return maximoAux(nodo.next) < nodo.data;
        }
    }

    public static void main(String[] args) {

        LinkedListLuisa list = new LinkedListLuisa();
        list.insert(5, 0);
        list.insert(4, 0);
        list.insert(3, 0);
        list.insert(2, 0);
        list.insert(1, 0);
        maximo(list);
        
        /*for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list.contains(3));

        list.remove(4);

        System.out.println(list.contains(3));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
    }

}
