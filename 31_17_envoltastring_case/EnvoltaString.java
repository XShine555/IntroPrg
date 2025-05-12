public class EnvoltaString {
    private String string;

    public EnvoltaString(String string) {
        this.string = string;
    }

    public boolean equals(EnvoltaString obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EnvoltaString) {
            EnvoltaString other = (EnvoltaString) obj;
            return this.string.equalsIgnoreCase(other.string);
        }
        return false;
    }
}
