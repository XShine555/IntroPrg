public class Arguments {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String currentString = args[i];

            System.out.format("[%s] \"%s\": %s", i, currentString, UtilString.esEnter(currentString) ? "és enter" : "no és enter");
        }
    }
}