public class UtilString {
    // retorna un String format per les cadenes de text separades pel separador amb darrer separador
    public static String junta(String[] cadenes, String separador, String darrerSeparador) {
        if (cadenes.length < 1)
            return "";

        String result = "";

        result += cadenes[0];

        if (cadenes.length == 2) {
            result += darrerSeparador + cadenes[1];
            return result;
        }

        for (int i = 1; i < cadenes.length - 1; i++) {
            if (i < cadenes.length - 1) {
                result += separador;
            }
            result += cadenes[i];
        }

        if (cadenes.length > 2) {
            result += darrerSeparador;
            result += cadenes[cadenes.length - 1];
        }

        return result;
    }
    // equivalent a junta(cadenes, separador, separador)
    public static String junta(String[] cadenes, String separador) {
        return junta(cadenes, separador, separador);
    }
}