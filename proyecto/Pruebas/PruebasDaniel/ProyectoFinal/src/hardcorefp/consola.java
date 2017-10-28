/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardcorefp;

import java.io.BufferedReader;
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
    private HardcoreFP structure;
    public consola() throws IOException {
        definiendoSistema();
        loading();
        structure = new HardcoreFP();
    }

    /**
     * Método principal que se ejecuta, requiere que se establezca donde esta
     * ubicado el archivo de texto a leer y procesar
     *
     * @param args the command line arguments
     */
    public static void i(String[] args) throws IOException {

        /**
         * System.out.println(buscar("Mario Power Tennis (2009)
         * [Wii][PAL][MULTi5][WwW.ZoNaTorrent.CoM].iso")); AbstractClass resul =
         * (AbstractClass) buscarR("Mario Power Tennis (2009)
         * [Wii][PAL][MULTi5][WwW.ZoNaTorrent.CoM].iso");
         * System.out.println(resul.getNombre());
        *
         */
    }

    public void consola() throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        String comando = teclado.readLine();
        while (!(comando.equals("exit"))) {
            if (comando.equals("ls")) {
                System.out.println("\nListando elementos del directorio: " + sDirectorio);
                structure.listar();
            }

            if (comando.equals("ls -l")) {
                System.out.println("\nListando elementos del directorio: " + sDirectorio);
                //prueba2.listarSimple();
            }
            if (comando.equals("see")) {
                System.out.println("\nListando elementos del directorio: " + sDirectorio);
                System.out.println("Ingrese el nombre del archivo o carpeta a "
                        + "buscar");
                String name = teclado.readLine();
                structure.obtRuta(name);//cambiar lo del parentesis por name
            }

            if (comando.equals("buscar")) {
                System.out.println("Ingrese el nombre del archivo o carpeta a "
                        + "buscar");
                String name = teclado.readLine();
                boolean resultado = structure.buscar(name);
                if (!resultado) {
                    System.out.println("El archivo no existe");
                } else {
                    System.out.println(resultado);
                }
            }
            
            if(comando.equals("imprimir"))
            {
                String name = teclado.readLine();
                structure.buscarIm(name);
            }
            /**
             * if (comando.equals("rm")) { System.out.println("Ingrese el nombre
             * del archivo o carpeta a " + "eliminar"); String name = ""; //=
             * teclado.readLine(); if (!prueba.eliminar(name)) {
             * System.out.println("El archvio no existe\n"); }
            }
             */

            if (comando.equals("dibu")) {
               structure.dibujarArbol();
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

        /**
         * Posible implementación con carpetas del sistema if
         * (OS.equals("linux")) { sDirectorio = "/home/evinracher/prueba"; }
         * else if (OS.substring(0, 7).equals("windows")) { sDirectorio =
         * "C:\\Prueba"; } else if (OS.equals("mac")) { System.out.println("No
         * tenemos mac :c"); }
         *
         * }
         */
    }

}
