public class Quadrats {
    public static void main(String[] args) {
        dibuixaQuadrat();
    }    

    public static void dibuixaQuadrat() {
        for (int linia=1; linia <= 5; linia++) {
            dibuixaLinia();
            System.out.println();
        }
    }

    public static void dibuixaLinia() {
        for (int columna=1; columna <= 5; columna++) {
            dibuixaElement();
        }
    }

    public static void dibuixaElement() {
        System.out.print(" X");
    }
}
