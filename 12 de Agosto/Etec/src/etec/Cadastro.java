package etec;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;

public class Cadastro {

    public Cadastro() throws SQLException {
        Conexao bd = new Conexao(); //Busca a classe de conexão, automatizando o processo
        if (bd.getRetorno()) {
            String nome = JOptionPane.showInputDialog("Digite o nome", JOptionPane.QUESTION_MESSAGE);

            if (!nome.equals("")) {
                String codigo = JOptionPane.showInputDialog("Digite o código", JOptionPane.QUESTION_MESSAGE);
                if (!codigo.equals("")) {
                    String cad = "insert into aluno values('" + codigo + "' , '" + nome + "')";
                    PreparedStatement gatilho;
                    gatilho = bd.conn.prepareStatement(cad);
                    gatilho.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Cadastrado com sucesso", "Congratuletion", JOptionPane.INFORMATION_MESSAGE);
                    bd.fechar();/* Chama o método da classe Conexão( que possuir maior segurança)
                     para encerrar a conexão com o MySQL*/

                }
                else {
                    JOptionPane.showMessageDialog(null , "O campo está vazio");
                }

            } else{
                JOptionPane.showMessageDialog(null , "O campo está vazio");
            }

        }
    }
}
