import java.util.*;
/**
 *Esta clase implementa los algoritmos de groupSum, Fibonacci y ArrayMax, todos con implementacion
 *recursiva
 *@author Kevin Arley Parra Henao, codigo: 201710093010, 
 *        Daniel Alejandro Mesa Arango Codigo: 201710054010
 *        Codigos de ArrayMax y Fibonacci tomados de los suministrados en el laboratorio 1
 *@version 28/08/2017
 * 
 */
public class Taller5final
{
    //retorna true si este encuentra algun conjunto capaz de sumar el numero solicitado
    public static boolean groupSum(int start, int [] nums, int target)
    {
	if (start >= nums.length) return target == 0;
	return groupSum(start+1, nums, target - nums[start])
	    || groupSum(start+1, nums, target);
	
    }

    //Retorna el valor maximo de los elementos del arreglo
    public static int ArrayMax(int[] A, int n)
    {
	int max;
	if (n == 0)
	    max = A[0];
	else
	    max = Math.max(A[n],ArrayMax(A, n-1));
	return max;
    }

    //Retorna el valor del Fibonacci para el valor ingresado
    public static long Fibonnacci(int n)
    {
	long result;
	if (n == 0 || n == 1)
	    result = n;
	else
	    result = Fibonnacci(n-1) + Fibonnacci(n-2);
	return result;
    }

    //Genera arreglos con valores aleatorios de tamaño n
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

    //Toma los tiempos de ejecucion para el algoritmo fibonacci
    public static long tomarTiempoFibo(int n) 
    {
        //int[] a = generarArregloDeTamanoN(n);
	long startTime = System.currentTimeMillis();
        System.out.println("Valor de Fibo: "+Fibonnacci(n));
        long estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }
    
    //Toma los tiempos de ejecucion para el algoritmo de GroupSum 
    public static long tomarTiempoGroup(int n) 
    {
	int[] a = generarArregloDeTamanoN(n);
	Random gene = new Random();
	int target = gene.nextInt(5000);
        long startTime = System.currentTimeMillis();
        System.out.println("Resultado: "+ groupSum(0, a, target));
        long estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }

    //Toma los tiempos de ejecucion para el algoritmo de buscas el maximo
    public static long tomarTiempoMax(int n) 
    {
        int[] a = generarArregloDeTamanoN(n);
	long startTime = System.currentTimeMillis();
        System.out.println("Valor Maximo: "+ ArrayMax(a, n-1));
	//ArrayMax(a, n-1);
        long estimatedTime = System.currentTimeMillis() - startTime;
        return estimatedTime;
    }

    //implementa los metodos anteriores para 10 valores
    public static void main(String[] args)
    {
	for(int i = 30; i <= 40; i++)
	    {
		System.out.println("Operacion: "+ i +" Tiempo en milisegundos: " + tomarTiempoFibo(i));
		System.out.println();
	    }

	/*for(int i = 25; i <= 35  ; i++)
	    {
		System.out.println("Tiempo: "+i+" " + tomarTiempoGroup(i));
		System.out.println();
		}*/
      
	/*for(int i = 1000000; i <= 11000000; i = i+1000000)
	    {
		System.out.println(i +" " +tomarTiempoMax(i));
		System.out.println();
		}*/
	
    }
  
}
