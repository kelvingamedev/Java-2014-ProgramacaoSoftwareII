package br.com.etec.ConectionFactory;
//para importar tudo do mysql simplesmente faça -> import java.sql.*;

import java.sql.Connection;//O Connection faz parte da classe ao lado do mysql
import java.sql.DriverManager;
import java.sql.SQLException;
//sempre que chamar o método Connection ele vai pedir a importação.

/**
 *
 * @author Anderson Araujo
 */
public class Conexao {

    public Connection con = null;//variavel de conexão com o mysql, armazena a conexão com o banco de dados
    //Final é uma constante, ou seja, uma variavel que 
    //não altera o valor
    public final String Driver = "com.mysql.jdbc.Driver";//driver de conexão do mysql com o Java
    public final String Nome = "cosmeticos";//Nome do meu banco de dados
    public final String Caminho = "jdbc:mysql://localhost:3306/" + Nome;//caminho do banco de dados, e o nome do banco de dados
    public final String Usuario = "root";
    public final String Senha = "vertrigo";

    /**
     * @return Método responsavel pela conexão do banco de dados, ele é do tipo
     * boolean retorna verdadeiro caso a conexão tenha sido efetuada com sucesso
     * e false caso ocorra um erro.
     */
    public boolean getCon() {
        try {
            Class.forName(Driver);
            con = DriverManager.getConnection(Caminho, Usuario, Senha);
            System.out.println("Conectado com o Banco de dados!");
            return true;
        } catch (SQLException erro) {
            System.out.println("O caminho para o banco de dados esta incorreto!");
            return false;
        } catch (ClassNotFoundException erro) {
            System.out.println("Drive incorreto");
            return false;
        }
    }

    public void fechar() throws SQLException {
        con.close();
    }
}
