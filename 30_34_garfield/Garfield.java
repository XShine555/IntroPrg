public class Garfield extends Gat {
    public Garfield() {
        super("Garfield");
    }

    @Override
    public String estirat() {
        if (this.getPosicio().equals("estirat")) {
            return "Ja estic estirat";
        }
        
        this.setPosicio("estirat");
        return "Bai Maitea, bai";
    }
}
