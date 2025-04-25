/*
 * Iker Rivera Garcia
 * Entorn.java
 * Clase Entorn que simula un entorn de botiga
 * per a gestionar vins.
 * Aquesta classe permet afegir, modificar, eliminar i cercar vins.
 */

public class Entorn {
    private static Botiga botiga = new Botiga();

    public static void main(String[] args) {
        System.out.println("Celler La Bona Estrella. Escriviu ajuda per veure opcions.");
        String comanda = "";

        while (!comanda.equals("surt")) {
            System.out.print("botiga> ");
            comanda = Entrada.readLine();

            switch (comanda) {
                case "ajuda" -> ajuda();
                case "cerca" -> cerca();
                case "afegeix" -> afegeix();
                case "modifica" -> modifica();
                case "elimina" -> elimina();
                case "surt" -> System.out.println("adéu");
                default -> System.out.println("ERROR: comanda no reconeguda. Escriviu help per ajuda");
            }
        }
    }

    private static void elimina() {
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        if (nom.isBlank())
            return;

        Vi result = botiga.cerca(nom);

        if (result == null) {
            System.out.println("No trobat");
            return;
        }

        System.out.print("A eliminar:");
        System.out.print(result.toString());

        System.out.print("Segur?> ");
        String resposta = Entrada.readLine();

        if (resposta.equalsIgnoreCase("Si") || resposta.equalsIgnoreCase("Sí")) {
            Vi eliminat = botiga.elimina(nom);
            System.out.println(eliminat != null ? "Eliminat" : "ERROR: no s'ha pogut eliminar");
        } else {
            System.out.println("No eliminat");
        }
    }

    private static void afegeix() {
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();

        if (nom.isBlank())
            return;

        System.out.print("preu (en cèntims)> ");
        int preu = Integer.parseInt(Entrada.readLine());
        if (preu < 0) {
            System.out.println("ERROR: cal un enter positiu");
            return;
        }

        System.out.print("estoc (enter sense estoc)> ");
        int estoc = Integer.parseInt(Entrada.readLine());
        if (estoc < 0) {
            System.out.println("ERROR: cal un enter positiu");
            return;
        }

        Vi vi = new Vi(nom, preu, estoc);
        Vi result = botiga.afegeix(vi);

        System.out.println(
                result != null ? String.format("Introduït:%s", result.toString()) : "ERROR: no s'ha pogut afegir");
    }

    private static void modifica() {
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();
        if (nom.isBlank())
            return;

        Vi result = botiga.cerca(nom);

        if (result == null) {
            System.out.println("No trobat");
            return;
        }

        System.out.format("preu (enter %s)> ", result.getPreu());
        String preuString = Entrada.readLine();
        int preu = 0;

        try{
            preu = Integer.parseInt(preuString);

            if (preu < 0) {
                System.out.println("ERROR: cal un enter positiu");
                return;
            }
        } catch (NumberFormatException e) { }

        System.out.format("estoc (enter %s)> ", result.getEstoc());
        String estocString = Entrada.readLine();
        int estoc = 0;

        try{
            estoc = Integer.parseInt(estocString);

            if (estoc < 0) {
                System.out.println("ERROR: cal un enter positiu");
                return;
            }
        } catch (NumberFormatException e) { }

        if (!preuString.isBlank())
            result.setPreu(preu);

        if (!estocString.isBlank())
            result.setEstoc(estoc);

        System.out.print("Modificat:");
        System.out.print(result.toString());
    }

    private static void cerca() {
        System.out.print("nom (enter cancel·la)> ");
        String nom = Entrada.readLine();

        if (nom.isBlank()) {
            return;
        }

        Vi result = botiga.cerca(nom);
        System.out.println(result != null ? String.format("Trobat:%s", result.toString()) : "No trobat");
    }

    private static void ajuda() {
        System.out.print("""
                Comandes disponibles:
                ajuda
                cerca
                afegeix
                modifica
                elimina
                surt
                """);
    }
}
