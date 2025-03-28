/*
 * Iker Rivera Garcia
 * 28/03/2025
 * Clase Menjar, que representa un menjar
 * i conté el mètode toString
 * que imprimeix el nom del menjar.
 */

public class Menjar {
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