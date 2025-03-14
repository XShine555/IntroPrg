/*
 * Iker Rivera Garcia
 * 15/03/2025
 * Clase GatRenat, que representa un gato con nombre, vidas y posición
 */

public class GatRenat extends Gat {
    private static final String NOM = "Renat";

    GatRenat() {
        super(NOM);
    }

    GatRenat(int vides) {
        super(NOM, vides);
    }

    GatRenat(String posicio) {
        super(NOM, posicio);
    }

    GatRenat(int vides, String posicio) {
        super(NOM, vides, posicio);
    }
}
