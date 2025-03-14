/*
 * Iker Rivera Garcia
 * 15/03/2025
 * Clase UsaRenat, s'encarrega de consumir la classe "*GatRenat"
 */

public class UsaGatRenat {
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        System.out.println("Les vides inicials són: " + renat.getVides());
        System.out.println("La posició inicial és: " + renat.getPosicio());
        System.out.println("Introdueix nova posició:");
        renat.setPosicio(Entrada.readLine());
        System.out.println("La posició final és: " + renat.getPosicio());
    }
}