package StartingAgain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FolderClass extends AbstractClass {

    private String space;
    private LinkedList<AbstractClass> archivos;
    private String lastCarp;

    public FolderClass(String file, String space) {
        super(file);
        archivos = new LinkedList<>();
            //generadorLinked();
            this.space = space;
      
    }
    
    public void generadorLinked() throws FileNotFoundException, IOException
    {
        File f = new File("ejemplito.txt");
        FileReader fr = new FileReader (f);
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        linea = br.readLine();
        String mitad = "";
        while(br.ready())
        {
            mitad = linea.substring(linea.indexOf("]")+1);
            if(mitad.contains("."))
            {
                archivos.add(new Archivo(mitad));
            }else if(!mitad.contains("."))
            {
                archivos.add(new FolderClass(mitad, space));
            }
            linea = br.readLine();
        }
    }

    /*public void generadorLinked() {
        
        for (int x = 0; x < file.length; x++) {
            if (file[x].isFile()) {
                archivos.add(new Archivo(file[x]));
            } else if (file[x].isDirectory()) {
                archivos.add(new FolderClass(file[x], space));
            }
        }
    }*/

    public void listar(String space) {
        for (int x = 0; x < archivos.size(); ++x) {
            if (archivos.get(x) instanceof Archivo) {
                System.out.println(space + "Archivo: " + archivos.get(x).getNombre());
            } else if (archivos.get(x) instanceof FolderClass) {
                System.out.println(space + "Carpeta: " + archivos.get(x).getNombre());
                String esp = space + "-";
                //FolderClass p = (FolderClass) archivos.get(x);
                //p.listar(esp);
            }
        }
    }

    public boolean eliminar(String name) {
        for (int x = 0; x < archivos.size(); ++x) {
            if (archivos.get(x) instanceof Archivo) {
                if (archivos.get(x).getNombre().equals(name)) {
                    System.out.println("Eliminando el archvio en:\n " + archivos.get(x).getFile());
                    File aBorrar = archivos.get(x).getFile();
                    aBorrar.delete();
                    archivos.remove(x);
                    return true;
                }
            } else if (archivos.get(x) instanceof FolderClass) {
                if (archivos.get(x).getNombre().equals(name)) {
                    System.out.println("Eliminando el archvio en:\n " + archivos.get(x).getFile());
                    File aBorrar = archivos.get(x).getFile();
                    aBorrar.delete();
                    archivos.remove(x);
                    return true;
                } else {
                    FolderClass p = (FolderClass) archivos.get(x);
                    p.eliminar(name);
                }
            }

        }
        return false;
    }

    public boolean buscar(String name) {
        for (int x = 0; x < archivos.size(); ++x) {
            if (archivos.get(x) instanceof Archivo) {
                if (archivos.get(x).getNombre().equals(name)) {
                    System.out.println("El archvio existe:\n " + archivos.get(x).getFile());
                    lastCarp = archivos.get(x).getFile().getParent();                   
                    return true;
                }
            } else if (archivos.get(x) instanceof FolderClass) {
                if (archivos.get(x).getNombre().equals(name)) {
                    System.out.println("El archvio existe:\n " + archivos.get(x).getFile());
                    lastCarp = archivos.get(x).getFile().toString();
                    return true;
                } else {
                    FolderClass p = (FolderClass) archivos.get(x);
                    p.buscar(name);
                }
            }

        }
        return false;
    }
    
    public String obtLastDir(){
    return lastCarp;
    }

    public boolean crear(String dir) {
        return false;
    }
    

}
