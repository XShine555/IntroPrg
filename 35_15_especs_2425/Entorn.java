/*
 * Iker Rivera Garcia
 * Entorn.java
 * Clase Entorn que simula un entorn de botiga
 * per a gestionar vins.
 * Aquesta classe permet afegir, modificar, eliminar i cercar vins.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Entorn {
    private static final String CSV_FILE = "botiga.csv";
    private static Botiga botiga = new Botiga();
    private static int loadedRefs = 0;

    public static void main(String[] args) throws IOException, IllegalArgumentException, BotigaException {
        System.out.println("Celler La Bona Estrella. Escriviu ajuda per veure opcions.");
        String comanda = "";

        carregaCsv();

        while (!comanda.equals("surt")) {
            System.out.print("botiga> ");
            comanda = Entrada.readLine();

            switch (comanda) {
                case "ajuda" -> ajuda();
                case "cerca" -> cerca();
                case "afegeix" -> System.out.println("Comanda temporalment no disponible");
                case "modifica" -> System.out.println("Comanda temporalment no disponible");
                case "elimina" -> System.out.println("Comanda temporalment no disponible");
                case "surt" -> System.out.println("adéu");
                default -> System.out.println("ERROR: comanda no reconeguda. Escriviu help per ajuda");
            }
        }
    }

    private static void carregaCsv() throws IOException, IllegalArgumentException, BotigaException {
        File file = new File(CSV_FILE);
        if (!file.exists()) {
            System.out.println("Referències llegides: 0");
            return;
        }

        FileReader fileReader = new FileReader(CSV_FILE);
        BufferedReader input = new BufferedReader(fileReader);

        while (true) {
            String linia = input.readLine();
            if (linia == null)
                break;

            String[] parts = linia.split(";");
            Vi vi = Vi.deArrayString(parts);
            if (vi == null)
                continue;

            Vi result = botiga.afegeix(vi);
            loadedRefs++;
        }

        System.out.println(String.format("Referències llegides: %s", loadedRefs));
        input.close();
    }

    private static void guardaCsv() throws IOException {
        String text = "";

        for (Vi vi : botiga.getVins()) {
            text += String.join(";", vi.aArrayString()) + "\n";
        }

        BufferedWriter sortida = new BufferedWriter(new FileWriter(CSV_FILE));
        sortida.write(text);
        sortida.close();

        System.out.println(String.format("Referències guardades: %s", loadedRefs));
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

            if (eliminat != null) {
                loadedRefs--;
                System.out.println("Eliminat");
            } else {
                System.out.println("ERROR: no s'ha pogut eliminar");
            }
        } else {
            System.out.println("No eliminat");
        }
    }

    /*
     * private static void afegeix() {
     * System.out.print("nom (enter cancel·la)> ");
     * String nom = Entrada.readLine();
     * 
     * if (nom.isBlank())
     * return;
     * 
     * System.out.print("preu (en cèntims)> ");
     * String preuString = Entrada.readLine();
     * int preu = 0;
     * 
     * try{
     * preu = Integer.parseInt(preuString);
     * 
     * if (preu < 0) {
     * System.out.println("ERROR: cal un enter positiu");
     * return;
     * }
     * } catch (NumberFormatException e) { }
     * 
     * System.out.print("estoc (enter sense estoc)> ");
     * String estocString = Entrada.readLine();
     * int estoc = 0;
     * try{
     * estoc = Integer.parseInt(estocString);
     * 
     * if (estoc < 0) {
     * System.out.println("ERROR: cal un enter positiu");
     * return;
     * }
     * } catch (NumberFormatException e) { }
     * 
     * Vi vi = new Vi(nom, preu, estoc);
     * Vi result = botiga.afegeix(vi);
     * 
     * if (result == null) {
     * System.out.println("ERROR: no s'ha pogut afegir");
     * }
     * else {
     * System.out.println(String.format("Introduït:%s", result.toString()));
     * loadedRefs++;
     * }
     * }
     */

    /*
     * private static void modifica() {
     * System.out.print("nom (enter cancel·la)> ");
     * String nom = Entrada.readLine();
     * if (nom.isBlank())
     * return;
     * 
     * Vi result = botiga.cerca(nom);
     * 
     * if (result == null) {
     * System.out.println("No trobat");
     * return;
     * }
     * 
     * System.out.format("preu (enter %s)> ", result.getPreu());
     * String preuString = Entrada.readLine();
     * int preu = 0;
     * 
     * try{
     * preu = Integer.parseInt(preuString);
     * 
     * if (preu < 0) {
     * System.out.println("ERROR: cal un enter positiu");
     * return;
     * }
     * } catch (NumberFormatException e) { }
     * 
     * System.out.format("estoc (enter %s)> ", result.getEstoc());
     * String estocString = Entrada.readLine();
     * int estoc = 0;
     * 
     * try{
     * estoc = Integer.parseInt(estocString);
     * 
     * if (estoc < 0) {
     * System.out.println("ERROR: cal un enter positiu");
     * return;
     * }
     * } catch (NumberFormatException e) { }
     * 
     * if (!preuString.isBlank())
     * result.setPreu(preu);
     * 
     * if (!estocString.isBlank())
     * result.setEstoc(estoc);
     * 
     * System.out.print("Modificat:");
     * System.out.print(result.toString());
     * }
     */

    private static void cerca() {
        System.out.print("ref> ");
        String ref = Entrada.readLine();
        String nom = null;
        int preu = -1;
        int estoc = -1;
        String lloc = null;
        String origen = null;
        String tipus = null;
        String collita = null;

        if (!ref.isBlank() && !ref.equals("!")) {
            Vi result = botiga.cerca(ref);
            if (result != null) {
                System.out.println(String.format("Trobat:%s", result.toString()));
            } else {
                System.out.println("No trobat");
            }
            return;
        }

        if (ref.equals("!")) {
            return;
        }

        System.out.print("nom> ");
        nom = Entrada.readLine();
        if (nom.equals("!")) {
            Especificacio plantilla = new Especificacio(
                nom,
                origen,
                tipus,
                collita
            );
            List<Vi> results = botiga.cerca(plantilla);
            if (results != null && !results.isEmpty()) {
                System.out.println("Trobat:");
                for (Vi vi : results) {
                    System.out.println(vi.toString());
                }
            } else {
                System.out.println("No trobat");
            }
            return;
        }

        System.out.print("preu max.> ");
        String preuStr = Entrada.readLine();
        preu = -1;
        if (!preuStr.isBlank() && !preuStr.equals("!")) {
            try {
                preu = Integer.parseInt(preuStr);
                if (preu < 0) {
                    System.out.println("ERROR: el valor ha de ser un enter positiu");
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: el valor ha de ser un enter positiu");
                return;
            }
        } else if (preuStr.equals("!")) {
            Especificacio plantilla = new Especificacio(
                nom,
                origen,
                tipus,
                collita
            );
            List<Vi> results = botiga.cerca(plantilla);
            if (results != null && !results.isEmpty()) {
                System.out.println("Trobat:");
                for (Vi vi : results) {
                    System.out.println(vi.toString());
                }
            } else {
                System.out.println("No trobat");
            }
            return;
        }

        System.out.print("estoc min.> ");
        String estocStr = Entrada.readLine();
        estoc = -1;
        if (!estocStr.isBlank() && !estocStr.equals("!")) {
            try {
                estoc = Integer.parseInt(estocStr);
                if (estoc < 0) {
                    System.out.println("ERROR: el valor ha de ser un enter positiu");
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: el valor ha de ser un enter positiu");
                return;
            }
        } else if (estocStr.equals("!")) {
            Especificacio plantilla = new Especificacio(
                nom,
                origen,
                tipus,
                collita
            );
            List<Vi> results = botiga.cerca(plantilla, preu, -1);
            if (results != null && !results.isEmpty()) {
                System.out.println("Trobat:");
                for (Vi vi : results) {
                    System.out.println(vi.toString());
                }
            } else {
                System.out.println("No trobat");
            }
            return;
        }

        /*System.out.print("lloc> ");
        String lloc = Entrada.readLine();
        if (lloc.equals("!")) {
            Especificacio plantilla = new Especificacio(nom.isBlank() ? null : nom, null, null, null);
            List<Vi> results = botiga.cerca(plantilla, preu, estoc);
            if (results != null && !results.isEmpty()) {
                System.out.println("Trobat:");
                for (Vi vi : results) {
                    System.out.println(vi.toString());
                }
            } else {
                System.out.println("No trobat");
            }
            return;
        }*/

        System.out.print("D.O.> ");
        origen = Entrada.readLine();
        if (origen.equals("!")) {
            Especificacio plantilla = new Especificacio(
                nom,
                origen,
                tipus,
                collita
            );
            List<Vi> results = botiga.cerca(plantilla, preu, estoc);
            if (results != null && !results.isEmpty()) {
                System.out.println("Trobat:");
                for (Vi vi : results) {
                    System.out.println(vi.toString());
                }
            } else {
                System.out.println("No trobat");
            }
            return;
        }

        System.out.print("tipus> ");
        tipus = Entrada.readLine();
        if (tipus.equals("!")) {
            Especificacio plantilla = new Especificacio(
                nom,
                origen,
                tipus,
                collita
            );
            List<Vi> results = botiga.cerca(plantilla, preu, estoc);
            if (results != null && !results.isEmpty()) {
                System.out.println("Trobat:");
                for (Vi vi : results) {
                    System.out.println(vi.toString());
                }
            } else {
                System.out.println("No trobat");
            }
            return;
        }

        System.out.print("collita> ");
        collita = Entrada.readLine();
        if (collita.equals("!")) {
            Especificacio plantilla = new Especificacio(
                nom.isBlank() ? null : nom,
                origen.isBlank() ? null : origen,
                tipus.isBlank() ? null : tipus, 
                collita.isBlank() ? null : collita
            );
            List<Vi> results = botiga.cerca(plantilla, preu, estoc);
            if (results != null && !results.isEmpty()) {
                System.out.println("Trobat:");
                for (Vi vi : results) {
                    System.out.println(vi.toString());
                }
            } else {
                System.out.println("No trobat");
            }
            return;
        }

        Especificacio plantilla = new Especificacio(
            nom,
            origen,
            tipus,
            collita
        );

        List<Vi> results = botiga.cerca(plantilla);
        if (results != null && !results.isEmpty()) {
            System.out.println("Trobat:");
            for (Vi vi : results) {
                System.out.println(vi.toString());
            }
        } else {
            System.out.println("No trobat");
        }
    }

    private static void ajuda() {
        System.out.print("""
                Comandes disponibles:
                ajuda
                cerca
                surt
                """);
    }
}
