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
        return "ENVOLAT(" + "\"" + string + "\"" + ")";
    }
}
