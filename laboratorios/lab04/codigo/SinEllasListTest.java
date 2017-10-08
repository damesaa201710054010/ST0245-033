/**
 * Pruebas de la clase SinEllasList
 */
package laboratorio4;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * "Traficando rimas"
 *
 * @author Kevin Parra Ft Daniel Mesa
 */
public class SinEllasListTest {

    /**
     * Test of insert method, of class SinEllasList.
     */
    @Test
    public void testInsert() {
        System.out.println("insert test");
        int data = 0;
        int index = 5;
        SinEllasList instance = new SinEllasList();
        //insertar con la lista vacía en una posición diferente a la primera
        assertEquals(instance.insert(data, index), false);
        index = 0;
        //Insertar en la primera posición con la lista vacía
        assertEquals(instance.insert(data, index), true);
        //Borramos para que la lista queda vacía
        instance.removeLast();
        //Insertar en la ultima posición con la lista vacía
        assertEquals(instance.insertLast(data), true);
    }

    /**
     * Test of get method, of class SinEllasList.
     *
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int index = 0;
        SinEllasList instance = new SinEllasList();
        int expResult = 0;
        instance.insert(0, index);
        int result = instance.get(index);
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class SinEllasList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        SinEllasList instance = new SinEllasList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        instance.insert(0, 0);
        expResult = 1;
        result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class SinEllasList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        int index = 2;
        SinEllasList instance = new SinEllasList();
        System.out.println("Size: " + instance.size());
        //eliminar con la lista vacía en una posición diferente a la primera
        assertEquals(instance.remove(index), false);
        index = 0;
        //Eliminar en la primera posición con la lista vacía
        assertEquals(instance.remove(index), false);
        //Insertamos un elemento
        instance.insert(index, 0);
        //Eliminar con un solo elemento
        assertEquals(instance.removeLast(), true);
    }

    /**
     * Test of contains method, of class SinEllasList.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        int data = 0;
        SinEllasList instance = new SinEllasList();
        boolean expResult = false;
        boolean result = instance.contains(data);
        assertEquals(expResult, result);
        instance.insert(0, data);
        expResult = true;
        result = instance.contains(data);
        assertEquals(expResult, result);
    }
}
