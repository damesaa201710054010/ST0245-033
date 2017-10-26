/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardcorefp;

import java.io.IOException;
import java.util.LinkedList;
import java.util.TreeMap;

/**
 * Consideraciones: Evinracher es el AKA de Kevin Arley Parra, anietog1 es
 * nuestro camarada del grupo de competitiva
 *
 * @author Evinracher ft anietog1
 */
public class HardcoreFP {

    private static Carpeta home;
    public static TreeMap arbol;

    /**
     * Método principal que se ejecuta, requiere que se establezca donde esta
     * ubicado el archivo de texto a leer y procesar
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        HFPRead p = new HFPRead("/home/evinracher/Escritorio/juegos.txt");
        home = p.load();
//        tree(home, "-");
        arbol = new TreeMap();
        generar(home, "-");
        System.out.println(buscar("Mario Power Tennis (2009) [Wii][PAL][MULTi5][WwW.ZoNaTorrent.CoM].iso"));
    }

    private static void tree(Carpeta start, String bars) {
        LinkedList<AbstractClass> list = start.getList();

        list.forEach((f) -> {
            System.out.println(bars + f.getNombre() + " Padre: " + f.getPadre().getNombre());
            if (f instanceof Carpeta) {
                tree((Carpeta) f, bars + "-");
            }
        });
    }

    private static void generar(Carpeta start, String space) {
        LinkedList<AbstractClass> list = start.getList();

        list.forEach((f) -> {
            System.out.println(space + f.getNombre());//Esto pa despues: + " Padre: "+f.getPadre().getNombre()
            arbol.put(f.getNombre(), f);
            if (f instanceof Carpeta) {
                generar((Carpeta) f, space + "-");
            }
        });
    }

    public static boolean buscar(String nombre) {
        return arbol.containsKey(nombre);
    }

}
