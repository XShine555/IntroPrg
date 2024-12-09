public class Quadrat {
    public static void main(String[] args) {
        if (args.length > 1 && args[1].length() > 0)
            dibuixaQuadrat(Integer.parseInt(args[0]), args[1].charAt(0));
    }

    public static void dibuixaQuadrat(int costat, char caracter) {
        for (int y=0; y < costat; y++) {
            dibuixaLinia(costat, caracter);
            System.out.println();
        }
    }

    public static void dibuixaLinia(int costat, char caracter) {
        for (int x = 0; x < costat; x++) {
            System.out.print(" " + caracter);
        }
    }
}
