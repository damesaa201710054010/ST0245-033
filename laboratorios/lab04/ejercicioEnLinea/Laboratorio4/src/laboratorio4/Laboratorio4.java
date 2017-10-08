/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Laboratorio 4 de Estructuras de Datos 1.
 * 
 * @author: Kevin Arley Parra Henao - Codigo: 201710093010, Daniel Alejandro Mesa Arango - Codigo: 201710054010 
 * @version: 1.0 08/10/2017
 */
public class Laboratorio4 {

    private final ArrayList<Stack> pilaInicial = new ArrayList<>();
    private final int tamaño;

    public Laboratorio4(int n) {
        this.tamaño = n;
        for (int i = 0; i < tamaño; i++) {
            Stack pilaA = new Stack();
            pilaA.push(i);
            pilaInicial.add(pilaA);
        }
    }

    private void recorrerImprimir() {
        Stack pilaActual = new Stack();
        for (int i = 0; i < tamaño; i++) {
            System.out.print(i+":");
            while (!pilaInicial.get(i).empty()) {
                pilaActual.push(pilaInicial.get(i).pop());
            }
            while(!pilaActual.empty())
            {
                System.out.print(" "+pilaActual.pop());
            }
            System.out.println();
        }

    }

    private void moveOnto(int a, int b) {
        if (a != b) {
            for (int i = 0; i < tamaño; i++) {
                boolean poA = pilaInicial.get(i).contains(a);
                boolean poB = pilaInicial.get(i).contains(b);
                if (poA != poB) {
                    if (poB) {
                        int po = (int) pilaInicial.get(i).pop();
                        while (po != b) {
                            pilaInicial.get(po).push(po);
                            po = (int) pilaInicial.get(i).pop();
                        }
                        pilaInicial.get(i).push(b);
                        pilaInicial.get(i).push(a);

                    }
                    if (poA) {
                        int po = (int) pilaInicial.get(i).pop();
                        while (po != a) {
                            pilaInicial.get(po).push(po);
                            po = (int) pilaInicial.get(i).pop();
                        }
                    }
                }
            }
        }
    }

    private void moveOver(int a, int b) {
        if (a != b) {
            for (int i = 0; i < tamaño; i++) {
                boolean poA = pilaInicial.get(i).contains(a);
                boolean poB = pilaInicial.get(i).contains(b);
                if (poA != poB) {
                    if (poA) {
                        int po = (int) pilaInicial.get(i).pop();
                        while (po != a) {
                            pilaInicial.get(po).push(po);
                            po = (int) pilaInicial.get(i).pop();
                        }

                    }
                    if (poB) {
                        pilaInicial.get(i).push(a);
                    }
                }
            }
        }
    }

    private void moverPilaOnto(int a, int b) {
        if (a != b) {
            int posicionDeB = 0;
            int posicionDeA = 0;
            for (int i = 0; i < tamaño; i++) {
                boolean poA = pilaInicial.get(i).contains(a);
                boolean poB = pilaInicial.get(i).contains(b);
                if (poA) {
                    posicionDeB = i;
                }
                if (poB) {
                    posicionDeA = i;
                }
            }
            if (posicionDeA != posicionDeB) {
                int po = (int) pilaInicial.get(posicionDeB).pop();
                while (po != b) {
                    pilaInicial.get(po).push(po);
                    po = (int) pilaInicial.get(posicionDeB).pop();
                }
                Stack Aux = new Stack();
                po = (int) pilaInicial.get(posicionDeA).pop();
                while (po != a) {
                    Aux.push(po);
                    po = (int) pilaInicial.get(posicionDeA).pop();
                }
                Aux.push(a);
                while (!Aux.empty()) {
                    pilaInicial.get(posicionDeB).push(Aux.pop());
                }
            }
        }
    }

    private void movePilaOver(int a, int b) {
        int posicionDeB = 0;
        int posicionDeA = 0;
        if (a != b) {
            for (int i = 0; i < tamaño; i++) {
                boolean poA = pilaInicial.get(i).contains(a);
                boolean poB = pilaInicial.get(i).contains(b);
                if (poA) {
                    posicionDeA = i;
                }
                if (poB) {
                    posicionDeB = i;
                }
            }
            if (posicionDeA != posicionDeB) {
                Stack Aux = new Stack();
                int po = (int) pilaInicial.get(posicionDeA).pop();
                while (po != a) {
                    Aux.push(po);
                    po = (int) pilaInicial.get(posicionDeA).pop();
                }
                Aux.push(a);
                while (!Aux.empty()) {
                    pilaInicial.get(posicionDeB).push(Aux.pop());
                }

            }
        }
    }

    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Laboratorio4 uno = new Laboratorio4(n);
        String indicacion = in.next();
        while (!indicacion.equals("quit")) {
            int a = in.nextInt();
            String dos = in.next();
            int b = in.nextInt();
            if (indicacion.equals("move")) {
                if (dos.equals("onto")) {
                    uno.moveOnto(a, b);
                } else {
                    uno.moveOver(a, b);
                }
            } else if (indicacion.equals("pile")) {
                if (dos.equals("onto")) {
                    uno.moverPilaOnto(a, b);
                } else {
                    uno.movePilaOver(a, b);
                }
            }
            indicacion = in.next();
        }
        System.out.println();
        uno.recorrerImprimir();
    }
    
}
