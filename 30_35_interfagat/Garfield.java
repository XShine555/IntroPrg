public class Garfield extends Gat implements AnimalDeCompanyia {
    public Garfield() {
        super("Garfield");
    }

    @Override
    public String deixatEstimar() {
        return "El gat " + this.getNom() + " es deixa estimar";
    }
}
