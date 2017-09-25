package laboratorio3;

/**
 * Laboratorio 3 de Estructuras de Datos 1. 
 * Esta clase representa una nevera con su codigo y descripcion
 * 
 * @author: Kevin Arley Parra Henao - Codigo: 201710093010, Daniel Alejandro Mesa Arango - Codigo: 201710054010 
 * @version: 1.0 24/09/2017
 */
public class Neveras {

    private int codigo;
    private String descripcion;

    /**
     * Este constructor crea una nueva nevera (fabrica)
     * @param codigo codigo de producto
     * @param descripcion marca de la nevera
     */
    public Neveras(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    /**
     * Este metodo devuelve el codigo
     * @return entero que es el codigo de la nevera
     */
    public int codigo() {
        return codigo;
    }

    /**
     * Este metodo devuelve la descripcion o marca de la nevera
     * @return String marce de la nervera
     */
    public String descripcion() {
        return descripcion;
    }
}
