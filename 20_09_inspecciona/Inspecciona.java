import java.io.File;

public class Inspecciona {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            System.out.format("""
            
            Processant argument: %s
            ===============================
            """, arg);
            inspecciona(arg);
        }
    }

    private static void inspecciona(String path) {
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
            System.out.format("""
                                
                %s fitxer de mida en bytes: %d
                """, getPermissions(file), file.length());

            String[] getFiles = file.list();
            if (getFiles != null) {
                System.out.println("Amb els continguts:");
                for (int i = 0; i < getFiles.length; i++) {
                    System.out.println(getFiles[i]);
                }
            }
        }
    }

    private static String getPermissions(File file) {
        String canRead = file.canRead() ? "r" : "-";
        String canWrite = file.canWrite() ? "w" : "-";
        String canExecute = file.canExecute() ? "x" : "-";

        return canRead + canWrite + canExecute;
    }
}
