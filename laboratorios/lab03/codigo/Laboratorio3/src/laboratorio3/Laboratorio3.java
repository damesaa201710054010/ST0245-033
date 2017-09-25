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
     * Busca en donde esta el equilibrio de la suma en la lista e indica en que posisicion se produce este equilibrio
     * @param l lista en la cual se buscara el pivote
     * @return la posicion de tipo entero, indica donde deberia de ir el pivote
     */
    public int pivote(List<Integer> l)
    {
        int sum = 0;
        int sum2 = 0;
        Iterator<Integer> iterador = l.iterator();
        for(int i = 0; i < l.size(); i++)
        {
            sum = sum + iterador.next();
        }
        System.out.print(sum);
        for(int j = 0; j < l.size(); j++)
        {
            sum2 = sum2 + iterador.next();
        }
        return 7;
    }  
}
