/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller9;

import java.util.Enumeration;
import java.util.Hashtable;
/**
 * 
 * @author Kevin Arley Parra Henao - 201710093010, Daniel Alejandro Mesa Arango - 201710054010 
 * @version: 1.0  02/10/2017
 */
public class Taller9{
    //pedrito 1
    public static void agregar(Hashtable empresas,String key, String value){
        empresas.put(key, value);
        System.out.println("Agregados con: \n" + "key: "+key+"\nValor: "+value+"\n");
    }
    
    //pedrito 2
    public static void buscar(Hashtable empresas, String val){
        if(empresas.containsKey(val))
        {
            System.out.println("Valor: " + empresas.get(val)+"\n");
        }else
        {
            System.out.println("ERROR: No se se encuentra en la tabla (NULL)\n");
        }
    }
    //pedrito 3
    public static boolean contienekey(Hashtable empresas, String value){
        return empresas.containsValue(value);
    } 
    
    
    public static void main(String[] args)
    {
        Hashtable hash = new Hashtable();
        hash.put("Google", "Estados Unidos");
        hash.put("La locura", "Colombia");
        hash.put("Nokia", "Finlandia");
        hash.put("Sony", "Japón");
        agregar(hash, "MisArepas", "Venezuela");
        buscar(hash, "Google");
        buscar(hash, "Motorola");
        System.out.println("Elemento en la tabla: " + contienekey(hash, "India")+ "\n");
        System.out.println("Elemento en la tabla: " + contienekey(hash, "Estados Unidos") + "\n");
        
        Enumeration e = hash.elements();
        while(e.hasMoreElements())
        {
            System.out.println("Elemento: " +e.nextElement());
        }
        System.out.println();
        Enumeration d = hash.keys();
        while(d.hasMoreElements())
        {
            System.out.println("clave: " +d.nextElement());
        }
    }
}