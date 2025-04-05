/*
 * Iker Rivera Garcia
 * 05/04/2025
 * Garfield.java, consisteix en la classe Garfield que hereta de Gat i implementa
 * l'interfície AnimalDeCompanyia.
 * Aquesta classe conté un mètode deixatEstimar que retorna un missatge
 * indicant que el gat es deixa estimar, però només una mica.
 */

public class Garfield extends Gat implements AnimalDeCompanyia {
    public Garfield() {
        super("Garfield");
    }

    @Override
    public String deixatEstimar() {
        return "em deixo estimar, però només una mica";
    }
}
