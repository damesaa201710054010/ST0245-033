package laboratorio3;
import java.util.*;
/**
 *
 * @author danys
 */
public class Laboratorio3 
{
    
    public int multp(List<Integer> lista)
    {
        int mult = 1;
        for(int i = 0; i < lista.size(); i++)
        {
            mult = mult * lista.get(i);
        }
        return mult;
    }
    
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
    
    public List SmartInsert(List l, int data)
    {
        if(!(l.contains(data)))
        {
            l.add(data);
            return l;
        }
        return l;
    }
    
    public int pivote(List<Integer> l)
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
}
