public class Ascensor {
    private int pis = -1;

    public static void main(String[] args) {
        Ascensor instance;
        instance = new Ascensor();
        System.out.format("L'ascensor està a la planta %s%n", instance.pis);
    }    
}
