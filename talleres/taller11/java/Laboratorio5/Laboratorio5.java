/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio5;


/**
 * Clase para probar el arbol
 * @author Kevin Parra
 */
public class Laboratorio5 {

    /** Clase para probar el arbol
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                BinaryTree arbol = new BinaryTree("Kevin", 1);
                arbol.insert("Kevin", "Gustavo", 1);
                arbol.insert("Kevin", "Amanda", 0);
                arbol.insert("Gustavo", "Sandra", 0);
                arbol.insert("Gustavo", "racher", 1);
                arbol.insert("Amanda", "Tomasina", 0);
                
                arbol.search("Tomasina");
                arbol.recursivePrint();
                arbol.searchForGrand();
                System.out.println("Tamaño: "+arbol.maxheight());
    }
    
}