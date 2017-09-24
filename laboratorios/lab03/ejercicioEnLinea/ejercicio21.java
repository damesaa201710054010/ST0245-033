package javaapplication10;

import java.io.BufferedReader;
import java.util.LinkedList;
import java.io.InputStreamReader;
import java.io.IOException;

public class ejercicio21 {

    LinkedList<String> tecleado = new LinkedList<String>();

    public LinkedList<String> teclear(String entrada) {
        int j = 0;
        for (int i = 0; i < entrada.length(); ++i) {
            if (entrada.charAt(i) == '[') {
                j = 0;
            } else if (entrada.charAt(i) == ']') {
                j = tecleado.size();
            } else {
                tecleado.add(j, entrada.charAt(i)+"");
                j++;
            }
        }
        return tecleado;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada = br.readLine();
        ejercicio21 ej = new ejercicio21();
        String out = ej.teclear(entrada).toString();
        System.out.println(ej.imprimir(out));   
    }

   
    public String imprimir(String str ){
    String r = "";
        for(int i = 0; i < str.length();++i){
            if(!(str.charAt(i) == ',' )){
            r = r + str.charAt(i);
            }
    }
        return r;
    }

}
