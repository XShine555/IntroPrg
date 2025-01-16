public class EntersEntreComes {
    public static void main(String[] args) {
        System.out.println("Quants?");
        String input = Entrada.readLine();
        boolean numValid = false;
        while (!numValid) {
            if (UtilString.esEnter(input)) {
                numValid = true;
            } else {
                System.out.println("Per favor, un valor enter");
                input = Entrada.readLine();
            }
        }
        int count = Integer.parseInt(input);

        if (count < 1)
        {
            System.out.println("Res a fer");
            return;
        }

        System.out.println("Separador?");
        String separatorInput = Entrada.readLine();
        char separator = ',';

        if (!separatorInput.isEmpty() || !separatorInput.isBlank())
            separator = separatorInput.charAt(0);

        int[] numeros;
        numeros = new int[count];
        
        for (int i = 0; i < count; i++) {
            System.out.println("Valor " + (i + 1) + "?");
            boolean isValid = false;

            while (!isValid) {
                String iInput = Entrada.readLine();
                if (!UtilString.esEnter(iInput)) {
                    System.out.println("Per favor, un valor enter");
                    continue;
                }
                
                numeros[i] = Integer.parseInt(iInput);
                isValid = true;
            }
        }

        System.out.println(UtilString.entreComes(numeros, separator));
    }
}