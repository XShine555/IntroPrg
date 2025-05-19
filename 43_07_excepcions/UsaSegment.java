/*
 * Iker Rivera Garcia
 * 19/05/2025
 * Clase UsaSegment, que conté el mètode main per executar la classe Segment.
 */

public class UsaSegment {
    public static void main(String[] args){
        int x1 = args.length > 0 ? parseInt(args[0]) : 0; // args[0] si hi és i és enter, o 0 altrament
        int y1 = args.length > 1 ? parseInt(args[1]) : 0; // args[1] si hi és i és enter, o 0 altrament
        int x2 = args.length > 2 ? parseInt(args[2]) : 0; // args[2] si hi és i és enter, o 0 altrament
        int y2 = args.length > 3 ? parseInt(args[3]) : 0; // args[3] si hi és i és enter, o 0 altrament
        Punt punt1 = new Punt(x1, y1);
        Punt punt2 = new Punt(x2, y2);
        Segment segment1 = new Segment(punt1, punt2);
        Segment segment2 = new Segment();
        segment2.setP1(segment1.getP2());
        segment2.setP2(segment1.getP1());
        System.out.printf("p1: %s%n", punt1);
        System.out.printf("p2: %s%n", punt2);
        System.out.printf("s1: %s s1.longitud: %.02f%n", segment1, segment1.longitud());
        System.out.printf("s2: %s s2.longitud: %.02f%n", segment2, segment2.longitud());
    }

    private static int parseInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}