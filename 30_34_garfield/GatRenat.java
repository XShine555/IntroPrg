public class GatRenat extends Gat {
    private static final String NOM = "Renat";

    GatRenat() {
        super(NOM);
    }

    GatRenat(int vides) {
        super(NOM, vides);
    }

    GatRenat(String posicio) {
        super(NOM, posicio);
    }

    GatRenat(int vides, String posicio) {
        super(NOM, vides, posicio);
    }

    @Override
    public String aixecat() {
        return "Bai Maitea, bai";
    }
}
