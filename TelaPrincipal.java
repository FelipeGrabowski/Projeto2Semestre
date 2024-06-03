/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author fhgrabowski
 */
public class TelaPrincipal extends javax.swing.JFrame {

    CadastroFornecedor cadastrofornecedor;
    FuncionarioCadastro funcionariocadastro;
    LocalizarUsuario localizarusuario;
    CadastrarCliente cadastrarcliente;
    CadastrarLanche cadastrarlanche;
    LocalizarCliente localizarcliente;
    LocalizarFornecedor localizarfornecedor;
    LocalizarLanche localizarlanche;
        /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        cadastrofornecedor = new CadastroFornecedor();
        funcionariocadastro = new FuncionarioCadastro();
        localizarusuario = new LocalizarUsuario();
        cadastrarcliente = new CadastrarCliente();
        cadastrarlanche = new CadastrarLanche();
        localizarcliente = new LocalizarCliente();
        localizarfornecedor = new LocalizarFornecedor();
        localizarlanche = new LocalizarLanche();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itmCadastro = new javax.swing.JMenuItem();
        itmLocalizar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itmCadastrarUsuario = new javax.swing.JMenuItem();
        itmLocalizarUsuario = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        itmCadastroLanche = new javax.swing.JMenuItem();
        itmLocalizarLanche = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        itmCadastroFornecedor = new javax.swing.JMenuItem();
        itmLocalizarFornecedor = new javax.swing.JMenuItem();
        itmSair = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Pizzaria");
        getContentPane().setLayout(null);

        jMenu1.setText("Usuários");

        itmCadastro.setText("Cadastrar");
        itmCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastroActionPerformed(evt);
            }
        });
        jMenu1.add(itmCadastro);

        itmLocalizar.setText("Localizar");
        itmLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmLocalizarActionPerformed(evt);
            }
        });
        jMenu1.add(itmLocalizar);

        jMenuItem1.setText("Trocar de Usuário");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Clientes");

        itmCadastrarUsuario.setText("Cadastrar");
        itmCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(itmCadastrarUsuario);

        itmLocalizarUsuario.setText("Localizar");
        itmLocalizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmLocalizarUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(itmLocalizarUsuario);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Lanches");

        itmCadastroLanche.setText("Cadastrar");
        itmCadastroLanche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastroLancheActionPerformed(evt);
            }
        });
        jMenu5.add(itmCadastroLanche);

        itmLocalizarLanche.setText("Localizar");
        itmLocalizarLanche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmLocalizarLancheActionPerformed(evt);
            }
        });
        jMenu5.add(itmLocalizarLanche);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Fornecedores");

        itmCadastroFornecedor.setText("Cadastrar");
        itmCadastroFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastroFornecedorActionPerformed(evt);
            }
        });
        jMenu6.add(itmCadastroFornecedor);

        itmLocalizarFornecedor.setText("Localizar");
        itmLocalizarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmLocalizarFornecedorActionPerformed(evt);
            }
        });
        jMenu6.add(itmLocalizarFornecedor);

        jMenuBar1.add(jMenu6);

        itmSair.setText("Sair");
        itmSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itmSairMouseClicked(evt);
            }
        });
        jMenuBar1.add(itmSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(659, 438));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastroActionPerformed
        funcionariocadastro.setVisible (true);
    }//GEN-LAST:event_itmCadastroActionPerformed

    private void itmLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmLocalizarActionPerformed
        localizarusuario.setVisible(true);
    }//GEN-LAST:event_itmLocalizarActionPerformed

    private void itmCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarUsuarioActionPerformed
       cadastrarcliente.setVisible(true);
    }//GEN-LAST:event_itmCadastrarUsuarioActionPerformed

    private void itmLocalizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmLocalizarUsuarioActionPerformed
       localizarcliente.setVisible(true);
    }//GEN-LAST:event_itmLocalizarUsuarioActionPerformed

    private void itmCadastroLancheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastroLancheActionPerformed
      cadastrarlanche.setVisible(true);
    }//GEN-LAST:event_itmCadastroLancheActionPerformed

    private void itmLocalizarLancheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmLocalizarLancheActionPerformed
        localizarlanche.setVisible(true);
    }//GEN-LAST:event_itmLocalizarLancheActionPerformed

    private void itmCadastroFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastroFornecedorActionPerformed
        cadastrofornecedor.setVisible(true);
    }//GEN-LAST:event_itmCadastroFornecedorActionPerformed

    private void itmLocalizarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmLocalizarFornecedorActionPerformed
        localizarfornecedor.setVisible(true);
    }//GEN-LAST:event_itmLocalizarFornecedorActionPerformed

    private void itmSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itmSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_itmSairMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmCadastrarUsuario;
    private javax.swing.JMenuItem itmCadastro;
    private javax.swing.JMenuItem itmCadastroFornecedor;
    private javax.swing.JMenuItem itmCadastroLanche;
    private javax.swing.JMenuItem itmLocalizar;
    private javax.swing.JMenuItem itmLocalizarFornecedor;
    private javax.swing.JMenuItem itmLocalizarLanche;
    private javax.swing.JMenuItem itmLocalizarUsuario;
    private javax.swing.JMenu itmSair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
