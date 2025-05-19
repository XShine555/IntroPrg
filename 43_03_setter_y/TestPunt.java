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
    public void constructorDefecteXZero() {
        Punt punt = new Punt();
        assert(punt.getX() == 0);
        assert(punt.getY() == 0);
    }

    @org.junit.jupiter.api.Test
    public void constructorDefecteXYPositiu() {
        Punt punt = new Punt();
        assert(punt.getX() >= 0);
        assert(punt.getY() >= 0);
    }
}