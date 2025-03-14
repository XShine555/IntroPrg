/*
 * Iker Rivera Garcia
 * 15/03/2025
 * Clase Ascensor, que tiene dos atributos, pis y posicio, y sus metodos get y set
 */

public class UsaAscensor {
    private static Ascensor ascensor = new Ascensor();
    public static void main(String[] args) {
        System.out.println("Pis inicial: " + ascensor.getPis());
        System.out.println("Moviment inicial: " + ascensor.getMoviment());
        if (args.length > 0 && UtilString.esEnter(args[0])) {
            ascensor.setPis(Integer.parseInt(args[0]));
        }
        if (args.length > 1)
            ascensor.setMoviment(args[1]);
        System.out.println("Pis final: " + ascensor.getPis());
        System.out.println("Moviment final: " + ascensor.getMoviment());
    }
}