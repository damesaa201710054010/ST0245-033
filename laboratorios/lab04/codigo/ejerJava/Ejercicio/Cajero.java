/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 *
 * @author evinracher
 */
public class Cajero {
    private int idCajero;
    private String nombreCliente;
    private int fila;

    public Cajero(int id){
        this.idCajero = id;
        nombreCliente = "none";
    }
    
    public String getNombre(){
        return nombreCliente;
    }
    
    public void setNombre(String nombre){
        this.nombreCliente = nombre;
    }
    
    public int getCajero(){
        return idCajero;
    }
    
    public int getFila(){
        return fila;
    }
}
