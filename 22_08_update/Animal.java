/*
 * Iker Rivera Garcia
 * 19/05/2025
 * Classe Animal, que representa un animal en un zoològic.
 */

public class Animal {
    private int id = -1; // -1 indica no assignat/indefinit
    private String nom;
    private Categoria categoria;

    public Animal(String nom, Categoria categoria) throws IllegalArgumentException {
        if (nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("El nom no pot ser null ni blanc");
        }
        if (categoria == null) {
            throw new IllegalArgumentException("La categoria no pot ser null");
        }
        this.nom = nom;
        this.categoria = categoria;
    }

    public Animal(int id, String nom, Categoria categoria) throws IllegalArgumentException {
        this(nom, categoria);
        if (id < 0) {
            throw new IllegalArgumentException("L'identificador ha de ser positiu");
        }
        this.id = id;
    }

    public boolean idIndefinit() {
        return id < 0;
    }

    public void setId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("L'identificador ha de ser positiu");
        }
        this.id = id;
    }

    public int getId() {
        if (idIndefinit()) {
            throw new UnsupportedOperationException("L'identificador no està disponible");
        }
        return id;
    }

    public String getNom() {
        return nom;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        String stringId = idIndefinit() ? "indefinit" : String.valueOf(getId());

        return String.format("Animal(id:%s, %s, %s)", stringId, getNom(), getCategoria());
    }
}