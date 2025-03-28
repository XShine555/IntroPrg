public class DemoCrides {
    public static void main(String[] args) {
        var feli1 = new Feli();
        var feli2 = new Feli();
        var gat1 = new Gat();
        var feli3 = new Feli();
        var gat2 = new Gat();
        var renat = new GatRenat();

        feli1.netejaUrpes();
        gat1.netejaUrpes();
        renat.netejaUrpes();

        gat1.miola();
        renat.miola();

        var bacalla = new Menjar("bacallà");
        renat.menja(bacalla);
        renat.netejaUrpes();
        gat1.netejaUrpes();
        renat.netejaUrpes();
    }    
}
