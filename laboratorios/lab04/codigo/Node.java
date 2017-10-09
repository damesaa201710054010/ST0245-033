/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

/**
 * Clase nodo para una lista simplemente enlazada.
 * @author evinracher
 */
public class Node {

    public int data;
    public Node next;
/**
 * Método constructor, pone por defecto el nodo siguiente (next) con valor de
 * null.
 * @param data El valor que almacenará el nodo
 */
    public Node(int data) {
        next = null;
        this.data = data;
    }

}
