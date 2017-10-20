/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio5;

/**
 * Clase para probar el arbol
 *
 * @author Kevin Parra
 */
public class Laboratorio5 {

    /**
     * Clase para probar el arbol
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree arbol = new BinaryTree("Daniel", 1);
        arbol.insert("Daniel", "Hector", 1);
        arbol.insert("Daniel", "Adriana", 0);
        arbol.insert("Adriana", "Estella", 0);
        arbol.insert("Adriana", "Willmar", 1);
        arbol.insert("Estella", "Santiago", 0);
        arbol.search("Tomasina");
        arbol.recursivePrint();
        arbol.searchForGrand();
        System.out.println("Tamaño: " + arbol.maxheight());
        dibujarArbol(arbol);
        
    }

    /**
     * Los siguientes códigos están basados en los códigos proporcionados por el
     * profesor Mauricio Toro ye están disponibles en:
     * https://github.com/mauriciotoro/ST0245-Eafit/blob/master/talleres/taller11/java/Laboratorio5/src/Laboratorio5.java
     */
    //
    public static void dibujarArbol(BinaryTree a) {
        System.out.println("/* arbolito para http://www.webgraphviz.com/ */");
        System.out.println("digraph arbolito {");
        System.out.println("size=\"6,6\";");
        System.out.println("node [color=aquamarine, style=filled];");
        dibujarArbolAux(a.root);
        System.out.println("}");
    }

    public static void dibujarArbolAux(Node nodo) {
        if (nodo != null) //"x_\n__" -> "xo\n__";
        {
            for (Node n : new Node[]{nodo.left, nodo.right}) {
                if (n != null) {
                    System.out.println("\"" + nodo.nombre + "\" -> \"" + n.nombre + "\";");
                }
                dibujarArbolAux(n);
            }
        }
    }
}
