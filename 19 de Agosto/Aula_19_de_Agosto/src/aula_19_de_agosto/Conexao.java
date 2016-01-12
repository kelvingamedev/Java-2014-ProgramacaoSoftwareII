package aula_19_de_agosto;

import java.sql.Connection;// Necessário para utilizar o Connection
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public Connection con; // Variável de conexão com o banco de dados.
    public final String driver = "com.mysql.jdbc.Driver"; //Driver de conexão com o Mysql
    public final String banco = "empresa";
    public final String usuario = "root";
    public final String senha = "vertrigo";
    public final String caminhoBD = "jdbc:mysql://localhost:3306/" + banco;

    public boolean Conecta() throws ClassNotFoundException {
        try {
                Class.forName(driver);
                con = DriverManager.getConnection(caminhoBD , usuario , senha);
                return true;
        } catch (SQLException ex) {
            System.out.println("Caminho ou nome do banco de dados está errado"+ex);
            return false;  
        }        
    }
    
          public void Fechar() throws SQLException{
              con.close();
          }

}
  