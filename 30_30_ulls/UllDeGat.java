public class UllDeGat {
    private boolean obert;

    public UllDeGat() {
        this(false);
    }   
    
    public UllDeGat(boolean bool) {
        obert = bool;
    }

    public void obrir() {
        obert = true;
    }
    public void obret() {
        obert = true;
    }

    public void tancar() {
        obert = false;
    }
    public void tancat() {
        obert = false;
    }

    public boolean esObert() {
        return obert;
    }
}
