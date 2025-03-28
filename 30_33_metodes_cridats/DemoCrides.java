/*
 * Iker Rivera Garcia
 * 28/03/2025
 * Clase DemoCrides, on la funció main
 * crea objectes de les classes Feli, Gat i GatRenat
 * i crida els mètodes netejaUrpes, menja i miola
 * per veure com es comporten.
 */

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
    }    
}
