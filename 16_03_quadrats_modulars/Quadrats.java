public class Quadrats {
    public static void main(String[] args) {
        dibuixaQuadrats();
    }

    public static void dibuixaQuadrats() {
        System.out.println("Quants?");
        int amount = Integer.parseInt(Entrada.readLine());
        for (int i=0; i < amount; i++) {
            dibuixaQuadrat();
            System.out.println();
        }
    }

    public static void dibuixaQuadrat() {
        for (int y=0; y < 5; y++) {
            dibuixaLinia();
            System.out.println();
        }
    }

    public static void dibuixaLinia() {
        for (int x = 0; x < 5; x++) {
            System.out.print(" X");
        }
    }
}
