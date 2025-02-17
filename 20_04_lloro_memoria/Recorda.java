import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Recorda {
    public static void main(String[] args) throws IOException {
        String cami = "records.txt";
        processaEntrada(cami);
        System.out.println("D'acord");
        mostraRecords(cami);
    }

    public static void processaEntrada(String cami) throws IOException {
        System.out.println("El lloro pregunta paraula:");
        String input = Entrada.readLine();
        while (!input.isBlank()) {
            System.out.println("El lloro registra: " + input);
            guardaRecord(cami, input);

            System.out.println("El lloro pregunta paraula:");
            input = Entrada.readLine();
        }
    }

    private static void guardaRecord(String cami, String record) throws IOException {
        Writer fileReader = new FileWriter(cami, true);
        BufferedWriter writer = new BufferedWriter(fileReader);

        writer.append(record);
        writer.newLine();
        writer.close();
    }

    public static void mostraRecords(String cami) throws IOException {
        File file = new File(cami);
        if (!file.exists()) {
            System.out.println("El lloro no recorda res");
        }
        else {
            FileReader fr = new FileReader(cami);
            BufferedReader br = new BufferedReader(fr);
            String linia = br.readLine();
            while (linia != null) {
                System.out.format("El lloro recorda: %s%n", linia);
                linia = br.readLine();
            }
            br.close();
        }
        System.out.println("Adéu");
    }
}
