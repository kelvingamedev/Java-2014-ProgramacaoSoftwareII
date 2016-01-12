package etec;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Busca {

    public Busca() throws SQLException {
        Conexao bd = new Conexao();
        if (bd.getRetorno()) {
            String opcao = JOptionPane.showInputDialog("Selecione uma opção\n1-Pesquisar todas as informações\n2-Pesquisar especificamente");

            if (!opcao.equals("")) {

                int n = Integer.parseInt(opcao);

                do {
                    switch (n) {
                        case 1:
                            String busca = "SELECT * FROM aluno";
                            PreparedStatement gatilho;
                            gatilho = bd.conn.prepareStatement(busca);
                            ResultSet resultado = gatilho.executeQuery();

                            while (resultado.next())// Enquanto houver resultados na consulta...
                            {
                                String cod = resultado.getString("AluId");//Retorna a informação por campo
                                String nome = resultado.getString("AluNome");

                                JOptionPane.showMessageDialog(null, " Código: " + cod + "\n Nome : " + nome);/*Imprime
                                 as informações  */

                            }
                            break;
                        case 2:
                            String buscaesp = JOptionPane.showInputDialog("Digite o aluno a ser buscado");

                            if (!buscaesp.equals("")) {
                                String query = "SELECT * FROM aluno WHERE AluNome like '%" + buscaesp + "%' ";
                                PreparedStatement gatilhoesp;
                                gatilhoesp = bd.conn.prepareStatement(query);
                                ResultSet resultadoesp = gatilhoesp.executeQuery();

                                    
                                    if (resultadoesp.wasNull()) {
                                        JOptionPane.showMessageDialog(null,"Nenhum resultado encontrado");
                       
                                    }else {
                                          while (resultadoesp.next())// Enquanto houver resultados na consulta...
                                        {
                                            String cod = resultadoesp.getString("AluId");//Retorna a informação por campo
                                            String nome = resultadoesp.getString("AluNome");

                                            JOptionPane.showMessageDialog(null, " Código: " + cod + "\n Nome : " + nome);/*Imprime
                                             as informações  */
                                        }
                                    }

                                }

                             else {
                                JOptionPane.showMessageDialog(null, "Campo de pesquisa vazio");
                                ;
                            }

                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Selecione apenas um e dois");
                    }

                } while (n != 1 && n != 2);
            } else {
                JOptionPane.showMessageDialog(null, "Campo de pesquisa vazio");
            }
        }

    }
}
