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
     * Este metodo devuelve la cantidad de orejas que tienen entre todos los
     * conejos, tomando que cada conejo tiene dos orejas
     *
     * @param bunnies El parametro bunnies define el numero de conejos
     * @return La cantidad de orejas que tienen los conejos
     */
    public int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return 2 + bunnyEars(bunnies - 1);
    }

    /**
     * Este metodo devuelve el n-esimo numero de la secuencia de fibonacci
     * @param n el n-esimo que se desea encontrar en la serie de fibonacci
     * @return el n-esimo numero de la serie de fibonacci
     */
    public int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
