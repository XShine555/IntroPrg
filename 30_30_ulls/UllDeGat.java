public class UllDeGat {
    private boolean obert = false;

    public UllDeGat() {
        this(false);
    }   
    
    public UllDeGat(boolean bool) {
        obert = bool;
    }

    public void obrir() {
        obert = true;
    }

    public void tancar() {
        obert = false;
    }

    public boolean esObert() {
        return obert;
    }
}
