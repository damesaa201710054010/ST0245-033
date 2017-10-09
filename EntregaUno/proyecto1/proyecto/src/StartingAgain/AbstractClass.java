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

    private File identificador;

    public AbstractClass(File file) {
        this.identificador = file;
    }

    public String getNombre() {
        return identificador.getName();
    }
    
    public File getFile(){
        return this.identificador;
    }
    
}
