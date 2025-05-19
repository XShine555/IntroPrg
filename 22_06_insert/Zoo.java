/*
 * Iker Rivera Garcia
 * 19/05/2025
 * Clase Zoo, que representa un zoològic i gestiona la connexió amb una base de dades SQLite.
 */

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private static final String NOM_BASE_DE_DADES = "animals.bd";
    private static final String CADENA_DE_CONNEXIO = "jdbc:sqlite:" +
            NOM_BASE_DE_DADES;
    private Connection conn = null;

    public void connecta() throws SQLException {
        if (conn != null)
            return; // ja connectat
        conn = DriverManager.getConnection(CADENA_DE_CONNEXIO);
    }

    public void desconnecta() throws SQLException {
        if (conn == null)
            return; // ja desconnectat
        conn.close();
        conn = null;
    }

    public void creaTaulaCategories() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS CATEGORIES (" +
                "       id        INTEGER PRIMARY KEY AUTOINCREMENT," +
                "       nom       VARCHAR(40))";
        Statement st = null;
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }

    public void afegeixAnimal(Animal animal) throws SQLException {
        if (animal.idIndefinit())
            return;

        String sql = "INSERT INTO ANIMALS (nom, categoria) VALUES ('" +
                animal.getNom() + "', " +
                animal.getCategoria().getId() + ")";
        Statement st = null;
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
            animal.setId(st.getGeneratedKeys().getInt(1));
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }

    public void eliminaTaulaCategories() throws SQLException {
        String sql = "DROP TABLE IF EXISTS CATEGORIES";
        Statement st = null;
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
        } finally {
            if (st != null) {
                st.close();
            }
        }
        eliminaTaulaAnimals();
    }

    public void creaTaulaAnimals() throws SQLException {
        creaTaulaCategories();
        String sql = "CREATE TABLE IF NOT EXISTS ANIMALS (" +
                "       id        INTEGER PRIMARY KEY AUTOINCREMENT," +
                "       nom       VARCHAR(40)," +
                "       categoria INTEGER," +
                "       FOREIGN KEY (categoria) REFERENCES CATEGORIES(id))";
        Statement st = null;
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }

    public void eliminaTaulaAnimals() throws SQLException {
        String sql = "DROP TABLE IF EXISTS ANIMALS";
        Statement st = null;
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }

    public void afegeixCategoria(Categoria categoria) throws SQLException {
        String sql = "INSERT INTO CATEGORIES (nom) VALUES ('" + categoria.getNom() + "')";
        Statement st = null;
        try {
            st = conn.createStatement();
            st.executeUpdate(sql);
            categoria.setId(st.getGeneratedKeys().getInt(1));
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }

    public List<Categoria> recuperaCategories() throws SQLException {
        String sql = "SELECT * FROM CATEGORIES ORDER BY nom DESC, id DESC";
        Statement st = null;
        try {
            st = conn.createStatement();
            var rs = st.executeQuery(sql);
            List<Categoria> categories = new ArrayList<>();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                categories.add(new Categoria(id, nom));
            }
            return categories;
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }

    /* retorna el nom de les taules definides a la bd */
    public String getNomTaules() throws SQLException {
        String sql = "SELECT name FROM sqlite_schema " +
                "WHERE name NOT LIKE 'sqlite%' " +
                "ORDER BY name";
        List<String> taules = new ArrayList<>();
        try (Statement st = conn.createStatement()) {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                taules.add(rs.getString("name"));
            }
            rs.close();
        }
        return taules.size() > 0 ? String.join(", ", taules) : "cap";
    }

    public Categoria obteCategoriaPerNom(String nom) throws SQLException {
        String sql = "SELECT * FROM CATEGORIES WHERE nom = '" + nom + "'";
        Statement st = null;
        try {
            st = conn.createStatement();
            var rs = st.executeQuery(sql);
            if (rs.next()) {
                int id = rs.getInt("id");
                return new Categoria(id, nom);
            } else {
                return null;
            }
        } finally {
            if (st != null) {
                st.close();
            }
        }
    }

    public static void main(String[] args) throws SQLException {
        Zoo zoo = new Zoo();

        System.out.print("Primer connectem amb la base de dades: ");
        zoo.connecta();
        System.out.println("connectat");

        System.out.println("Creem la taula CATEGORIES");
        zoo.creaTaulaCategories();

        System.out.print("Finalment tanquem la connexió amb la base de dades: ");
        zoo.desconnecta();
        System.out.println("desconnectat");
    }
}