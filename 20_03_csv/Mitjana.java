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
        String cami = "notes.csv";
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);
        input.readLine();
        System.out.println("Càlcul de la mitjana de notes per 6 exàmens");
        
        while (true) {
            String linia = input.readLine();
            if (linia == null) 
                break;
            String[] splitByComma = linia.split(",");
            int total = 0;
            for (int i = 1; i < splitByComma.length; i++) {
                String value = splitByComma[i];
                if (value.equalsIgnoreCase("NP"))
                    continue;
                total += Integer.parseInt(value);
            }
            int media = total/splitByComma.length - 1;

            System.out.println(splitByComma[0] + "(" + media + "," + total + ")");
        }
        input.close();  
    } 
}
