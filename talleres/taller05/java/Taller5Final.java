/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller5;

import java.util.Random;

/**
 *
 * @author danys
 */
public class Taller5
{
    public static boolean groupSum(int start, int[] nums, int target) 
    {
        if (start >= nums.length) return target == 0;
        return groupSum(start + 1, nums, target - nums[start]) || groupSum(start + 1, nums, target);
    }

    // Computes the maximum value of an array recursively
    public static int ArrayMax(int[] A, int n)
    {
        int max;
        if (n == 0)
            max = A[0];
        else
            max = Math.max(A[n],ArrayMax(A, n-1));
        return max;
    }
  
    // Computes Fibonnacci series recursively
    public static int Fibonnacci(int n)
    {
        int result;
        if (n == 0 || n == 1)
            result = n;
        else
            result = Fibonnacci(n-1) + Fibonnacci(n-2);
        return result;
    }
  
    public static int[] generarArregloDeTamanoN(int n) 
    {
        int max = 5000;
        int[] array = new int[n];
        Random generator = new Random();
        for (int i = 0; i < n; i++) 
        {
            array[i] = generator.nextInt(max);
        }
        return array;
    }
  
    public static long tomarTiempoFibo(int n) 
    {
        //int[] a = generarArregloDeTamanoN(n);
        long startTime = System.currentTimeMillis();
        System.out.println("Valor de Fibo: "+Fibonnacci(n));
        long estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }
   
    public static long tomarTiempoGroup(int n) 
    {
        int[] a = generarArregloDeTamanoN(n);
        long startTime = System.currentTimeMillis();
        System.out.println("Valor de la suma: "+ArraySum(a, n-1));
        long estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }
   
    public static long tomarTiempoMax(int n) 
    {
        int[] a = generarArregloDeTamanoN(n);
        long startTime = System.currentTimeMillis();
        System.out.println("Valor Maximo: "+ArrayMax(a, n-1));
        long estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }
  
    public static void main(String[] args)
    {
        for(int i = 30; i <= 45; i = i + 5)
        {
            System.out.println("Tiempo en milisegundos: " + tomarTiempoFibo(i));
        }
      
        /*for(int i = 100000; i <= 10000000; i = i*10)
        {
            System.out.println("Tiempo: " + tomarTiempoSum(i));
        }*/
      
        for(int i = 100000; i <= 10000000; i = i*10)
        {
            System.out.println(tomarTiempoMax(i));
        }
      
        /*int[] A = {1,5,3,2,6};
        int[] B = {1,5,3,2};
        int[] C = {1,5,2,6};
        int [] D = {5};
        int[][] Arrays = {A,B,C,D};   
        for (int[] X : Arrays)
        {        
            System.out.println(Laboratorio1.ArraySum(X, X.length - 1) + " " + 
            Laboratorio1.ArrayMax(X, X.length -1) + " " + Laboratorio1.Fibonnacci(X.length) +  "\n" );      
        }*/
    }
}
