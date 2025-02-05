/*
 * Juego del tres en raya hecho en Java, con la representación del tablero mediante filas mostrandolo en la consola, y permitiendo al jugador X hacer un movimiento.
 */
public class TresEnRatlla {
    public static void main(String[] args){
        // declaració del taulell
        char[][] taulell = new char[3][3];

        // inicialització de la fila 0
        taulell[0][0] = '·';
        taulell[0][1] = 'O';
        taulell[0][2] = 'O';

        // inicialització de la resta de files
        taulell[1][0] = '·';
        taulell[1][1] = 'X';
        taulell[1][2] = '·';

        taulell[2][0] = '·';
        taulell[2][1] = '·';
        taulell[2][2] = 'X';

        // mostra la posició inicial del taulell
        System.out.println("La posició inicial del taulell:");
        mostraFila(taulell[0]);     // mostra la línia 0
        mostraFila(taulell[1]);     // mostra la línia 1
        mostraFila(taulell[2]);     // mostra la línia 2

        // demana coordenades del moviment del jugador X
        System.out.println("Fila del següent moviment?");
        int fila = Integer.parseInt(Entrada.readLine());
        System.out.println("Columna del següent moviment?");
        int columna = Integer.parseInt(Entrada.readLine());

        // marquem el nou moviment
        if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3) {
            if (taulell[fila][columna] == '·') {
                taulell[fila][columna] = 'X';
            }
            else {
                System.out.println("Posició ocupada");
            }
        }
        else {
            System.out.println("Coordenades incorrectes");
        }

        // tornem a mostrar el taulell
        System.out.println("La posició final del taulell:");
        mostraFila(taulell[0]);
        mostraFila(taulell[1]);
        mostraFila(taulell[2]);
    }

    // mostra el contingut de la fila per sortida estàndard
    public static void mostraFila(char[] fila) {
        for (int col = 0; col < fila.length; col++) {
            System.out.print(fila[col]);
        }
        System.out.println();
    }
}