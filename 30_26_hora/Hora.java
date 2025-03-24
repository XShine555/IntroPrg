public class Hora {
    private int hores;
    private int minuts;
    private int segons;
    
    public Hora() {
        this(0,0,0);
    }

    public Hora(int hores, int minuts, int segons) {
        setHores(hores);
        setMinuts(minuts);
        setSegons(segons);
    }

    public int getHores() {
        return hores;
    }

    public int getMinuts() {
        return minuts;
    }

    public int getSegons() {
        return segons;
    }

    public void setHores(int hora) {
        if (hora >= 0 && hora < 24) {
            hores = hora;
        } else {
            hores = 0;
        }
    }

    public void setMinuts(int minuts) {
        if (minuts >= 0 && minuts < 60) {
            this.minuts = minuts;
        } else {
            this.minuts = 0;
        }
    }

    public void setSegons(int segons) {
        if (segons >= 0 && segons < 60) {
            this.segons = segons;
        } else {
            this.segons = 0;
        }
    }

    public void incrementa() {
        segons++;
        if (segons == 60) {
            segons = 0;
            minuts++;
            if (minuts == 60) {
                minuts = 0;
                hores++;
                if (hores == 24) {
                    hores = 0;
                }
            }
        }
    }

    public void incrementa(int value) {
        for (int i = 0; i < value; i++) {
            incrementa();
        }
    }

    public void decrementa() {
        segons--;
        if (segons == -1) {
            segons = 59;
            minuts--;
            if (minuts == -1) {
                minuts = 59;
                hores--;
                if (hores == -1) {
                    hores = 23;
                }
            }
        }
    }

    public void decrementa(int value) {
        for (int i = 0; i < value; i++) {
            decrementa();
        }
    }

    public int compareTo(Hora hora) {
        if (hores < hora.getHores()) {
            return -1;
        } else if (hores > hora.getHores()) {
            return 1;
        } else {
            if (minuts < hora.getMinuts()) {
                return -1;
            } else if (minuts > hora.getMinuts()) {
                return 1;
            } else {
                if (segons < hora.getSegons()) {
                    return -1;
                } else if (segons > hora.getSegons()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%d:%02d:%02d", hores, minuts, segons);
    }
}