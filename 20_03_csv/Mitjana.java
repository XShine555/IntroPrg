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
        int exams = 6;
        if (args.length != 0 && !args[0].isBlank())
            exams = Integer.parseInt(args[0]);

        String cami = "notes.csv";
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);
        input.readLine();
        System.out.format("Càlcul de la mitjana de notes per %s exàmens%n", exams);
        
        boolean anyLine = false;

        while (true) {
            String linia = input.readLine();
            if (linia == null || linia.isBlank()) 
                break;
            anyLine = true;
            String[] splitByComma = linia.split(",");
            int total = 0;
            for (int i = 1; i < Math.min(splitByComma.length, exams + 1); i++) {
                String value = splitByComma[i];
                if (value.equalsIgnoreCase("NP"))
                    continue;
                total += Integer.parseInt(value);
            }

            System.out.format("%s (%.2f)%n", splitByComma[0], (float)total/exams);
            //System.out.println(total);
            //System.out.println(splitByComma.length -1);
        }
        
        input.close();  

        if (!anyLine)
            System.out.println("El fitxer notes.csv no conté cap nota.");
    } 
}
