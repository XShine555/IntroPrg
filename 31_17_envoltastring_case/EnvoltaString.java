public class EnvoltaString {
    private String string;

    public EnvoltaString(String string) {
        this.string = string;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EnvoltaString) {
            EnvoltaString other = (EnvoltaString) obj;
            return this.string.toUpperCase().equals(other.string.toUpperCase());
        }
        return false;
    }
}
