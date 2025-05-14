public class Especificacio {
    private String nom;
    private String origen;
    private String tipus;
    private String collita;

    public Especificacio(
            String nom,
            String origen,
            String tipus,
            String collita
        ) {
        this.nom = UtilString.normalitzaString(nom);
        this.origen = UtilString.normalitzaString(origen);
        this.tipus = UtilString.normalitzaString(tipus);
        this.collita = UtilString.normalitzaString(collita);
    }

    public String getNom() {
        return nom;
    }

    public String getOrigen() {
        return origen;
    }

    public String getTipus() {
        return tipus;
    }

    public String getCollita() {
        return collita;
    }
}
