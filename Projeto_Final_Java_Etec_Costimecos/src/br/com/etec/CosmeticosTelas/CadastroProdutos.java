package br.com.etec.CosmeticosTelas;

import br.com.etec.ConectionFactory.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastroProdutos extends javax.swing.JFrame {

    public CadastroProdutos() throws SQLException {
        initComponents();
        jTextFieldCodigo.setVisible(false);
        Conexao conecta = new Conexao();
        if (conecta.getCon()) {
            String sql = "SELECT FabNome FROM fabricante";
            PreparedStatement stm = conecta.con.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                jComboBoxFabricante.addItem(rs.getString(1));
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaObservacao = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPreco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSpinnerQuantidade = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxFabricante = new javax.swing.JComboBox();
        jButtonCadastrar = new javax.swing.JButton();
        jTextFieldCodigo = new javax.swing.JTextField();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldNome.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jTextFieldNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jLabel4.setText("Nome:");

        jLabel14.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel14.setText("Cadastro de Produtos");

        jLabel15.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel15.setText("Produto");

        jTextAreaObservacao.setColumns(20);
        jTextAreaObservacao.setRows(5);
        jScrollPane2.setViewportView(jTextAreaObservacao);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jLabel5.setText("Observação:");

        jTextFieldPreco.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jTextFieldPreco.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jLabel6.setText("Preço:");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jLabel7.setText("Quantidade:");

        jLabel16.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel16.setText("Fabricante:");

        jComboBoxFabricante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFabricanteActionPerformed(evt);
            }
        });

        jButtonCadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });

        jButtonVoltar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinnerQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButtonVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButtonCadastrar)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jSpinnerQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jComboBoxFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonCadastrar)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxFabricanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFabricanteActionPerformed

    }//GEN-LAST:event_jComboBoxFabricanteActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        String Nome = jTextFieldNome.getText();
        String Observacao = jTextAreaObservacao.getText();
        String Preco = jTextFieldPreco.getText();
        String Quantidade = jSpinnerQuantidade.getValue().toString();
        String Fabricante = jComboBoxFabricante.getSelectedItem().toString();

        JOptionPane.showMessageDialog(null, Quantidade + "\n" + Fabricante);

        if (!Nome.isEmpty()
                && !Observacao.isEmpty()
                && !Preco.isEmpty()
                && !Quantidade.isEmpty()
                && !Fabricante.isEmpty()) {
            Conexao conecta = new Conexao();
            if (conecta.getCon()) {
                try {
                    String sql = "SELECT MAX(ProCod) from produto";
                    PreparedStatement stm = conecta.con.prepareStatement(sql);
                    ResultSet rs = stm.executeQuery();
                    rs.next();
                    jTextFieldCodigo.setText(((rs.getString(1) == null ? "1" : String.valueOf(Integer.parseInt(rs.getString(1)) + 1))));
                    sql = "SELECT FabCod FROM fabricante WHERE FabNome ='" + Fabricante + "'";
                    stm = conecta.con.prepareStatement(sql);
                    rs = stm.executeQuery();
                    rs.next();
                    String FabCod = rs.getString(1);

                    sql = "INSERT INTO produto(ProCod, ProNome,ProFab,ProObs,ProPreco,ProQuant ) VALUES"
                            + "("
                            + jTextFieldCodigo.getText() + ","
                            + "'" + Nome + "' ,"
                            + FabCod + ","
                            + "'" + Observacao + "' ,"
                            + Double.parseDouble(Preco) + ","
                            + Integer.parseInt(Quantidade)
                            + ")";

                    stm = conecta.con.prepareStatement(sql);
                    stm.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");

                } catch (SQLException ex) {
                    Logger.getLogger(CadastroProdutos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
    }//GEN-LAST:event_jButtonCadastrarActionPerformed
    }
    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        Menu_principal_Cosmeticos principal = new Menu_principal_Cosmeticos();
        principal.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_principal_Cosmeticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_principal_Cosmeticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_principal_Cosmeticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_principal_Cosmeticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadastroProdutos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CadastroProdutos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox jComboBoxFabricante;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinnerQuantidade;
    private javax.swing.JTextArea jTextAreaObservacao;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPreco;
    // End of variables declaration//GEN-END:variables
}
