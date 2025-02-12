/*
 * Iker Rivera Garcia
 * 12/02/2025
 * Llegir un fitxer de text i mostrar les línies que comencen i acaben amb vocal.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Mitjana {
    public static void main(String[] args) throws IOException {
        String cami = "frases.txt";
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);
        input.readLine();

        while (true) {
            String linia = input.readLine();
            if (null == linia) 
                break;
            String[] splitByComma = linia.split(",");
            int total = 0;
            for (int i = 0; i < splitByComma.length; i++) {
                total += Integer.parseInt(splitByComma[i]);
            }
            int media = total/splitByComma.length - 1;

            System.out.println(splitByComma[0] + "(" + media + "," + total + ")");
        }
        input.close();  
    } 
}
