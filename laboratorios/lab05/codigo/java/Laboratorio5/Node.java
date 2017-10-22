//package laboratorio5;
/**
 * Esta clase define un nodo, que tendra un lado derecho otro izquierdo, ademas la informacion, como el dato que contiene y el sexo del dato que contiene
 *
 *
 *
 * @author Kevin Parra, Daniel Mesa
 */
public class Node {

        public String nombre;
        public int sexo;
        public Node left;
        public Node right;

        /**
         * Método constructor para la clase Node
         *
         * @param nombre
         * @param sexo
         */
        public Node(String nombre, int sexo) {
            this.nombre = nombre;
            this.sexo = sexo;
        }
    }
