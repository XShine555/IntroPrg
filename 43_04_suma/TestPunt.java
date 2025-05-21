/*
 * Iker Rivera Garcia
 * 19/05/2024
 * Test de la classe Punt, usa JUnit per fer les proves
 * de les funcionalitats de la classe Punt.
 */

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestPunt {
    @Test
    public void constructorDefecteYZero() {
        Punt punt = new Punt();
        Assertions.assertEquals(0, punt.getX());
        Assertions.assertEquals(0, punt.getY());
    }

    @Test
    public void constructorCustomParams() {
        Punt punt = new Punt(5, 10);
        Assertions.assertEquals(5, punt.getX());
        Assertions.assertEquals(10, punt.getY());
    }

    @Test
    public void sumaDosPunts() {
        Punt punt1 = new Punt(5, 10);
        Punt punt2 = new Punt(3, 7);
        punt1.suma(punt2);
        Assertions.assertEquals(8, punt1.getX());
        Assertions.assertEquals(17, punt1.getY());
    }

    @Test
    public void constructorDefecteXZero() {
        Punt punt = new Punt();
        Assertions.assertEquals(0, punt.getX());
        Assertions.assertEquals(0, punt.getY());
    }

    @Test
    public void xPositiu() {
        Punt punt = new Punt();
        Assertions.assertTrue(punt.getX() >= 0);
    }

    @Test
    public void yPositiu() {
        Punt punt = new Punt();
        Assertions.assertTrue(punt.getY() >= 0);
    }

    @Test
    public void comprobaSetters() {
        Punt punt = new Punt();
        punt.setX(5);
        punt.setY(10);
        Assertions.assertEquals(5, punt.getX());
        Assertions.assertEquals(10, punt.getY());
    }
}