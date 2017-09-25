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
    private LinkedList distribucion;
    public Distribucion()
    {
        distribucion = new LinkedList();
    }
    public static void ejercicio4(LinkedList<Neveras> neveras, LinkedList<Solicitud> solicitudes)throws IOException
    {
        int recorridoNeveras = neveras.size()-1;
        int hasta = neveras.size();
        int cantidad = 0;
        int tamaño = solicitudes.size()-1;
        Iterator<Solicitud> iterador2 = solicitudes.iterator();
        while(tamaño >= 0)
        {
            
            cantidad = solicitudes.get(tamaño).cantidad();//iterador2.next().cantidad();
            hasta = hasta - cantidad;
            while(recorridoNeveras > hasta)
            {
                solicitudes.get(tamaño).agregarNe(neveras.get(recorridoNeveras));
                recorridoNeveras--;
            }
            cantidad = 0;
            tamaño--;
        }
        System.out.println(solicitudes);
    }
}
