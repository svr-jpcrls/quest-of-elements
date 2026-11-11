package gamelogin;

import java.awt.Color;

public class GameStages extends javax.swing.JFrame {
    
    private final String playerName;
    
        public GameStages(String characterName, String playerName) {
            this.playerName = playerName;
            initComponents();        
            ign.setText("Player: " + playerName + " (" + characterName + ")");  
             gamePanel panel = new gamePanel(playerName);
             
    boolean midUnlocked = panel.isLevelUnlocked(2);
    boolean bossUnlocked = panel.isLevelUnlocked(3);
    
    mid_level_stage.setEnabled(midUnlocked);
    boss_level_stage.setEnabled(bossUnlocked);
    
    if (!midUnlocked) {
        mid_level_stage.setToolTipText("Complete Beginner level to unlock");
    }
    if (!bossUnlocked) {
        boss_level_stage.setToolTipText("Complete Mid-level to unlock");
    }
        }

    private GameStages(String gameName) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ign = new javax.swing.JLabel();
        mid_level_stage = new javax.swing.JButton();
        boss_level_stage = new javax.swing.JButton();
        beginner_level_stage = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        GameStageBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Game Stage");

        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 900));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 900));
        jPanel1.setPreferredSize(new java.awt.Dimension(888, 800));
        jPanel1.setLayout(null);

        ign.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ign.setForeground(new java.awt.Color(255, 255, 255));
        ign.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jPanel1.add(ign);
        ign.setBounds(550, 10, 330, 40);

        mid_level_stage.setFont(new java.awt.Font("Tempus Sans ITC", 1, 35)); // NOI18N
        mid_level_stage.setForeground(new java.awt.Color(153, 153, 153));
        mid_level_stage.setText("MID-LEVEL");
        mid_level_stage.setBorder(null);
        mid_level_stage.setContentAreaFilled(false);
        mid_level_stage.setFocusable(false);
        mid_level_stage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mid_level_stageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mid_level_stageMouseExited(evt);
            }
        });
        mid_level_stage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mid_level_stageActionPerformed(evt);
            }
        });
        jPanel1.add(mid_level_stage);
        mid_level_stage.setBounds(340, 340, 220, 80);

        boss_level_stage.setFont(new java.awt.Font("Tempus Sans ITC", 1, 34)); // NOI18N
        boss_level_stage.setForeground(new java.awt.Color(153, 153, 153));
        boss_level_stage.setText("BOSS-LEVEL");
        boss_level_stage.setBorder(null);
        boss_level_stage.setContentAreaFilled(false);
        boss_level_stage.setFocusable(false);
        boss_level_stage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boss_level_stageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boss_level_stageMouseExited(evt);
            }
        });
        boss_level_stage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boss_level_stageActionPerformed(evt);
            }
        });
        jPanel1.add(boss_level_stage);
        boss_level_stage.setBounds(340, 460, 220, 90);

        beginner_level_stage.setFont(new java.awt.Font("Tempus Sans ITC", 1, 35)); // NOI18N
        beginner_level_stage.setForeground(new java.awt.Color(153, 153, 153));
        beginner_level_stage.setText("BEGINNER");
        beginner_level_stage.setBorder(null);
        beginner_level_stage.setContentAreaFilled(false);
        beginner_level_stage.setFocusable(false);
        beginner_level_stage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                beginner_level_stageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                beginner_level_stageMouseExited(evt);
            }
        });
        beginner_level_stage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginner_level_stageActionPerformed(evt);
            }
        });
        jPanel1.add(beginner_level_stage);
        beginner_level_stage.setBounds(340, 210, 220, 80);

        backButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(153, 153, 153));
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonBackground/back.png"))); // NOI18N
        backButton.setBorder(null);
        backButton.setBorderPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.setFocusable(false);
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backButtonMouseExited(evt);
            }
        });
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton);
        backButton.setBounds(20, 630, 50, 50);

        GameStageBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GameBackground/GameStageBG.png"))); // NOI18N
        jPanel1.add(GameStageBG);
        GameStageBG.setBounds(0, 0, 900, 700);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void mid_level_stageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mid_level_stageMouseEntered
        mid_level_stage.setForeground(Color.white); 
    }//GEN-LAST:event_mid_level_stageMouseEntered

    private void mid_level_stageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mid_level_stageMouseExited
        mid_level_stage.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_mid_level_stageMouseExited

    private void mid_level_stageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mid_level_stageActionPerformed
      Sounds.clickSounds();         
        String fullText = ign.getText();
        String characterName = fullText.substring(fullText.indexOf("(") + 1, fullText.indexOf(")"));
        mid_level level = new mid_level(characterName, playerName, this);
        level.setVisible(true);
        level.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_mid_level_stageActionPerformed

    private void boss_level_stageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boss_level_stageMouseEntered
        // TODO add your handling code here:
         boss_level_stage.setForeground(Color.white);
    }//GEN-LAST:event_boss_level_stageMouseEntered

    private void boss_level_stageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boss_level_stageMouseExited
        // TODO add your handling code here:
        boss_level_stage.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_boss_level_stageMouseExited

    private void boss_level_stageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boss_level_stageActionPerformed
       Sounds.clickSounds();         
        String fullText = ign.getText();
        String characterName = fullText.substring(fullText.indexOf("(") + 1, fullText.indexOf(")"));
        boss_level level = new boss_level(characterName, playerName, this);
        level.setVisible(true);
        level.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_boss_level_stageActionPerformed

    private void beginner_level_stageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beginner_level_stageMouseEntered
        // TODO add your handling code here:
         beginner_level_stage.setForeground(Color.white);
    }//GEN-LAST:event_beginner_level_stageMouseEntered

    private void beginner_level_stageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_beginner_level_stageMouseExited
        // TODO add your handling code here:
        beginner_level_stage.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_beginner_level_stageMouseExited

    private void beginner_level_stageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginner_level_stageActionPerformed
        Sounds.clickSounds();         
        String fullText = ign.getText();
        String characterName = fullText.substring(fullText.indexOf("(") + 1, fullText.indexOf(")"));
        beginner level = new beginner(characterName, playerName, this);
        level.setVisible(true);
        level.setLocationRelativeTo(null);
        dispose();

    }//GEN-LAST:event_beginner_level_stageActionPerformed

    private void backButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonMouseEntered

    private void backButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonMouseExited

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Sounds.clickSounds();
        CharacterSelection gameMenu = new CharacterSelection(this.playerName); // Pass the player name
        gameMenu.setVisible(true);
        gameMenu.setLocationRelativeTo(null);      
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GameStages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameStages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameStages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameStages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            String gameName = "PlayerName";
            new GameStages(gameName).setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GameStageBG;
    private javax.swing.JButton backButton;
    private javax.swing.JButton beginner_level_stage;
    private javax.swing.JButton boss_level_stage;
    private javax.swing.JLabel ign;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mid_level_stage;
    // End of variables declaration//GEN-END:variables
}
