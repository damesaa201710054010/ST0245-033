/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardcorefp;

/**
 *
 * @author evinracher
 */
public class index {
    
    public static void main(String[] args) {
        consola Probando = new consola();  
        try {
            Probando.consola();
        } catch (Exception e) {
            System.out.println("Falló");
        }
    }
}
