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
                    System.out.println(space + "L " + ficheros[x].getName());
                } else {
                    System.out.println(space+"Carpeta: " + ficheros[x].getName());
                    String esp = space+"-";
                    recorrer(ficheros[x].listFiles(), esp);

                }
            }
        }

    }

    public static void imprimir(File[] f) {
        for (int i = 0; i < f.length; ++i) {
            System.out.println("--" + f[i].getName());
        }
    }

    public static void recorrer(File[] ficheros, String space) {
        String esp = space;
        for (int x = 0; x < ficheros.length; x++) {
            if (ficheros[x].isFile()) {
                System.out.println(esp + "L " + ficheros[x].getName());
            } else if (ficheros[x].isDirectory()) {
                System.out.println(space+"Carpeta: " + ficheros[x].getName());
                esp = space + "-";
                recorrer(ficheros[x].listFiles(), esp);
            }
        }
    }

}
