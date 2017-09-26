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
    private LinkedList<Neveras> neveras;
    /**
     * Este metodo reparte en el orden correcto las neveras del amacen a los pedidos hechos por las empresas, imprime el orden
     * y pedidos
     * @param neveras lista de neveras disponibles en el almacen
     * @param solicitudes los pedidos que actualmente existen por repartir
     * @throws IOException en caso de que este vacia
     */
    public void ejercicio4(LinkedList<Neveras> neveras, LinkedList<Solicitud> solicitudes)throws IOException
    {
        this.neveras = neveras;
        int cantidad = 0;
        while(!(solicitudes.isEmpty()))
        {
            cantidad = solicitudes.getFirst().cantidad();
            System.out.println("solicitud numero: "+ " "+ "empresa: "+solicitudes.getFirst().nombre()+" le corresponden: ");
            for(int i = 0; i < cantidad; i++)
            {
                repartirNeveras();
            }
            cantidad = 0;
            solicitudes.removeFirst();
        }
    }
    
    private void repartirNeveras()
    {
        System.out.println(neveras.getLast().codigo() + " "+ neveras.getLast().descripcion());
        neveras.removeLast();
    }
    
    public void ejercicio4A(List<Neveras> neveras, List<Solicitud> solicitudes)throws IOException
    {
        int i = neveras.size()-1;
        int hasta = neveras.size()-1;
        int cantidad = 0;
        int h = 0;
        while( h < solicitudes.size())
        {
            cantidad = solicitudes.get(h).cantidad();
            System.out.println("solicitud numero: "+ " "+ "empresa: "+solicitudes.get(h).nombre()+" le corresponden: ");
            hasta = hasta - cantidad;
            while(i > hasta)
            {
                System.out.println(neveras.get(i).codigo() + " "+ neveras.get(i).descripcion());
                i--;
            }
            h++;
        }
    }
}