package gamelogin;
import java.awt.Color;

public class customYesNoMessage extends javax.swing.JFrame {
 private int selectedOption = -1;
    public customYesNoMessage(String message) {
        initComponents();  
        setLocationRelativeTo(null);       
        messageLabel.setText("<html><div style='width:300px;text-align:center;'>"
                              + message + "</div></html>");       
         
        jPanel1.setComponentZOrder(messageBackground, jPanel1.getComponentCount()-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        noButton = new javax.swing.JButton();
        yesButton = new javax.swing.JButton();
        messageLabel = new javax.swing.JLabel();
        messageBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        setSize(new java.awt.Dimension(400, 200));

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 200));
        jPanel1.setLayout(null);

        noButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        noButton.setForeground(new java.awt.Color(255, 255, 255));
        noButton.setText("no");
        noButton.setBorder(null);
        noButton.setContentAreaFilled(false);
        noButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                noButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                noButtonMouseExited(evt);
            }
        });
        noButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noButtonActionPerformed(evt);
            }
        });
        jPanel1.add(noButton);
        noButton.setBounds(240, 140, 100, 35);

        yesButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        yesButton.setForeground(new java.awt.Color(255, 255, 255));
        yesButton.setText("yes");
        yesButton.setBorder(null);
        yesButton.setContentAreaFilled(false);
        yesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                yesButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                yesButtonMouseExited(evt);
            }
        });
        yesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesButtonActionPerformed(evt);
            }
        });
        jPanel1.add(yesButton);
        yesButton.setBounds(60, 140, 100, 35);

        messageLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        messageLabel.setForeground(new java.awt.Color(255, 255, 255));
        messageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        messageLabel.setMaximumSize(new java.awt.Dimension(360, 70));
        messageLabel.setMinimumSize(new java.awt.Dimension(360, 70));
        messageLabel.setPreferredSize(new java.awt.Dimension(360, 70));
        jPanel1.add(messageLabel);
        messageLabel.setBounds(20, 20, 360, 70);

        messageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MessageBackground/Confrimation.png"))); // NOI18N
        jPanel1.add(messageBackground);
        messageBackground.setBounds(0, 0, 400, 200);

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

    public int getSelectedOption() {
        return selectedOption;
    } 
    
    private void noButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noButtonActionPerformed
        selectedOption = 1;
        dispose();
    }//GEN-LAST:event_noButtonActionPerformed

    private void yesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesButtonActionPerformed
        selectedOption = 0;
        dispose();
    }//GEN-LAST:event_yesButtonActionPerformed

    private void yesButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yesButtonMouseEntered
         yesButton.setForeground(new Color(200, 200, 200));
    }//GEN-LAST:event_yesButtonMouseEntered

    private void yesButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yesButtonMouseExited
       yesButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_yesButtonMouseExited

    private void noButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noButtonMouseEntered
        noButton.setForeground(new Color(200, 200, 200));
    }//GEN-LAST:event_noButtonMouseEntered

    private void noButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noButtonMouseExited
         noButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_noButtonMouseExited

    public static void exit(){
        Sounds.clickSounds();  
        customYesNoMessage dialog = new customYesNoMessage("Are you sure you want to exit?");
        dialog.setVisible(true);
            new Thread(() -> {
                while(dialog.isVisible()) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
                if(dialog.getSelectedOption() == 0) {
                    System.exit(0);
                }
            }).start();
    }
      
    
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
            java.util.logging.Logger.getLogger(customYesNoMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customYesNoMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customYesNoMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customYesNoMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
         java.awt.EventQueue.invokeLater(() -> {
            new customYesNoMessage("Sample question?").setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel messageBackground;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JButton noButton;
    private javax.swing.JButton yesButton;
    // End of variables declaration//GEN-END:variables
}
