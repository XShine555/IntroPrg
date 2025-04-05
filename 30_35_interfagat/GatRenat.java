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
        this.posicio = "dret";
        return this.getNom() + " s'ha aixecat i ara està " + this.posicio;
    }

    @Override
    public String seu() {
        this.posicio = "assegut";
        return this.getNom() + " s'ha assegut i ara està " + this.posicio;
    }

    @Override
    public String estirat() {
        this.posicio = "estirat";
        return this.getNom() + " s'ha estirat i ara està " + this.posicio;
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
