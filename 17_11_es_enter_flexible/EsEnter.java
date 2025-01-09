public class EsEnter {
    public static void main(String[] args) {
        boolean isStrict = false;

        if (args.length > 0) {
            if (args[0].equals("estricte")) {
                isStrict = true;
            } else if (args[0].equals("flexible")) {
                isStrict = false;
            } else {
                System.out.println("Modalitat no reconeguda");
                return;
            }
        }

        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text = Entrada.readLine();

        while (!text.isBlank()) {
            if (!isStrict)
                text = text.replace(" ", "");
            else {
                if (text.contains(".") || text.contains("_")) {
                    System.out.println("No és enter");
                    text = Entrada.readLine();
                    continue;
                }
            }

            if (UtilString.esEnter(text)) {
                System.out.println("És enter");
            } else {
                System.out.println("No és enter");
            }

            text = Entrada.readLine();
        }

        System.out.println("Adéu");
    }
}
