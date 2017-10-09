/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller11;

/**
 *
 * @author Kevin Parra, Daniel Mesa
 */
public class Taller11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinarySearchTree arbol = new BinarySearchTree();
        arbol.insert(1);
        arbol.insert(2);
        arbol.insert(6);
        arbol.insert(4);
        arbol.insert(3);
        arbol.insert(7);
        arbol.search(1);
        arbol.delete(6);
        arbol.recursivePrint();

    }

}
