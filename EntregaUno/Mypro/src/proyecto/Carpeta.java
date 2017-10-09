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
public class Carpeta extends Nodo {

    String space;
    private LinkedList<Nodo> subarbol;

    public Carpeta(File f, String space) {
        super(f);
        this.space = space + " ";
        subarbol = new LinkedList<>();
        recorrer(f);        
    }

    private void recorrer(File fichero) {
        File[] ficheros = fichero.listFiles();
        for (File fichero1 : ficheros) {
            if (fichero1.isFile()) {
                subarbol.add(new Nodo(fichero));
            } else {
                subarbol.add(new Carpeta(fichero, space));
            }
        }
        
        
        
    }
    
    public String getSubarbol(){
        return "";
    }
}
