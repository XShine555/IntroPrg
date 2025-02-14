/*
 * Programa que tradueix un fitxer de text segons un fitxer de traduccions donat i escriu el resultat en un altre fitxer.
 * Iker Rivera Garcia
 * 14/05/2025
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Traduccio {
    public static void main(String[] args) throws IOException {
        if (args.length < 3)
        {
            System.out.println("Cal especificar els fitxers origen, traduccio i destinació");
            return;
        }

        tradueix(args[0], args[1], args[2]);
    }
    
    public static void tradueix(String fitxerOrigen, String fitxerTraduccio, String fitxerDestinacio) throws IOException  {
        FileWriter fitxerResultWriter = new FileWriter(fitxerDestinacio);
        BufferedWriter writer = new BufferedWriter(fitxerResultWriter);

        FileReader fitxerOrigenReader = new FileReader(fitxerOrigen);
        BufferedReader origenReader = new BufferedReader(fitxerOrigenReader);

        String liniaOrigen;
        while ((liniaOrigen = origenReader.readLine()) != null) {
            String liniaTraduida = tradueixLinia(liniaOrigen, fitxerTraduccio);
            writer.append(liniaTraduida);
            writer.newLine();
        }

        writer.close();
        origenReader.close();
    }

    public static String tradueixLinia(String linia, String fitxerTraduccio) throws IOException {
        FileReader fitxerTraduccioReader = new FileReader(fitxerTraduccio);
        BufferedReader traduccioReader = new BufferedReader(fitxerTraduccioReader);

        String liniaTraduida = linia;
        String liniaTraduccio;
        while ((liniaTraduccio = traduccioReader.readLine()) != null) {
            String[] paraules = liniaTraduccio.split(",");
            liniaTraduida = liniaTraduida.replace(trimStart(paraules[0]), trimStart(paraules[1]));
        }

        traduccioReader.close();
        return liniaTraduida;
    }

    private static String trimStart(String text) {
        int i = 0;
        while (i < text.length() && Character.isWhitespace(text.charAt(i))) {
            i++;
        }
        return text.substring(i);
    }
}
