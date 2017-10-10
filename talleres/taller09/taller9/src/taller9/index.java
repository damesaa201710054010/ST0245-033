package taller9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author cl18412
 */
public class index {

    UnaTablaDeHash probando = new UnaTablaDeHash();

    public index() throws IOException {
        consola();
    }

    private void consola() throws IOException {
        String dato;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        dato = teclado.readLine();
        while (!dato.equals("exit")) {
            if (dato.equals("ls")) {
                probando.listar();
            }
            if (dato.equals("put")) {
                System.out.println("Ingrese el nombre de la persona:");
                String nombre = teclado.readLine();
                System.out.println("Ingrese el telefono de la persona:");
                String tel = teclado.readLine();
                probando.put(nombre, Integer.parseInt(tel));
            }

            dato = teclado.readLine();

        }
    }

    public static void main(String[] args) {
        try {
            index inicio = new index();
        } catch (IOException e) {
            System.out.println("FALLO");
        }

    }
}
