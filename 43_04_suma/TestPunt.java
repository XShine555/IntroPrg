/*
 * Iker Rivera Garcia
 * 19/05/2024
 * Test de la classe Punt, usa JUnit per fer les proves
 * de les funcionalitats de la classe Punt.
 */

public class TestPunt {
    @org.junit.jupiter.api.Test
    public void constructorDefecteYZero() {
        Punt punt = new Punt();
        assert(punt.getX() == 0);
        assert(punt.getY() == 0);
    }

    @org.junit.jupiter.api.Test
    public void constructorCustomParams() {
        Punt punt = new Punt(5, 10);
        assert(punt.getX() == 5);
        assert(punt.getY() == 10);
    }

    @org.junit.jupiter.api.Test
    public void sumaDosPunts() {
        Punt punt1 = new Punt(5, 10);
        Punt punt2 = new Punt(3, 7);
        punt1.suma(punt2);
        assert(punt1.getX() == 8);
        assert(punt1.getY() == 17);
    }

    @org.junit.jupiter.api.Test
    public void constructorDefecteXZero() {
        Punt punt = new Punt();
        assert(punt.getX() == 0);
        assert(punt.getY() == 0);
    }

    @org.junit.jupiter.api.Test
    public void xPositiu() {
        Punt punt = new Punt();
        assert(punt.getX() >= 0);
    }

    @org.junit.jupiter.api.Test
    public void yPositiu() {
        Punt punt = new Punt();
        assert(punt.getY() >= 0);
    }

    @org.junit.jupiter.api.Test
    public void comprobaSetters() {
        Punt punt = new Punt();
        punt.setX(5);
        punt.setY(10);
        assert(punt.getX() == 5);
        assert(punt.getY() == 10);
    }
}