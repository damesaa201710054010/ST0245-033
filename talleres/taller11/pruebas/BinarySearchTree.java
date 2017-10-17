//package taller11;

/**
 *
 * @author Kevin Parra, Daniel Mesa
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

        if (nodo.data < n) {
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
        if (nodo.left.data == n) {
            nodo.left = null;
        }else if (nodo.right.data == n) {
            nodo.right = null;
        } else if (nodo.data < n) {
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

    private void recursivePrintAUX(Node node) {
        if (node != null) {
            recursivePrintAUX(node.left);
            recursivePrintAUX(node.right);
            System.out.println(node.data);
        }

    }

    public void recursivePrint() {
        recursivePrintAUX(root);
    }
}
