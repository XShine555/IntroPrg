public class EntersEntreComes {
    public static void main(String[] args) {
        System.out.println("Quants?");
        String input = Entrada.readLine();
        int count = Integer.parseInt(input);

        if (count < 1)
        {
            System.out.println("Res a fer");
            return;
        }

        System.out.println("Separador?");
        String separatorInput = Entrada.readLine();
        char separator = ',';

        if (!separatorInput.isBlank())
            separator = separatorInput.charAt(0);

        int[] numeros;
        numeros = new int[count];

        int countWhile = 0;
        while (countWhile != count) {
            System.out.println("Valor " + (countWhile + 1) + "?");

            String iInput = Entrada.readLine();
            if (!UtilString.esEnter(iInput)) {
                System.out.println("No pots introduir un no enter");
                continue;
            }
            
            numeros[countWhile] = Integer.parseInt(iInput);
            countWhile++;
        }

        for (int i = 0; i < count; i++) {
            System.out.println("Valor " + (i + 1) + "?");

            String iInput = Entrada.readLine();
            numeros[i] = Integer.parseInt(iInput);
        }

        System.out.println(entreComes(numeros, separator));
    }

    public static String entreComes(int[] array, char separator) {
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if (i > 0)
                result += separator + " ";
            result += array[i];
        }
        return result;
    }
}