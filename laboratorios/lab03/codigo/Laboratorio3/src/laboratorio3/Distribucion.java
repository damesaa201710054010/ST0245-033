package laboratorio3;
import java.util.*;
import java.io.*;
/**
 * Laboratorio 3 de Estructuras de Datos 1. 
 * Esta clase reparte de manera ordenada las neveras disponibles a los pedidos hechos
 * 
 * @author: Kevin Arley Parra Henao - Codigo: 201710093010, Daniel Alejandro Mesa Arango - Codigo: 201710054010 
 * @version: 1.0 24/09/2017
 */
public class Distribucion {
    /**
     * Este metodo reparte en el orden correcto las neveras del amacen a los pedidos hechos por las empresas, imprime el orden
     * y pedidos
     * @param neveras lista de neveras disponibles en el almacen
     * @param solicitudes los pedidos que actualmente existen por repartir
     * @throws IOException en caso de que este vacia
     */
    public void ejercicio4(LinkedList<Neveras> neveras, LinkedList<Solicitud> solicitudes)throws IOException
    {
        int cantidad = 0;
        int never = neveras.size()-1;
        int hasta = neveras.size()-1;
        for(int i = 0; i < solicitudes.size(); i++)
        {
            cantidad = solicitudes.get(i).cantidad();
            int numero = i+1;
            System.out.println("solicitud numero: "+ numero + " "+ "empresa: "+solicitudes.get(i).nombre()+" le corresponden: ");
            if(hasta >= 0){
            hasta = hasta - cantidad;
            while(never > hasta)
            {
                System.out.println("Codigo: "+neveras.get(never).codigo()+" "+"Descripcion: "+ neveras.get(never).descripcion());
                neveras.remove(never);
                never--;
                System.out.println();
            }
            cantidad = 0;
            }else{
                System.out.println("No hay existencia de productos");
            }
        }
        
    }
}
