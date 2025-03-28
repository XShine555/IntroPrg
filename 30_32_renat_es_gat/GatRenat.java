public class GatRenat extends Gat {
    public boolean esViu() {
        return getVides() > 0;
    }  

    public boolean esDret() {
        return getPosicio().equals("dret");
    }

    public boolean esAssegut() {
        return getPosicio().equals("assegut");
    }

    public boolean esEstirat() {
        return getPosicio().equals("estirat");
    }

    public String aixecat() {
        if (getPosicio().equals("dret"))
            return "passo de fer res";

        setPosicio("dret");
        return "ja m'aixeco";
    }

    public String seu() {
        if (getPosicio().equals("assegut"))
            return "passo de fer res";

        setPosicio("assegut");
        return "ja m'assec";
    }

    public String estirat() {
        if (getPosicio().equals("estirat"))
            return "passo de fer res";

        setPosicio("estirat");
        return "ja m'estiro";
    }
}
