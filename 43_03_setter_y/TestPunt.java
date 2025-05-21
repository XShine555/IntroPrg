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
        Assertions.assertEquals(0, punt.getY());
    }

    @Test
    public void constructorDefecteXZero() {
        Punt punt = new Punt();
        Assertions.assertEquals(0, punt.getY());
    }

    @Test
    public void settersX() {
        Punt punt = new Punt();
        punt.setX(5);
        Assertions.assertEquals(5, punt.getX());
    }

    @Test
    public void settersY() {
        Punt punt = new Punt();
        punt.setY(5);
        Assertions.assertEquals(5, punt.getY());
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