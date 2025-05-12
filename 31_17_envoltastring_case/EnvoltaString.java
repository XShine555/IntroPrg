/*
 * EnvoltaString.java
 * Clase EnvoltaString, que encapsula una cadena de text i proporciona
 * un mètode equals que compara dues instàncies de la classe sense tenir en compte
 * les majúscules i minúscules.
 */

public class EnvoltaString {
    private String string;

    public EnvoltaString(String string) {
        this.string = string;
    }

    public boolean equals(EnvoltaString other) {
        return this.string.equalsIgnoreCase(other.string);
    }

    @Override
    public String toString() {
        return "ENVOLTAT(" + "\"" + string + "\"" + ")";
    }
}
