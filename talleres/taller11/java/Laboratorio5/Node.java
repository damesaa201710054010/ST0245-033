package laboratorio5;

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