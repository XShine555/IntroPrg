public class Formes {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String item = args[i];

            String[] split = item.split("x", 2);
            if (split.length < 2 || split[0].isBlank() || split[1].isBlank()) {
                System.out.println(item);
                System.out.println("Especificació no vàlida");
                continue;
            }

            int x = Integer.parseInt(split[0]);
            if (x < 0 || x > 99) {
                System.out.println(item);
                System.out.println("Especificació no vàlida");
                continue;
            }

            int find = findIndexOfLastNumber(split[1]);

            if (find == -1) {
                System.out.println(item);
                System.out.println("Especificació no vàlida");
                continue;
            }

            int y = Integer.parseInt(split[1].substring(0, find + 1));
            String mode = split[1].substring(find + 1);
            if (y < 0) {
                System.out.println(item);
                System.out.println("Especificació no vàlida");
                continue;
            }
            if (y > 32)
                y = 32;

            boolean[][] taula = new boolean[x][y];
            System.out.println(item);
            if (mode.equals("*\\")) {
                UtilTaula.inicialitzaPrimeraDiagonalPrimerPle(taula);
            }
            else if (mode.equals("\\*")) {
                UtilTaula.inicialitzaPrimeraDiagonalSegonPle(taula);
            }
            else if (mode.equals("*/")) {
                UtilTaula.inicialitzaSegonaDiagonalPrimerPle(taula);
            }
            else if (mode.equals("/*")) {
                UtilTaula.inicialitzaSegonaDiagonalSegonPle(taula);
            }
            else if (mode.equals("*|")) {
                UtilTaula.inicialitzaVerticalMigPrimerPle(taula);
            }
            else if (mode.equals("|*")) {
                UtilTaula.inicialitzaVerticalMigSegonPle(taula);
            }
            else if (mode.equals("*-")) {
                UtilTaula.inicialitzaHoritzontalMigPrimerPle(taula);
            }
            else if (mode.equals("-*")) {
                UtilTaula.inicialitzaHoritzontalMigSegonPle(taula);
            }
            else if (mode.equals("*+")) {
                UtilTaula.inicialitzaQuartsNOPle(taula);
            }
            else if (mode.equals("**+")) {
                UtilTaula.inicialitzaQuartsSOPle(taula);
            }
            else if (mode.equals("+*")) {
                UtilTaula.inicialitzaQuartsNEPle(taula);
            }
            else if (mode.equals("+**")) {
                UtilTaula.inicialitzaQuartsSEPle(taula);
            }
            else if (mode.equals("*+**")) {
                UtilTaula.inicialitzaQuartsNOSEPlens(taula);
            }
            else if (mode.equals("**+*")) {
                UtilTaula.inicialitzaQuartsSONEPlens(taula);
            }
            else if (mode.equals("*x")) {
                UtilTaula.inicialitzaCreuNPle(taula);
            }
            else if (mode.equals("**x")) {
                UtilTaula.inicialitzaCreuOPle(taula);
            }
            else if (mode.equals("x*")) {
                UtilTaula.inicialitzaCreuSPle(taula);
            }
            else if (mode.equals("x**")) {
                UtilTaula.inicialitzaCreuEPle(taula);
            }
            else if (mode.equals("*x*")) {
                UtilTaula.inicialitzaCreuNSPlens(taula);
            }
            else if (mode.equals("**x**")) {
                UtilTaula.inicialitzaCreuOEPlens(taula);
            }
            else if (!mode.isBlank()) {
                System.out.println("Especificació no vàlida");
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
