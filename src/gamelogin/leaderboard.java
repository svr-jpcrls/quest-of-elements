package gamelogin;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class leaderboard extends javax.swing.JFrame {

    private String playerName;
    private int score;
    private int level;
    private int timeElapsed;
    public leaderboard(String playerName, int score, int level, int timeElapsed) {
        
    this.playerName = playerName;
    this.score = score;
    this.level = level;
    this.timeElapsed = timeElapsed;
    initComponents();
    Sounds.BackgroundMusic();
    displayPlayerData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Back_Button = new javax.swing.JButton();
        Level_1_Leaderboard = new javax.swing.JLabel();
        timecompletedLabel = new javax.swing.JLabel();
        gamenameLabel = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        level2Rank1Name = new javax.swing.JLabel();
        level2Rank1Time = new javax.swing.JLabel();
        level2Rank1Score = new javax.swing.JLabel();
        level2Rank2Name = new javax.swing.JLabel();
        level2Rank2Score = new javax.swing.JLabel();
        level2Rank2Time = new javax.swing.JLabel();
        level2Rank3Name = new javax.swing.JLabel();
        level2Rank3Score = new javax.swing.JLabel();
        level2Rank3Time = new javax.swing.JLabel();
        Level_1_Leaderboard1 = new javax.swing.JLabel();
        level1Rank1Name = new javax.swing.JLabel();
        level1Rank1Time = new javax.swing.JLabel();
        level1Rank1Score = new javax.swing.JLabel();
        level1Rank2Name = new javax.swing.JLabel();
        level1Rank2Time = new javax.swing.JLabel();
        level1Rank2Score = new javax.swing.JLabel();
        level1Rank3Name = new javax.swing.JLabel();
        level1Rank3Time = new javax.swing.JLabel();
        level1Rank3Score = new javax.swing.JLabel();
        Level_3_Leaderboard = new javax.swing.JLabel();
        level3Rank1Name = new javax.swing.JLabel();
        level3Rank2Name = new javax.swing.JLabel();
        level3Rank3Name = new javax.swing.JLabel();
        level3Rank1Time = new javax.swing.JLabel();
        level3Rank2Time = new javax.swing.JLabel();
        level3Rank3Time = new javax.swing.JLabel();
        level3Rank1Score = new javax.swing.JLabel();
        level3Rank2Score = new javax.swing.JLabel();
        level3Rank3Score = new javax.swing.JLabel();
        LeaderboardBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Leaderboard");

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 100));
        jPanel1.setLayout(null);

        Back_Button.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Back_Button.setForeground(new java.awt.Color(153, 153, 153));
        Back_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonBackground/back.png"))); // NOI18N
        Back_Button.setBorder(null);
        Back_Button.setBorderPainted(false);
        Back_Button.setContentAreaFilled(false);
        Back_Button.setFocusable(false);
        Back_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Back_ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Back_ButtonMouseExited(evt);
            }
        });
        Back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Back_Button);
        Back_Button.setBounds(50, 620, 50, 50);

        Level_1_Leaderboard.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        Level_1_Leaderboard.setForeground(new java.awt.Color(255, 255, 255));
        Level_1_Leaderboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Level_1_Leaderboard.setText("level 1");
        jPanel1.add(Level_1_Leaderboard);
        Level_1_Leaderboard.setBounds(400, 170, 100, 20);

        timecompletedLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        timecompletedLabel.setForeground(new java.awt.Color(255, 255, 255));
        timecompletedLabel.setText("TIME");
        jPanel1.add(timecompletedLabel);
        timecompletedLabel.setBounds(420, 200, 50, 19);

        gamenameLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        gamenameLabel.setForeground(new java.awt.Color(255, 255, 255));
        gamenameLabel.setText("GAME NAME");
        jPanel1.add(gamenameLabel);
        gamenameLabel.setBounds(200, 200, 120, 19);

        scoreLabel.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        scoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        scoreLabel.setText("SCORE");
        jPanel1.add(scoreLabel);
        scoreLabel.setBounds(600, 200, 50, 19);

        level2Rank1Name.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level2Rank1Name.setForeground(new java.awt.Color(255, 255, 255));
        level2Rank1Name.setText("No Record");
        jPanel1.add(level2Rank1Name);
        level2Rank1Name.setBounds(200, 350, 200, 20);

        level2Rank1Time.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level2Rank1Time.setForeground(new java.awt.Color(255, 255, 255));
        level2Rank1Time.setText("No Record");
        jPanel1.add(level2Rank1Time);
        level2Rank1Time.setBounds(420, 350, 100, 20);

        level2Rank1Score.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level2Rank1Score.setForeground(new java.awt.Color(255, 255, 255));
        level2Rank1Score.setText("No Record");
        jPanel1.add(level2Rank1Score);
        level2Rank1Score.setBounds(600, 350, 100, 20);

        level2Rank2Name.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level2Rank2Name.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(level2Rank2Name);
        level2Rank2Name.setBounds(200, 380, 200, 20);

        level2Rank2Score.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level2Rank2Score.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(level2Rank2Score);
        level2Rank2Score.setBounds(600, 380, 100, 20);

        level2Rank2Time.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level2Rank2Time.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(level2Rank2Time);
        level2Rank2Time.setBounds(420, 380, 100, 20);

        level2Rank3Name.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level2Rank3Name.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(level2Rank3Name);
        level2Rank3Name.setBounds(200, 410, 200, 20);

        level2Rank3Score.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level2Rank3Score.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(level2Rank3Score);
        level2Rank3Score.setBounds(600, 410, 100, 20);

        level2Rank3Time.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level2Rank3Time.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(level2Rank3Time);
        level2Rank3Time.setBounds(420, 410, 100, 20);

        Level_1_Leaderboard1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        Level_1_Leaderboard1.setForeground(new java.awt.Color(255, 255, 255));
        Level_1_Leaderboard1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Level_1_Leaderboard1.setText("level 2");
        jPanel1.add(Level_1_Leaderboard1);
        Level_1_Leaderboard1.setBounds(400, 320, 100, 20);

        level1Rank1Name.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level1Rank1Name.setForeground(new java.awt.Color(255, 255, 255));
        level1Rank1Name.setText("No Record");
        jPanel1.add(level1Rank1Name);
        level1Rank1Name.setBounds(200, 230, 200, 20);

        level1Rank1Time.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level1Rank1Time.setForeground(new java.awt.Color(255, 255, 255));
        level1Rank1Time.setText("No Record");
        jPanel1.add(level1Rank1Time);
        level1Rank1Time.setBounds(420, 230, 100, 20);

        level1Rank1Score.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level1Rank1Score.setForeground(new java.awt.Color(255, 255, 255));
        level1Rank1Score.setText("No Record");
        jPanel1.add(level1Rank1Score);
        level1Rank1Score.setBounds(600, 230, 100, 20);

        level1Rank2Name.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level1Rank2Name.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(level1Rank2Name);
        level1Rank2Name.setBounds(200, 260, 200, 20);

        level1Rank2Time.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level1Rank2Time.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(level1Rank2Time);
        level1Rank2Time.setBounds(420, 260, 100, 20);

        level1Rank2Score.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level1Rank2Score.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(level1Rank2Score);
        level1Rank2Score.setBounds(600, 260, 100, 20);

        level1Rank3Name.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level1Rank3Name.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(level1Rank3Name);
        level1Rank3Name.setBounds(200, 290, 200, 20);

        level1Rank3Time.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level1Rank3Time.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(level1Rank3Time);
        level1Rank3Time.setBounds(420, 290, 100, 20);

        level1Rank3Score.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level1Rank3Score.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(level1Rank3Score);
        level1Rank3Score.setBounds(600, 290, 100, 20);

        Level_3_Leaderboard.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        Level_3_Leaderboard.setForeground(new java.awt.Color(255, 255, 255));
        Level_3_Leaderboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Level_3_Leaderboard.setText("level 3");
        jPanel1.add(Level_3_Leaderboard);
        Level_3_Leaderboard.setBounds(400, 440, 100, 20);

        level3Rank1Name.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level3Rank1Name.setForeground(new java.awt.Color(255, 255, 255));
        level3Rank1Name.setText("No Record");
        jPanel1.add(level3Rank1Name);
        level3Rank1Name.setBounds(200, 470, 200, 20);

        level3Rank2Name.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level3Rank2Name.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(level3Rank2Name);
        level3Rank2Name.setBounds(200, 500, 200, 20);

        level3Rank3Name.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level3Rank3Name.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(level3Rank3Name);
        level3Rank3Name.setBounds(200, 530, 200, 20);

        level3Rank1Time.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level3Rank1Time.setForeground(new java.awt.Color(255, 255, 255));
        level3Rank1Time.setText("No Record");
        jPanel1.add(level3Rank1Time);
        level3Rank1Time.setBounds(420, 470, 100, 20);

        level3Rank2Time.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level3Rank2Time.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(level3Rank2Time);
        level3Rank2Time.setBounds(420, 500, 100, 20);

        level3Rank3Time.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level3Rank3Time.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(level3Rank3Time);
        level3Rank3Time.setBounds(420, 530, 100, 20);

        level3Rank1Score.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level3Rank1Score.setForeground(new java.awt.Color(255, 255, 255));
        level3Rank1Score.setText("No Record");
        jPanel1.add(level3Rank1Score);
        level3Rank1Score.setBounds(600, 470, 100, 20);

        level3Rank2Score.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level3Rank2Score.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(level3Rank2Score);
        level3Rank2Score.setBounds(600, 500, 100, 20);

        level3Rank3Score.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        level3Rank3Score.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(level3Rank3Score);
        level3Rank3Score.setBounds(600, 530, 100, 20);

        LeaderboardBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GameBackground/leaderboard.png"))); // NOI18N
        LeaderboardBG.setText("2");
        jPanel1.add(LeaderboardBG);
        LeaderboardBG.setBounds(0, 0, 900, 700);

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
private void displayPlayerData() {
   try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/GameDb", "game", "game")) {
        // Display current player's dat
        Level_1_Leaderboard.setText("Level " + level);
        
       
        for (int lvl = 1; lvl <= 3; lvl++) {
            String sql = "SELECT p.GAME_NAME, l.SCORE, l.TIME_ELAPSED " +
                         "FROM LEVEL_COMPLETION l " +
                         "JOIN PLAYERTABLES p ON l.PLAYER_ID = p.PLAYER_ID " +
                         "WHERE l.LEVEL_NUMBER = ? " +
                         "ORDER BY l.SCORE DESC, l.TIME_ELAPSED ASC " +
                         "FETCH FIRST 3 ROWS ONLY";
            
            try (PreparedStatement pst = con.prepareStatement(sql)) {
                pst.setInt(1, lvl);
                ResultSet rs = pst.executeQuery();
                
                int rank = 1;
                while (rs.next()) {
                    String name = rs.getString("GAME_NAME");
                    int topScore = rs.getInt("SCORE");
                    int topTime = rs.getInt("TIME_ELAPSED");
                  
                    if (lvl == 1) {
                        if (rank == 1) {
                            level1Rank1Name.setText(name);
                            level1Rank1Score.setText(String.valueOf(topScore));
                            level1Rank1Time.setText(topTime + "s");
                        } else if (rank == 2) {
                            level1Rank2Name.setText(name);
                            level1Rank2Score.setText(String.valueOf(topScore));
                            level1Rank2Time.setText(topTime + "s");
                        } else if (rank == 3) {
                            level1Rank3Name.setText(name);
                            level1Rank3Score.setText(String.valueOf(topScore));
                            level1Rank3Time.setText(topTime + "s");
                        }                      
                    }  else if (lvl == 2) {
                        if (rank == 1) {
                            level2Rank1Name.setText(name);
                            level2Rank1Score.setText(String.valueOf(topScore));
                            level2Rank1Time.setText(topTime + "s");
                        } else if (rank == 2) {
                            level2Rank2Name.setText(name);
                            level2Rank2Score.setText(String.valueOf(topScore));
                            level2Rank2Time.setText(topTime + "s");
                        } else if (rank == 3) {
                            level2Rank3Name.setText(name);
                            level2Rank3Score.setText(String.valueOf(topScore));
                            level2Rank3Time.setText(topTime + "s");
                        }                      
                    }else if (lvl == 3) {
                        if (rank == 1) {
                            level3Rank1Name.setText(name);
                            level3Rank1Score.setText(String.valueOf(topScore));
                            level3Rank1Time.setText(topTime + "s");
                        } else if (rank == 2) {
                            level3Rank2Name.setText(name);
                            level3Rank2Score.setText(String.valueOf(topScore));
                            level3Rank2Time.setText(topTime + "s");
                        } else if (rank == 3) {
                            level3Rank3Name.setText(name);
                            level3Rank3Score.setText(String.valueOf(topScore));
                            level3Rank3Time.setText(topTime + "s");
                        }                      
                    }
                   
                    rank++;
                }
            }
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
}
    private void Back_ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_ButtonMouseEntered
        Back_Button.setForeground(Color.white);
    }//GEN-LAST:event_Back_ButtonMouseEntered

    private void Back_ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back_ButtonMouseExited
        Back_Button.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_Back_ButtonMouseExited

    private void Back_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_ButtonActionPerformed

        Sounds.clickSounds();
        gamePanel panel = new gamePanel(playerName);         
        panel.setVisible(true);
        panel.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_Back_ButtonActionPerformed

    private leaderboard() {
       
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
            java.util.logging.Logger.getLogger(leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new leaderboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Button;
    private javax.swing.JLabel LeaderboardBG;
    private javax.swing.JLabel Level_1_Leaderboard;
    private javax.swing.JLabel Level_1_Leaderboard1;
    private javax.swing.JLabel Level_3_Leaderboard;
    private javax.swing.JLabel gamenameLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel level1Rank1Name;
    private javax.swing.JLabel level1Rank1Score;
    private javax.swing.JLabel level1Rank1Time;
    private javax.swing.JLabel level1Rank2Name;
    private javax.swing.JLabel level1Rank2Score;
    private javax.swing.JLabel level1Rank2Time;
    private javax.swing.JLabel level1Rank3Name;
    private javax.swing.JLabel level1Rank3Score;
    private javax.swing.JLabel level1Rank3Time;
    private javax.swing.JLabel level2Rank1Name;
    private javax.swing.JLabel level2Rank1Score;
    private javax.swing.JLabel level2Rank1Time;
    private javax.swing.JLabel level2Rank2Name;
    private javax.swing.JLabel level2Rank2Score;
    private javax.swing.JLabel level2Rank2Time;
    private javax.swing.JLabel level2Rank3Name;
    private javax.swing.JLabel level2Rank3Score;
    private javax.swing.JLabel level2Rank3Time;
    private javax.swing.JLabel level3Rank1Name;
    private javax.swing.JLabel level3Rank1Score;
    private javax.swing.JLabel level3Rank1Time;
    private javax.swing.JLabel level3Rank2Name;
    private javax.swing.JLabel level3Rank2Score;
    private javax.swing.JLabel level3Rank2Time;
    private javax.swing.JLabel level3Rank3Name;
    private javax.swing.JLabel level3Rank3Score;
    private javax.swing.JLabel level3Rank3Time;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel timecompletedLabel;
    // End of variables declaration//GEN-END:variables
}
