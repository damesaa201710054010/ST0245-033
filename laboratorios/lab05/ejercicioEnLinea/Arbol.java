import java.util.Scanner;
/**
 *
 * @author Kevin Parra, Daniel Mesa
 */
public class Arbol {

    class Node {

        public int data;
        public Node left;
        public Node right;

        public Node(int n) {
            this.data = n;
        }
    }
    
    Node root;
    
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

    private void posOrden(Node node) {
	if (node == null) {
        }else {
	    posOrden(node.left);
	    posOrden(node.right);
	    System.out.println(node.data);
	    
	}
    }

    public void posOrden() {
	posOrden(root);
    }

    public static void main(String[] args)
    {
	Arbol arbol = new Arbol();
	Scanner in = new Scanner(System.in);
	int  numero = in.nextInt();
	while(numero >= 0)
	    {
		arbol.insert(numero);
		numero = in.nextInt();
	    }
	arbol.posOrden();
    }   
}
