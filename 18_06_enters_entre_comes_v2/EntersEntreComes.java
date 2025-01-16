public class EntersEntreComes {
    public static void main(String[] args) {
        int[] numeros;
        numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor " + i + 1 + "?");

            String input = Entrada.readLine();
            numeros[i] = Integer.parseInt(input);
        }

        System.out.print(numeros[0]);
        for (int i = 1; i < numeros.length; i++) {
            System.out.print(", " + numeros[i]);
        }
        System.out.println();
    }
}