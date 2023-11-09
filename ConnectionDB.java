import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/Banco_dados_banco_av2";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "116811";

    public static Connection getConexaoMySQL() {
        try {
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Falha ao obter a conexão com o banco de dados.", e);
        }
    }

    public static void fecharConexao(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Falha ao fechar a conexão com o banco de dados.", e);
            }
        }
    }

    public static void listarContas() {
        try (Connection connection = getConexaoMySQL()) {
            String sql = "SELECT tipo_conta, nome_conta, status_conta, numero_conta FROM conta_bancaria";
            // Crie um PreparedStatement e execute a consulta
            // ...
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Ocorreu um erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        listarContas();
    }
}
