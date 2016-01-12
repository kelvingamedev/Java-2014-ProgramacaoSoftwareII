/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.etec.CosmeticosTelas;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anderson Araujo
 */
public class Menu_principal_Cosmeticos extends javax.swing.JFrame {

    /**
     * Creates new form Menu_principal_Cosmeticos
     */
    public Menu_principal_Cosmeticos() {
        initComponents();
    }


  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jButtonCadastrar1 = new javax.swing.JButton();
        jButtonModuloFuncionarios = new javax.swing.JButton();
        jButtonVendas = new javax.swing.JButton();
        jButtonProdutos = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButtonModuloFabricantes = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonCadastrar6 = new javax.swing.JButton();
        jButtonCadastrar7 = new javax.swing.JButton();

        jLabel14.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel14.setText("Cadastro de Vendas");

        jButtonCadastrar1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCadastrar1.setText("Módulo de Fabricantes");
        jButtonCadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrar1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");

        jButtonModuloFuncionarios.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonModuloFuncionarios.setText("Módulo de Funcionários");
        jButtonModuloFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModuloFuncionariosActionPerformed(evt);
            }
        });

        jButtonVendas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonVendas.setText("Módulo de Vendas");
        jButtonVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVendasActionPerformed(evt);
            }
        });

        jButtonProdutos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonProdutos.setText("Módulo de Produtos");
        jButtonProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProdutosActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel15.setText("ERP  Cosméticos JK");

        jButtonModuloFabricantes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonModuloFabricantes.setText("Módulo de Fabricantes");
        jButtonModuloFabricantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModuloFabricantesActionPerformed(evt);
            }
        });

        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonCadastrar6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCadastrar6.setText("Sair");
        jButtonCadastrar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrar6ActionPerformed(evt);
            }
        });

        jButtonCadastrar7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonCadastrar7.setText("Relatório de vendas");
        jButtonCadastrar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrar7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCadastrar6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel15))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonCadastrar7, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonModuloFuncionarios)
                                    .addComponent(jButtonModuloFabricantes, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(96, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCadastrar7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonModuloFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModuloFabricantes, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButtonCadastrar6)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonModuloFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModuloFuncionariosActionPerformed
        try {
            CadastroFuncionario funcionario = new CadastroFuncionario();
            funcionario.setVisible(true);
            setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Menu_principal_Cosmeticos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonModuloFuncionariosActionPerformed

    private void jButtonCadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrar1ActionPerformed
        CadastroFabricantes fabricante = new CadastroFabricantes();
        fabricante.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonCadastrar1ActionPerformed

    private void jButtonVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVendasActionPerformed
    try{
            Cadastro_Vendas vendas = new Cadastro_Vendas();
            vendas.setVisible(true);
            setVisible(false);
    }catch(Exception err){
        System.out.println("Erro: "+err.getMessage());
    }    
    }//GEN-LAST:event_jButtonVendasActionPerformed

    private void jButtonProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProdutosActionPerformed
        try {
            CadastroProdutos produtos = new CadastroProdutos();
            produtos.setVisible(true);
            setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(Menu_principal_Cosmeticos.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButtonProdutosActionPerformed

    private void jButtonModuloFabricantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModuloFabricantesActionPerformed
        CadastroFabricantes fabricantes = new CadastroFabricantes();
        fabricantes.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonModuloFabricantesActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        Menu_Buscas buscas = new Menu_Buscas();
        buscas.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonCadastrar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrar6ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCadastrar6ActionPerformed

    private void jButtonCadastrar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrar7ActionPerformed
        try {
            Relatorio_Vendas vendas = new Relatorio_Vendas();
            setVisible(false);
            vendas.setVisible(true);
            
        } catch (SQLException ex) {
            Logger.getLogger(Menu_principal_Cosmeticos.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_jButtonCadastrar7ActionPerformed

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
                new Menu_principal_Cosmeticos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCadastrar1;
    private javax.swing.JButton jButtonCadastrar6;
    private javax.swing.JButton jButtonCadastrar7;
    private javax.swing.JButton jButtonModuloFabricantes;
    private javax.swing.JButton jButtonModuloFuncionarios;
    private javax.swing.JButton jButtonProdutos;
    private javax.swing.JButton jButtonVendas;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    // End of variables declaration//GEN-END:variables
}
