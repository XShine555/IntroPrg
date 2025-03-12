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
        int quants = Integer.parseInt(args[0]);
        Ascensor[] ascensors = creaAscensorsEnEscala(quants);
        for (int i = 0; i < ascensors.length; i++) {
            System.out.printf("Ascensor %d al pis %d%n", i, ascensors[i].pis);
        }
    }
}