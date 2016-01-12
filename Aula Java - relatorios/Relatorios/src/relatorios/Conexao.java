package relatorios;

import java.sql.*;

public class Conexao {
   public Connection con;
   public String drive = "com.mysql.jdbc.Driver";
   public String nome = "relatorios";
   public String Caminho= "jdbc:mysql://localhost:3306/"+
            nome;
   public String usuario = "root";
   public String senha = "vertrigo";
   
   public boolean getRetorno(){
       try{
           Class.forName(drive);
           con = DriverManager.getConnection(Caminho,
                   usuario,senha);
           
           return true;
       }catch(SQLException e){
           System.out.println("np");
           return false;
       }catch(ClassNotFoundException e){
           System.out.println("np1");
           return false;
       }
   }
}
