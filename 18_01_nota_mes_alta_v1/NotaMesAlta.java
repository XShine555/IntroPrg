public class NotaMesAlta {
    public static void main(String[] args) {
        System.out.println("Introdueix les notes (-1 per finalitzar)");
        String input = Entrada.readLine();

        int higher = 0;
        int count = 0;

        while (!input.isBlank()) {
            int number = Integer.parseInt(input);

            if (number < 0 || number > 10)
                break;

            if (number > higher)
                higher = number;

            count++;

            input = Entrada.readLine();
        }

        if (higher > 1)
            System.out.println("La nota més alta és " + higher);
        else
            System.out.println("Com a mínim calen dues notes");
    }
}