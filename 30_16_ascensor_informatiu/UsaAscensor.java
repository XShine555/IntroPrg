/*
 * Iker Rivera Garcia
 * 17/03/2025
 * Clase UsaAscensor, clase principal que usa la clase Ascensor.
 */

public class UsaAscensor {
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();
        System.out.println("Pis inicial: " + ascensor.getPis());
        System.out.println("Moviment inicial: " + ascensor.getMoviment());
        System.out.println("Introdueix nou pis:");
        String newPis = Entrada.readLine();
        if (!UtilString.esEnter(newPis))
        {
            System.out.println("Error: el pis ha de ser un enter.");
            return;
        }
        ascensor.setPis(Integer.parseInt(newPis));

        System.out.println("Introdueix nou moviment:");
        String newMoviment = Entrada.readLine();
        ascensor.setMoviment(newMoviment);

        System.out.println("Pis final: " + ascensor.getPis());
        System.out.println("Moviment final: " + ascensor.getMoviment());
        System.out.println("Estat de l'ascensor: " + ascensor.comEsta());
    }
}