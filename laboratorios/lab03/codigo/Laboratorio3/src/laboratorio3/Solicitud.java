/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;
import java.util.*;
/**
 *
 * @author danys
 */
public class Solicitud {
    
    private int cantidad;
    private String nombreDeLaTienda;
    private LinkedList<Neveras> neveras;
    public Solicitud(String nombreDeLaTienda, int cantidad)
    {
        this.cantidad = cantidad;
        this.nombreDeLaTienda = nombreDeLaTienda;
        neveras = new LinkedList<>();
    }
    
    public int cantidad()
    {
        return cantidad;
    }
    
    public String nombre()
    {
        return nombreDeLaTienda;
    }
    
    public void agregarNe(Nevera nevera)
    {
        neveras.add(nevera);
    }
}
