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
public class StartingAgain {

    private String sDirectorio;
    private String OS;
    private String OSArch;
    private String OSversion;
    private String OSdataModel;

    public StartingAgain() {
        definiendoSistema();
        loading();
        File f = new File(sDirectorio);
        FolderClass prueba = new FolderClass(f, "");
        System.out.println("\nListando elementos del directorio: "+ sDirectorio);
        prueba.listar("");
    }

    public void loading() {
        System.out.println("BIENVENIDO\nDatos del sistema:\n"
                + "Sistema Operativo: " + OS
                + "\nArquitectura: " + OSArch
                + "\nVersion: " + OSversion
                + "\nData Model: " + OSdataModel);
    }

    public void definiendoSistema() {
        OS = System.getProperty("os.name").toLowerCase();
        OSArch = System.getProperty("os.arch").toLowerCase();
        OSversion = System.getProperty("os.version").toLowerCase();
        OSdataModel = System.getProperty("sun.arch.data.model");

        if (OS.equals("linux")) {
            sDirectorio = "/home/evinracher/prueba";
        } else if (OS.substring(0, 7).equals("windows")) {
            sDirectorio = "C:\\Prueba";
        } else if (OS.equals("mac")) {
            System.out.println("No tenemos mac :c");
        }

    }

    public static void main(String[] args) {
        StartingAgain Probando = new StartingAgain();
    
    }
}
