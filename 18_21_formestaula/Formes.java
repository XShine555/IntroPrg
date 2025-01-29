public class Formes {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String item = args[i];

            String[] split = item.split("x");
            if (split.length < 2) {
                System.out.println("Especificació errònia");
                continue;
            }

            int x = Integer.parseInt(split[0]);
            if (x < 0 || x > 99) {
                System.out.println("Especificació errònia");
                continue;
            }

            int find = findIndexOfLastNumber(split[1]);

            if (find == -1) {
                System.out.println("Especificació errònia");
                continue;
            }

            int y = Integer.parseInt(split[1].substring(0, find + 1));
            String mode = split[1].substring(find + 1);

            if (y < 0 || y > 99) {
                System.out.println("Especificació errònia");
                continue;
            }

            boolean[][] taula = new boolean[x][y];
            System.out.format("%sx%s%n", x, y);
            if (mode.equals("\\")) {
                UtilTaula.inicialitzaPrimeraDiagonal(taula);
            }
            else if (mode.equals("|")) {
                UtilTaula.inicialitzaVerticalMig(taula);
            }
            else if (mode.equals("-")) {
                UtilTaula.inicialitzaHoritzontalMig(taula);
            }
            else if (mode.equals("+")) {
                UtilTaula.inicialitzaQuarts(taula);
            }
            else if (mode.equals("/")) {
                UtilTaula.inicialitzaSegonaDiagonal(taula);
            }
            else if (mode.equals("x")) {
                UtilTaula.inicialitzaCreu(taula);
            }
            else if (mode.equals("=")) {
                UtilTaula.inicialitzaPasVianants(taula);
            }
            else if (mode.equals("||")) {
                UtilTaula.inicialitzaZebra(taula);
            }
            else if (mode.equals("++")) {
                UtilTaula.inicialitzaEscacs(taula);
            }
            else if (!mode.isBlank()) {
                System.out.println("Especificació errònia");
                continue;
            }

            String resultat = UtilTaula.taulaToString(taula, 'X', '·');
            System.out.println(resultat);
        }
    }

    private static int findIndexOfLastNumber(String text) {
        if (text.length() < 0)
            return -1;

        int lastNumber = -1;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            
            if (Character.isDigit(currentChar)) {
                lastNumber = i;
            }
            else {
                return lastNumber;
            }
        }
        return lastNumber;
    }
}
