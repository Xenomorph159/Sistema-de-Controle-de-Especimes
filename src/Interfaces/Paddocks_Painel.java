package Interfaces;

import java.awt.GridBagLayout;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 */
public class Paddocks_Painel extends javax.swing.JFrame {

    /**
     * Creates new form Painel_Principal_Teste
     */
    public Paddocks_Painel() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(206, 208, 45));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PADDOCKS");
        jLabel3.setToolTipText("");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(10, 0, 180, 30);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(60, 10, 200, 30);

        jLabel4.setFont(new java.awt.Font("Arial Black", 2, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(139, 0, 0));
        jLabel4.setText("!");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(270, 10, 20, 30);

        jLabel5.setFont(new java.awt.Font("Arial Black", 2, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(139, 0, 0));
        jLabel5.setText("!");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(30, 10, 20, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(130, 290, 320, 50);
        jPanel2.add(jLabel7);
        jLabel7.setBounds(200, 10, 120, 80);

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(null);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        jButton2.setText("VOLTAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2);
        jButton2.setBounds(10, 10, 90, 30);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(240, 210, 110, 50);
        jPanel2.add(jLabel14);
        jLabel14.setBounds(410, 360, 0, 0);
        jPanel2.add(jLabel15);
        jLabel15.setBounds(440, 340, 150, 50);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setLayout(null);

        jToggleButton5.setBackground(new java.awt.Color(204, 204, 204));
        jToggleButton5.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        jToggleButton5.setText("CRIAR");
        jToggleButton5.setToolTipText("");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jToggleButton5);
        jToggleButton5.setBounds(10, 10, 220, 30);

        jToggleButton6.setBackground(new java.awt.Color(204, 204, 204));
        jToggleButton6.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        jToggleButton6.setText("VERIFICAR");
        jToggleButton6.setToolTipText("");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jToggleButton6);
        jToggleButton6.setBounds(10, 50, 220, 30);

        jToggleButton8.setBackground(new java.awt.Color(204, 204, 204));
        jToggleButton8.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        jToggleButton8.setText("LISTAR PADDOCKS");
        jToggleButton8.setToolTipText("");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });
        jPanel6.add(jToggleButton8);
        jToggleButton8.setBounds(10, 130, 220, 30);

        jToggleButton7.setBackground(new java.awt.Color(204, 204, 204));
        jToggleButton7.setFont(new java.awt.Font("Arial Black", 2, 12)); // NOI18N
        jToggleButton7.setText("ALTERAR ESPÉCIME ");
        jToggleButton7.setToolTipText("");
        jToggleButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton7ActionPerformed(evt);
            }
        });
        jPanel6.add(jToggleButton7);
        jToggleButton7.setBounds(10, 90, 220, 30);

        jPanel2.add(jPanel6);
        jPanel6.setBounds(180, 20, 240, 170);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(80, 20, 600, 360);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1069, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(772, 430));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton7ActionPerformed
        // TODO add your handling code here:
        Alterar_Especime_Paddock aep = new Alterar_Especime_Paddock();
        aep.setVisible(true);
    }//GEN-LAST:event_jToggleButton7ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        boolean status = true;
        if (status) {
            JOptionPane.showMessageDialog(this, Classes.PaddockDAO.getInstance().listar());
        } else {
            JOptionPane.showMessageDialog(this, "Não foi possivel listar os dados", "ERRO", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        // TODO add your handling code here:
        Verificar_Paddock vp = new Verificar_Paddock();
        vp.setVisible(true);
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Lembrando que você deve escrever o Tipo com Letra maiscula no inicio e as outras minusculas!");
        Adicionar_Paddock cp = new Adicionar_Paddock();
        cp.setVisible(true);
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Painel_Principal pp = new Painel_Principal();
        pp.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Paddocks_Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Paddocks_Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Paddocks_Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Paddocks_Painel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and Painel_Principal_Teste the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GridBagLayout layout = new GridBagLayout();
                new Paddocks_Painel().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    // End of variables declaration//GEN-END:variables
}
