package gamelogin;

import java.awt.Color;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class lead extends javax.swing.JFrame {

    /**
     * Creates new form Start
     */
    public lead() {
        initComponents();
         Sounds.BackgroundMusic();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        submit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 100));
        jPanel1.setLayout(null);

        submit.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        submit.setForeground(new java.awt.Color(153, 153, 153));
        submit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/back.png"))); // NOI18N
        submit.setBorder(null);
        submit.setBorderPainted(false);
        submit.setContentAreaFilled(false);
        submit.setFocusable(false);
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                submitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                submitMouseExited(evt);
            }
        });
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit);
        submit.setBounds(110, 630, 50, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/leaderboard.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseEntered
        submit.setForeground(Color.white);
    }//GEN-LAST:event_submitMouseEntered

    private void submitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseExited
        submit.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_submitMouseExited

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

        Sounds.clickSounds();
       String gameName = "PlayerName";
            gamePanel gameMenu = new gamePanel(gameName); 
            gameMenu.setVisible(true);
            gameMenu.setLocationRelativeTo(null);
            dispose();  // Close the current level window
    }//GEN-LAST:event_submitActionPerformed

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
            java.util.logging.Logger.getLogger(lead.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lead.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lead.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lead.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lead().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables
}
