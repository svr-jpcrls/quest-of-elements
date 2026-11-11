package gamelogin;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class gamePanel extends javax.swing.JFrame {

    private final String Name;
    private int playerScore = 0; 
    private int playerLevel = 1;
    private int playerTime = 0; 
    
    public gamePanel(String playerName) {
        initComponents();        
        this.Name = playerName;
        ign.setText(playerName);  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ign = new javax.swing.JLabel();
        ignBG = new javax.swing.JLabel();
        leaderBoard = new javax.swing.JButton();
        guide = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        startGame = new javax.swing.JButton();
        MainMenuBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Main Menu");

        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 900));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 900));
        jPanel1.setPreferredSize(new java.awt.Dimension(888, 800));
        jPanel1.setLayout(null);

        ign.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        ign.setForeground(new java.awt.Color(255, 255, 255));
        ign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(ign);
        ign.setBounds(680, 15, 200, 33);

        ignBG.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ignBG.setForeground(new java.awt.Color(255, 255, 255));
        ignBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tag/ign_tag.png"))); // NOI18N
        jPanel1.add(ignBG);
        ignBG.setBounds(680, 10, 200, 40);

        leaderBoard.setFont(new java.awt.Font("Tempus Sans ITC", 1, 26)); // NOI18N
        leaderBoard.setForeground(new java.awt.Color(153, 153, 153));
        leaderBoard.setText("LEADERBOARD");
        leaderBoard.setBorder(null);
        leaderBoard.setContentAreaFilled(false);
        leaderBoard.setFocusable(false);
        leaderBoard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                leaderBoardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                leaderBoardMouseExited(evt);
            }
        });
        leaderBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leaderBoardActionPerformed(evt);
            }
        });
        jPanel1.add(leaderBoard);
        leaderBoard.setBounds(340, 330, 220, 70);

        guide.setFont(new java.awt.Font("Tempus Sans ITC", 1, 28)); // NOI18N
        guide.setForeground(new java.awt.Color(153, 153, 153));
        guide.setText("GUIDE");
        guide.setBorder(null);
        guide.setContentAreaFilled(false);
        guide.setFocusable(false);
        guide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guideMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guideMouseExited(evt);
            }
        });
        guide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guideActionPerformed(evt);
            }
        });
        jPanel1.add(guide);
        guide.setBounds(350, 440, 200, 80);

        exit.setFont(new java.awt.Font("Tempus Sans ITC", 1, 28)); // NOI18N
        exit.setForeground(new java.awt.Color(153, 153, 153));
        exit.setText("EXIT");
        exit.setBorder(null);
        exit.setContentAreaFilled(false);
        exit.setFocusable(false);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(340, 560, 220, 70);

        startGame.setFont(new java.awt.Font("Tempus Sans ITC", 1, 28)); // NOI18N
        startGame.setForeground(new java.awt.Color(153, 153, 153));
        startGame.setText("START GAME");
        startGame.setBorder(null);
        startGame.setContentAreaFilled(false);
        startGame.setFocusable(false);
        startGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                startGameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startGameMouseExited(evt);
            }
        });
        startGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameActionPerformed(evt);
            }
        });
        jPanel1.add(startGame);
        startGame.setBounds(340, 210, 210, 80);

        MainMenuBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GameBackground/MainMenuBg.png"))); // NOI18N
        jPanel1.add(MainMenuBG);
        MainMenuBG.setBounds(0, 0, 900, 700);

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
// In gamePanel.java
public boolean isLevelUnlocked(int levelNumber) {
    try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/GameDb", "game", "game")) {
        String sql = "SELECT 1 FROM LEVEL_COMPLETION WHERE PLAYER_ID = " +
                     "(SELECT PLAYER_ID FROM PLAYERTABLES WHERE GAME_NAME = ?) " +
                     "AND LEVEL_NUMBER = ?";
        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, this.Name);
            pst.setInt(2, levelNumber - 1); // Check if previous level is completed
            ResultSet rs = pst.executeQuery();
            return levelNumber == 1 || rs.next(); // Level 1 is always unlocked
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        return false;
    }
}

