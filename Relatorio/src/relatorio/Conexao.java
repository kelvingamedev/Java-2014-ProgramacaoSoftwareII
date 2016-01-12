
package relatorio;

import java.sql.*;

public class Conexao {
    public Connection con;
    public String drive = "com.mysql.jdbc.Driver";
    public String banco = "relatorios";
    public String Caminho = "jdbc:mysql://localhost:3306/"+ 
            banco;
    public String usuario = "root";
    public String senha = "vertrigo";
    public boolean getCon(){
        try{
            Class.forName(Caminho);
            con = DriverManager.getConnection(Caminho, usuario, senha);
            
            return true;            
        }catch (SQLException ex){
                System.out.println(ex);
            return false;
        
        } catch(ClassNotFoundException ex){
        return false;
        }
        
    }
    
    
    
}
