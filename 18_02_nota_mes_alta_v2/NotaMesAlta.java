/**
 * Programa que llegeix notes i mostra la nota més alta.
 */
public class NotaMesAlta {
    public static void main(String[] args) {
        System.out.println("Introdueix les notes (-1 per finalitzar)");
        String input = Entrada.readLine();
        String notes = "";

        int higher = 0;

        while (!input.isBlank()) {
            int number = Integer.parseInt(input);

            if (number < 0 || number > 10)
                break;

            if (number > higher)
                higher = number;

            if (!notes.isBlank())
                notes += ",";
            notes += number;

            input = Entrada.readLine();
        }

        if (notes.length() > 1) {
            String joinNotes = "";
            String buffer = "";
            for (int i = 0; i < notes.length(); i++) {
                char currentChar = notes.charAt(i);
                if (currentChar == ',') {
                    joinNotes += buffer;
                    buffer = "";

                    if (i < notes.length() - 2)
                        joinNotes += ", ";
                }
                else {
                    buffer += currentChar;
                }
            }

            if (buffer.length() > 0) {
                if (joinNotes.length() > 0)
                    joinNotes += " i ";
                joinNotes += buffer;
            }

            System.out.format("La nota més alta és %s de les introduïdes: %s", higher, joinNotes);
        }
        else
            System.out.println("Com a mínim calen dues notes");
    }
}