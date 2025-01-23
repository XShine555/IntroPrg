/*
 * Simula el movimiento de una pelota.
*/
public class Pilota {
    public static final int N_FILES = 9;
    public static final int N_COLS = 14;

    public static void netejaPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void mostraCamp(char[][] camp) {
        for (int i=0; i<N_FILES; i++) {
            for (int j=0; j<N_COLS; j++) {
                System.out.print(camp[i][j]);
            }
            System.out.println();
        }
    }
    public static void netejaCamp(char[][] camp) {
        for (int i=0; i<N_FILES; i++) {
            for (int j=0; j<N_COLS; j++) {
                netejaPosicio(camp, new int[] {i, j} );
            }
        }
    }
    public static void netejaPosicio(char[][] camp, int[] posicio) {
        int fila = obteFila(posicio);
        int col = obteCol(posicio);
        camp[fila][col] = '·';
    }
    public static void posicionaPilota(char[][] camp, int[] posicio) {
        int fila = obteFila(posicio);
        int col = obteCol(posicio);
        camp[fila][col] = 'O';
    }

    public static int obteFila(int[] posicio) {
        return posicio[0];
    }
    public static int obteCol(int[] posicio) {
        /* XXX */
    }
    public static int obteIncrFila(int[] increment) {
        /* XXX */;
    }
    public static int obteIncrCol(int[] increment) {
        /* XXX */;
    }

    public static void canviaPosicio(int[] posicio, int novaFila, int novaCol) {
        posicio[0] = novaFila;
        posicio[1] = novaCol;
    }
    public static void canviaIncrement(int[] increment, int nouIncFila, int nouIncCol) {
        increment[0] = nouIncFila;
        increment[1] = nouIncCol;
    }
    public static void seguentPosicio(int[] posicio, int[] increment) {
        int fila = obteFila(posicio);
        int col = obteCol(posicio);
        int incFila = obteIncrFila(increment);
        int incCol = obteIncrCol(increment);

        // actualitza la fila
        fila += incFila;
        if (fila < 0) {                     // es passa per sobre
            fila = 1;                       // torna a la primera fila
            incFila = 1;                    // toca baixar
        } else if (fila > N_FILES -1) {     // es passa per sota
        /* XXX */;
        }

        // actualitza la columna
        /* XXX */;

        // actualitza la posició i l'increment
        canviaPosicio(posicio, fila, col);
        canviaIncrement(increment, incFila, incCol);
    }
    public static void main(String[] args)  {
        char[][] camp = new char[N_FILES][N_COLS];
        netejaCamp(camp);

        int[] posicio = new int[2];         // fila, col
        canviaPosicio(posicio, 0, 0);       // posició inicial (0, 0)

        int[] increment = new int[2];       // incFila, incCol
        canviaIncrement(increment, 1, 1);   // desplaçament inicial: 1 fila 1 columna

        do {
            posicionaPilota(camp, posicio);
            netejaPantalla();
            mostraCamp(camp);
            netejaPosicio(camp, posicio);
            seguentPosicio(posicio, increment);
            System.out.printf("%nEnter per continuar");
        } while (Entrada.readLine().isEmpty());

    }
}