/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller9;

/**
 *
 * @author cl18412
 */
//Una tabla de hash donde la llave es un String y el valor un int.
public class UnaTablaDeHash {
    // Ojo, esta tabla definida así no permite manejar las colisiones

    private int[] tabla;

    public UnaTablaDeHash() {
        tabla = new int[10];
    }

    // Ojo, esta función hash es muy ingenua
    private int funcionHash(String k) {
        int suma = 0;
        for (int i = 0; i < k.length(); ++i) {
            if (i % 2 == 0) {
                suma = suma + k.codePointAt(i) * 2;
            } else {
                suma = suma + k.codePointAt(i) * 3;
            }
        }
        return (suma) % 10;
    }

    // Ojo con las colisiones
    public int get(String k) {
        return funcionHash(k);
    }

    private boolean exist(int i) {
        if (tabla[i] != 0) {
            return true;
        }
        return false;
    }
    
    private boolean guardar(int v){
        for(int i = 0; i < tabla.length; ++i){
            if(tabla[i] == 0){
                tabla[i] = v;
                return true;
            }
        }
        return false;
    }

    // Ojo con las colisiones
    public void put(String k, int v) {
        int val = get(k);
        if (exist(val)) {
            if(!guardar(v)){
                System.out.println("No hay espacio para guardar");
            }
        } else {
            tabla[val] = v;
        }
    }

    public void listar() {
        System.out.print(tabla[0]);
        for (int x = 1; x < tabla.length; ++x) {
            System.out.print("-" + tabla[x]);
        }
    }
}
