import java.util.*;
public class notPolaca{
    public static int notacion()
    {
	Scanner in = new Scanner(System.in);
	String cadena = in.nextLine();
	String [] partes = cadena.split(" ");
	Stack<Integer> pila = new Stack<Integer>();
	int result = 0;
	for(int i = 0; i < partes.length; i++)
	    {
		if(!(partes[i].equals("+")) && !(partes[i].equals("*")) && !(partes[i].equals("/"))
		   && !(partes[i].equals("-")))
		    {
			pila.push(Integer.parseInt(partes[i]));
		    }else if(partes[i].equals("+"))
		    {
			result = pila.pop() + pila.pop();
			pila.push(result);
		    }else if(partes[i].equals("*"))
		    {
			result = pila.pop() * pila.pop();
			pila.push(result);
		    }else if(partes[i].equals("/")) 
		    {
			result = pila.pop() / pila.pop();
			pila.push(result);
		    }else if(partes[i].equals("-"))
		    {
			int primero = pila.pop();
			int segundo = pila.pop();
			if(primero > segundo)
			    {
				result = primero - segundo;
			    }else
			    {
				result = segundo - primero;
			    }
			pila.push(result);
		    }
	    }
	return pila.pop();
    }

    public static void main(String[] args)
    {
	System.out.println(notacion());
    }
}
