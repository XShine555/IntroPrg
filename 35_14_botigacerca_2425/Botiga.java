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
        this(DEFAULT_MAX_VINS);
    }

    public List<Vi> getVins() {
        return vins;
    }

    public Botiga(int maxVins) throws IllegalArgumentException {
        if (maxVins <= 0) {
            throw new IllegalArgumentException("No es pot crear una botiga amb menys d'un vi");
        }

        this.vins = new ArrayList<>(maxVins);
    }

    public boolean isPlena() {
        return vins.size() >= DEFAULT_MAX_VINS;
    }

    public Vi afegeix(Vi vi) throws IllegalArgumentException, BotigaException {
        if (vi == null) {
            throw new IllegalArgumentException("El vi no pot ser null");
        }

        if (!vi.esValid()) {
            throw new IllegalArgumentException("El vi ha de ser vàlid");
        }

        if (cerca(vi.getRef()) != null)
            throw new IllegalArgumentException("Referència de vi repetida");

        for (int i = 0; i < vins.size(); i++) {
            if (vins.get(i) == null) {
                vins.set(i, vi);
                return vi;
            }
        }

        throw new BotigaException("Botiga plena");
    }

    public Vi elimina(String ref) throws IllegalArgumentException {
        if (ref == null || ref.isEmpty()) {
            throw new IllegalArgumentException("La referència no pot ser null");
        }
        ref = Vi.normalitzaString(ref);

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
        ref = Vi.normalitzaString(ref);

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
                    !Vi.normalitzaString(plantilla.getRef()).equalsIgnoreCase(vi.getRef()))
                continue;

            if (plantilla.getNom() != null && !plantilla.getNom().isEmpty() &&
                    !Vi.normalitzaString(plantilla.getNom()).equalsIgnoreCase(vi.getNom()))
                continue;

            if (plantilla.getPreu() >= 0 && plantilla.getPreu() < vi.getPreu())
                continue;

            if (plantilla.getLloc() != null && !plantilla.getLloc().isEmpty() &&
                    !Vi.normalitzaString(plantilla.getLloc()).equalsIgnoreCase(vi.getLloc()))
                continue;

            if (plantilla.getOrigen() != null && !plantilla.getOrigen().isEmpty() &&
                    !Vi.normalitzaString(plantilla.getOrigen()).equalsIgnoreCase(vi.getOrigen()))
                continue;

            if (plantilla.getTipus() != null && !plantilla.getTipus().isEmpty() &&
                    !Vi.normalitzaString(plantilla.getTipus()).equalsIgnoreCase(vi.getTipus()))
                continue;

            if (plantilla.getCollita() != null && !plantilla.getCollita().isEmpty() &&
                    !Vi.normalitzaString(plantilla.getCollita()).equalsIgnoreCase(vi.getCollita()))
                continue;

            if (plantilla.getEstoc() >= 0 && plantilla.getEstoc() > vi.getEstoc())
                continue;

            resultats.add(vi);
        }
        return resultats;
    }
}
