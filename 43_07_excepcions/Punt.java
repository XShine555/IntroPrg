/*
 * Iker Rivera Garcia
 * 19/05/2025
 * Clase Punt, representa un punt en un sistema de coordenades.
 */

public class Punt {
    private int[] coords = new int[2];  
    
    public Punt() {
        this(0, 0);
    }

    public Punt(int x, int y) throws IllegalArgumentException {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Coordenada negativa");
        }

        this.coords[0] = x;
        this.coords[1] = y;
    }

    public int getX() {
        return coords[0];
    }
    
    public int getY() {
        return coords[1];
    }

    public void setX(int x) {
        this.coords[0] = x;
    }

    public void setY(int y) {
        this.coords[1] = y;
    }

    public void suma(Punt punt) {
        this.coords[0] += punt.getX();
        this.coords[1] += punt.getY();
    }

    @Override
    public String toString() {
        return String.format("Punt(%d, %d)", getX(), getY());
    }
}
