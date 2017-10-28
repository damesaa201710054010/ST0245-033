/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardcorefp;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
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
    public HardcoreFP() throws IOException {
        HFPRead p = new HFPRead("juegos.txt");
        home = p.load();
        //tree(home, "-");
        arbol = new TreeMap();
        generar(home);

    }
    public void dibujarArbol() {
        System.out.println("/* arbolito para http://www.webgraphviz.com/ */");
        System.out.println("digraph arbolito {");
        System.out.println("size=\"6,6\";");
        System.out.println("node [color=aquamarine, style=filled];");
        dibujarArbolAux(arbol);
        System.out.println("}");
    }

    private void dibujarArbolAux(TreeMap nodo) {
        System.out.println("entra");
        if (nodo != null) //"x_\n__" -> "xo\n__";
        {
            System.out.println("ENTRA");
            Iterator it = nodo.entrySet().iterator();
                if (it.hasNext()) {
                    AbstractClass ent = (AbstractClass)it.next();
                    System.out.println("\"" + ent.getPadre() + "\" -> \"" + ent.getNombre() + "\";");
                }
            }
        
    }

    private void tree(Carpeta start, String bars) {
        LinkedList<AbstractClass> list = start.getList();

        list.forEach((f) -> {
            System.out.println(bars + f.getNombre() + " Padre: " + f.getPadre().getNombre());
            if (f instanceof Carpeta) {
                tree((Carpeta) f, bars + "-");
            }
        });
    }

    private void generar(Carpeta start) {
        LinkedList<AbstractClass> list = start.getList();
        list.forEach((AbstractClass f) -> {
            if (!(arbol.get(f.getNombre()) instanceof LinkedList) && arbol.get(f.getNombre()) == null) {
                arbol.put(f.getNombre(), f);
                if (f instanceof Carpeta) {
                    generar((Carpeta) f);
                }
            } else if (arbol.get(f.getNombre()) instanceof LinkedList) {

                LinkedList temporal = (LinkedList) arbol.get(f.getNombre());
                temporal.add(f);
                arbol.put(f.getNombre(), temporal);
                if (f instanceof Carpeta) {
                    generar((Carpeta) f);
                }
            } else {
                LinkedList ella = new LinkedList();
                AbstractClass temporalA = (AbstractClass) arbol.get(f.getNombre());
                ella.add(temporalA);
                ella.add(f);
                arbol.put(f.getNombre(), ella);
                if (f instanceof Carpeta) {
                    generar((Carpeta) f);
                }
            }
        });
    }
    
    public void listar() {
        listarAux(home, "-");
    }

    private void listarAux(Carpeta start, String space) {
        LinkedList<AbstractClass> list = start.getList();

        list.forEach((AbstractClass f) -> {
            System.out.println(space + f.getNombre());//Esto pa despues: + " Padre: "+f.getPadre().getNombre()

            if (f instanceof Carpeta) {
                listarAux((Carpeta) f, space + "-");
            }
        });
    }

    public boolean buscar(String nombre) {
        return arbol.containsKey(nombre);
    }

    public Object buscarR(String nombre) {
        return arbol.get(nombre);
    }

    public void buscarIm(String nombre) {
        if(arbol.get(nombre) instanceof LinkedList)
        {
            LinkedList<AbstractClass> temporal = (LinkedList)arbol.get(nombre);
            temporal.forEach((AbstractClass f) -> {
                System.out.println(f.getNombre());
            });
        }else
        {
            AbstractClass tem = (AbstractClass)arbol.get(nombre);
            System.out.println(tem.getNombre());
        }
    }
    public void obtRuta(String nombre) {
        AbstractClass resul = (AbstractClass) buscarR(nombre);
        String ruta = "/";
        String impr = obtRutaAux(resul, ruta, 0);
        if (!impr.equals("")) {
            System.out.println("Ruta: " + impr);
        } else {
            System.out.println("No existe el archivo para la ruta");
        }
    }

    private String obtRutaAux(AbstractClass archivo, String ruta, int cont) {

        AbstractClass padre;
        if (archivo != null) {
            padre = archivo.getPadre();
            cont++;
            return obtRutaAux(padre, "/", cont) + ruta + archivo.getNombre();
        } else {

            return "";
        }
    }
    
    /*public static void main(String[] args) throws IOException
    {
        HardcoreFP prueba = new HardcoreFP();
        AbstractClass archivo = (AbstractClass)prueba.buscarR("bios");
        System.out.println(archivo.getNombre());
        
        
    }*/

}
