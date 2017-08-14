/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller4;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author danys
 */
public class Taller4 {

    public static void ArraySum(int[] Sum) {
        int c = 0;
        for (int i = 0; i < Sum.length; i++) {
            c = c + Sum[i];
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {
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
    
    public static void imprimirTablasDeMultiplicar(int n)
    {
        for (int i = 0; i <= n; i++)
        {
            for (int j = 0; j <= n; j++)
            {
                System.out.println(i+ " * " + j + " = " + i*j) ;
                /*try 
                {
                TimeUnit.SECONDS.sleep(1);
                } catch (Exception e) 
                {
                }*/
            }
        }
        

    }

    public static long tomarTiempo(int n) {
        //int[] a = generarArregloDeTamanoN(n);
        long startTime = System.currentTimeMillis();
        //ArraySum(a);
        imprimirTablasDeMultiplicar(n);
        long estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }
    
    public static void main(String[] args) 
    {
        /*for (int i = 1; i < 10; i = i + 1) 
        {
            System.out.println(i + " " + tomarTiempo(i));
        }*/
        
        System.out.println("100 " + tomarTiempo(100));
    }
}
