import java.util.*;
public class notPolaca{
    public int notacion()
    {
	Scanner in = new Scanner(System.in);
	String cadena = in.next();
	String [] partes = cadena.split(" ");
	Stack<String> pila = new Stack<String>();
	for(int i = 0; i < partes.length; i++)
	    {
		pila.push(partes[i]);
	    }
	while(pila.emtpy())
	    {
		String afuera = pila.pop();
		if(afuera == '+')
		    {
			
		    }
	    }
    }

    public static void main(String[] args)
    {
	public notacion();
    }
}
