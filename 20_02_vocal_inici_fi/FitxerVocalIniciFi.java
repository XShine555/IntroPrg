/*
 * Iker Rivera Garcia
 * 12/02/2025
 * Llegir un fitxer de text i mostrar les línies que comencen i acaben amb vocal.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FitxerVocalIniciFi {
    public static void main(String[] args) throws IOException {
        String cami = "frases.txt";
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);
        while (true) {
            String linia = input.readLine();
            if (null == linia) 
                break;
            
            char firstChar = linia.charAt(0);
            char lastChar = linia.charAt(linia.length() - 1);

            if (UtilString.esVocal(firstChar) || UtilString.esVocal(lastChar)) {
                System.out.println(linia);
            }
        }
        input.close();   
    }
}
