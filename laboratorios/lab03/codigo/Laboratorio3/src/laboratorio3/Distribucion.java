/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;
import java.util.*;
import java.io.*;
/**
 *
 * @author danys
 */
public class Distribucion {
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
