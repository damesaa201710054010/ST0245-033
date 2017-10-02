/*
 * En esta version se hara uso de un arraylist que representara un fichero home
 * dado por el usuario y que contendra los archivos y las carpetas, cada carpeta
 * a su vez las carpetas se representaran con un arraylist
 */
package proyecto;

import java.io.File;
import java.util.LinkedList;
import static proyecto.Proyecto.recorrer;

/**
 *
 * @author Kevin Parra, Daniel Mesa
 */
public class Home {

    private LinkedList<Nodo> arbolB;
    private String sDirectorio;

    public Home() {
        arbolB = new LinkedList<>();
        EstablecerHome();
        generarArbol();
    }

    private void EstablecerHome() {
        String OS = System.getProperty("os.name").toLowerCase();
        String OSArch = System.getProperty("os.arch").toLowerCase();
        String OSversion = System.getProperty("os.version").toLowerCase();
        System.out.println(OS);

        if (OS.equals("linux")) {
            this.sDirectorio = "/home/evinracher/prueba";
        } else if (OS.substring(0, 7).equals("windows")) {
            this.sDirectorio = "C:\\Prueba";
        } else if (OS.equals("mac")) {
            System.out.println("No tenemos mac :c");
        }

    }

    private void generarArbol() {
        File f = new File(sDirectorio);
        if (f.exists()) {
            File[] ficheros = f.listFiles();
            for (int i = 0; i < ficheros.length; ++i) {
                if (ficheros[i].isFile()) {
                    arbolB.add(new Nodo(ficheros[i]));
                } else {
                    arbolB.add(new Carpeta(ficheros[i], ""));
                }
            }
        } else {
            System.out.println("Directorio home no encontrado");
        }
    }

    public void listar() {
        for (int x = 0; x < arbolB.size(); x++) {
            if (arbolB.get(x) instanceof Carpeta) {
                System.out.println(arbolB.get(x).getNombre());
            } else {
                System.out.println(arbolB.get(x).getNombre());
            }
        }
    }

    public String pruebaAgregar(File f) {
        Nodo node = new Nodo(f);
        arbolB.add(node);
        return arbolB.getFirst().getNombre();
    }
}
