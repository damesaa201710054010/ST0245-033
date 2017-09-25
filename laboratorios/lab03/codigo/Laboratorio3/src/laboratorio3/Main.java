/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;
import java.io.IOException;
import java.util.*;
/**
 *
 * @author danys
 */
public class Main 
{
    public static void main(String[] args) throws IOException 
    {   
        /*LinkedList lis = new LinkedList();
        lis.add(1);
        lis.add(2);
        lis.add(3);
        lis.add(4);
        ArrayList lis2 = new ArrayList();
        lis2.add(1);
        lis2.add(2);
        lis2.add(3);
        lis2.add(4);
        
        LinkedList<Integer> lispi = new LinkedList<Integer>();
        lispi.add(10);
        lispi.add(20);
        lispi.add(5);
        lispi.add(3);
        lispi.add(20);
        lispi.add(10);
        
        ArrayList<Integer> lispi2 = new ArrayList<>();
        lispi2.add(10);
        lispi2.add(2);
        lispi2.add(5);
        lispi2.add(2);
        lispi2.add(11);
        //lispi2.add(10);
        Laboratorio3 ins = new Laboratorio3();
        System.out.println(ins.multp(lis));
        System.out.println(ins.multIt(lis2));
        
        System.out.println(ins.SmartInsert(lis, 5));
        
        System.out.println(ins.pivote(lispi2));*/
        
        Neveras uno = new Neveras(1, "haceb");
        Neveras dos = new Neveras(2, "lg");
        Neveras tres = new Neveras(3, "ibm");
        Neveras cuatro = new Neveras(4, "haceb");
        Neveras cinco = new Neveras(5, "lg");
        Neveras seis = new Neveras(6, "ibm");
        Neveras siete = new Neveras(7, "haceb");
        Neveras ocho = new Neveras(8, "lg");
        Neveras nueve = new Neveras(9, "ibm");
        Neveras diez = new Neveras(8, "lg");
        Neveras once = new Neveras(9, "ibm");
        LinkedList<Neveras> neveras= new LinkedList<>();
        neveras.add(uno);
        neveras.add(dos);
        neveras.add(tres);
        neveras.add(cuatro);
        neveras.add(cinco);
        neveras.add(seis);
        neveras.add(siete);
        neveras.add(ocho);
        neveras.add(nueve);
        neveras.add(diez);
        neveras.add(once);
        Solicitud sol = new Solicitud("exito", 1);
        Solicitud sol2 = new Solicitud("olimpica", 4);
        Solicitud sol3 = new Solicitud("la14", 2);
        Solicitud sol4 = new Solicitud("eafit", 4);
        LinkedList<Solicitud> solicitudes = new LinkedList<>();
        solicitudes.add(sol);
        solicitudes.add(sol2);
        solicitudes.add(sol3);
        solicitudes.add(sol4);
        Distribucion dis1 = new Distribucion();
        dis1.ejercicio4(neveras, solicitudes);
    }
}
