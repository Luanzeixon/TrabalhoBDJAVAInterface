/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Luan
 */
public class Cadastrar extends javax.swing.JFrame {
    
    String sql = "";
    String valor = "";
    /**
     * Creates new form Create
     */
    public Cadastrar() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TXTNOME = new javax.swing.JTextField();
        TXTEMAIL = new javax.swing.JTextField();
        BLOGAR = new javax.swing.JButton();
        TXTSENHA = new javax.swing.JTextField();
        COMBO = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        PROFESSOR = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NOME");

        jLabel2.setText("E-MAIL");

        jLabel3.setText("SENHA");

        BLOGAR.setText("LOGAR");
        BLOGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLOGARActionPerformed(evt);
            }
        });

        COMBO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESCOLA", "TURMA", "PROFESSOR", "ALUNO" }));
        COMBO.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                COMBOItemStateChanged(evt);
            }
        });

        jLabel4.setText("INSERIR NA TABELA DE");

        jMenu1.setText("INICIO");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("ESCOLA");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("TURMA");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        PROFESSOR.setText("PROFESSOR");
        PROFESSOR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PROFESSORMouseClicked(evt);
            }
        });
        jMenuBar1.add(PROFESSOR);

        jMenu5.setText("ALUNO");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel3))
                            .addComponent(jLabel2))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TXTNOME, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(TXTEMAIL, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXTSENHA, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(COMBO, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BLOGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTNOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTSENHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(COMBO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BLOGAR)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void BLOGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLOGARActionPerformed

        inserir();
        
    }//GEN-LAST:event_BLOGARActionPerformed

    private void COMBOItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_COMBOItemStateChanged
        if(COMBO.getSelectedIndex() == 0){
          sql = "insert into escola values (?,?,?)" ;
          valor = "select * from escola where email=? and senha=?";
       }if(COMBO.getSelectedIndex() == 1){
           sql = "insert into turma values (?,?,?)" ;
           valor = "select * from turma where email=? and senha=?";
       }if(COMBO.getSelectedIndex() == 2){
           sql = "insert into professor values (?,?,?)" ;
           valor = "select * from professor where email=? and senha=?";
       }if(COMBO.getSelectedIndex() == 3){
           sql = "insert into aluno values (?,?,?)" ;
           valor = "select * from aluno where email=? and senha=?";
       }
    }//GEN-LAST:event_COMBOItemStateChanged

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        Cadastrar a = new Cadastrar();
         a.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        Escola a = new Escola();
         a.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        Turma a = new Turma();
        a.setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void PROFESSORMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PROFESSORMouseClicked
        Professor a = new Professor();
        a.setVisible(true);
    }//GEN-LAST:event_PROFESSORMouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        Aluno a = new Aluno();
         a.setVisible(true);
    }//GEN-LAST:event_jMenu5MouseClicked
    
    private void inserir(){
          try {
            Class.forName("com.mysql.jdbc.Driver");

            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/escola","root","");
            
            PreparedStatement teste = con.prepareStatement(valor);
            
            teste.setString(1,TXTEMAIL.getText());
            
            teste.setString(2, TXTSENHA.getText());
            
            ResultSet rs = teste.executeQuery();
            
            if(rs.next()){ // ver se tem algum usuario igual
                JOptionPane.showMessageDialog(null, "Já tem um email e senha iguais", "",JOptionPane.INFORMATION_MESSAGE);
            }else{
                PreparedStatement patm = con.prepareStatement(sql);
            
                patm.setString(1, TXTNOME.getText());
            
                patm.setString(2, TXTEMAIL.getText());
            
                patm.setString(3, TXTSENHA.getText());
                int res = patm.executeUpdate();
                if(res > 0){
                    JOptionPane.showMessageDialog(null, "Inserido com sucesso", "",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Deu um erro", "",JOptionPane.ERROR_MESSAGE);
                }
                patm.close();
            }
                teste.close();
                con.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cadastrar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Cadastrar.class.getName()).log(Level.SEVERE, null, ex);
        }
          
       }
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
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BLOGAR;
    private javax.swing.JComboBox<String> COMBO;
    private javax.swing.JMenu PROFESSOR;
    private javax.swing.JTextField TXTEMAIL;
    private javax.swing.JTextField TXTNOME;
    private javax.swing.JTextField TXTSENHA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
