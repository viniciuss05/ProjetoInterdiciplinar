/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univs.edu.telas;

import javax.swing.JOptionPane;
import univs.edu.funcionario.Funcionario;
import univs.edu.funcionario.FuncionarioDAO;
import univs.edu.usuario.Usuario;


/**
 *
 * @author Maria Eliene
 */
public class TelaNivelDeAcesso extends javax.swing.JFrame {

    Funcionario funcionario = new Funcionario();
    FuncionarioDAO dao = new FuncionarioDAO();
    
    public TelaNivelDeAcesso() {
        initComponents();
    }

        public void limparCampos(){
        funcionario = new Funcionario();
        tfNome.setText("");
        tfUsuario.setText("");
        tfTelefone.setText("");
        jcCargo.setSelectedItem("Selecione");
    }
        
        public void preencherFuncionario(){
        tfNome.setText(funcionario.getNome());
        tfUsuario.setText(funcionario.getUsuario().getLogin());
        jcCargo.setSelectedItem(funcionario.getCargo());
        }
        
        public void carregarUsuario(Usuario usuario){
        funcionario.setUsuario(usuario);
        tfUsuario.setText(usuario.getLogin());
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JFormattedTextField();
        jLabel22 = new javax.swing.JLabel();
        jcCargo = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel18.setFont(new java.awt.Font("High Tower Text", 0, 18)); // NOI18N
        jLabel18.setText("Nome");

        setTitle("Nivel de Acesso");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(31, 31, 31));

        jLabel20.setBackground(new java.awt.Color(31, 31, 31));
        jLabel20.setFont(new java.awt.Font("Beyond The Mountains", 0, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Nome:");
        jLabel20.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        tfNome.setForeground(new java.awt.Color(102, 102, 102));
        tfNome.setBorder(null);
        tfNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNometfNomeFocusGained(evt);
            }
        });
        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeActionPerformed(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(31, 31, 31));
        jLabel21.setFont(new java.awt.Font("Beyond The Mountains", 0, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Telefone:");

        tfTelefone.setBorder(null);
        try {
            tfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel22.setFont(new java.awt.Font("Beyond The Mountains", 0, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Nível:");

        jcCargo.setBackground(new java.awt.Color(31, 31, 31));
        jcCargo.setEditable(true);
        jcCargo.setFont(new java.awt.Font("Beyond The Mountains", 0, 18)); // NOI18N
        jcCargo.setForeground(new java.awt.Color(31, 31, 31));
        jcCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Administrador", "Secretario", "Cliente" }));

        jLabel23.setFont(new java.awt.Font("Beyond The Mountains", 0, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("usuário:");
        jLabel23.setAutoscrolls(true);

        tfUsuario.setBorder(null);
        tfUsuario.setEnabled(false);
        tfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsuariotfUsuarioActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Beyond The Mountains", 0, 18)); // NOI18N
        jButton21.setText("Selecionar");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21jButton1ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(255, 255, 255));
        jButton22.setFont(new java.awt.Font("Beyond The Mountains", 0, 18)); // NOI18N
        jButton22.setForeground(new java.awt.Color(31, 31, 31));
        jButton22.setText("Voltar");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22jButton2ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(255, 255, 255));
        jButton23.setFont(new java.awt.Font("Beyond The Mountains", 0, 18)); // NOI18N
        jButton23.setForeground(new java.awt.Color(31, 31, 31));
        jButton23.setText("Limpar");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23jButton3ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(255, 255, 255));
        jButton25.setFont(new java.awt.Font("Beyond The Mountains", 0, 18)); // NOI18N
        jButton25.setForeground(new java.awt.Color(31, 31, 31));
        jButton25.setText("Pesquisar");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25jButton5ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(255, 255, 255));
        jButton24.setFont(new java.awt.Font("Beyond The Mountains", 0, 18)); // NOI18N
        jButton24.setForeground(new java.awt.Color(31, 31, 31));
        jButton24.setText("Salvar");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNome)
                    .addComponent(tfTelefone)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton22)
                        .addGap(49, 49, 49)
                        .addComponent(jButton23)
                        .addGap(51, 51, 51)
                        .addComponent(jButton25)
                        .addGap(68, 68, 68)
                        .addComponent(jButton24)
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jcCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton22)
                    .addComponent(jButton23)
                    .addComponent(jButton25)
                    .addComponent(jButton24))
                .addGap(64, 64, 64))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/Sem Título-2.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfNometfNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNometfNomeFocusGained
        tfNome.setText("");
    }//GEN-LAST:event_tfNometfNomeFocusGained

    private void tfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeActionPerformed

    private void tfUsuariotfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsuariotfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsuariotfUsuarioActionPerformed

    private void jButton21jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21jButton1ActionPerformed
        TelaVincularUsuario tela = new TelaVincularUsuario(this);
        tela.setVisible(true);
    }//GEN-LAST:event_jButton21jButton1ActionPerformed

    private void jButton22jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton22jButton2ActionPerformed

    private void jButton23jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23jButton3ActionPerformed
        limparCampos();
    }//GEN-LAST:event_jButton23jButton3ActionPerformed

    private void jButton25jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25jButton5ActionPerformed
        TelaPesquisaNivel tela = new TelaPesquisaNivel();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton25jButton5ActionPerformed

    private void jButton24jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24jButton4ActionPerformed
        if(!tfNome.getText().isEmpty() && !tfTelefone.getText().isEmpty()
            && !tfUsuario.getText().isEmpty()
            && !jcCargo.getSelectedItem().equals("Selecione"))
        {
            funcionario.setCargo(String.valueOf(jcCargo.getSelectedItem()));
            funcionario.setNome(tfNome.getText());
            funcionario.setNumero((Integer.parseInt(tfTelefone.getText())));
            dao.salvar(funcionario);
            limparCampos();
            dispose();
        }else{
            JOptionPane.showConfirmDialog(null,"Preencha todos os campos!");
        }
    }//GEN-LAST:event_jButton24jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaNivelDeAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNivelDeAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNivelDeAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNivelDeAcesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNivelDeAcesso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcCargo;
    private javax.swing.JTextField tfNome;
    private javax.swing.JFormattedTextField tfTelefone;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
