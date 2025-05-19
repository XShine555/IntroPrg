/*
 * Iker Rivera Garcia
 * 19/05/2025
 * Clase Segment, representa un segment en un sistema de coordenades.
 */

public class Segment {
    private Punt p1;
    private Punt p2;

    public Segment(Punt p1, Punt p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Punt getP1() {
        return p1;
    }

    public void setP1(Punt p1) {
        this.p1 = p1;
    }

    public Punt getP2() {
        return p2;
    }

    public void setP2(Punt p2) {
        this.p2 = p2;
    }

    public double longitud() {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    @Override
    public String toString() {
        //Segment(Punt(2, 3), Punt(4, 5)) s1.longitud: 2,83
        return String.format("Segment(%s, %s) s1.longitud: %.2f", p1.toString(), p2.toString(), longitud());
    }
}
