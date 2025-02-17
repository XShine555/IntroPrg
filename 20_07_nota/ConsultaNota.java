import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConsultaNota {
    public static final String FITXER_NOTES = "notes.csv";

    public static void main(String[] args) throws IOException {
        System.out.println("Alumne:");
        String input = Entrada.readLine();
        String[] alumnes = carregaAlumnes(FITXER_NOTES);
        String[] proves = carregaProves(FITXER_NOTES);
        int[][] notes = carregaNotes(FITXER_NOTES, alumnes.length, proves.length);

        while (!input.isBlank()) {
            int fila = filaAlumne(input, alumnes);
            if (fila == -1) {
                System.out.format("Alumne \"%s\" no disponible%n", input);
                System.out.println("Alumne:");
                input = Entrada.readLine();
                continue;
            }
            
            System.out.println("Prova:");
            String ejer = Entrada.readLine();

            if (ejer.isBlank())
                break;

            int columna = columnaProva(ejer, proves);
            if(columna == -1) {
                System.out.format("Prova \"%s\" no disponible%n", ejer);
            } else {
                int nota = notes[fila][columna];
                if(nota == -3) {
                    System.out.println("Nota no disponible");
                } else if(nota == -2) {
                    System.out.println("Nota amb valor no numèric o fora de rang");
                } else if(nota == -1) {
                    System.out.println("No Presentat");
                } else {
                    System.out.format("Nota: %s%n", nota);
                }
            }

            System.out.println("Alumne:");
            input = Entrada.readLine();
        }

        System.out.println("Arreveure");
    }
    
    public static String[] carregaAlumnes(String nomFitxer) throws IOException {
        int totalLines = countLines(nomFitxer);
        if(totalLines <= 1) {
            return new String[0];
        }
        String[] array = new String[totalLines - 1];
        FileReader fileReader = new FileReader(nomFitxer);
        BufferedReader input = new BufferedReader(fileReader);
        
        input.readLine();
        for (int i = 0; i < totalLines - 1; i++) {
            String linia = input.readLine();
            array[i] = linia;
        }
        input.close();
        return array;
    }

    public static String[] carregaProves(String nomFitxer) throws IOException {
        FileReader fileReader = new FileReader(nomFitxer);
        BufferedReader input = new BufferedReader(fileReader);
        String linia = input.readLine();
        input.close();
        return splitWithSkip(linia, ",", 1);
    }

    public static int[][] carregaNotes(String nomFitxer, int numAlumnes, int numProves) throws IOException {
        int[][] notes = new int[numAlumnes][numProves];
        FileReader fileReader = new FileReader(nomFitxer);
        BufferedReader input = new BufferedReader(fileReader);
        input.readLine();
        
        for (int i = 0; i < numAlumnes; i++) {
            String linia = input.readLine();
            if(linia == null) {
                for (int j = 0; j < numProves; j++) {
                    notes[i][j] = -3;
                }
            } else {
                String[] camps = linia.split(",");
                for (int j = 0; j < numProves; j++) {
                    int pos = j + 1;
                    if(pos >= camps.length) {
                        notes[i][j] = -3;
                    } else {
                        String valor = camps[pos].trim();
                        if(valor.equalsIgnoreCase("NP")) {
                            notes[i][j] = -1;
                        } else {
                            try {
                                int nota = Integer.parseInt(valor);
                                if(nota >= 0 && nota <= 100) {
                                    notes[i][j] = nota;
                                } else {
                                    notes[i][j] = -2;
                                }
                            } catch (NumberFormatException e) {
                                notes[i][j] = -2;
                            }
                        }
                    }
                }
            }
        }
        input.close();
        return notes;
    }

    public static int filaAlumne(String nomAlumne, String[] alumnes) {
        String normNom = normalize(nomAlumne);
        for (int i = 0; i < alumnes.length; i++) {
            String[] camps = alumnes[i].split(",");
            String alumne = camps[0];
            if(normalize(alumne).equals(normNom)) {
                return i;
            }
        }
        return -1;
    }

    public static int columnaProva(String nomProva, String[] proves) {
        String normProva = normalize(nomProva);
        for (int i = 0; i < proves.length; i++) {
            if(normalize(proves[i]).equals(normProva)) {
                return i;
            }
        }
        return -1;
    }

    private static int countLines(String nomFitxer) throws IOException {
        FileReader fileReader = new FileReader(nomFitxer);
        BufferedReader input = new BufferedReader(fileReader);
        int count = 0;
        while (input.readLine() != null) {
            count++;
        }
        input.close();
        return count;
    }

    private static String[] splitWithSkip(String content, String splitBy, int skip) {
        String[] split = content.split(splitBy);
        String[] result = new String[split.length - skip];
        for (int i = 0; i < result.length; i++) {
            result[i] = split[i + skip].trim();
        }
        return result;
    }

    private static String normalize(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            result += normalize(c);
        }

        return result.trim().toLowerCase();
    }

    private static char normalize(char character) {
        char result = character;
        switch (Character.toLowerCase(result)) {
            case 'à':
            case 'á':
            case 'ä':
                result = 'a';
                break;
            case 'è':
            case 'é':
            case 'ë':
                result = 'e';
                break;
            case 'ì':
            case 'í':
            case 'ï':
                result = 'i';
                break;
            case 'ò':
            case 'ó':
            case 'ö':
                result = 'o';
                break;
            case 'ù':
            case 'ú':
            case 'ü':
                result = 'u';
                break;
        }

        return Character.isUpperCase(character) ? Character.toUpperCase(result) : Character.toLowerCase(result);
    }
}