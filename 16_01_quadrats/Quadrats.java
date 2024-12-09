public class Quadrats {
    public static void main(String[] args) {
        System.out.println("Quants?");
        int amount = Integer.parseInt(Entrada.readLine());

        for (int i = 0; i < amount; i++) {
            for (int y = 0; y < 5; y++) {
                for (int x = 0; x < 5; x++) {
                    System.out.print(" X");
                }
                System.out.println();
            }
            System.out.println();
        }
    }    
}
