/* 
 * Aquest programa mostra una representació artística de dígits a partir de la seva representació en forma de matriu.
 */
public class DigitArt {
    public static char[][] construeix1() {
        return new char[][] {
            {'·', '·', '·', '·', '·'},
                {'·', 'X', 'X', '·', '·'},
                {'·', '·', 'X', '·', '·'},
                {'·', '·', 'X', '·', '·'},
                {'·', '·', 'X', '·', '·'},
                {'·', 'X', 'X', 'X', '·'},
                {'·', '·', '·', '·', '·'}
        };
    }

    public static char[][] construeix2() {
        return new char[][] {
                {'·', '·', '·', '·', '·', '·'},
                {'·', 'X', 'X', 'X', 'X', '·'},
                {'·', '·', '·', '·', 'X', '·'},
                {'·', 'X', 'X', 'X', 'X', '·'},
                {'·', 'X', '·', '·', '·', '·'},
                {'·', 'X', 'X', 'X', 'X', '·'},
                {'·', '·', '·', '·', '·', '·'},
        };
    }

    public static char[][] construeix3() {
        return new char[][] {
                {'·', '·', '·', '·', '·', '·'},
                {'·', 'X', 'X', 'X', 'X', '·'},
                {'·', '·', '·', '·', 'X', '·'},
                {'·', 'X', 'X', 'X', 'X', '·'},
                {'·', '·', '·', '·', 'X', '·'},
                {'·', 'X', 'X', 'X', 'X', '·'},
                {'·', '·', '·', '·', '·', '·'},
        };
    }
    public static void mostraResultat(char[][] origen, char[][] resultat) {
        for (int i = 0; i < origen.length; i++) {
            for (int j = 0; j < origen[i].length; j++) {
                System.out.print(origen[i][j]);
            }
            System.out.print(" -> ");
            for (int j = 0; j < resultat[i].length; j++) {
                System.out.print(resultat[i][j]);
            }
            System.out.println();
        }
    }
    public static void processaCaracter(char ch) {
        char[][] origen;
        switch (ch) {
            case '1': origen = construeix1();
                      break;
            case '2': origen = construeix2();
                      break;
            case '3': origen = construeix3();
                      break;
            default: return;    // no conec aquest caràcter
        }
        char[][] desti = UtilTaula.substitueix(origen, 'X', ch);
        mostraResultat(origen, desti);
        System.out.println();
    }
    public static void processaArgument(String arg) {
        for (int i = 0; i < arg.length(); i++) {
            processaCaracter(arg.charAt(i));
        }
    }
    public static void main(String[] args){
        // comprova que com a mínim hi hagi un argument
        if (args.length == 0) {
            System.out.println("Siusplau, passa'm un argument");
            return;
        }
        // processa cada argument
        for (int i = 0; i < args.length; i++) {
            processaArgument(args[i]);
        }
    }
}