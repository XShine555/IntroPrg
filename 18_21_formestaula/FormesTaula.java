public class FormesTaula {
    public static void main(String[] args) {
        boolean[][] taula = UtilTaula.inicialitzaHoritzontalMig(new boolean[4][4]);
        String resultat = UtilTaula.taulaToString(taula, 'X', '·');
        System.out.println(resultat);
    }
}
