/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package startingagainii;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * Clase para la lectura del archivo
 * @author evinracher
 */
public class LecturaDeArchivo {
    /**
     * Método constructor.
     * 
     */
    public LecturaDeArchivo() {
        ejecucion();
    }
    
    /**
     * Realiza la lectura del archivo almacenado en una dirección específica
     */
    private void ejecucion() {
        //Codigo tomado de(solo lo de la lectura, el resto de metodos son propios):https://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=466:operadores-logicos-en-java-igual-distinto-and-or-not-mayor-menor-cortocircuito-cu00634b&catid=68&Itemid=188

        FileReader fr = null;
        String Lectura = "";

        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            File archivo = new File("/home/evinracher/prueba/ejemplito.txt");
            fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while ((linea = br.readLine()) != null) {
                Lectura = Lectura + linea + "\n";
                System.out.println("LEYENDO...");
            }
            Lectura = quitarLast(Lectura);
            Lectura = Lectura.substring(0, Lectura.length() - 2);
            Lectura = limpieza(Lectura);
            //System.out.println(Lectura);
            //Definiendo tipo
            Lectura = type(cont(conEsp(Lectura)));
            System.out.println(Lectura);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

    }
    
    /**
     * Remueve las dos últimas lineas, las cuales se consideran innecesarias, 
     * esté método se usa si se da el archivo con el formato que el profesor 
     * puso de ejemplo
     * @param line El string al cual se le removeran las dos uĺtimas líneas
     * @return Un string sin esas líneas
     */
    public static String quitarLast(String line) {
        String nueva = "";
        int cont = 0;
        for (int i = line.length() - 1; line.charAt(i) != ' '; --i) {
            cont++;
        }

        for (int i = line.length() - cont - 1; line.charAt(i) != '\n'; --i) {
            cont++;
        }
        return line.substring(0, line.length() - cont - 1);

    }

    public static String limpieza(String line) {
        String nueva = "";
        for (int i = 0; i < line.length(); ++i) {
            if ((line.charAt(i) != '│') && (line.charAt(i) != '├') && (line.charAt(i) != '─') && (line.charAt(i) != '└')) {
                if ((line.charAt(i) == '[')) {
                    int j = i;
                    while (line.charAt(j) != ']') {
                        j++;
                    }
                    i = j + 1;
                }
                nueva = nueva + line.charAt(i);
            }
        }
        return nueva;
    }

    public static String conEsp(String line) {
        String nueva = "";
        for (int i = 0; i < line.length(); ++i) {
            if (line.charAt(i) == '\n' && i + 1 < line.length()) {
                nueva = nueva + line.charAt(i);
                int j;
                for (j = i; line.charAt(j) != ' '; ++j) {
                }
                i = j;

            } else {
                nueva = nueva + line.charAt(i);
            }
        }
        return nueva;

    }

    public static String cont(String line) {
        String nueva = "";
        int cont = 0;
        for (int i = 0; i < line.length(); ++i) {
            if (line.codePointAt(i) == 10 && i + 1 < line.length()) {
                nueva = nueva + line.charAt(i);
                int j;
                for (j = i + 1; line.charAt(j) == ' '; ++j) {
                    cont++;
                }
                i = j - 1;
                nueva = nueva + "[" + cont + "]";
                cont = 0;
            } else {
                nueva = nueva + line.charAt(i);
            }
        }
        return nueva;

    }

    public static String type(String line) {
        String nueva = "";
        boolean punto = false;
        nueva = nueva + line.charAt(0);
        for (int i = 1; i < line.length(); ++i) {
            if (line.codePointAt(i) == 10 && i + 1 < line.length()) {
                nueva = nueva + line.charAt(i);
                for (int j = i + 1; line.charAt(j) != '\n' && j + 1 < line.length(); ++j) {
                    if (line.charAt(j) == '.') {
                        punto = true;
                        break;
                    }
                }
                if (punto) {
                    nueva = nueva + "<A>";
                } else {
                    nueva = nueva + "<C>";
                }
                punto = false;
            } else {
                nueva = nueva + line.charAt(i);
            }

        }
        return nueva;
    }

}
