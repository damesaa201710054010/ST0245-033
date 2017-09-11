package javaapplication3;
/**
 * 
 * @author Kevin Arley Parra
 * @author Daniel Mesa 
 */
public class SinEllasList {

    private int size;
    private static int tam = 10;
    private int[] enterosFavoritos;

    public SinEllasList() {
        size = 0;
        enterosFavoritos = new int[tam];
    }

    private void moverDer(int enteroFavorito, int pos) {
        for (int i = size - 1; i >= pos; i--) {
            enterosFavoritos[i + 1] = enterosFavoritos[i];
        }
    }

    private boolean isFull() {
        return (size == enterosFavoritos.length);
    }

    private void actualizar() {
        int[] nuevo = new int[enterosFavoritos.length * 2];
        for (int i = 0; i < enterosFavoritos.length; i++) {
            nuevo[i] = enterosFavoritos[i];
        }
        enterosFavoritos = nuevo;
    }

    public void add(int enteroFavorito, int pos) {
        try {
            addMiEnteroFavoirito(enteroFavorito, pos);
        } catch (Exception e) {
            System.out.println("No se puede realizar la operación");
        }
    }

    public void add(int enteroFavorito) {
        addMiUltimoEntero(enteroFavorito);
    }

    private void addMiEnteroFavoirito(int enteroFavorito, int pos) throws Exception {

        if (!(isFull())) {
            moverDer(enteroFavorito, pos);
            enterosFavoritos[pos] = enteroFavorito;
            size++;
        } else {
            actualizar();
            moverDer(enteroFavorito, pos);
            enterosFavoritos[pos] = enteroFavorito;
            size++;

        }

    }

    private void addMiUltimoEntero(int enteroFavorito) {
        if (!(isFull())) {
            enterosFavoritos[size] = enteroFavorito;
            size++;
        } else {
            actualizar();
            enterosFavoritos[size] = enteroFavorito;
            size++;
        }
    }

    public int get(int pos) {
        return enterosFavoritos[pos];
    }

    public int size() {
        return size;
    }

    public String toString() {
        String r = "[" + enterosFavoritos[0] + "";
        for (int i = 1; i < size; i++) {
            r = r + "," + enterosFavoritos[i];
        }
        return r + "]";
    }

    public static void main(String[] args) {
        SinEllasList sinSusana = new SinEllasList();
        for (int i = 1; i <= 5; i++) {
            sinSusana.add(i);
        }
        sinSusana.add(11, 15);
        System.out.println(sinSusana.toString());
    }

}
