/*…*/
public class TaulaEnterAString {
    public static void main(String[] args){
        for (int i=0; i<args.length; i++) {
            System.out.println(args[i]);
            int files = obteFiles(args[i]);
            int columnes = obteColumnes(args[i]);
            if (files < 1 || columnes < 1) {
                System.out.println("Especificació no vàlida");
            } else {
                int[][] taula  = new int[files][columnes];
                UtilTaula.inicialitzaSequencial(taula, files);
                String resultat = UtilTaula.taulaToString(taula);
                System.out.println(resultat);
                System.out.println();
            }
        }
    }

    public static boolean especificacioCorrecta(String especificacio) {
        /* retorna true si l'especificació és de la forma n'x'm on n i m
         * són dos strings d'un o dos dígits.  Exemple: "12x5" seria
         * correcta, mentre que "x3454" no.  */
        String[] coordenades = especificacio.split("x");
        if (coordenades.length != 2) return false;
        for (int i=0; i<coordenades.length; i++) {
            if (! UtilString.esEnter(coordenades[i])) return false;
            int valor = Integer.parseInt(coordenades[i]);
            if (valor < 0 || valor > 99) return false;
        }
        return true;
    }

    public static int obteFiles(String especificacio) {
        /* Aquesta funció espera l'especificació de la forma d'una taula.
         * En cas que l'especificació sigui correcta, retornarà l'enter
         * corresponent als primers dígits. Per exemple, si especificacio
         * és "12x5", retornarà 12.
         * Altrament, retornarà el valor -1.  */
        if (!especificacioCorrecta(especificacio)) return -1;
        String[] coordenades = especificacio.split("x");
        return Integer.parseInt(coordenades[0]);
    }

    public static int obteColumnes(String especificacio) {
        /* Aquesta funció espera l'especificació de la forma d'una taula.
         * En cas que l'especificació sigui correcta, retornarà l'enter
         * corresponent als segons dígits. Per exemple, si especificacio
         * és "12x5", retornarà 5.
         * Altrament, retornarà el valor -1.  */
        if (!especificacioCorrecta(especificacio)) return -1;
        String[] coordenades = especificacio.split("x");
        return Integer.parseInt(coordenades[1]);
    }
}