/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Clase para los ejercicios.
 *
 * @author evinracher
 */
public class Banco {

    private Queue<String>[] filas;
    private Cajero cajero1;
    private Cajero cajero2;

    public Banco() {
        this.filas = new LinkedList[4];
        for (int i = 0; i < 4; ++i) {
            filas[i] = new LinkedList<String>();
        }
        int num = 1;
        cajero1 = new Cajero(num);
        num++;
        cajero2 = new Cajero(num);
    }

    public void ponerEnEspera(String nombre, int numFila) {
        filas[numFila].add(nombre);
    }

    public void atender() {
        int numFilas = filas.length;
        boolean[] isEmpty = new boolean[numFilas];
        
        while (numFilas > 0) {
            for (int i = 0; i < 4; ++i) {
                if (!isEmpty[i]) {
                    if (cajero1.getNombre().equals("none")) {
                        cajero1.setNombre(filas[i].poll());
                        System.out.println("Cajero N°" + cajero1.getCajero() + " atendiendo a: " + cajero1.getNombre()+" [Fila"+i+"]");
                        cajero2.setNombre("none");
                    } else {
                        cajero2.setNombre(filas[i].poll());
                        System.out.println("Cajero N°" + cajero2.getCajero() + " atendiendo a: " + cajero2.getNombre()+" [Fila"+i+"]");
                        cajero1.setNombre("none");
                    }
                    if(filas[i].size() <= 0){
                        isEmpty[i] = true;
                        numFilas--;
                    }
                }
            }

        }
    }

    public void imprimirFilas() {
        try {
            for (int i = 0; i < filas.length; ++i) {
                System.out.println("Fila: " + i);
                System.out.println(filas[i].toString());
            }
        } catch (NullPointerException e) {
            System.out.println("Hay filas que están vacías");
        }
    }

}
