public class Quadrat {
    public static void main(String[] args) {
        dibuixaQuadrat(Integer.parseInt(args[0]));
    }

    public static void dibuixaQuadrat(int length) {
        for (int y=0; y < 5; y++) {
            dibuixaLinia(length);
            System.out.println();
        }
    }

    public static void dibuixaLinia(int length) {
        for (int x = 0; x < length; x++) {
            System.out.print(" X");
        }
    }
}
