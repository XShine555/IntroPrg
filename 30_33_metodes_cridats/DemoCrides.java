public class DemoCrides {
    public static void main(String[] args) {
        var feli = new Feli();
        var gat = new Gat();
        var renat = new GatRenat();

        feli.netejaUrpes();
        gat.netejaUrpes();
        renat.netejaUrpes();

        gat.miola();
        renat.miola();

        var bacalla = new Menjar("bacallà");
        renat.menja(bacalla);

        renat.netejaUrpes();
        renat.menja(bacalla);
    }    
}
