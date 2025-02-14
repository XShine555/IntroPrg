import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Log {
    private static final String LOG_FILE = "log.txt";

    private static int errorCount = 1;
    private static int warningCount = 1;
    private static int infoCount = 1;
    private static int debugCount = 1;
    
    public static void printError(String message) {
        try{
            write(String.format("[%s] ERROR: %s", errorCount, message));
        }
        catch (IOException e) {
            System.out.println("Error writing to log file");
        }

        errorCount++;
    }

    public static void printWarning(String message) throws IOException {
        write(String.format("[%s] WARNING: %s", warningCount, message));
        
        warningCount++;
    }

    public static void printInfo(String message) throws IOException {
        write(String.format("[%s] INFO: %s", infoCount, message));

        infoCount++;
    }

    public static void printDebug(String message) throws IOException {
        write(String.format("DEBUG: %s", message));

        debugCount++;
    }

    public static void reset() {
        errorCount = 1;
        warningCount = 1;
        infoCount = 1;
    }

    private static void write(String text) throws IOException {
        Writer fileReader = new FileWriter(LOG_FILE, true);
        BufferedWriter writer = new BufferedWriter(fileReader);

        writer.append(text);
        writer.newLine();
        writer.close();
    }
}
