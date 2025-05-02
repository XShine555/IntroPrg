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
        this(DEFAULT_MAX_VINS);
    }

    public Botiga(int maxVins) {
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

    public Vi afegeix(Vi vi) {
        if (!vi.esValid())
            return null;

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
        nom = Vi.normalitzaString(nom);

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

    public Vi cerca(String ref) {
        for (int i = 0; i < vins.length; i++) {
            Vi vi = vins[i];

            if (vi != null && vi.getRef().equalsIgnoreCase(ref)) {
                return vi;
            }
        }

        return null;
    }

    public Vi cerca(Vi plantilla) {
        for (Vi vi: vins) {
            if (vi == null) continue;
            if (! plantilla.getRef().isEmpty() && ! plantilla.getRef().equalsIgnoreCase(vi.getRef())) 
                continue;
            if (! plantilla.getNom().isEmpty() && ! plantilla.getNom().equalsIgnoreCase(vi.getNom())) 
                continue;
            if (plantilla.getPreu() >= 0 && plantilla.getPreu() <= vi.getPreu()) 
                continue;

            if (! plantilla.getLloc().isEmpty() && ! plantilla.getLloc().equalsIgnoreCase(vi.getLloc()))
                continue;
            if (! plantilla.getOrigen().isEmpty() && ! plantilla.getOrigen().equalsIgnoreCase(vi.getOrigen()))
                continue;
            if (! plantilla.getTipus().isEmpty() && ! plantilla.getTipus().equalsIgnoreCase(vi.getTipus()))
                continue;
            if (! plantilla.getCollita().isEmpty() && ! plantilla.getCollita().equalsIgnoreCase(vi.getCollita()))
                continue;
            if (plantilla.getEstoc() >= 0 && plantilla.getEstoc() <= vi.getEstoc()) 
                continue;

            return vi;
        }
        return null;
    }
}
