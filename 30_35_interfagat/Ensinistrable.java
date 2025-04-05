/*
 * Iker Rivera Garcia
 * 05/04/2025
 * Ensinistrable.java, interfície que defineix els mètodes esDret, esAssegut,
 * esEstirat, aixecat, seu i estirat. Aquesta interfície és implementada per la
 * classe GatRenat, que representa un gat que pot ser ensinistrat per adoptar
 * diferents posicions. Els mètodes permeten gestionar l'estat de la posició del
 * gat, incloent les posicions dret, assegut i estirat. Els mètodes
 * aixecat, seu i estirat retornen un missatge indicant l'acció realitzada pel gat.
 */

public interface Ensinistrable {
    public boolean esDret();
    public boolean esAssegut();
    public boolean esEstirat();
    public String aixecat();
    public String seu();
    public String estirat();
}