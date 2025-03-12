/*
 * Iker Rivera Garcia
 * 12/03/2025
 * UsaGatRenat.java, Usa la classe GatRenat per a mostrar les vides i la posició inicial i final del gat Renat.
 */
 public class UsaGatRenat {
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        System.out.println("Vides inicials: " + renat.vides);
        System.out.println("Posició inicial: " + renat.posicio);
        renat.posicio = "assegut";
        System.out.println("Posició final: " + renat.posicio);
    }
}