import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author fhgrabowski
 */
public class LocalizarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form LocalizarUsuario
     */
    public LocalizarUsuario() {
        initComponents();
        try{
        // 1 - Conectar com o Banco de Dados
        Class.forName("com.mysql.cj.jdbc.Driver");
     Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/uninove","root","admin");
        //2- Buscar todos os usuários cadastrados na tabela do banco de dados
        
       PreparedStatement st = conectado.prepareStatement("SELECT * FROM CadastroFuncionario");
       ResultSet CadastroFuncionario = st.executeQuery();//Executa o Select
      DefaultTableModel tblModelo = (DefaultTableModel) tblUsuario.getModel();
       while(CadastroFuncionario.next()){
        String linha[] ={
             CadastroFuncionario.getString("Nome"),
             CadastroFuncionario.getString("Cpf"),
             CadastroFuncionario.getString("Endereco"),
             CadastroFuncionario.getString("Telefone"),
             CadastroFuncionario.getString("EstadoCivil"),
             CadastroFuncionario.getString("Filhos"),
             CadastroFuncionario.getString("Qnt"),
             CadastroFuncionario.getString("Data_de_Nascimento"),
             CadastroFuncionario.getString("Cadastro"),
             CadastroFuncionario.getString("Cargo"),
             CadastroFuncionario.getString("Senha")
       };
        tblModelo.addRow(linha);
       }
        }catch (ClassNotFoundException ex){
       JOptionPane.showMessageDialog(null,"Driver não colocado na library");
     
     }catch (SQLException ex){
         JOptionPane.showMessageDialog(null,"Erro na conexão do banco de dados" + ex.getMessage());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Localizar Usuário");
        getContentPane().setLayout(null);

        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cpf", "Endereco", "Telefone", "Estado Civil", "Filhos", "Qnt", "Data_de_Nascimento", "Cadastro", "Cargo", "Senha"
            }
        ));
        jScrollPane1.setViewportView(tblUsuario);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 10, 730, 470);

        setSize(new java.awt.Dimension(793, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(LocalizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LocalizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LocalizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LocalizarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LocalizarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsuario;
    // End of variables declaration//GEN-END:variables
}
