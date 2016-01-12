package etec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    //Final é uma constante 

    public Connection conn; //variável de conexão com o banco de dados.
    public final String Driver = "com.mysql.jdbc.Driver"; //Nome do driver de conexão com o BD. 
    public final String Nomebd = "Etec";//  Nome do Banco de dados.
    public final String Caminhobd = "jdbc:mysql://localhost:3306/" + Nomebd; /*Caminho de acesso
     do banco de dados*/

    public final String Usuario = "root"; //Usuário do banco de dados.
    public final String Senha = "vertrigo"; // Senha do banco de dados.

    public boolean getRetorno() {
        try {
            Class.forName(Driver);
            conn = DriverManager.getConnection( /*Conecta com o banco de dados conforme
                     os dados informados */
                    Caminhobd, Usuario, Senha);
            return true;
        } catch (ClassNotFoundException erro) {
            System.out.println("Driver não funciona");
            return false;
        } catch (SQLException erro) {
            System.out.println("Caminho ou nome do banco de dados está errado");
            return false;
        }
    }

    public void fechar() throws SQLException {
        conn.close();
    }

}
