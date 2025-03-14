public class Garfield extends Gat {
    public Garfield() {
        super("Garfield");
    }

    @Override
    public String estirat() {
        if (this.getPosicio().equals("estirat")) {
            return "passo de fer res";
        }
        
        this.setPosicio("estirat");
        return "Bai Maitea, bai";
    }
}
