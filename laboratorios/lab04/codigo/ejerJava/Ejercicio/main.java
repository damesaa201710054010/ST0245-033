/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 *
 * @author evinracher
 */
public class main {

    public static void main(String[] args) {
        Banco miBanco = new Banco();
        String nombre = "Luisa";
        for (int i = 0; i < 4; i++) {
            nombre = nombre.substring(0, 5) + i;
            miBanco.ponerEnEspera(nombre, i);
        }
        miBanco.ponerEnEspera(nombre, 0);
        miBanco.ponerEnEspera("Kevin", 0);
        miBanco.ponerEnEspera("Daniel", 1);
        miBanco.ponerEnEspera("Jacinto", 3);
        miBanco.imprimirFilas();
        miBanco.atender();
        miBanco.imprimirFilas();

    }
}
