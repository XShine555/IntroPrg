/*
* █████
*/
public class CalculaArea {
    public static void main(String[] args) {
        System.out.println("Càlcul de l'àrea d'un cercle");
        System.out.println("Introduïu el radi:");
        String linia = Entrada.readLine();
        System.out.println("Introduïu les unitats:");
        String unitats = Entrada.readLine();
        float radi = Float.parseFloat(linia);
        float area =  (float)Math.PI * radi * radi;
        System.out.println("L'area és "+ area + " " + unitats +"^2");
    }
}
