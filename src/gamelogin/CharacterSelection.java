package gamelogin;

import java.awt.Color;

public class CharacterSelection extends javax.swing.JFrame {
    private final String playerName;
       
       public CharacterSelection(String playerName) {
        this.playerName = playerName;
        initComponents();
        Sounds.BackgroundMusic();        
    }  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Blaze = new javax.swing.JButton();
        aqua = new javax.swing.JButton();
        aqua_label = new javax.swing.JLabel();
        blaze_label = new javax.swing.JLabel();
        backButton2 = new javax.swing.JButton();
        CharacterSelectionBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 100));
        jPanel1.setLayout(null);

        Blaze.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        Blaze.setForeground(new java.awt.Color(153, 153, 153));
        Blaze.setText("BLAZE");
        Blaze.setBorder(null);
        Blaze.setContentAreaFilled(false);
        Blaze.setFocusable(false);
        Blaze.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BlazeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BlazeMouseExited(evt);
            }
        });
        Blaze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlazeActionPerformed(evt);
            }
        });
        jPanel1.add(Blaze);
        Blaze.setBounds(160, 560, 220, 80);

        aqua.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        aqua.setForeground(new java.awt.Color(153, 153, 153));
        aqua.setText("AQUA");
        aqua.setBorder(null);
        aqua.setContentAreaFilled(false);
        aqua.setFocusable(false);
        aqua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aquaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aquaMouseExited(evt);
            }
        });
        aqua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aquaActionPerformed(evt);
            }
        });
        jPanel1.add(aqua);
        aqua.setBounds(510, 560, 220, 80);

        aqua_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Aqua/AquaCharacterSelection.gif"))); // NOI18N
        jPanel1.add(aqua_label);
        aqua_label.setBounds(530, 240, 200, 250);

        blaze_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Blaze/blaze.gif"))); // NOI18N
        jPanel1.add(blaze_label);
        blaze_label.setBounds(170, 240, 200, 250);

        backButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backButton2.setForeground(new java.awt.Color(153, 153, 153));
        backButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonBackground/back.png"))); // NOI18N
        backButton2.setBorder(null);
        backButton2.setBorderPainted(false);
        backButton2.setContentAreaFilled(false);
        backButton2.setFocusable(false);
        backButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backButton2MouseExited(evt);
            }
        });
        backButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(backButton2);
        backButton2.setBounds(20, 630, 50, 50);

        CharacterSelectionBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GameBackground/gameSelection.png"))); // NOI18N
        CharacterSelectionBG.setText("jLabel1");
        jPanel1.add(CharacterSelectionBG);
        CharacterSelectionBG.setBounds(0, 0, 900, 700);

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

    private void BlazeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BlazeMouseEntered
        Blaze.setForeground(Color.white); // Change text color when hovered
    }//GEN-LAST:event_BlazeMouseEntered

    private void BlazeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BlazeMouseExited
        Blaze.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_BlazeMouseExited

    private void BlazeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlazeActionPerformed
        Sounds.clickSounds();
        GameStages stages = new GameStages("Blaze", playerName); 
        stages.setVisible(true);
        stages.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BlazeActionPerformed

    private void aquaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aquaMouseEntered
         aqua.setForeground(Color.white);
    }//GEN-LAST:event_aquaMouseEntered

    private void aquaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aquaMouseExited
        aqua.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_aquaMouseExited

    private void aquaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aquaActionPerformed
        Sounds.clickSounds();
        GameStages stages = new GameStages("Aqua", playerName);
        stages.setVisible(true);
        stages.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_aquaActionPerformed

    private void backButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButton2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_backButton2MouseEntered

    private void backButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButton2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_backButton2MouseExited

    private void backButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton2ActionPerformed
        Sounds.clickSounds();
        gamePanel gameMenu = new gamePanel(this.playerName); // Pass the player name
        gameMenu.setVisible(true);
        gameMenu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_backButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CharacterSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CharacterSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CharacterSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CharacterSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CharacterSelection("PlayerName").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Blaze;
    private javax.swing.JLabel CharacterSelectionBG;
    private javax.swing.JButton aqua;
    private javax.swing.JLabel aqua_label;
    private javax.swing.JButton backButton;
    private javax.swing.JButton backButton1;
    private javax.swing.JButton backButton2;
    private javax.swing.JLabel blaze_label;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
