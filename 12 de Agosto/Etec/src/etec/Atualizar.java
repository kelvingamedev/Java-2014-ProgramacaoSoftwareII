package etec;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Atualizar {

    public Atualizar() throws SQLException {
        Conexao conecta = new Conexao();
        if (conecta.getRetorno()) {
            String codigo = JOptionPane.showInputDialog("Digite o código");

            if (!codigo.equals("")) {

                String nome = JOptionPane.showInputDialog("Digite um novo nome");

                if (!nome.equals("")) {
                    String atualizar = "UPDATE aluno SET AluNome ='" + nome + "' WHERE AluId =" + codigo;
                    PreparedStatement gatilho;
                    gatilho = conecta.conn.prepareStatement(atualizar);
                    gatilho.executeUpdate();
                    conecta.fechar();
                    JOptionPane.showMessageDialog(null, "Alterado com sucesso");
                }
                else{
                    JOptionPane.showMessageDialog(null, "O campo de pesquisa está vazio");
                }

            } else {
                JOptionPane.showMessageDialog(null, "O campo de pesquisa está vazio");
            }

        }
    }
}
