/*
 * Iker Rivera Garcia
 * 28/03/2025
 * Classe GatRenat, que representa un gat
 * i hereta de la classe Gat
 * conté el mètode miola
 * que imprimeix un missatge a la consola
 * amb el nom de la classe
 * i el tipus de menjar
 * que s'està menjant.
 * A més, redefineix el mètode menja
 * per imprimir un missatge
 * amb el nom de la classe
 * i el tipus de menjar
 * que s'està menjant.
 */

public class GatRenat extends Gat {
    public GatRenat() {
        System.out.println("Neix Renat");
    }
    @Override
    public void miola() {
        System.out.println("Renat miola des de " + this.getClass());
    }

    @Override
    public void menja(Menjar menjar) {
        System.out.println("Renat menja " + menjar + " des de " + this.getClass());
        netejaUrpes();
        super.menja(menjar);
    }
}