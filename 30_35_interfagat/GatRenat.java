public class GatRenat extends Gat implements AnimalDeCompanyia, Ensinistrable {
    private String posicio = "estirat";

    public GatRenat() {
        super("Renat");
    }

    public GatRenat(String posicio) {
        this();
        this.posicio = posicio;
    }

    public String getPosicio() {
        return this.posicio;
    }

    @Override
    public String deixatEstimar() {
        return "El gat " + this.getNom() + " es deixa estimar i està " + this.posicio;
    }

    @Override
    public String aixecat() {
        if (posicio.equals("dret"))
            return "passo de fer res";

        posicio = "dret";
        return "ja m'aixeco";
    }

    @Override
    public String seu() {
        if (posicio.equals("assegut"))
            return "passo de fer res";

        posicio = "assegut";
        return "ja m'assec";
    }

    @Override
    public String estirat() {
        if (posicio.equals("estirat"))
            return "passo de fer res";

        posicio = "estirat";
        return "ja m'estiro";
    }

    @Override
    public boolean esDret() {
        return this.posicio.equals("dret");
    }

    @Override
    public boolean esAssegut() {
        return this.posicio.equals("assegut");
    }

    @Override
    public boolean esEstirat() {
        return this.posicio.equals("estirat");
    }
}
