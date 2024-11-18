package main.java.com.crud;



import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {

    private static String URL;
    private static String USER;
    private static String PASSWORD;
    private static final Logger LOGGER = Logger.getLogger(DatabaseConnection.class.getName());

    static {
        try (InputStream input = DatabaseConnection.class.getClassLoader().getResourceAsStream("application.properties")) {
            Properties prop = new Properties();
            if (input == null) {
                System.out.println("Desculpe, não foi possível encontrar o arquivo application.properties");
            } else {
                // Carrega as propriedades
                prop.load(input);

                URL = prop.getProperty("db.url");
                USER = prop.getProperty("db.username");
                PASSWORD = prop.getProperty("db.password");

                // Verifica se as propriedades foram carregadas corretamente
                System.out.println("URL: " + URL);
                System.out.println("USER: " + USER);
                System.out.println("PASSWORD: " + PASSWORD);
            }
        }catch (Exception ex) {
            LOGGER.log(Level.SEVERE, "Erro ao carregar propriedades do banco de dados", ex);
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void main(String[] args) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            System.out.println(conn + " Conexão bem-sucedida!");
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Erro ao conectar ao banco de dados", e);
        }
    }
}
