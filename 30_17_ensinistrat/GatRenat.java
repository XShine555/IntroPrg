/*
 * Iker Rivera Garcia
 * 17/03/2025
 * Clase GatRenat, clase que modela un gat amb els seus atributs i mètodes.
 */

public class GatRenat {
    private String lastState = "";

    public String aixecat() {
        if (lastState.equals("aixecat"))
            return "passo de fer res";
        lastState = "aixecat";
        return "ja m'aixeco";
    }
    
    public String seu() {
        if (lastState.equals("seu"))
            return "passo de fer res";
        lastState = "seu";
        return "ja m'assec";
    }

    public String estirat() {
        if (lastState.equals("estirat"))
            return "passo de fer res";
        lastState = "estirat";
        return "ja m'estiro";   
    }
}
