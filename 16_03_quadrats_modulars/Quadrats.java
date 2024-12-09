public class Quadrats {
    public static void main(String[] args) {
        dibuixaQuadrats();
    }

    public static void dibuixaQuadrats() {
        System.out.println("Quants?");
        int amount = Integer.parseInt(Entrada.readLine());
        for (int linia=amount; linia <= 5; linia++) {
            dibuixaQuadrat();
        }
    }

    public static void dibuixaQuadrat() {
        for (int columna=1; columna <= 5; columna++) {
            dibuixaLinia();
        }
        System.out.println();
    }

    public static void dibuixaLinia() {
        System.out.print(" X");
    }
}
