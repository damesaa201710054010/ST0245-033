/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartingAgain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
    private FolderClass prueba;
   // private File Last;

    public StartingAgain() throws FileNotFoundException, IOException {
        definiendoSistema();
        loading();
        //File f = new File(sDirectorio);
        File f = new File("ejemplito.txt");
        FileReader g = new FileReader(f);
        BufferedReader br = new BufferedReader(g);
        String linea = br.readLine();
        br.close();
        prueba = new FolderClass(linea, "");
        prueba.generadorLinked();
    }
    

    public void consola() throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        String comando = teclado.readLine();
        while (!(comando.equals("exit"))) {
            if (comando.equals("ls")) {
                System.out.println("\nListando elementos del directorio: " + sDirectorio);
                prueba.listar("");

            }
            if (comando.equals("buscar")) {
                System.out.println("Ingrese el nombre del archivo o carpeta a "
                        + "buscar");
                String name = teclado.readLine();
                if (!prueba.buscar(name)) {
                    System.out.println("El archvio no existe\n");
                }
            }
            if (comando.equals("rm")) {
                System.out.println("Ingrese el nombre del archivo o carpeta a "
                        + "eliminar");
                String name = teclado.readLine();
                if (!prueba.eliminar(name)) {
                    System.out.println("El archvio no existe\n");
                }
            }
            if(comando.equals("mkdir")){
                System.out.println("Padre con Parent: "+prueba.obtLastDir());
            }
            comando = teclado.readLine();
        }
        System.out.println("logout");
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
}
