public class Garfield extends Gat {
    public Garfield() {
        super("Garfield");
    }

    @Override
    public String estirat() {
        String posicio = this.getPosicio();

        if (posicio.equals("estirat")) {
            return "passo de fer res";
        }
        
        if (!posicio.equals("assegut")) {
            return "Bai Maitea, bai";
        }
        
        this.setPosicio("estirat");
        return "ja m'estiro";
    }

    @Override
    public String aixecat() {
        String posicio = this.getPosicio();

        if (posicio.equals("dret")) {
            return "passo de fer res";
        }
        
        if (!posicio.equals("assegut")) {
            return "Bai Maitea, bai";
        }
        
        this.setPosicio("dret");
        return "ja m'estiro";
    }
}
