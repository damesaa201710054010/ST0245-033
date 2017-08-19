/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosenlinea;

/**
 * En esta clase se entregan los ejercicios realizados sobre recursion de la
 * pagina: http://codingbat.com/java
 *
 * @author Kevin Arley Parra
 * @author Daniel Mesa
 * @see <a href = "http://codingbat.com/java"> CodingBat </a>
 */
public class EjerciciosEnLinea {
    

    /**
     * @param n El parametro n define el numero al que se le realizar el 
     * factorial.
     * @return El factorial del numero n
     */
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
