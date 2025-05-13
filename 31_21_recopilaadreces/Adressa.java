public class Adressa implements Comparable {
    private String identificador;
    private String domini;

    private Adressa(String identificador, String domini) {
        this.identificador = identificador;
        this.domini = domini;
    }

    public static boolean esValida(String text) {
        if (text == null)
            return false;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '-' && c != '_' && c != '.' && c != '@' && c != '+') {
                return false;
            }
        }

        int atIndex = text.indexOf('@');
        if (atIndex == -1 || atIndex != text.lastIndexOf('@')) {
            return false;
        }

        String identificador = text.substring(0, atIndex);
        String domini = text.substring(atIndex + 1);

        if (identificador.isEmpty() || domini.isEmpty())
            return false;

        int puntIndex = domini.indexOf('.');
        if (puntIndex == -1)
            return false;

        if (domini.startsWith(".") || domini.endsWith("."))
            return false;
        if (domini.contains(".."))
            return false;

        String[] parts = domini.split("\\.");
        for (String part : parts) {
            if (part.isEmpty())
                return false;
        }

        String ultim = parts[parts.length - 1];
        if (ultim.length() < 2)
            return false;
        for (int i = 0; i < ultim.length(); i++) {
            if (!Character.isLetter(ultim.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static Adressa fromString(String s) {
        if (!esValida(s)) {
            throw new IllegalArgumentException("Adreça no vàlida: " + s);
        }
        int at = s.indexOf('@');
        return new Adressa(s.substring(0, at), s.substring(at + 1));
    }

    @Override
    public int compareTo(Adressa altra) {
        return this.toString().compareTo(altra.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) 
            return true;
        if (!(o instanceof Adressa)) 
            return false;
        Adressa adressa = (Adressa) o;
        return identificador.equals(adressa.identificador) && domini.equals(adressa.domini);
    }

    @Override
    public String toString() {
        return identificador + "@" + domini;
    }
}
