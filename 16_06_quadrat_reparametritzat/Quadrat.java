public class Quadrat {
    public static void main(String[] args) {
        dibuixaQuadrat(Integer.parseInt(args[0]), args[1]);
    }

    public static void dibuixaQuadrat(int length, String ch) {
        for (int y=0; y < length; y++) {
            dibuixaLinia(length, ch);
            System.out.println();
        }
    }

    public static void dibuixaLinia(int length, String ch) {
        for (int x = 0; x < length; x++) {
            System.out.print(" " + ch);
        }
    }
}
