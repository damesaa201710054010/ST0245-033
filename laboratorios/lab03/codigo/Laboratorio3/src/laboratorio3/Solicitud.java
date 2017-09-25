package laboratorio3;
import java.util.*;
/**
 * Laboratorio 3 de Estructuras de Datos 1. 
 * Representa una solicitud de nevera con empresa y cantidad a pedir
 * 
 * @author: Kevin Arley Parra Henao - Codigo: 201710093010, Daniel Alejandro Mesa Arango - Codigo: 201710054010 
 * @version: 1.0 24/09/2017
 */
public class Solicitud {
    
    private int cantidad;
    private String nombreDeLaTienda;
    /**
     * Este constructor crea una solicitud de neveras
     * @param nombreDeLaTienda nombre de la empresa de tipo String
     * @param cantidad 
     */
    public Solicitud(String nombreDeLaTienda, int cantidad)
    {
        this.cantidad = cantidad;
        this.nombreDeLaTienda = nombreDeLaTienda;
    }
    
    /**
     * Este metodo devuelve la cantidad de neveras pedidas
     * @return cantidad a pedir de tipo entero
     */
    public int cantidad()
    {
        return cantidad;
    }
    
    /**
     * Este metodo devuelve el nombre de la empresa
     * @return devuelve un String con el nombre de la empresa
     */
    public String nombre()
    {
        return nombreDeLaTienda;
    }
}
