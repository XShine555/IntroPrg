import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class CercaAlumnes {

    public static final String NOM_FITXER = "alumnes.csv";

    static class Alumne {
        String nom;
        String email;
        int edat;
        boolean esOient;
        int[] notes;
    }

    public static Alumne construeixAlumne(String nom, String email,
                                          int edat, boolean esOient,
                                          int[] notes) {
        Alumne alumne = new Alumne();
        alumne.nom = nom;
        alumne.email = email;
        alumne.edat = edat;
        alumne.esOient = esOient;
        alumne.notes = notes;
        return alumne;
    }

    public static void mostraAlumne(Alumne alumne) {
        // cal mostrar les dades de l'alumne
        System.out.format("""
                Alumne: %s
                - email: %s
                - edat: %s
                - és oïent: %s
                - notes: %s
                """
            , alumne.nom, alumne.email, alumne.edat, alumne.esOient ? "Sí" : "No", notesACsv(alumne.notes));
    }

    public static String alumneAString(Alumne alumne) {
        return String.format(
                "Alumne(nom: \"%s\", email: \"%s\", " +
                "edat: %d, esOient: %b, notes: {%s})",
                alumne.nom, alumne.email, alumne.edat, alumne.esOient,
                notesACsv(alumne.notes));
    }

    // converteix un array de notes a CSV
    // Té en comptes els valors NP com a -1
    public static String notesACsv(int[] notes) {
        String result = "";
        for (int i = 0; i < notes.length; i++) {
            if (i > 0) {
                result += ",";
            }
            if (notes[i] == -1) {
                result += "NP";
            } else {
                result += notes[i];
            }
        }
        return result;
    }

    public static String alumneACsv(Alumne alumne) {
        return String.format("%s,%s,%d,%b,%s",
                             alumne.nom, alumne.email, alumne.edat,
                             alumne.esOient, notesACsv(alumne.notes));
    }

    public static Alumne csvAAlumne(String csv) {
        String[] parts = csv.split(",", 5);
        String nom = parts[0];
        String email = parts[1];
        int edat = Integer.parseInt(parts[2]);
        boolean esOient = Boolean.parseBoolean(parts[3]);
        int[] notes = stringToIntArray(parts[4]);
        return construeixAlumne(nom, email, edat, esOient, notes);
    }

    public static void main(String[] args) throws IOException {
        // assegura que hi ha el criteri de cerca
        if (args.length < 1) {
            System.out.println("Ús: CercaAlumnes «criteri de cerca»");
            return;
        }

        // declaracions, inicialitzacions, apertura de fitxer, ignora línia de capçaleres, etc.
        FileReader fileReader = new FileReader(NOM_FITXER);
        BufferedReader input = new BufferedReader(fileReader);
        input.readLine(); // ignora capçaleres

        boolean anyFound = false;
        while (true) {
            // llegeix entrada i finalitza bucle si no en queden més
            String line = input.readLine();
            if (line == null) {
                break;
            }

            // converteix l'entrada a Alumne
            Alumne alumne = csvAAlumne(line);

            // comprova si el criteri de cerca es troba dins del nom o
            // el email. Si és així, mostra'l
            String lowerName = alumne.nom.toLowerCase();
            if (lowerName.contains(args[0]) || alumne.email.contains(args[0])) {
                mostraAlumne(alumne);
                anyFound = true;
            }
        }
        // consideracions finals com ara el tancament del fitxer
        input.close();

        if (!anyFound) {
            System.out.println("No s'ha trobat cap alumne");
        }
    }

    private static int[] stringToIntArray(String input) {
        String[] array = input.split(",");
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("NP")) {
                result[i] = -1;
            } else {
                result[i] = Integer.parseInt(array[i]);
            }
        }
        return result;
    }
}