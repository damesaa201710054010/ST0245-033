/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laboratorio1;
/**
 * Laboratorio 4 de Estructuras de Datos 1
 * 
 * @author Mauricio Toro 
 * @version 1
 */

import java.util.Arrays;
import java.util.*;

public class Laboratorio1
{
  // Computes the sum of an array recursively
  public static int ArraySum(int[] A, int n)
  {          
      int sum;
      if (n == 0)
        sum = A[0];
      else 
        sum = A[n] + ArraySum(A,n-1);
      return sum;
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
  
   public static long tomarTiempoFibo(int n) {
        //int[] a = generarArregloDeTamanoN(n);
        long startTime = System.currentTimeMillis();
        System.out.println("Valor de Fibo: "+Fibonnacci(n));
        long estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }
  
  public static void main(String[] args)
  {
      for(int i = 20; i <= 30; i = i + 5)
      {
        System.out.println("Tiempo en milisegundos: " + tomarTiempoFibo(i));
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
