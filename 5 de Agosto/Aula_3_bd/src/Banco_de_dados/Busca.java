package Banco_de_dados;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Anderson Araujo
 */
public class Busca {

    public static void main(String[] args) throws SQLException {
        String pesquisa = JOptionPane.showInputDialog(null,"Quem você deseja pesquisar?","Pesquisa por nome ou letra", JOptionPane.QUESTION_MESSAGE);
        Conexao bd = new Conexao();
        //
        if (bd.getCon()) {
            String sql = "Select * from aluno where nome like '%"+pesquisa+"%'";
            PreparedStatement stm; //
            stm = bd.con.prepareStatement(sql);//stm é uma classe que tem métodos que trabalham com o banco de dados.
            //Este stm é como escrever o codigo que sera inserido no banco de dados colocar o ponto e virgula porem não da enter.
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                String codigo = rs.getString("codigo");
                String nome = rs.getString("nome");
                JOptionPane.showMessageDialog(null, "Codigo = "+codigo+""
                        + "\nNome = "+nome);
            }
        } else {

        }
    }

}
