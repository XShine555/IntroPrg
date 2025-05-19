/*
 * Iker Rivera Garcia
 * 19/05/2025
 * Test de la classe Punt, usa JUnit per fer les proves
 * de les funcionalitats de la classe Punt.
 */

public class TestSegment {
    @org.junit.jupiter.api.Test
    public void constructorDefecte() {
        Segment segment = new Segment();
        assert(segment.getP1().getX() == 0);
        assert(segment.getP1().getY() == 0);
        assert(segment.getP2().getX() == 0);
        assert(segment.getP2().getY() == 0);
    }

    @org.junit.jupiter.api.Test
    public void constructorCustomParams() {
        Punt punt1 = new Punt(5, 10);
        Punt punt2 = new Punt(3, 7);
        Segment segment = new Segment(punt1, punt2);
        assert(segment.getP1().getX() == 5);
        assert(segment.getP1().getY() == 10);
        assert(segment.getP2().getX() == 3);
        assert(segment.getP2().getY() == 7);
    }

    @org.junit.jupiter.api.Test
    public void constructorCustomParamsXZero() {
        Punt punt1 = new Punt(5, 10);
        Punt punt2 = new Punt(0, 7);
        Segment segment = new Segment(punt1, punt2);
        assert(segment.getP1().getX() == 5);
        assert(segment.getP1().getY() == 10);
        assert(segment.getP2().getX() == 0);
        assert(segment.getP2().getY() == 7);
    }

    @org.junit.jupiter.api.Test
    public void longitud() {
        Punt punt1 = new Punt(5, 10);
        Punt punt2 = new Punt(3, 7);
        Segment segment = new Segment(punt1, punt2);
        assert(segment.longitud() == Math.sqrt(Math.pow(5 - 3, 2) + Math.pow(10 - 7, 2)));
    }
}
