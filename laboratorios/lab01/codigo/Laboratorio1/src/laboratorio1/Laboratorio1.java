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
import java.util.*;

public class Laboratorio1
{
  public static int ArraySum(int[] A, int n)
  {          
      int sum;
      if (n == 0)
        sum = A[0];
      else 
        sum = A[n] + ArraySum(A,n-1);
      return sum;
  }
  
  public static int ArrayMax(int[] A, int n)
  {
      int max;
      if (n == 0)
        max = A[0];
      else
        max = Math.max(A[n],ArrayMax(A, n-1));
      return max;
  }
  
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
   
   public static long tomarTiempoSum(int n) 
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
      /*for(int i = 30; i <= 45; i = i + 5)
      {
        System.out.println("Tiempo en milisegundos para i = "+i+": " + tomarTiempoFibo(i));
      }*/
      
      for(int i = 500000; i <= 62500000; i = i*5)
      {
        System.out.println("Tiempo para i = "+i+": " + tomarTiempoSum(i));
      }
      
      /*for(int i = 500000; i <= 62500000; i = i*5)
      {
        System.out.println("Tiempo para i = "+i+": "+tomarTiempoMax(i));
      }*/
  }
}
