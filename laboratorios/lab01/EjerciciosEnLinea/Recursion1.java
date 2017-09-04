/**
 * En esta clase se entregan los ejercicios realizados sobre recursion de la
 * pagina: http://codingbat.com/java
 *
 * @author Kevin Arley Parra
 * @author Daniel Mesa
 * @see <a href = "http://codingbat.com/java"> CodingBat </a>
 */
public class Recursion1 {
    

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
     * Este metodo devuelve la cantidad de orejas que tienen entre todos los
     * conejos, tomando que para los conejos pares, estos tienen una pata
     * levantada que se toma como una oreja, es decir tienen 3 orejas, para el
     * resto son 2 orejas cada uno.
     *
     * @param bunnies El parametro bunnies define el numero de conejos
     * @return La cantidad de orejas que se tiene entre todos los conejos
     */
    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        if (bunnies % 2 == 0) {
            return bunnyEars2(bunnies - 1) + 3;
        }
        return bunnyEars2(bunnies - 1) + 2;
    }

    /**
     * Este metodo devuelve la cantidad de bloques que hay en un triangulo
     * construido como sigue: en la fila uno hay un bloque, en la fila dos hay
     * dos bloques, y asi sucesivamente
     * @param rows El número de filas que tiene el triangulo a evaluar
     * @return El número de bloques que hay en el triangulo
     */
    public int triangle(int rows) {
        if (rows == 0) {
            return 0;
        }

        if (rows == 1) {
            return 1;
        }
        return triangle(rows - 1) + rows;
    }

    /**
     * Este metodo devuelve la suma de los digitos de un número
     * @param n El número a evaluar
     * @return La suma de sus dígitos
     */
    public int sumDigits(int n) {
        if (n / 10 == 0) {
            return n;
        }
        return sumDigits(n / 10) + sumDigits(n % 10);
    }

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
