/*
 * Iker Rivera Garcia
 * Exercici 31_02. La classe
 * Botiga.java
 * Classe Botiga, representa una botiga de vins
 */

public class Botiga {
    private static final int DEFAULT_MAX_VINS = 10;
    private Vi[] vins;

    public Botiga() {
        this.vins = new Vi[DEFAULT_MAX_VINS];
    }

    public Botiga(int maxVins) throws BotigaException {
        if (maxVins <= 0)
            throw new BotigaException("No es pot crear una botiga amb menys d'un vi");

        this.vins = new Vi[maxVins];
    }

    private int currentIndex = 0;

    public void iniciaRecorregut() {
        currentIndex = 0;
    }
    
    public Vi getSeguent() {
        if (currentIndex >= vins.length) {
            return null;
        }

        Vi vi = vins[currentIndex++];
        while (vi == null && currentIndex < vins.length - 1) {
            vi = vins[currentIndex];
            currentIndex++;
        }

        return vi;
    }

    public Vi afegeix(Vi vi) throws IllegalArgumentException {
        if (vi == null) {
            throw new IllegalArgumentException("El vi no pot ser null");
        }

        if (!vi.esValid())
            throw new IllegalArgumentException("El vi no pot ser null");

        if (cerca(vi.getNom()) != null)
            return null;

        for (int i = 0; i < vins.length; i++) {
            if (vins[i] == null) {
                vins[i] = vi;
                return vi;
            }
        }

        return null;
    }

    public Vi elimina(String nom) {
        nom = Vi.normalitzaNom(nom);

        for (int i = 0; i < vins.length; i++) {
            Vi vi = vins[i];

            if (vi != null && vi.getNom().equals(nom)) {
                if (vi.getEstoc() > 0) {
                    return null;
                }

                vins[i] = null;
                return vi;
            }
        }

        return null;
    }

    public Vi cerca(String nom) throws IllegalArgumentException {
        if (nom == null) {
            throw new IllegalArgumentException("La referència no pot ser null");
        }

        nom = Vi.normalitzaNom(nom);

        for (int i = 0; i < vins.length; i++) {
            Vi vi = vins[i];

            if (vi != null && vi.getNom().equalsIgnoreCase(nom)) {
                return vi;
            }
        }

        return null;
    }

    public Vi cerca(Vi plantilla) throws IllegalArgumentException {
        if (plantilla == null) {
            throw new IllegalArgumentException("La referència no pot ser null");
        }

        for (int i = 0; i < vins.length; i++) {
            Vi vi = vins[i];

            if (vi != null && vi.equals(plantilla)) {
                return vi;
            }
        }

        return null;
    }
}
