/*
 * Iker Rivera Garcia
 * 19/05/2025
 * Clase UsaPunt, que conté el mètode main per executar la classe Punt.
 */

public class UsaPunt {
    public static void main(String[] args) {
        int x1 = args.length > 0 ? parseInt(args[0]) : 0; // args[0] si hi és i és enter, o 0 altrament
        int y1 = args.length > 1 ? parseInt(args[1]) : 0; // args[1] si hi és i és enter, o 0 altrament
        int x2 = args.length > 2 ? parseInt(args[2]) : 0; // args[2] si hi és i és enter, o 0 altrament
        int y2 = args.length > 3 ? parseInt(args[3]) : 0; // args[3] si hi és i és enter, o 0 altrament
        Punt p1 = new Punt(x1, y1);
        Punt p2 = new Punt(x2, y2);
        System.out.printf("p1: (%d, %d)%n", p1.getX(), p1.getY());
        System.out.printf("p2: (%d, %d)%n", p2.getX(), p2.getY());
        p1.suma(p2);
        System.out.printf("p1+p2: (%d, %d)%n", p1.getX(), p1.getY());
    }

    private static int parseInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}