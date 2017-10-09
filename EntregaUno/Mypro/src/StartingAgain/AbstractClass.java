/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartingAgain;

import java.io.File;

/**
 *
 * @author evinracher
 */
public abstract class AbstractClass {

    private String identificador;

    public AbstractClass(String file) {
        this.identificador = file;
    }

    public String getNombre() {
        return identificador;
    }
    
    /*public File getFile(){
        return this.identificador;
    }*/
    
}