public void saveLevelCompletion(int levelNumber, int score, int timeElapsed) {
    try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/GameDb", "game", "game")) {
        // Check if already completed
        String checkSql = "SELECT 1 FROM LEVEL_COMPLETION WHERE PLAYER_ID = " +
                         "(SELECT PLAYER_ID FROM PLAYERTABLES WHERE GAME_NAME = ?) " +
                         "AND LEVEL_NUMBER = ?";
        boolean exists = false;
        try (PreparedStatement checkStmt = con.prepareStatement(checkSql)) {
            checkStmt.setString(1, this.Name);
            checkStmt.setInt(2, levelNumber);
            ResultSet rs = checkStmt.executeQuery();
            exists = rs.next();
        }
        
        if (exists) {
            // Update existing record if new score is higher or time is better
            String updateSql = "UPDATE LEVEL_COMPLETION SET SCORE = ?, TIME_ELAPSED = ? " +
                              "WHERE PLAYER_ID = (SELECT PLAYER_ID FROM PLAYERTABLES WHERE GAME_NAME = ?) " +
                              "AND LEVEL_NUMBER = ? AND (SCORE < ? OR TIME_ELAPSED > ?)";
            try (PreparedStatement updateStmt = con.prepareStatement(updateSql)) {
                updateStmt.setInt(1, score);
                updateStmt.setInt(2, timeElapsed);
                updateStmt.setString(3, this.Name);
                updateStmt.setInt(4, levelNumber);
                updateStmt.setInt(5, score);
                updateStmt.setInt(6, timeElapsed);
                updateStmt.executeUpdate();
            }
        } else {
            // Insert new completion record
            String insertSql = "INSERT INTO LEVEL_COMPLETION (PLAYER_ID, LEVEL_NUMBER, SCORE, TIME_ELAPSED) " +
                              "SELECT PLAYER_ID, ?, ?, ? FROM PLAYERTABLES WHERE GAME_NAME = ?";
            try (PreparedStatement insertStmt = con.prepareStatement(insertSql)) {
                insertStmt.setInt(1, levelNumber);
                insertStmt.setInt(2, score);
                insertStmt.setInt(3, timeElapsed);
                insertStmt.setString(4, this.Name);
                insertStmt.executeUpdate();
            }
            
            // If this wasn't the boss level, unlock the next level
            if (levelNumber < 3) {
                String unlockSql = "INSERT INTO LEVEL_COMPLETION (PLAYER_ID, LEVEL_NUMBER, SCORE, TIME_ELAPSED) " +
                                  "SELECT PLAYER_ID, ?, 0, 0 FROM PLAYERTABLES WHERE GAME_NAME = ?";
                try (PreparedStatement unlockStmt = con.prepareStatement(unlockSql)) {
                    unlockStmt.setInt(1, levelNumber + 1);
                    unlockStmt.setString(2, this.Name);
                    unlockStmt.executeUpdate();
                }
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}
    public void updateGameStats(int score, int level, int time) {
        this.playerScore = score;
        this.playerLevel = level;
        this.playerTime = time;
    }
    private void leaderBoardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaderBoardMouseEntered
        leaderBoard.setForeground(Color.white); 
    }//GEN-LAST:event_leaderBoardMouseEntered

    private void leaderBoardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leaderBoardMouseExited
        leaderBoard.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_leaderBoardMouseExited

    private void leaderBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leaderBoardActionPerformed
                                     
    Sounds.clickSounds();
    leaderboard lead = new leaderboard(this.Name, this.playerScore, this.playerLevel, this.playerTime );
    lead.setVisible(true);
    lead.setLocationRelativeTo(null);
    dispose();        
    }//GEN-LAST:event_leaderBoardActionPerformed

    private void guideMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guideMouseEntered
         guide.setForeground(Color.white);
    }//GEN-LAST:event_guideMouseEntered

    private void guideMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guideMouseExited
        // TODO add your handling code here:
        guide.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_guideMouseExited

    private void guideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guideActionPerformed
        Sounds.clickSounds();
        Guide gameMechanics = new Guide();
        gameMechanics.setVisible(true);
        gameMechanics.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_guideActionPerformed

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        // TODO add your handling code here:
         exit.setForeground(Color.white);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        // TODO add your handling code here:
        exit.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_exitMouseExited

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
       customYesNoMessage.exit();//No need to modify this at any cost
    }//GEN-LAST:event_exitActionPerformed

    private void startGameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startGameMouseEntered
        startGame.setForeground(Color.white);
    }//GEN-LAST:event_startGameMouseEntered

    private void startGameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startGameMouseExited
        startGame.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_startGameMouseExited

    private void startGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameActionPerformed
        Sounds.clickSounds();
        CharacterSelection gameMenu = new CharacterSelection(this.Name); // Pass the player name
        gameMenu.setVisible(true);
        gameMenu.setLocationRelativeTo(null);      
        this.dispose();
    }//GEN-LAST:event_startGameActionPerformed

    
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
            java.util.logging.Logger.getLogger(gamePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gamePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gamePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gamePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

            java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            String gameName = "PlayerName";
            new gamePanel(gameName).setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MainMenuBG;
    private javax.swing.JButton exit;
    private javax.swing.JButton guide;
    private javax.swing.JLabel ign;
    private javax.swing.JLabel ignBG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton leaderBoard;
    private javax.swing.JButton startGame;
    // End of variables declaration//GEN-END:variables
}
