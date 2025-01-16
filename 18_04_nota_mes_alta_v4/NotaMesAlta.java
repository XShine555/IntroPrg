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

            if (notes.length() > 0) {
                String[] currentNums = notes.split(",");
                boolean finded = false;

                for (int i = 0; i < currentNums.length; i++) {
                    int num = Integer.parseInt(currentNums[i]);
                    if (num == number) {
                        finded = true;
                        break;
                    }
                }

                if (!finded)
                    notes += number;
            } else {
                notes += number;
            }

            input = Entrada.readLine();
        }

        if (notes.length() > 1) {
            String joinNotes = "";
            String[] notesSplit = notes.split(",");

            int count = 0;
            for (int i = 0; i < notesSplit.length; i++) {
                int number = Integer.parseInt(notesSplit[i]);

                if (number != higher) {
                    if (!joinNotes.isEmpty())
                        joinNotes += ", ";
                    joinNotes += number;
                    count++;
                }
            }

            if (notesSplit.length > 1) {
                String[] notesArray = joinNotes.split(", ");
                for (int i = 0; i < notesArray.length - 1; i++) {
                    for (int j = i + 1; j < notesArray.length; j++) {
                        int a = Integer.parseInt(notesArray[i]);
                        int b = Integer.parseInt(notesArray[j]);
                        if (a < b) {
                            String temp = notesArray[i];
                            notesArray[i] = notesArray[j];
                            notesArray[j] = temp;
                        }
                    }
                }
                joinNotes = String.join(", ", notesArray);
            }

            if (count > 1) {
                int lastCommaIndex = joinNotes.lastIndexOf(", ");
                joinNotes = joinNotes.substring(0, lastCommaIndex) + " i " + joinNotes.substring(lastCommaIndex + 2);
            }

            System.out.format("La nota més alta és %s. %s", higher,
                    joinNotes.isBlank() ? "No queda cap altra nota." : "La resta de notes és: " + joinNotes);
        } else
            System.out.println("Com a mínim calen dues notes");
    }
}