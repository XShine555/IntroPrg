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

        if (!Vi.esValid(
                vi.getRef(),
                vi.getNom(),
                vi.getPreu(),
                vi.getEstoc(),
                vi.getLloc(),
                vi.getOrigen(),
                vi.getTipus(),
                vi.getCollita()
        )) {
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

    public List<Vi> cerca(Especificacio espec) throws IllegalArgumentException {
        if (espec == null) {
            throw new IllegalArgumentException("espec no pot ser null");
        }

        List<Vi> resultats = new ArrayList<>();

        for (Vi vi : vins) {
            if (vi == null)
                continue;

            if (espec.getNom() != null && !espec.getNom().isEmpty() &&
                    !UtilString.esPlantillaDeText(espec.getNom(), vi.getNom()))
                continue;

            if (espec.getOrigen() != null && !espec.getOrigen().isEmpty() &&
                    !UtilString.esPlantillaDeText(espec.getOrigen(), vi.getOrigen()))
                continue;

            if (espec.getTipus() != null && !espec.getTipus().isEmpty() &&
                    !UtilString.esPlantillaDeText(espec.getTipus(), vi.getTipus()))
                continue;

            if (espec.getCollita() != null && !espec.getCollita().isEmpty() &&
                    !UtilString.esPlantillaDeText(espec.getCollita(), vi.getCollita()))
                continue;

            resultats.add(vi);
        }

        return resultats;
    }

    public List<Vi> cerca(Especificacio espec, int preuMax, int estocMin) throws IllegalArgumentException {
        if (espec == null) {
            throw new IllegalArgumentException("espec no pot ser null");
        }

        List<Vi> resultats = new ArrayList<>();

        for (Vi vi : vins) {
            if (vi == null)
                continue;

            if (espec.getNom() != null && !espec.getNom().isEmpty() &&
                    !UtilString.esPlantillaDeText(espec.getNom(), vi.getNom()))
                continue;

            if (preuMax >= 0 && vi.getPreu() > preuMax)
                {
                    continue;
                }

            if (espec.getOrigen() != null && !espec.getOrigen().isEmpty() &&
                    !UtilString.esPlantillaDeText(espec.getOrigen(), vi.getOrigen()))
                continue;

            if (espec.getTipus() != null && !espec.getTipus().isEmpty() &&
                    !UtilString.esPlantillaDeText(espec.getTipus(), vi.getTipus()))
                continue;

            if (espec.getCollita() != null && !espec.getCollita().isEmpty() &&
                    !UtilString.esPlantillaDeText(espec.getCollita(), vi.getCollita()))
                continue;

            if (estocMin >= 0 && estocMin > vi.getEstoc())
                continue;

            resultats.add(vi);
        }

        return resultats;
    }

    /*public List<Vi> cerca(Vi plantilla) throws IllegalArgumentException {
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
    }*/
}
