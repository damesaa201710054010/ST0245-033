/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller9;

/**
 * 
 * @author Kevin Arley Parra Henao - 201710093010, Daniel Alejandro Mesa Arango - 201710054010 
 * @version: 1.0  02/10/2017
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
        int n = funcionHash(k);
        for(int i = 0; i < tabla.length; i++)
        {
            if(tabla[i] == tabla[n])
            {
                return tabla[i];
            }
        }
        return 00000;
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
        int val = funcionHash(k);
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
