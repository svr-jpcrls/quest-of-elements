package gamelogin;
import java.awt.Color;
import javax.swing.JDialog;


public class customerWarningMessage extends  JDialog  {

    public customerWarningMessage(String message) {
        setModal(true);
        initComponents();
        setLocationRelativeTo(null); 
        jLabelMessage.setText(message);
    }

    private customerWarningMessage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        jLabelMessage = new javax.swing.JLabel();
        CustomWarningMessageBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Warning Message");
        setAlwaysOnTop(true);
        setName("customWarningMessage"); // NOI18N
        setUndecorated(true);
        setSize(new java.awt.Dimension(400, 200));

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 200));
        jPanel1.setLayout(null);

        okButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        okButton.setForeground(new java.awt.Color(255, 255, 255));
        okButton.setText("Ok");
        okButton.setBorder(null);
        okButton.setContentAreaFilled(false);
        okButton.setFocusable(false);
        okButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                okButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                okButtonMouseExited(evt);
            }
        });
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        jPanel1.add(okButton);
        okButton.setBounds(160, 145, 70, 35);

        jLabelMessage.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabelMessage.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabelMessage);
        jLabelMessage.setBounds(30, 40, 330, 60);

        CustomWarningMessageBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MessageBackground/warning.png"))); // NOI18N
        jPanel1.add(CustomWarningMessageBG);
        CustomWarningMessageBG.setBounds(0, 0, 400, 200);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
    dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    private void okButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonMouseEntered
        // TODO add your handling code here:
        okButton.setForeground(new Color(200, 200, 200));
    }//GEN-LAST:event_okButtonMouseEntered

    private void okButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okButtonMouseExited
         okButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_okButtonMouseExited

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
            java.util.logging.Logger.getLogger(customerWarningMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customerWarningMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customerWarningMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customerWarningMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customerWarningMessage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustomWarningMessageBG;
    private javax.swing.JLabel jLabelMessage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables
}
