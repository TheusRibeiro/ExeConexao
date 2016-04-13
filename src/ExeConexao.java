
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExeConexao {

    public static void main(String[] args) throws SQLException {

        Connection con = null;
        String db = "noticias";
        String usuario = "root";
        String senha = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/" + db, usuario, senha);
            System.out.println("Conectado.");
        } catch (ClassNotFoundException ex) {
            System.out.println("Classe não encontrada, adicione o driver nas bibliotecas.");
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }

    }

}
