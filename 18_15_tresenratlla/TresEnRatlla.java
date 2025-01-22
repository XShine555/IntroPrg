public class TresEnRatlla {
    public static void main(String[] args) {
        System.out.println("Comença el joc");
        char jugador = 'X';
        boolean haAcabat = false;

        char[][] taulell = new char[3][3];
        inicialitzaTaulell(taulell);
        mostraTaulell(taulell);

        while (!haAcabat) {
            System.out.println(jugador + "?");

            String moviment = Entrada.readLine();
            if (moviment.equalsIgnoreCase("a")) {
                System.out.println(jugador + " abandona");
                haAcabat = true;
                break;
            }

            if (moviment.length() < 2) {
                System.out.println("Moviment no vàlid");
                continue;
            }

            String stringX = moviment.substring(0, 1);
            String stringY = moviment.substring(1);

            if (!esNumero(stringX) && !esNumero(stringY)) {
                System.out.println("Moviment no vàlid");
                continue;
            }

            int x = Integer.parseInt(moviment.substring(0, 1)), y = Integer.parseInt(moviment.substring(1));

            if (x < 0 || x > 2 || y < 0 || y > 2) {
                System.out.println("Moviment fora del taulell");
                continue;
            } else {
                if (casellaOcupada(taulell, x, y)) {
                    System.out.println("Casella ocupada");
                    mostraTaulell(taulell);
                    continue;
                } else {
                    taulell[x][y] = jugador;
                }
            }

            mostraTaulell(taulell);

            if (jugadorGuanya(taulell, jugador)) {
                System.out.println(jugador + " guanya");
                haAcabat = true;
            }

            jugador = jugador == 'X' ? 'O' : 'X';
        }
    }

    public static void mostraTaulell(char[][] taulell) {
        mostraFila(taulell[0]);
        mostraFila(taulell[1]);
        mostraFila(taulell[2]);
    }

    public static boolean casellaOcupada(char[][] taulell, int fila, int columna) {
        return taulell[fila][columna] != '·';
    }

    public static boolean jugadorGuanya(char[][] taulell, char jugador) {
        for (int fila = 0; fila < 3; fila++) {
            if (taulell[fila][0] == jugador &&
                    taulell[fila][1] == jugador &&
                    taulell[fila][2] == jugador) {
                return true;
            }
        }

        for (int col = 0; col < 3; col++) {
            if (taulell[0][col] == jugador &&
                    taulell[1][col] == jugador &&
                    taulell[2][col] == jugador) {
                return true;
            }
        }

        return (taulell[0][0] == jugador &&
                taulell[1][1] == jugador &&
                taulell[2][2] == jugador)
                || (taulell[0][2] == jugador &&
                        taulell[1][1] == jugador &&
                        taulell[2][0] == jugador);
    }

    public static boolean hiHaEmpat(char[][] taulell) {
        for (int fila = 0; fila < taulell.length; fila++) {
            for (int columna = 0; columna < taulell[fila].length; columna++) {
                if (taulell[fila][columna] == '·') {
                    return false;
                }
            }
        }
        return true;
    }

    private static void mostraFila(char[] fila) {
        for (int col = 0; col < fila.length; col++) {
            System.out.print(fila[col]);
        }
        System.out.println();
    }

    private static void inicialitzaTaulell(char[][] taulell) {
        for (int fila = 0; fila < taulell.length; fila++) {
            for (int columna = 0; columna < taulell[fila].length; columna++) {
                taulell[fila][columna] = '·';
            }
        }
    }

    private static boolean esNumero(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}