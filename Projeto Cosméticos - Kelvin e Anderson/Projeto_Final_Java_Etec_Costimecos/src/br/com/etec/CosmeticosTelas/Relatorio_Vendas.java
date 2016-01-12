/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.etec.CosmeticosTelas;

import br.com.etec.ConectionFactory.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Relatorio_Vendas extends javax.swing.JFrame {

    public class reVenda {

        private String CodigoVenda;
        private String Funcionario;
        private String Produto;
        private String Preço;
        private String Quantidade;
        private String Data;

        /**
         * @return the CodigoVenda
         */
        public String getCodigoVenda() {
            return CodigoVenda;
        }

        /**
         * @param CodigoVenda the CodigoVenda to set
         */
        public void setCodigoVenda(String CodigoVenda) {
            this.CodigoVenda = CodigoVenda;
        }

        /**
         * @return the Funcionario
         */
        public String getFuncionario() {
            return Funcionario;
        }

        /**
         * @param Funcionario the Funcionario to set
         */
        public void setFuncionario(String Funcionario) {
            this.Funcionario = Funcionario;
        }

        /**
         * @return the Produto
         */
        public String getProduto() {
            return Produto;
        }

        /**
         * @param Produto the Produto to set
         */
        public void setProduto(String Produto) {
            this.Produto = Produto;
        }

        /**
         * @return the Preço
         */
        public String getPreço() {
            return Preço;
        }

        /**
         * @param Preço the Preço to set
         */
        public void setPreço(String Preço) {
            this.Preço = Preço;
        }

        /**
         * @return the Quantidade
         */
        public String getQuantidade() {
            return Quantidade;
        }

        /**
         * @param Quantidade the Quantidade to set
         */
        public void setQuantidade(String Quantidade) {
            this.Quantidade = Quantidade;
        }

        /**
         * @return the Data
         */
        public String getData() {
            return Data;
        }

        /**
         * @param Data the Data to set
         */
        public void setData(String Data) {
            this.Data = Data;
        }

    }
    /**
     * Creates new form Relatorio_Vendas
     */
    List<reVenda> reVenda;
    int index = 0;
    int coluna;

    public Relatorio_Vendas() throws SQLException {
        initComponents();
        Conexao conecta = new Conexao(); //Cria a classe de conexao
        if (conecta.getCon()) { // Conecta com o BD
            String sql = "SELECT * FROM vendas "; // Seleciona todas as vendas
            PreparedStatement stm = conecta.con.prepareStatement(sql); // prepara o gatilho
            ResultSet rs = stm.executeQuery(); // Executa o comando
            reVenda = new ArrayList();

            while (rs.next()) { // Se dados forem retornados
                // Busca o primeiro resultado

                reVenda r = new reVenda();
                sql = "SELECT ProNome FROM produto WHERE ProCod =" + rs.getString("VendProd");
                stm = conecta.con.prepareStatement(sql);
                ResultSet rsProduto = stm.executeQuery();
                sql = "SELECT FunNome FROM funcionario WHERE FunCod =" + rs.getString("VendFun");

                stm = conecta.con.prepareStatement(sql);
                ResultSet rsFuncionario = stm.executeQuery();

                rsProduto.next();
                rsFuncionario.next();
                r.setCodigoVenda(rs.getString("VendCod"));
                r.setPreço(rs.getString("VendPreco"));
                r.setQuantidade(rs.getString("VendQuant"));
                r.setProduto(rsProduto.getString("ProNome"));
                r.setFuncionario(rsFuncionario.getString("FunNome"));
                
                

                
                reVenda.add(r);
            }
            jLabelCodigoVenda.setText(reVenda.get(index).getCodigoVenda());
                //jLabelData.setText(rs.getString("VendData"));
                jLabelPreco.setText(reVenda.get(index).getPreço());
                jLabelQuantidade.setText(reVenda.get(index).getQuantidade());


                jLabelFuncionario.setText(reVenda.get(index).getFuncionario());

               
                jLabelProduto.setText(reVenda.get(index).getProduto());
            coluna = reVenda.size();
//else {
            //JOptionPane.showMessageDialog(null, "Não há nenhuma venda registrada");
            //}
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabelCodigoVenda = new javax.swing.JLabel();
        jLabelFuncionario = new javax.swing.JLabel();
        jLabelProduto = new javax.swing.JLabel();
        jLabelPreco = new javax.swing.JLabel();
        jLabelQuantidade = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();

        jButton2.setText("-->");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Relatório de Vendas");

        jButton1.setText("-->");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("<--");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Código da Venda:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Funcionário:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Produto:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Preço:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Quantidade:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Data:");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabelCodigoVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCodigoVenda.setText("____");

        jLabelFuncionario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelFuncionario.setText("____");

        jLabelProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelProduto.setText("____");

        jLabelPreco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPreco.setText("____");

        jLabelQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelQuantidade.setText("____");

        jLabelData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelData.setText("____");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelCodigoVenda)
                                    .addComponent(jLabelProduto)
                                    .addComponent(jLabelFuncionario)
                                    .addComponent(jLabelPreco)
                                    .addComponent(jLabelQuantidade)
                                    .addComponent(jLabelData))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelCodigoVenda))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelFuncionario))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelProduto)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabelPreco))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabelQuantidade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabelData))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Menu_principal_Cosmeticos principal = new Menu_principal_Cosmeticos();
        principal.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    int i = 0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            index++;
            if (index < coluna) {
                
                jLabelCodigoVenda.setText(reVenda.get(index).getCodigoVenda());
                jLabelFuncionario.setText(reVenda.get(index).getFuncionario());
                jLabelProduto.setText(reVenda.get(index).getProduto());
                jLabelPreco.setText(reVenda.get(index).getPreço());
                jLabelQuantidade.setText(reVenda.get(index).getQuantidade());
                jLabelData.setText(reVenda.get(index).getData());
            }else{
                index--;
                JOptionPane.showMessageDialog(null,"Ultimo relatório");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            index--;
            if (index >= 0) {

                jLabelCodigoVenda.setText(reVenda.get(index).getCodigoVenda());
                jLabelFuncionario.setText(reVenda.get(index).getFuncionario());
                jLabelProduto.setText(reVenda.get(index).getProduto());
                jLabelPreco.setText(reVenda.get(index).getPreço());
                jLabelQuantidade.setText(reVenda.get(index).getQuantidade());
                jLabelData.setText(reVenda.get(index).getData());
            }else{
                index++;
                JOptionPane.showMessageDialog(null,"Primeiro relatório");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Relatorio_Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio_Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio_Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio_Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Relatorio_Vendas().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Relatorio_Vendas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelCodigoVenda;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelFuncionario;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JLabel jLabelProduto;
    private javax.swing.JLabel jLabelQuantidade;
    // End of variables declaration//GEN-END:variables
}
