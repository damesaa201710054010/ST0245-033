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
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author danys
 */
public class Leer {
    LinkedList<AbstractClass> archivos = new LinkedList<>();
    public void leer() throws FileNotFoundException, IOException
    {
        File f = new File("ejemplito.txt");
        FileReader fr = new FileReader (f);
        BufferedReader br = new BufferedReader(fr);
        String linea = br.readLine();
        System.out.println(linea);
        File file = new File(linea);
        File [] file2 = file.listFiles();
        System.out.println(file2.length);
        if(file.isFile())
        {
            System.out.println("funciona");
        }else if(file.isDirectory())
        {
            System.out.println("directorio y funciona");
        }
        linea = br.readLine();
        if(file.isFile())
        {
            System.out.println("funciona");
        }else if(file.isDirectory())
        {
            System.out.println("directorio y funciona");
        }
        linea = br.readLine();
        if(file.isFile())
        {
            System.out.println("funciona");
        }else if(file.isDirectory())
        {
            System.out.println("directorio y funciona");
        }
        
        /*linea = br.readLine();
        int tamaño = linea.length()-1;
        String mitad = "";
        while(br.ready())
        {
            mitad = linea.substring(linea.indexOf("]")+1);
            if(mitad.contains("."))
            {
                archivos.add(new Archivo(linea));
            }else if(mitad.contains("."))
            {
                archivos.add(new FolderClass(linea, space))
            }
            linea = br.readLine();
        }*/
    }
    
    /*public void generadorLinked(String file) {
        
        for (int x = 0; x < file.length; x++) {
            if (file[x].isFile()) {
                archivos.add(new Archivo(file[x]));
            } else if (file[x].isDirectory()) {
                archivos.add(new FolderClass(file[x], space));
            }
        }
    }*/
    
    public static void main(String[] args)
    {
        Leer l = new Leer();
        try{
            l.leer();
        }catch(Exception e)
        {
            System.out.println("error");
        }
    }
}
