/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardcorefp;

import java.io.File;
import java.util.LinkedList;

/**
 * Clase abstracta que permite la abstraccion
 * @author Evinracher
 */
public abstract class AbstractClass {

    private File identificador;
    private String nombre;
    private Carpeta padre;
    public AbstractClass(File file) {
        this.identificador = file;
    }
    
    public AbstractClass(String nombre){
        File archivo = new File("./"+nombre);
        this.identificador = archivo;
    }
    
    public AbstractClass(String nombre, Carpeta padre) {
        File archivo = new File("./" + nombre);
        this.identificador = archivo;
        this.padre = padre;
    }


    public String getNombre() {
        return identificador.getName();
    }
    
    public void setNombre(){
    }
    
    public File getFile(){
        return this.identificador;
    }
    
    public Carpeta getPadre(){
        return this.padre;
    }
}
