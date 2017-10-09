package taller11;

/**
 *
 * @author Kevin Parra
 */
public class BinarySearchTree {

    class Node {

        public int data;
        public Node left;
        public Node right;

        public Node(int n) {
            this.data = n;
        }
    }

    Node root;

    public boolean search(int n) {
        return search(root, n);
    }

    private boolean search(Node nodo, int n) {
        if (nodo == null) {
            return false;
        }
        if (nodo.data == n) {
            System.out.println("ESTÁ");
            return true;
        }
        if (nodo.data < n) {
            return search(nodo.left, n);
        }
        return search(nodo.right, n);
    }

    public void insert(int n) {
        root = insertPrivate(root, n);
    }

    private Node insertPrivate(Node nodo, int n) {
        if (nodo == null) {
            Node nuevo = new Node(n);
            return nuevo;
        }

        if (nodo.data >= n) {
            Node i = insertPrivate(nodo.left, n);
            Node nodito = new Node(nodo.data);
            nodito.left = i;
            nodito.right = nodo.right;
            return nodito;
        }
        Node i = insertPrivate(nodo.right, n);
        Node nodito = new Node(nodo.data);
        nodito.right = i;
        nodito.left = nodo.left;
        return nodito;

    }

    public void delete(int n) {
        root = delete(root, n);
    }

    private Node delete(Node nodo, int n) {
        if (nodo.left != null && nodo.left.data == n) {
            System.out.println("Buscando izq: " + nodo.left.data);
            nodo.right = nodo.left.right;
            nodo.left = nodo.left.left;
            return nodo;
        }

        if (nodo.right != null && nodo.right.data == n) {
            System.out.println("Buscando der: " + nodo.right.data);
            nodo.left = nodo.right.left;
            nodo.right = nodo.right.right;
            return nodo;
        }

        if (nodo.data >= n) {
            System.out.println("Entra por: " + nodo.data);
            Node i = delete(nodo.left, n);
            Node nodito = new Node(nodo.data);
            nodito.left = i;
            nodito.right = nodo.right;
            return nodito;
        }
        System.out.println("Entra por: " + nodo.data);
        Node i = delete(nodo.right, n);
        Node nodito = new Node(nodo.data);
        nodito.right = i;
        nodito.left = nodo.left;
        return nodito;

    }

    private void recursivePrintAUX(Node node, String msg) {
        if (node != null) {
            recursivePrintAUX(node.left, "Izquierdo:");
            recursivePrintAUX(node.right, "Derecho: ");
            System.out.println(msg + node.data);
        }

    }

    public void recursivePrint() {
        recursivePrintAUX(root, "raiz: ");
    }
}
