package gamelogin;
import java.awt.Color;

public class settings extends javax.swing.JFrame {
      private int selectedOption = -1;
    private final String playerName; // Add this field

    public settings(String message, String playerName) {
         initComponents();  
    setLocationRelativeTo(null);      
    jLabel1.setText(message);       
    this.playerName = playerName;
    

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        resume_gameButton = new javax.swing.JButton();
        quit_gameButton = new javax.swing.JButton();
        messageBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setFocusable(false);
        setUndecorated(true);
        setSize(new java.awt.Dimension(400, 200));

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 200));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GAME SETTINGS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(63, 33, 310, 40);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel2.setText("GAME SETTINGS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 30, 310, 40);

        resume_gameButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 28)); // NOI18N
        resume_gameButton.setForeground(new java.awt.Color(153, 153, 153));
        resume_gameButton.setText("RESUME");
        resume_gameButton.setBorder(null);
        resume_gameButton.setContentAreaFilled(false);
        resume_gameButton.setFocusable(false);
        resume_gameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resume_gameButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resume_gameButtonMouseExited(evt);
            }
        });
        resume_gameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resume_gameButtonActionPerformed(evt);
            }
        });
        jPanel1.add(resume_gameButton);
        resume_gameButton.setBounds(127, 134, 130, 40);

        quit_gameButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 28)); // NOI18N
        quit_gameButton.setForeground(new java.awt.Color(153, 153, 153));
        quit_gameButton.setText("QUIT ");
        quit_gameButton.setBorder(null);
        quit_gameButton.setContentAreaFilled(false);
        quit_gameButton.setFocusable(false);
        quit_gameButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                quit_gameButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                quit_gameButtonMouseExited(evt);
            }
        });
        quit_gameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quit_gameButtonActionPerformed(evt);
            }
        });
        jPanel1.add(quit_gameButton);
        quit_gameButton.setBounds(130, 80, 130, 40);

        messageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MessageBackground/settings.png"))); // NOI18N
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

    private void resume_gameButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resume_gameButtonMouseEntered
        // TODO add your handling code here:
        resume_gameButton.setForeground(Color.white);
    }//GEN-LAST:event_resume_gameButtonMouseEntered

    private void resume_gameButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resume_gameButtonMouseExited
        // TODO add your handling code here:
        resume_gameButton.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_resume_gameButtonMouseExited

    private void resume_gameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resume_gameButtonActionPerformed
         Sounds.clickSounds();
    dispose(); // Simply close the settings window to resume game
    }//GEN-LAST:event_resume_gameButtonActionPerformed

    private void quit_gameButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quit_gameButtonMouseEntered
     quit_gameButton.setForeground(Color.white);
    }//GEN-LAST:event_quit_gameButtonMouseEntered

    private void quit_gameButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quit_gameButtonMouseExited
        quit_gameButton.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_quit_gameButtonMouseExited

    private void quit_gameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quit_gameButtonActionPerformed
    Sounds.clickSounds();
    dispose();     
    customYesNoMessage dialog = new customYesNoMessage("Your progress will not be save");
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
            gamePanel gameMenu = new gamePanel(playerName);
            gameMenu.setVisible(true);
            gameMenu.setLocationRelativeTo(null);
            
            
            java.awt.Window[] windows = java.awt.Window.getWindows();
            for (java.awt.Window window : windows) {
                if (window instanceof beginner || window instanceof mid_level || window instanceof boss_level) {
                    window.dispose();
                }
            }
        }
    }).start();
    }//GEN-LAST:event_quit_gameButtonActionPerformed

  
  
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
            java.util.logging.Logger.getLogger(settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel messageBackground;
    private javax.swing.JButton quit_gameButton;
    private javax.swing.JButton resume_gameButton;
    // End of variables declaration//GEN-END:variables
}
