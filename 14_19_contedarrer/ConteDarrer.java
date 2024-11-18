public class ConteDarrer {
    public static void main(String[] args) {
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text = Entrada.readLine();

        while (!text.isBlank()) {
            

            text = Entrada.readLine();
        }

        System.out.println("Adéu");
    }
}