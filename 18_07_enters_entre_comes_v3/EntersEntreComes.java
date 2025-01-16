public class EntersEntreComes {
    public static void main(String[] args) {
        System.out.println("Quants valors vols introduir?");
        String input = Entrada.readLine();
        int count = Integer.parseInt(input);

        int[] numeros;
        numeros = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Valor " + (i + 1) + "?");

            String iInput = Entrada.readLine();
            numeros[i] = Integer.parseInt(iInput);
        }

        System.out.print(numeros[0]);
        for (int i = 1; i < numeros.length; i++) {
            System.out.print(", " + numeros[i]);
        }
        System.out.println();
    }
}