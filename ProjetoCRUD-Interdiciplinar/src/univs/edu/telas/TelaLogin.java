/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package univs.edu.telas;

import java.awt.Color;
import java.awt.Point;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import univs.edu.funcionario.Funcionario;
import univs.edu.funcionario.FuncionarioDAO;
import univs.edu.telas.MenuPrincipal;


/**
 *
 * @author Maria Eliene
 */
public class TelaLogin extends javax.swing.JFrame {
    
    Funcionario funcionario;
    FuncionarioDAO dao;
    
    private Point point = new Point();
    
    public TelaLogin() {
        initComponents();
        funcionario = new Funcionario();
        dao = new FuncionarioDAO();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfLogin = new univs.edu.outros.JTextFieldHint(new JTextField(), "Nome");
        ;
        tfCPF = new univs.edu.outros.JPassWordFieldHint(new JPasswordField(),"Senha");
 ;
        jbEntrar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 410));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/login.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(31, 31, 31));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 553));

        jLabel2.setFont(new java.awt.Font("Beyond The Mountains", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/univs/edu/imagens/informações de login.png"))); // NOI18N
        jLabel2.setToolTipText("");

        tfLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        tfLogin.setForeground(new java.awt.Color(204, 204, 204));
        tfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLogin(evt);
            }
        });

        tfCPF.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        tfCPF.setForeground(new java.awt.Color(204, 204, 204));
        tfCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCPF(evt);
            }
        });

        jbEntrar.setBackground(new java.awt.Color(255, 255, 255));
        jbEntrar.setFont(new java.awt.Font("Beyond The Mountains", 0, 36)); // NOI18N
        jbEntrar.setForeground(new java.awt.Color(31, 31, 31));
        jbEntrar.setText("Entrar");
        jbEntrar.setBorderPainted(false);
        jbEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbEntrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbEntrarMouseExited(evt);
            }
        });
        jbEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntrarActionPerformed(evt);
            }
        });

        jbSair.setBackground(new java.awt.Color(255, 255, 255));
        jbSair.setFont(new java.awt.Font("Beyond The Mountains", 0, 36)); // NOI18N
        jbSair.setForeground(new java.awt.Color(31, 31, 31));
        jbSair.setText("Sair");
        jbSair.setBorderPainted(false);
        jbSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbSairMouseExited(evt);
            }
        });
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                            .addComponent(tfCPF))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jbEntrar)
                .addGap(37, 37, 37)
                .addComponent(jbSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public Funcionario autenticarFunc(String login, String senha){
   List <Funcionario> listaFuncionario = dao.ListarFuncionarios();
        for (Funcionario funcionario1 : listaFuncionario) {
            if(funcionario1.getUsuario().getLogin().equals(login) && funcionario1.getUsuario().getSenha().equals(senha)  ){
                return funcionario1;
            }
        }
        return null;
    }
    
    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        
    }//GEN-LAST:event_formMouseDragged

    private void tfLogin(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLogin
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLogin

    private void tfCPF(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCPF
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCPF

    private void jbEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEntrarMouseEntered
        jbEntrar.setBackground(new Color(235, 235, 235));
        jbEntrar.setForeground(new Color(58, 65, 84));
    }//GEN-LAST:event_jbEntrarMouseEntered

    private void jbEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbEntrarMouseExited
        jbEntrar.setBackground(new Color(58, 65, 84));
        jbEntrar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jbEntrarMouseExited

    private void jbEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntrarActionPerformed
        if(!tfLogin.getText().isEmpty()&& !tfCPF.getText().isEmpty())
        funcionario = autenticarFunc(tfLogin.getText(), tfCPF.getText());
        if(funcionario != null){
            MenuPrincipal menu = new MenuPrincipal(funcionario);
            menu.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null,"dados invalidos!");
        }

    }//GEN-LAST:event_jbEntrarActionPerformed

    private void jbSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSairMouseEntered
        jbSair.setBackground(new Color(235, 235, 235));
        jbSair.setForeground(new Color(217, 81, 51));
    }//GEN-LAST:event_jbSairMouseEntered

    private void jbSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSairMouseExited
        jbSair.setBackground(new Color(217, 81, 51));
        jbSair.setForeground(Color.WHITE);
    }//GEN-LAST:event_jbSairMouseExited

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
    dispose();
    }//GEN-LAST:event_jbSairActionPerformed

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
                if ("".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbEntrar;
    private javax.swing.JButton jbSair;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfLogin;
    // End of variables declaration//GEN-END:variables
}
