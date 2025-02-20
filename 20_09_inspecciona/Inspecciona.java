import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Inspecciona {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            System.out.format("""
            
            Processant argument: %s
            %s
            """, arg, getBar("Processant argument: " + arg));
            inspecciona(arg);
        }
    }

    private static void inspecciona(String path) throws IOException {
        File file = new File(path);

        if (!file.exists()) {
            System.out.format("""       

            No trobat
            """);
            return;
        }

        if (file.isDirectory()) {
            String[] files = file.list();

            if (files.length > 1) {
                Arrays.sort(files);

                System.out.format("""
                                
                %s directori que conté: %s
                """, getPermissions(file), String.join(", ", files));
            }
            else {
                System.out.format("""
                                
                %s directori buit
                """, getPermissions(file));
            }
        }
        else {
            long length = file.length();

            if (length > 0) {
                System.out.format("""
                                
                %s fitxer de mida en bytes: %d
                Amb els continguts:
                """, getPermissions(file), length);

                FileReader fileReader = new FileReader(path);
                BufferedReader input = new BufferedReader(fileReader);

                String line = input.readLine();
                while (line != null) {
                    System.out.format("|%s|%n", line);
                    line = input.readLine();
                }

                input.close();
            }
            else {
                System.out.format("""
                                
                %s fitxer buit
                """, getPermissions(file));
            }
        }
    }

    private static String getPermissions(File file) {
        String canRead = file.canRead() ? "r" : "-";
        String canWrite = file.canWrite() ? "w" : "-";
        String canExecute = file.canExecute() ? "x" : "-";

        return canRead + canWrite + canExecute;
    }

    private static String getBar(String text) {
        return "=".repeat(text.length());
    }
}
