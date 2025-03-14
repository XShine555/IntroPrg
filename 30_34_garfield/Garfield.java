public class Garfield extends Gat {
    public Garfield() {
        super("Garfield");
    }

    @Override
    public String estirat() {
        if (this.getPosicio().equals("estirat")) {
            return "Bai Maitea, bai";
        }
        
        this.setPosicio("estirat");
        return "ja m'estiro";
    }
}
