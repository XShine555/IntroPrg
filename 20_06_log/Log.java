import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Log {
    private static final String LOG_FILE = "log.txt";
    private static final String ERROR = "ERROR";
    private static final String WARNING = "WARNING";
    private static final String INFO = "INFO";
    private static final String DEBUG = "DEBUG";

    private static int messageCount = 1;

    public static String printError(String message) throws IOException {
        message = formatMessage(message, ERROR);
        write(message);

        return message;
    }

    public static String printWarning(String message) throws IOException {
        message = formatMessage(message, WARNING);
        write(message);

        return message;
    }

    public static String printInfo(String message) throws IOException {
        message = formatMessage(message, INFO);
        write(message);

        return message;
    }

    public static String printDebug(String message) throws IOException {
        message = formatMessage(message, DEBUG);
        write(message);

        return message;
    }

    public static void reset() {
        messageCount = 1;
    }

    private static void write(String text) throws IOException {
        Writer fileReader = new FileWriter(LOG_FILE, true);
        BufferedWriter writer = new BufferedWriter(fileReader);

        writer.append(text);
        writer.newLine();
        writer.close();
    }

    private static String formatMessage(String content, String messageType) {
        String message = String.format("[%s] %s: %s", messageCount, messageType, content);

        messageCount++;

        return message;
    }
}
