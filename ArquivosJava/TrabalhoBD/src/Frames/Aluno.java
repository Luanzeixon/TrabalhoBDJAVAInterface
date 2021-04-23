/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luan
 */
public class Aluno extends javax.swing.JFrame {
    String acao;
    /**
     * Creates new form MENU
     */
    public Aluno() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        TXTATUALIZAR = new javax.swing.JTextField();
        COMBO = new javax.swing.JComboBox<>();
        TXT = new javax.swing.JLabel();
        BATUALIZAR = new javax.swing.JButton();
        TXTCAMPO = new javax.swing.JTextField();
        BMOSTRAR = new javax.swing.JToggleButton();
        OK = new javax.swing.JButton();
        TXT2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "E-MAIL", "SENHA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        COMBO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESCOLHA UMA AÇÃO", "DELETAR", "MODIFICAR EMAIL", "MODIFICAR SENHA" }));
        COMBO.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                COMBOItemStateChanged(evt);
            }
        });
        COMBO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMBOActionPerformed(evt);
            }
        });

        TXT.setText("MODIFICAR PELO E-MAIL ALUNO");

        BATUALIZAR.setText("LIMPAR  PARA ATUALIZAR TABELA");
        BATUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BATUALIZARActionPerformed(evt);
            }
        });

        TXTCAMPO.setBackground(new java.awt.Color(240, 240, 240));

        BMOSTRAR.setText("MOSTRAR TABELA");
        BMOSTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMOSTRARActionPerformed(evt);
            }
        });

        OK.setText("FAZER AÇÃO");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

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

        jMenu4.setText("PROFESSOR");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu5.setText("ALUNO");
        jMenu5.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
                jMenu5MenuCanceled(evt);
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TXT, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(TXT2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BMOSTRAR, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(COMBO, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TXTATUALIZAR)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TXTCAMPO)
                                    .addComponent(BATUALIZAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TXT2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTATUALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(COMBO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTCAMPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BATUALIZAR)
                    .addComponent(BMOSTRAR)
                    .addComponent(OK))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        Professor a = new Professor();
        a.setVisible(true);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu5MenuCanceled(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu5MenuCanceled
         Aluno a = new Aluno();
         a.setVisible(true);
    }//GEN-LAST:event_jMenu5MenuCanceled

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
        if(acao.equals("deletar")){
            deletar();
        }if(acao.equals("ms")){
            mudarSenha();
        }if(acao.equals("me")){
            mudarEmail();
        }
    }//GEN-LAST:event_OKActionPerformed

    private void BATUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BATUALIZARActionPerformed
        
        ((DefaultTableModel) tabela.getModel()).setRowCount(0);
        
    }//GEN-LAST:event_BATUALIZARActionPerformed

    private void BMOSTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMOSTRARActionPerformed
        
        mostrarTabela();
        
    }//GEN-LAST:event_BMOSTRARActionPerformed

    private void COMBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMBOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_COMBOActionPerformed

    private void COMBOItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_COMBOItemStateChanged
        if(COMBO.getSelectedItem() == "DELETAR"){
          TXT.setText("DELETAR PELO EMAIL DO ALUNO");
          TXTATUALIZAR.setText("colocar EMAIL aqui");
          acao = "deletar";
       }if(COMBO.getSelectedItem() == "MODIFICAR EMAIL"){
          TXT.setText("MODIDICAR EMAIL, PELA SENHA" );
          TXTCAMPO.setEnabled(true);
          TXTATUALIZAR.setText("colocar SENHA aqui");
          TXT2.setText("INSIRA O NOVO EMAIL:");
          acao = "me";
       }if(COMBO.getSelectedItem() == "MODIFICAR SENHA"){
          TXT.setText("MODIDICAR SENHA, PELO EMAIL" );
          TXTCAMPO.setEnabled(true);
          TXTATUALIZAR.setText("colocar EMAIL aqui");
          TXT2.setText("INSIRA A NOVA SENHA:");
          acao = "ms";
       }
    }//GEN-LAST:event_COMBOItemStateChanged
    private void mostrarTabela() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/escola", "root", "");

            String sql = "select * from aluno";
            
            PreparedStatement patm = con.prepareStatement(sql);
           
            ResultSet rs = patm.executeQuery(); //exclusivo para o comando select
            
            DefaultTableModel model = (DefaultTableModel) tabela.getModel(); //pega o modelo da minha tabela existente 
            
            while(rs.next()){ //percorrrer todas as linhas dos rs
                String[] linha = new String[]{
                    rs.getString("nome"), rs.getString("email"), rs.getString("senha")
                };
                model.addRow(linha);
            }
            
            rs.close();
            patm.close();
            con.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Professor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Professor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void deletar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/escola", "root", "");

            String sql = "delete from aluno where email =?";
            
            PreparedStatement patm = con.prepareStatement(sql);
            
            patm.setString(1, TXTATUALIZAR.getText());
            
            int res = patm.executeUpdate();
          
             if(res > 0){
                JOptionPane.showMessageDialog(null, "deu certo", "opa",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "deu errado", "vish",JOptionPane.ERROR_MESSAGE);
            }

             con.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Professor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Professor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void mudarSenha(){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/escola", "root", "");

            String sql = "update aluno set  senha = ? where email =?";
            
            PreparedStatement patm = con.prepareStatement(sql);
            
            patm.setString(1, TXTCAMPO.getText());
            
            patm.setString(2, TXTATUALIZAR.getText());

            int res = patm.executeUpdate();
          
             if(res > 0){
                JOptionPane.showMessageDialog(null, "deu certo", "opa",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "deu errado", "vish",JOptionPane.ERROR_MESSAGE);
            }
             
             patm.close();
             con.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Professor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Professor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void mudarEmail(){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/escola", "root", "");

            String sql = "update aluno set  email = ? where senha =?";
            
            PreparedStatement patm = con.prepareStatement(sql);
            
            patm.setString(1, TXTATUALIZAR.getText());
            
            patm.setString(2, TXTATUALIZAR.getText());

            int res = patm.executeUpdate();
          
             if(res > 0){
                JOptionPane.showMessageDialog(null, "deu certo", "opa",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "deu errado", "vish",JOptionPane.ERROR_MESSAGE);
            }
             
             patm.close();
             con.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Professor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Professor.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Aluno().setVisible(true);
            }
        });
    }
          

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BATUALIZAR;
    private javax.swing.JToggleButton BMOSTRAR;
    private javax.swing.JComboBox<String> COMBO;
    private javax.swing.JButton OK;
    private javax.swing.JLabel TXT;
    private javax.swing.JLabel TXT2;
    private javax.swing.JTextField TXTATUALIZAR;
    private javax.swing.JTextField TXTCAMPO;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
