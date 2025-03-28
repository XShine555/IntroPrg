/*
 * Iker Rivera Garcia
 * 28/03/2025
 * Classe Feli, que representa un felí
 * i conté els mètodes netejaUrpes i menja
 * que imprimeixen un missatge a la consola
 * amb el nom de la classe i el tipus de menjar
 * que s'està menjant.
 */

public class Feli {
    public Feli() {
        System.out.println("Neix Felí");
    }
    public void netejaUrpes() {
        System.out.println("Felí neteja urpes des de " + this.getClass());
    }
    public void menja(Menjar menjar) {
        System.out.println("Felí menja " + menjar + " des de " + this.getClass());
    }
}