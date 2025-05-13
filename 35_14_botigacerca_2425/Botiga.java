/*
 * Iker Rivera Garcia
 * Exercici 31_02. La classe
 * Botiga.java
 * Classe Botiga, representa una botiga de vins
 */

import java.util.ArrayList;
import java.util.List;

public class Botiga {
    private static final int DEFAULT_MAX_VINS = 10;
    private List<Vi> vins;

    public Botiga() {
        this.vins = new ArrayList<>();
    }

    public List<Vi> getVins() {
        return vins;
    }

    public boolean isPlena() {
        return false;
    }

    public Vi afegeix(Vi vi) throws IllegalArgumentException {
        if (vi == null) {
            throw new IllegalArgumentException("El vi no pot ser null");
        }

        if (!vi.esValid()) {
            throw new IllegalArgumentException("El vi ha de ser vàlid");
        }

        if (cerca(vi.getRef()) != null)
            throw new IllegalArgumentException("Referència de vi repetida");

        vins.add(vi);

        return vi;
    }

    public Vi elimina(String ref) throws IllegalArgumentException {
        if (ref == null || ref.isEmpty()) {
            throw new IllegalArgumentException("La referència no pot ser null");
        }
        ref = UtilString.normalitzaString(ref);

        for (int i = 0; i < vins.size(); i++) {
            Vi vi = vins.get(i);

            if (vi != null && vi.getRef().equalsIgnoreCase(ref)) {
                if (vi.getEstoc() > 0) {
                    throw new IllegalArgumentException("El vi a eliminar no pot tenir estoc");
                }

                vins.remove(i);
                return vi;
            }
        }

        throw new IllegalArgumentException("La instància a eliminar ha d'estar present");
    }

    public Vi cerca(String ref) throws IllegalArgumentException {
        if (ref == null || ref.isEmpty()) {
            throw new IllegalArgumentException("La referència no pot ser null");
        }
        ref = UtilString.normalitzaString(ref);

        for (int i = 0; i < vins.size(); i++) {
            Vi vi = vins.get(i);

            if (vi != null && vi.getRef().equalsIgnoreCase(ref)) {
                return vi;
            }
        }

        return null;
    }

    public List<Vi> cerca(Vi plantilla) throws IllegalArgumentException {
        if (plantilla == null) {
            throw new IllegalArgumentException("La plantilla no pot ser null");
        }
        List<Vi> resultats = new ArrayList<>();

        for (Vi vi : vins) {
            if (vi == null)
                continue;

            if (plantilla.getRef() != null && !plantilla.getRef().isEmpty() &&
                    !UtilString.normalitzaString(plantilla.getRef()).equalsIgnoreCase(vi.getRef()))
                continue;

            if (plantilla.getNom() != null && !plantilla.getNom().isEmpty() &&
                    !UtilString.esPlantillaDeText(plantilla.getNom(), vi.getNom()))
                continue;

            if (plantilla.getPreu() >= 0 && plantilla.getPreu() < vi.getPreu())
                continue;

            if (plantilla.getLloc() != null && !plantilla.getLloc().isEmpty() &&
                    !UtilString.esPlantillaDeText(plantilla.getLloc(), vi.getLloc()))
                continue;

            if (plantilla.getOrigen() != null && !plantilla.getOrigen().isEmpty() &&
                    !UtilString.esPlantillaDeText(plantilla.getOrigen(), vi.getOrigen()))
                continue;

            if (plantilla.getTipus() != null && !plantilla.getTipus().isEmpty() &&
                    !UtilString.esPlantillaDeText(plantilla.getTipus(), vi.getTipus()))
                continue;

            if (plantilla.getCollita() != null && !plantilla.getCollita().isEmpty() &&
                    !UtilString.esPlantillaDeText(plantilla.getCollita(), vi.getCollita()))
                continue;

            if (plantilla.getEstoc() >= 0 && plantilla.getEstoc() > vi.getEstoc())
                continue;

            resultats.add(vi);
        }
        return resultats;
    }
}
