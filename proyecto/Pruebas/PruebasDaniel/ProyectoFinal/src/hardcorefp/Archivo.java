/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardcorefp;

import java.io.File;
import java.util.LinkedList;

/**
 * Clase para encapsular los archivos
 * @author Evinracher
 */
public class Archivo extends AbstractClass{
    private File file;
    public Archivo(File file){
        super(file);
    }
    
    public Archivo(String file){
        super(file);
    }
    
    public Archivo(String file, Carpeta padre){
        super(file, padre);
    }
}
