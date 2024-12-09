public class LloroQuadrat {
    public static void main(String[] args) {
        String input = "";
        do {
            System.out.println("El lloro espera paraula:");
            input = Entrada.readLine();

            System.out.println(getResponse(input));
        }
        while (!input.isBlank());

        System.out.println("Adéu");
    }

    public static String getResponse(String input) {
        String response = switch (input)
        {
            case "dibuixa quadrat" -> drawCords(5, 5);
            case "dibuixa rectangle" -> drawCords(10, 5);
            default -> String.format("El lloro repeteix: %s", input);
        };

        return response;
    }

    private static String drawCords(int xCoord, int yCoord) {
        String result = "";

        for (int y = 0; y < yCoord; y++) {
            for (int x = 0; x < xCoord; x++) {
                result += " X";
            }
            if (y != yCoord-1)
                result += "\n";
        }

        return result;
    }
}
