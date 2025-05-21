/*
 * Iker Rivera Garcia
 * 19/05/2025
 * Test de la classe Punt, usa JUnit per fer les proves
 * de les funcionalitats de la classe Punt.
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSegment {
    @Test
    public void constructorDefecte() {
        Segment segment = new Segment();
        Assertions.assertEquals(0, segment.getP1().getX());
        Assertions.assertEquals(0, segment.getP1().getY());
        Assertions.assertEquals(0, segment.getP2().getX());
        Assertions.assertEquals(0, segment.getP2().getY());
    }

    @Test
    public void constructorCustomParams() {
        Punt punt1 = new Punt(5, 10);
        Punt punt2 = new Punt(3, 7);
        Segment segment = new Segment(punt1, punt2);
        Assertions.assertEquals(5, segment.getP1().getX());
        Assertions.assertEquals(10, segment.getP1().getY());
        Assertions.assertEquals(3, segment.getP2().getX());
        Assertions.assertEquals(7, segment.getP2().getY());
    }

    @Test
    public void constructorCustomParamsXZero() {
        Punt punt1 = new Punt(5, 10);
        Punt punt2 = new Punt(0, 7);
        Segment segment = new Segment(punt1, punt2);
        Assertions.assertEquals(5, segment.getP1().getX());
        Assertions.assertEquals(10, segment.getP1().getY());
        Assertions.assertEquals(0, segment.getP2().getX());
        Assertions.assertEquals(7, segment.getP2().getY());
    }
}
