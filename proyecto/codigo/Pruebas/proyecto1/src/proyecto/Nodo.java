/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.File;
import java.util.LinkedList;

/**
 *
 * @author evinracher
 */
public class Nodo {
    private File archivo;   
    
    public Nodo(File f){
        this.archivo = f;
    }
    
    public String getNombre(){
        return archivo.getName();
    }
}
    
    
    
