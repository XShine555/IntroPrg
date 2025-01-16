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
            int lastCommaIndex = -1;
            int count = 0;

            for (int i = 0; i < notes.length(); i++) {
                char c = notes.charAt(i);

                if (c == ',') {
                    int number = Integer.parseInt(buffer);

                    if (number != higher) {
                        if (!joinNotes.isEmpty()) {
                            joinNotes += ", ";
                            lastCommaIndex = joinNotes.length() - 2;
                        }
                        joinNotes += number;
                        count++;
                    }

                    buffer = "";
                } else {
                    buffer += c;
                }
            }
            
            if (!buffer.isEmpty()) {
                int number = Integer.parseInt(buffer);
                if (number != higher) {
                    if (!joinNotes.isEmpty()) {
                        joinNotes += ", ";
                        lastCommaIndex = joinNotes.length() - 2;
                    }
                    joinNotes += number;
                    count++;
                }
            }

            if (count > 1 && lastCommaIndex != -1) {
                joinNotes = joinNotes.substring(0, lastCommaIndex) + " i " + joinNotes.substring(lastCommaIndex + 2);
            }

            System.out.format("La nota més alta és %s. %s", higher, joinNotes.isBlank() ? "No queda cap altra nota." : "La resta de notes és: " + joinNotes);
        }
        else
            System.out.println("Com a mínim calen dues notes");
    }
}