/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardcorefp;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author evinracher
 */
public class consola {

    private String sDirectorio;
    private String OS;
    private String OSArch;
    private String OSversion;
    private String OSdataModel;

    public consola() {
        definiendoSistema();
        loading();
        //File f = new File(sDirectorio);
        //prueba = new FolderClass(f, "");
        //leyendoArchivo archivo = new leyendoArchivo();
        //prueba2 = new FolderClass(archivo.obtArchivo(), "");
    }

    public void consola() throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        String comando = teclado.readLine();
        while (!(comando.equals("exit"))) {
            if (comando.equals("ls")) {
                System.out.println("\nListando elementos del directorio: " + sDirectorio);
                //prueba2.listar("");

            }
            
            if (comando.equals("ls -l")) {
                System.out.println("\nListando elementos del directorio: " + sDirectorio);
                //prueba2.listarSimple();
            }
            
            if (comando.equals("buscar")) {
                System.out.println("Ingrese el nombre del archivo o carpeta a "
                        + "buscar");
                String name = teclado.readLine();
                String resultado = "";
                        //= prueba2.buscar(name);
                if (resultado.equals("")) {
                    System.out.println("El archivo no existe");
                } else {
                    System.out.println(resultado);
                }
            }
            if (comando.equals("rm")) {
                System.out.println("Ingrese el nombre del archivo o carpeta a "
                        + "eliminar");
                String name = "";
                        //= teclado.readLine();
                if (!prueba.eliminar(name)) {
                    System.out.println("El archvio no existe\n");
                }
            }
            
            if (comando.equals("mkdir")) {
                System.out.println("Padre con Parent: " + prueba.obtLastDir());
            }
            //Limpiar bufer
            comando = teclado.readLine();
        }
        System.out.println("logout");
    }

    private void loading() {
        System.out.println("BIENVENIDO\nDatos del sistema:\n"
                + "Sistema Operativo: " + OS
                + "\nArquitectura: " + OSArch
                + "\nVersion: " + OSversion
                + "\nData Model: " + OSdataModel);
    }

    private void definiendoSistema() {
        OS = System.getProperty("os.name").toLowerCase();
        OSArch = System.getProperty("os.arch").toLowerCase();
        OSversion = System.getProperty("os.version").toLowerCase();
        OSdataModel = System.getProperty("sun.arch.data.model");

        
        
        /** Posible implementación con carpetas del sistema
        if (OS.equals("linux")) {
            sDirectorio = "/home/evinracher/prueba";
        } else if (OS.substring(0, 7).equals("windows")) {
            sDirectorio = "C:\\Prueba";
        } else if (OS.equals("mac")) {
            System.out.println("No tenemos mac :c");
        }

    }
    */
}

}
