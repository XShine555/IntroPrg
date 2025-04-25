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
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.annotation.processing.FilerException;

public class Entorn {
    private static final String CSV_FILE = "botiga.csv";
    private static Botiga botiga = new Botiga();
    private static int loadedRefs = 0;

    public static void main(String[] args) throws IOException {
        System.out.println("Celler La Bona Estrella. Escriviu ajuda per veure opcions.");
        String comanda = "";

        carregaCsv();

        while (!comanda.equals("surt")) {
            System.out.print("botiga> ");
            comanda = Entrada.readLine();

            switch (comanda) {
                case "ajuda" -> ajuda();
                case "cerca" -> cerca();
                case "afegeix" -> afegeix();
                case "modifica" -> modifica();
                case "elimina" -> elimina();
                case "surt" -> { 
                    guardaCsv();
                    System.out.println("adéu");
                }
                default -> System.out.println("ERROR: comanda no reconeguda. Escriviu help per ajuda");
            }
        }
    }

    private static void carregaCsv() throws IOException {
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
            Vi result = botiga.afegeix(Vi.deArrayString(parts));

            if (result != null)
            loadedRefs++;
        }

        System.out.println(String.format("Referències llegides: %s", loadedRefs));
    }

    private static void guardaCsv() throws IOException {
        botiga.iniciaRecorregut();
        String text = "";

        while (true) {
            Vi vi = botiga.getSeguent();
            if (vi == null) 
                break;
            text += String.join(";", vi.aArrayString()) + "\n";
            System.out.println(text);
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
            }
            else {
                System.out.println("ERROR: no s'ha pogut eliminar");
            }
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
        String preuString = Entrada.readLine();
        int preu = 0;

        try{
            preu = Integer.parseInt(preuString);

            if (preu < 0) {
                System.out.println("ERROR: cal un enter positiu");
                return;
            }
        } catch (NumberFormatException e) { }

        System.out.print("estoc (enter sense estoc)> ");
        String estocString = Entrada.readLine();
        int estoc = 0;
        try{
            estoc = Integer.parseInt(estocString);

            if (estoc < 0) {
                System.out.println("ERROR: cal un enter positiu");
                return;
            }
        } catch (NumberFormatException e) { }

        Vi vi = new Vi(nom, preu, estoc);
        Vi result = botiga.afegeix(vi);

        if (result == null) {
            System.out.println("ERROR: no s'ha pogut afegir");
        }
        else {
            System.out.println(String.format("Introduït:%s", result.toString()));
            loadedRefs++;
        }
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
