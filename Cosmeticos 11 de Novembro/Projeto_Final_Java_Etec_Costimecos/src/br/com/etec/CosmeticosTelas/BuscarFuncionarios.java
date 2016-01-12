package br.com.etec.CosmeticosTelas;

import br.com.etec.ConectionFactory.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BuscarFuncionarios extends javax.swing.JFrame {

    public BuscarFuncionarios() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel14 = new javax.swing.JLabel();
        jComboBoxPesquisar = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonPesquisar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Buscar - Funcionário");

        jComboBoxPesquisar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FunNome", "FunRG", "FunCPF", "TelRes", "TelCel", "EndRua", "EndCid", "EndEst", "LogUsu", " " }));
        jComboBoxPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxPesquisarActionPerformed(evt);
            }
        });

        jLabel17.setText("Pesquisa:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Funcionário", "RG", "CPF", "Rua", "Cidade", "Estado", "Usuário", "Tel", "Cel"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jLabel18.setText("Pesquisar por:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jLabel14))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jComboBoxPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonPesquisar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel18)
                .addGap(82, 82, 82)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonPesquisar))
                    .addComponent(jComboBoxPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxPesquisarActionPerformed

    }//GEN-LAST:event_jComboBoxPesquisarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        /*====================================  VARIAVEIS ================================================*/
        DefaultTableModel tabela; // DeafultTableModel eh um tipo de variavel que armazena tabelas
        tabela = (DefaultTableModel) jTable1.getModel(); // Recebe o modelo grafico da tabela
        tabela.setRowCount(0); // Zera a tabela
        ArrayList<String> CodigosFuncionarios = new ArrayList<String>();
        PreparedStatement stm; // Gatilho para execuçao de SQLs
        ResultSet rs = null; // Variavel de retorno de buscas
        Boolean DadosRetornados = true; // Verifica se dados foram retornados
        Conexao conecta = new Conexao(); // Instancia a classe conexao
        String FunNome, FunRG, FunCPF, TelRes, TelCel, // Variaveis para armazenar dados das tabelas
                EndRua, EndCid, EndEst, LogUsu;


        /*====================================    PRIMEIRA ETAPA ================================================*/
