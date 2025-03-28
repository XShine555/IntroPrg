/*
 * Iker Rivera Garcia
 * 28/03/2025
 * Clase DemoCrides, on la funció main
 * crea objectes de les classes Feli, Gat i GatRenat
 * i crida els mètodes netejaUrpes, menja i miola
 * per veure com es comporten.
 */

public class DemoCrides {
    public static void main(String[] args) {
        var feli = new Feli();
        var gat = new Gat();
        var renat = new GatRenat();

        feli.netejaUrpes();
        gat.netejaUrpes();
        renat.netejaUrpes();

        gat.miola();
        renat.miola();

        var bacalla = new Menjar("bacallà");
        renat.menja(bacalla);
    }  
    
    static class Feli {
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
    
    static class Gat extends Feli {
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
    
    static class GatRenat extends Gat {
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
    
    static class Menjar {
        private static final String MENJAR_PER_DEFECTE = "sardines";
        private final String nom;
        public Menjar(String nom) {
            if (nom != null && !nom.isEmpty()) {
                this.nom = nom;
            } else {
                this.nom = MENJAR_PER_DEFECTE;
            }
            System.out.println("Neix Menjar(\"" + this.nom + "\")");
        }
        public String toString() { return nom; }
    }
}
