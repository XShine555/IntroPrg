/*
 * Iker Rivera Garcia
 * 28/03/2025
 * Classe Gat, que representa un gat
 * i hereta de la classe Feli
 * conté el mètode miola
 * que imprimeix un missatge a la consola
 * amb el nom de la classe
 * i el tipus de menjar
 * que s'està menjant.
 */

public class Gat extends Feli {
    public Gat() {
        System.out.println("Neix Gat");
    }
    public void miola() {
        System.out.println("Gat miola des de " + this.getClass());
    }
    @Override
    public void menja(Menjar menjar) {
        System.out.println("Gat menja " + menjar + " des de " + this.getClass());
        super.menja(menjar);
    }
}