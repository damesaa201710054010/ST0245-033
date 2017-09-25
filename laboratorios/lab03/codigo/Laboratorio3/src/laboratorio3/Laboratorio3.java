package laboratorio3;
import java.util.*;
/**
 * Laboratorio 3 de Estructuras de Datos 1. 
 * Esta clase contiene cuatro metodos, uno multiplica todos los elementos de una lista, el otro
 * realiza lo mismo pero utilizando un iterador, SmartInsert inserta un elemento en la lista pero si este no existe ya
 * en esta, y por ultimo, pivote, busca donde esta el balance en la lista e indica la posicion en donde esta
 * 
 * @author: Kevin Arley Parra Henao - Codigo: 201710093010, Daniel Alejandro Mesa Arango - Codigo: 201710054010 
 * @version: 1.0 24/09/2017
 */
public class Laboratorio3 
{
    /**
     * este metodo recorre todos los elementos de una lista y los multiplica
     * @param lista una lista que puede ser LinlkedList o ArrayList
     * @return el valor de la multiplicacion de todos los elementos de lista
     */
    public int multp(List<Integer> lista)
    {
        int mult = 1;
        for(int i = 0; i < lista.size(); i++)
        {
            mult = mult * lista.get(i);
        }
        return mult;
    }
    
    /**
     * Este metodo recorre todos los elementos de un a lista y los multiplica pero utilizando un iterador
     * @param list lista que puede ser de tipo LinkedList o ArrayList
     * @return el valor de la multiplicacion de todos sus elementos
     */
    public int multIt(List<Integer> list)
    {
        int mult=1;
        Iterator<Integer> iterador = list.iterator();
        while(iterador.hasNext())
        {
            mult = mult * iterador.next();
        }
        return mult;
    }
    
    /**
     * Este metodo solo inserta un elemento a la lista sui este no existe ya en ella
     * @param lista de tipo LlinkedList o ArrayList
     * @param data el dato a insertar en la lista
     * @return la misma lista con el nuevo dato si este no existia o solo la lista si ya existia
     */
    public List SmartInsert(List l, int data)
    {
        if(!(l.contains(data)))
        {
            l.add(data);
            return l;
        }
        return l;
    }
    
    /**
     * Busca en donde esta el equilibrio de la suma en la lista a ambos lados de una posicion especifica
     * e indica en que posisicion se produce este equilibrio
     * @param l lista en la cual se buscara el pivote
     * @return la posicion de tipo entero, indica donde deberia de ir el pivote
     */
    public int pivoteNoEf(List<Integer> l)
    {
        int sum  = 0;
        int sum2 = 0;
        int min = 0;
        int var = 0;
        int nuevoMin = 0;
        for(int i = 0; i < l.size(); i++)
        {
            for(int j = i; j < l.size()-1; j++)
            {
                sum = sum + l.get(j+1);
            }
            for(int h = i; h >= 0; h--)
            {
                if(h > 0) sum2 = sum2 + l.get(h-1);
            }
            nuevoMin = (sum>= sum2) ? sum - sum2 : sum2-sum;
            if(min < nuevoMin)
            {
                min = nuevoMin;
                var = i;
            }
        }
        return var;
    }
    
    public int pivoteEf(List<Integer> l)
    {
        int suma = 0;
        int suma2 = 0;
        int sumaActual = 0;
        int ndistancia = 0;
        int distancia = 0;
        int mejorIndice = 0;
        int sumatotal = 0;
        Iterator<Integer> iterador = l.iterator();
        while(iterador.hasNext())
        {
            suma = suma + iterador.next();
        }
        ndistancia = suma - l.get(0);
        for(int i = 1; i < l.size(); i++)
        {
            sumatotal = suma - l.get(i);
            suma2 = suma2 + l.get(i-1);
            sumaActual = sumatotal - suma2; 
            if(sumaActual > suma2)distancia = sumaActual - suma2;
            if(distancia < ndistancia)
            {
                ndistancia = distancia;
                mejorIndice = i;
            }
        }
        return mejorIndice;
    }
}
