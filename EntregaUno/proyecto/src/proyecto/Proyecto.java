package proyecto;

import java.io.File;

public class Proyecto {

    public static void main(String[] args) {
        String OS = System.getProperty("os.name").toLowerCase();
        String OSArch = System.getProperty("os.arch").toLowerCase();
        String OSversion = System.getProperty("os.version").toLowerCase();
        System.out.println(OS);

        String sDirectorio = "/home/evinracher/prueba";
        if (OS.equals("linux")) {
            sDirectorio = "/home/evinracher/prueba";
        } else if (OS.substring(0, 7).equals("windows")) {
            sDirectorio = "C:\\Prueba";
        } else if (OS.equals("mac")) {
            System.out.println("No tenemos mac :c");
        }
        String space = "";
        File f = new File(sDirectorio);
        if (f.exists()) {
            File[] ficheros = f.listFiles();
            for (int x = 0; x < ficheros.length; x++) {
                if (ficheros[x].isFile()) {
                    System.out.println("L" + ficheros[x].getName());
                } else {
                    space = space + " ";
                    System.out.println(space + ficheros[x].getName());
                    recorrer(ficheros[x], space);
                }
            }
        }

    }

    public static void recorrer(File fichero, String space) {
        File[] ficheros = fichero.listFiles();
        for (int x = 0; x < ficheros.length; x++) {
            if (ficheros[x].isFile()) {
                System.out.println(space + "L " + ficheros[x].getName());
            } else if (ficheros[x].isDirectory()) {
                space = space + " ";
                System.out.println(space + ficheros[x].getName());
                recorrer(ficheros[x], space);
            }
        }
    }

}
