package laboratorio1;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Laboratorio1 {

    public static void main(String[] args) {
        
        for (int i = 0; i < 1; i++) {
            System.out.println( i+" " + tomarTiempo(100000));
        }
    }

    public static void arraySum(int[] Sum) {
        int c = 0;
        for (int i = 0; i < Sum.length; i++) {
            c = c + Sum[i];
            try{
           TimeUnit.MILLISECONDS.sleep(1);// delay de un milisegundo
         }
         catch(Exception e)
         {
         } 
       }
        //System.out.println(c);
    }
    
    

    public static int[] generarArregloDeTamanoN(int n) {
        int max = 5000;
        int[] array = new int[n];
        Random generator = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = generator.nextInt(max);
        }
        return array;
    }

    public static long tomarTiempo(int n) {
        int[] a = generarArregloDeTamanoN(n);
        long startTime = System.currentTimeMillis();
        arraySum(a);
        long estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }
    
    public static int[] Ordenar(int[] array) {
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j > 0; j--) {
                if(array[j-1]> array[j]){
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                }
            }
        }

        return array;
    }
}


