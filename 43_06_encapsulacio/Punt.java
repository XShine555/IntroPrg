/*
 * Iker Rivera Garcia
 * 19/05/2025
 * Clase Punt, representa un punt en un sistema de coordenades.
 */

public class Punt {
    private int[] coord = new int[2];  
    
    public Punt() {
        this(0, 0);
    }

    public Punt(int x, int y) {
        this.coord[0] = x;
        this.coord[1] = y;
    }

    public int getX() {
        return coord[0];
    }
    
    public int getY() {
        return coord[1];
    }

    public void setX(int x) {
        this.coord[0] = x;
    }

    public void setY(int y) {
        this.coord[1] = y;
    }

    public void suma(Punt punt) {
        this.coord[0] += punt.getX();
        this.coord[1] += punt.getY();
    }

    @Override
    public String toString() {
        return String.format("Punt(%d, %d)", getX(), getY());
    }
}
