/*
 * Iker Rivera Garcia
 * 12/03/2025
 * Ascensor.java
 */
public class Ascensor {
    int pis = 0;

    public static Ascensor[] creaAscensorsEnEscala(int quants) {
        Ascensor[] col = new Ascensor[quants];
        for (int i = 0; i < quants; i++) {
            col[i] = new Ascensor();
            col[i].pis = i;
        }
        return col;
    }

    public static void main(String[] args){
        if (args.length != 1 || containsAnyLetter(args[0])){
            return;
        }
        int quants = Integer.parseInt(args[0]);
        if (quants <= 0){
            System.out.println("Cal indicar un únic valor enter.");
            return;
        }
        Ascensor[] ascensors = creaAscensorsEnEscala(quants);
        for (int i = 0; i < ascensors.length; i++) {
            System.out.printf("Ascensor %d al pis %d%n", i, ascensors[i].pis);
        }
    }

    private static boolean containsAnyLetter(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}