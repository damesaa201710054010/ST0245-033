package Laboratorio1;
import java.util.*;//importamos la libreria Util para random y tomar tiempos 

/**
 * Laboratorio 1 de Estructuras de Datos 1. 
 * Esta clase contiene los algoritmos recursivos para, la suma de los 
 * elementos de un arreglo, buscar el valor maximo en un arreglo y calcular la serie
 * de fibonacci, asi como los metodos para calcular el tiempo en milisegundos de cada uno de ellos. 
 * 
 * @author Los algoritmos ArraySum, ArrayMax, Fibonacci fueron tomados del github proporcionado por el preoferor
 * Toro, M (2017) Labpratorio 4 de Estrusturas de Datos (Version 1.0) 
 * [https://github.com/mauriciotoro/ST0245-Eafit/tree/master/laboratorios/lab01/codigo/Java/Laboratory4].
 * @author: Kevin Arley Parra Henao - 201710093010, Daniel Alejandro Mesa Arango - 201710054010 
 * @version: 2.0 3/09/2017
 */
public class Laboratorio1
{
  /**
   * Este metodo calcula la suma de los elementos del arreglo.
   * @param A Recibe un arreglo de tamaño n
   * @param n es el tamaño del arreglo
   * @return un entero, el cual corresponde a la suma recursiva de todos los elementos del arreglo
   */
  public static int ArraySum(int[] A, int n)
  {          
      int sum;
      if (n == 0)
        sum = A[0];
      else 
        sum = A[n] + ArraySum(A,n-1);
      return sum;
  }
  
  /**
   * Este metodo busca el entero mas grande entre todos los elementos del arreglo
   * @param A el arreglo de tamaño n que se recibe
   * @param n la longitud o tamaño del arreglo
   * @return retorna un entero, el cual es el elemento mas grande en el arreglo
   */
  
  public static int ArrayMax(int[] A, int n)
  {
      int max;
      if (n == 0)
        max = A[0];
      else
        max = Math.max(A[n],ArrayMax(A, n-1));
      return max;
  }
  /**
   * Este metodo calcula la serie de fibonacci hasta un numero dado
   * @param n representa el numero para el cual se quiere calcular la serie
   * @return devuelve el resultado de la serie de fibonacci, el valor del enésimo termino
   */
  public static int Fibonnacci(int n)
  {
     int result;
     if (n == 0 || n == 1)
       result = n;
     else
       result = Fibonnacci(n-1) + Fibonnacci(n-2);
     return result;
  }
  
  /**
   * Genera arregos con numeros aleatorios
   * @param n es el tamaño del arreglo deseado, cada posicion la llena con un numero aleatorio
   * @return retorna un arrelgo con elementos aleatorios
   */
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
  
  /**
   * Toma los tiempos para el algortimo de fibonacci, cuanto se demora para calcular 
   * el termino enésimo ingresado y ademas imprime el valor del termino calculado
   * @param n es el termino enésimo para el cual se quiere calcular la serie o saber cual es
   * @return retorna el tiempo que se demora en cacular la serie para el termino dado
   */
   public static long tomarTiempoFibo(int n) 
   {
        //int[] a = generarArregloDeTamanoN(n);
        long startTime = System.currentTimeMillis();
        System.out.println("Valor de Fibo: "+Fibonnacci(n));
        long estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
   }
   
   /**
    * Toma los tiempos para el algotimo de ArraySum, cuanto se demora en sumar todos los elementos
    * de un arreglo de tamaño de n, ademas imprime el valor de la suma
    * @param n es el tamaño del arreglo, esta funcion llama a otra que genera un arreglo de tamaño n
    * @return retorna el tiempo de ejecucion, cuanto tiempo tomo en sumar todos los elementos del arreglo, el 
    * teimpo lo retorna en milisegundos
    */
   public static long tomarTiempoSum(int n) 
   {
        int[] a = generarArregloDeTamanoN(n);
        long startTime = System.currentTimeMillis();
        System.out.println("Valor de la suma: "+ArraySum(a, n-1));
        long estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
   }
   
   /**
    * Toma el tiempo que se demora el algoritmo ArrayMax en buscar el elemento mas grande en un arreglo
    * llama tambien a la funcion de generar arreglo para despues pasarlo al ArrayMax y calcular el tiempo de ejecucion
    * @param n es el tamaño del arreglo generado
    * @return retorna un long con el tiempo de ejecucion en milisegundos
    */
   public static long tomarTiempoMax(int n) 
   {
        int[] a = generarArregloDeTamanoN(n);
        long startTime = System.currentTimeMillis();
        System.out.println("Valor Maximo: "+ArrayMax(a, n-1));
        long estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
   }
  
   /**
    * Metodo principal, que imprime los resultados para cuatro valores de los algoritmos
    * Fibonacci, ArraySum, ArrayMax, y los tiempos que tomo para los cuatro valores calculados
    * @param args 
    */
  public static void main(String[] args)
  {
      for(int i = 30; i <= 45; i = i + 5)
      {
        System.out.println("Tiempo en milisegundos para i = "+i+": " + tomarTiempoFibo(i));
      }
      
      /*for(int i = 500000; i <= 62500000; i = i*5)
      {
        System.out.println("Tiempo para i = "+i+": " + tomarTiempoSum(i));
      }*/
      
      /*for(int i = 500000; i <= 62500000; i = i*5)
      {
        System.out.println("Tiempo para i = "+i+": "+tomarTiempoMax(i));
      }*/
  }
}
