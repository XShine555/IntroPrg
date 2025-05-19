/*
 * Iker Rivera Garcia
 * 19/05/2025
 * Clase Punt, representa un punt en un sistema de coordenades.
 */

public class Punt {
    private int x;
    private int y;   
    
    public Punt() {
        this.x = 0;
        this.y = 0;
    }

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void suma(Punt punt) {
        this.x += punt.getX();
        this.y += punt.getY();
    }

    @Override
    public String toString() {
        return String.format("Punt(%d, %d)", x, y);
    }
}
