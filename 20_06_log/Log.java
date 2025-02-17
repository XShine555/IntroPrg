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

    public static String printError(String message) throws IOException {
        message = String.format("[%s] ERROR: %s", errorCount, message);
        write(message);

        errorCount++;

        return message;
    }

    public static String printWarning(String message) throws IOException {
        message = String.format("[%s] WARNING: %s", warningCount, message);
        write(message);
        
        warningCount++;

        return message;
    }

    public static String printInfo(String message) throws IOException {
        message = String.format("[%s] INFO: %s", infoCount, message);
        write(message);

        infoCount++;

        return message;
    }

    public static String printDebug(String message) throws IOException {
        message = String.format("[%s] DEBUG: %s", debugCount, message);
        write(message);

        debugCount++;

        return message;
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
