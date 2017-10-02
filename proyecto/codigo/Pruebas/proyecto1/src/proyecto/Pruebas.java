/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.File;

/**
 *
 * @author evinracher
 */
public class Pruebas {

    public static void main(String[] args) {
        Home prueba = new Home();
        File f = new File("/home/evinracher/prueba");
        prueba.pruebaAgregar(f);
    }
}
