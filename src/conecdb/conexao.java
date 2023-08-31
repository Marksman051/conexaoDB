
package conecdb;
// importes necessarios 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class conexao {
    Connection conn; //criando um objeto do tipo connection chamado conn
        try {
            Statement st; //criando um objeto do tipo Statement  chamado st para execução de comando SQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/bancocriado", "root", "senha se tiver");// endereço do banco de dados que vai ser usado
            st = conn.createStatement();// estabelecer a conexao 
        } catch (ClassNotFoundException ex) {
            System.out.println("driver não está disponível para acesso ou não existe");
        } catch (SQLException ex) {
            System.out.println("Sintaxe de comando invalida ");
        }

        
        
    
}
