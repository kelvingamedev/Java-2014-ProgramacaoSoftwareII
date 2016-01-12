package br.com.etec.CosmeticosTelas;

import br.com.etec.ConectionFactory.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class CadastroFuncionario extends javax.swing.JFrame {

    public CadastroFuncionario() throws SQLException {
        initComponents();
        jTextFieldCodigo.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jTextFieldRua = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxEstado = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButtonCriar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldComplemento = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextFieldNomeUsuario = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jFormattedTextFieldRG = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jPasswordFieldConfirmarSenha = new javax.swing.JPasswordField();
        jFormattedTextFieldTelefoneCelular = new javax.swing.JFormattedTextField();
        jFormattedTextFieldTelefoneResidencial = new javax.swing.JFormattedTextField();
        jTextFieldCodigo = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Funcionario");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jLabel1.setText("Nome:");

        jTextFieldNome.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jTextFieldNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jLabel2.setText("RG:");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jLabel3.setText("CPF:");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jLabel5.setText("Telefone Residencial:");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jLabel6.setText("Telefone Celular:");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jLabel7.setText("Nº:");

        jTextFieldNumero.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jTextFieldNumero.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jTextFieldRua.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jTextFieldRua.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jLabel8.setText("Rua:");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jLabel9.setText("Complemento:");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jLabel10.setText("Bairro:");

        jTextFieldBairro.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jTextFieldBairro.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jLabel11.setText("Estado:");

        jComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AM", "RJ", "SP", "MG", "MT", "MS", "BA", "PI", "PR", "SC", "PA", "TO", "GO", "AL", "SE", " " }));

        jLabel14.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel14.setText("Cadastro de Funcionários");

        jLabel15.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel15.setText("Dados báscos");

        jButtonCriar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCriar.setText("Criar");
        jButtonCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarActionPerformed(evt);
            }
        });

        jButtonVoltar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel22.setText("Telefone:");

        jLabel23.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        jLabel23.setText("Endereço:");

        jLabel24.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jLabel24.setText("Cidade:");

        jTextFieldCidade.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jTextFieldCidade.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jTextFieldComplemento.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jTextFieldComplemento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldComplementoActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jLabel25.setText("Nome de usuário:");

        jLabel26.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jLabel26.setText("Senha:");

        jTextFieldNomeUsuario.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jTextFieldNomeUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel28.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jLabel28.setText("Confirmar senha:");

        try {
            jFormattedTextFieldRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextFieldRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldRGActionPerformed(evt);
            }
        });

        try {
            jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jPasswordFieldSenha.setText("jPasswordField1");

        jPasswordFieldConfirmarSenha.setText("jPasswordField2");

        try {
            jFormattedTextFieldTelefoneCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextFieldTelefoneResidencial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTextFieldCodigo.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        jTextFieldCodigo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextFieldCodigo.setEnabled(false);
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(20, 20, 20)
                                .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addGap(25, 25, 25)
                                        .addComponent(jTextFieldNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel28)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(41, 41, 41)
                                        .addComponent(jFormattedTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(81, 81, 81)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(79, 79, 79)
                                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel14))
                            .addComponent(jLabel15)
                            .addComponent(jLabel23)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel6)
                                        .addGap(26, 26, 26))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jPasswordFieldConfirmarSenha, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jFormattedTextFieldTelefoneCelular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                        .addComponent(jFormattedTextFieldTelefoneResidencial, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addComponent(jLabel22))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(38, 38, 38)
                                .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCidade)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(125, 125, 125))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jTextFieldNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jPasswordFieldConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextFieldTelefoneResidencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jFormattedTextFieldTelefoneCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVoltar)
                    .addComponent(jButtonCriar)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldComplementoActionPerformed

    private void jButtonCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarActionPerformed

        String CPF = jFormattedTextFieldCPF.getText().replace(".", "");
        CPF = CPF.replaceAll("-", "");
        String RG = jFormattedTextFieldRG.getText().replace(".", "");
        RG = RG.replaceAll("-", "");
        String Nome = jTextFieldNome.getText();
        String NomeUsuario = jTextFieldNomeUsuario.getText();
        String Cidade = jTextFieldCidade.getText();
        String Senha = jPasswordFieldSenha.getText();
        String ConfirmarSenha = jPasswordFieldConfirmarSenha.getText();
        String TelefoneResidencial = jFormattedTextFieldTelefoneResidencial.getText().replaceAll("-", "");
        TelefoneResidencial = TelefoneResidencial.replaceAll(Pattern.quote("("), "");
        TelefoneResidencial = TelefoneResidencial.replaceAll(Pattern.quote(")"), "");
        String TelefoneCelular = jFormattedTextFieldTelefoneCelular.getText().replaceAll("-", "");
        TelefoneCelular = TelefoneCelular.replaceAll(Pattern.quote("("), "");
        TelefoneCelular = TelefoneCelular.replaceAll(Pattern.quote(")"), "");
        String Rua = jTextFieldRua.getText();
        String Bairro = jTextFieldBairro.getText();
        String Numero = jTextFieldNumero.getText();
        String Complemento = jTextFieldComplemento.getText();
        String Estado = jComboBoxEstado.toString();

        if (!Nome.equals("")
                && !CPF.equals("")
                && !RG.equals("")
                && !Nome.equals("")
                && !NomeUsuario.equals("")
                && !Cidade.equals("")
                && !Senha.equals("")
                && !TelefoneResidencial.equals("")
                && !TelefoneCelular.equals("")
                && !Rua.equals("")
                && !Bairro.equals("")
                && !Numero.equals("")
                && !Complemento.equals("")
                && !Estado.equals("")) {
            if (ConfirmarSenha.equals(Senha)) {
                Conexao conexao = new Conexao();
                if (conexao.getCon()) {
                    try {
                        String sql = "SELECT MAX(TelCod) FROM telefone";
                        PreparedStatement stm = conexao.con.prepareStatement(sql);
                        ResultSet rs = stm.executeQuery();
                        rs.next();
                        jTextFieldCodigo.setText(((rs.getString(1) == null ? "1" : String.valueOf(Integer.parseInt(rs.getString(1)) + 1))));

                        String insercao[] = new String[4];

                        insercao[0] = "INSERT INTO telefone(TelCod, TelRes, TelCel)VALUES ("
                                + jTextFieldCodigo.getText() + ","
                                + "'" + TelefoneResidencial + "',"
                                + "'" + TelefoneCelular + "'"
                                + ")";

                        insercao[1] = "INSERT INTO login(LogCod,LogUsu, LogSenha)VALUES("
                                + "'" + jTextFieldCodigo.getText() + "',"
                                + "'" + NomeUsuario + "',"
                                + "'" + Senha + "'"
                                + ")";

                        insercao[2] = "INSERT INTO endereco(EndCod , EndRua, EndNum,EndCompl,"
                                + "EndCid, EndEst) VALUES"
                                + "("
                                + jTextFieldCodigo.getText() + ","
                                + "'" + Rua + "' ,"
                                + "'" + Numero + "',"
                                + "'" + Complemento + "',"
                                + "'" + Cidade + "',"
                                + "'" + jComboBoxEstado.getSelectedItem() + "'"
                                + ")";

                        insercao[3] = "INSERT INTO funcionario "
                                + "(FunCod , FunNome,FunRG, FunCPF, FunEnd, FunTel, FunLog)"
                                + "VALUES ("
                                + jTextFieldCodigo.getText() + ","
                                + "'" + Nome + "',"
                                + "'" + RG + "',"
                                + "'" + CPF + "',"
                                + jTextFieldCodigo.getText() + ","
                                + jTextFieldCodigo.getText() + ","
                                + jTextFieldCodigo.getText()
                                + ")";

                        for (String a : insercao) {

                            stm = conexao.con.prepareStatement(a);
                            stm.executeUpdate();
                        }
                        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

                    } catch (SQLException ex) {
                        Logger.getLogger(CadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "As senhas digitadas não batem");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        }
    }//GEN-LAST:event_jButtonCriarActionPerformed

    private void jFormattedTextFieldRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldRGActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed

    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CadastroFuncionario().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(CadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCriar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox jComboBoxEstado;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JFormattedTextField jFormattedTextFieldRG;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefoneCelular;
    private javax.swing.JFormattedTextField jFormattedTextFieldTelefoneResidencial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPasswordField jPasswordFieldConfirmarSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldComplemento;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNomeUsuario;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldRua;
    // End of variables declaration//GEN-END:variables
}