// A primeira etapa eh receber todas as informacoes da pesquisa
        int NumeroTabela = jComboBoxPesquisar.getSelectedIndex() + 1;
        //O programa utiliza a posiçao do ComboBox
        //  para trabalhar com as tabelas.
        // Logo, as tabelas estao em sequencia

        String CampoPesquisa = jComboBoxPesquisar.getSelectedItem().toString();
        // A escolha feita no ComboBox eh utilizada
        // como campo de pesquisa da query

        String Pesquisa = jTextFieldPesquisar.getText();
        // A pesquisa do usuario eh armazenada          

        /*=======================================   SEGUNDA ETAPA  ============================================*/
        //A segunda etapa consiste em indicar a query de selecao do codigo do funcionario 
        String sql = null; // Variavel que armazena as querys

        if (!Pesquisa.equals("")) {// Se o campo de pesquisa nao for nulo

            if (NumeroTabela >= 1 && NumeroTabela <= 3) {
                // Verifica se a pesquisa tem dados da tabela funcionario
                sql = "SELECT FunCod FROM funcionario WHERE " + CampoPesquisa + " IN ('" + Pesquisa + "')";
                // Querry Especifica
            } else if (NumeroTabela == 4 || NumeroTabela == 5) {
//  Verifica se o usuario vai pesquisar na tabela Telefone
                sql = "SELECT FunCod FROM funcionario WHERE FunTel IN "
                        + " (SELECT TelCod FROM telefone WHERE " + CampoPesquisa + " IN ('" + Pesquisa + "'))";
                //Query especifica      
//  Verifica se o usuario vai pesquisar na tabela Endereco
            } else if (NumeroTabela >= 6 && NumeroTabela <= 8) {
                sql = "SELECT FunCod FROM funcionario WHERE FunEnd IN "
                        + " (SELECT EndCod FROM Endereco WHERE " + CampoPesquisa + " IN ('" + Pesquisa + "'))";
            } else {
                /*Pesquisa na tabela login*/
                sql = "SELECT FunCod FROM funcionario WHERE FunLog IN "
                        + " (SELECT LogCod FROM login WHERE " + CampoPesquisa + " IN ('" + Pesquisa + "'))";
            }
            /*=======================================   TERCEIRA ETAPA  ============================================*/
            //Consiste em buscar o codigo do funcionario    
            if (conecta.getCon()) {
                try {//Tenta se conectar com o banco de dados   
                    stm = conecta.con.prepareStatement(sql); // Prepara a busca
                    rs = stm.executeQuery(); // Busca e retorna o resultado

                    if (!rs.wasNull()) {    // Verifica se ha resultados para colocar na variavel
                        while (rs.next()) {
                            CodigosFuncionarios.add(String.valueOf(rs.getInt("FunCod")));
                            // Recebe o codigo dos funcionarios
                        }

                    } else {
                        DadosRetornados = false; // Nenhuma informacao foi retornada
                    }

                } catch (SQLException ex) { // Execoces
                    Logger.getLogger(BuscarFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
                }

                /*=======================================   QUARTA ETAPA  ============================================*/
                // Configurar a String de SQL do INNER JOIN, para buscar todas informacoes necessarias
                if (DadosRetornados != false) { // Se dados forem retornados
                    for (String codFuncionario : CodigosFuncionarios) {
                        sql = "SELECT "
                                + "FunNome, FunRG, FunCPF, TelRes, TelCel, EndRua, EndCid, EndEst , LogUsu"
                                + " FROM funcionario"
                                + " INNER JOIN telefone ON (funcionario.FunTel = telefone.TelCod)"
                                + "  INNER JOIN endereco ON (funcionario.FunEnd = endereco.EndCod)"
                                + " INNER JOIN login ON (funcionario.FunLog = login.LogCod)"
                                + " WHERE funcionario.FunCod =" + Integer.parseInt(codFuncionario);
                         // SQL INNER JOIN para busca de todas informacoes

                        /*=======================================   QUINTA ETAPA  ============================================*/
                        // Fazer a busca com o INNER JOIN
                        if (conecta.getCon()) {
                            try {
                                stm = conecta.con.prepareStatement(sql); // prepara o gatilho
                                rs = stm.executeQuery(); // realiza a busca
                                // Colocar os dados na tabela
                                while (rs.next()) {
                                    FunNome = rs.getString("FunNome"); // Busca as informacoes do ResultSet
                                    FunRG = rs.getString("FunRG");
                                    FunCPF = rs.getString("FunCPF");
                                    EndRua = rs.getString("EndRua");
                                    EndCid = rs.getString("EndCid");
                                    EndEst = rs.getString("EndEst");
                                    LogUsu = rs.getString("LogUsu");
                                    TelRes = rs.getString("TelRes");
                                    TelCel = rs.getString("TelCel");

                                    tabela.addRow(new String[]{FunNome, FunRG, FunCPF, EndRua, EndCid, EndEst, LogUsu, TelRes, TelCel});
                                    // Adiciona linhas de resultado na tabela
                                }
                                conecta.fechar(); // Fecha o banco de dados

                            } catch (SQLException ex) { // Excecao
                                Logger.getLogger(BuscarFuncionarios.class.getName()).log(Level.SEVERE, null, ex);
                            }

                        }
                    }
                    {

                        /*=======================================   SEXTA ETAPA  ============================================*/
                    }

                } else { // Nenhuma resultado foi retornado
                    JOptionPane.showMessageDialog(null, "Nenhum resultado foi retornado");
                }

            }

        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }

    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu_Buscas buscas = new Menu_Buscas();
        buscas.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JComboBox jComboBoxPesquisar;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldPesquisar;
    // End of variables declaration//GEN-END:variables
}
