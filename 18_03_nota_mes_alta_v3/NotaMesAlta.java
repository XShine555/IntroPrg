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
            
            notes += number;

            input = Entrada.readLine();
        }

        if (notes.length() > 1) {
            String newNotes = "";
            String joinNotes = "";
            for (int i = 0; i < notes.length(); i++) {
                char iChar = newNotes.charAt(i);

                if (iChar == (char)(higher + '0')) 
                    continue;

                newNotes += iChar;
            }

            for (int i = 0; i < newNotes.length(); i++) {
                char iChar = newNotes.charAt(i);

                if (iChar == (char)(higher + '0')) 
                    continue;

                joinNotes += iChar;

                if (i == newNotes.length() - 2)
                    joinNotes += " i ";
                else if (i < newNotes.length() - 1)
                    joinNotes += ", ";
            }

            System.out.format("La nota més alta és %s. %s", higher, joinNotes.isBlank() ? "No queda cap altra nota." : "La resta de notes és: " + joinNotes);
        }
        else
            System.out.println("Com a mínim calen dues notes");
    }
}