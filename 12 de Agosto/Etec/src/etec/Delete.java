package etec;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Delete {

    public Delete() throws SQLException {
        Conexao bd = new Conexao();
        if (bd.getRetorno()) {
            String cod = JOptionPane.showInputDialog("Digite o códgo para apagar");

            if (!cod.equals("")) {
                String deletar = "DELETE FROM aluno WHERE AluId = " + cod;
                PreparedStatement gatilho;
                gatilho = bd.conn.prepareStatement(deletar);
                gatilho.executeUpdate();
                bd.fechar();
                JOptionPane.showMessageDialog(null, "Deletado com sucesso");
            }
            else{
                JOptionPane.showMessageDialog(null, "O campo de exclusão está vazio");
            }

        }
    }
}
