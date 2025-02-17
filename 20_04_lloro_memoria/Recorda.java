import java.io.BufferedReader;
import java.io.BufferedWriter;
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
        FileReader fr = new FileReader(cami);
        BufferedReader br = new BufferedReader(fr);
        String linia;
        while ((linia = br.readLine()) != null) {
            System.out.format("El lloro recorda: %s%n", linia);
        }
        br.close();
        System.out.println("Adéu");
    }
}
