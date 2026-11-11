package gamelogin;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

public class boss_level extends javax.swing.JFrame {
  private static final int INITIAL_X = 20;
    private static final int INITIAL_Y = 630;
    private static final int MOVEMENT_SPEED = 5;
    private static final int JUMP_STRENGTH = -13;
    private static final int GRAVITY = 1;
   
    private final String playerName;
    private final String characterName;
    private int x = INITIAL_X, y = INITIAL_Y;
    private int verticalSpeed = 0;
    private boolean onGround = false;
    private boolean isJumping = false;
    private int timeElapsed = 0;
    private int score = 0;
    private boolean levelCompleted = false;
     private javax.swing.Timer gameTimer;

    private int playerHealth = 3;
    private int bossHealth = 10;
    private javax.swing.Timer questionTimer;
    private boolean questionActive = false;
    private final java.util.Random random = new java.util.Random(); 
    

       private final GameStages parentStage;
        public boss_level(String characterName, String playerName, GameStages parentStage) {           
            this.characterName = characterName;
            this.playerName = playerName;
            this.parentStage = parentStage;
            initComponents(); 
            initGameLogic();
        }

    private void initGameLogic() {
        setLocationRelativeTo(null);
        setCharacterImage();
        
        y = Game_First_Floor.getY() - GameCharacter.getHeight();
        onGround = true;
        GameCharacter.setLocation(x, y);
        
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        jPanel1.setFocusable(true);
        
        startGameThread();
        startGameTimer();
        startQuestionTimer();
        updateHealthDisplay();
        
        Sounds.stopBackgroundMusic();
//        Sounds.playBossMusic();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Timer = new javax.swing.JLabel();
        timerBG = new javax.swing.JLabel();
        hp = new javax.swing.JLabel();
        hp1 = new javax.swing.JLabel();
        hp2 = new javax.swing.JLabel();
        boss_hp = new javax.swing.JLabel();
        boss_hp1 = new javax.swing.JLabel();
        boss_hp2 = new javax.swing.JLabel();
        boss_hp3 = new javax.swing.JLabel();
        boss_hp4 = new javax.swing.JLabel();
        boss_hp5 = new javax.swing.JLabel();
        boss_hp6 = new javax.swing.JLabel();
        boss_hp7 = new javax.swing.JLabel();
        boss_hp8 = new javax.swing.JLabel();
        boss_hp9 = new javax.swing.JLabel();
        GameCharacter = new javax.swing.JLabel();
        FinalBoss = new javax.swing.JLabel();
        Border_LeftGame = new javax.swing.JLabel();
        Border_RightGame = new javax.swing.JLabel();
        BorderTopGame = new javax.swing.JLabel();
        Border_BottomGame = new javax.swing.JLabel();
        Game_First_Floor = new javax.swing.JLabel();
        GameEnvirnmentBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 700));
        jPanel1.setLayout(null);

        Timer.setBackground(new java.awt.Color(255, 255, 255));
        Timer.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        Timer.setForeground(new java.awt.Color(255, 255, 255));
        Timer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Timer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Timer);
        Timer.setBounds(430, 20, 40, 30);

        timerBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traps/timerBG.png"))); // NOI18N
        timerBG.setText("jLabel1");
        jPanel1.add(timerBG);
        timerBG.setBounds(400, 10, 100, 50);

        hp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tag/hp.png"))); // NOI18N
        hp.setText("jLabel1");
        jPanel1.add(hp);
        hp.setBounds(100, 10, 50, 50);

        hp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tag/hp.png"))); // NOI18N
        hp1.setText("jLabel1");
        jPanel1.add(hp1);
        hp1.setBounds(50, 10, 50, 50);

        hp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tag/hp.png"))); // NOI18N
        hp2.setText("jLabel1");
        jPanel1.add(hp2);
        hp2.setBounds(0, 10, 50, 50);

        boss_hp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tag/bosshp (1).png"))); // NOI18N
        boss_hp.setText("jLabel1");
        jPanel1.add(boss_hp);
        boss_hp.setBounds(650, 10, 50, 50);

        boss_hp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tag/bosshp (1).png"))); // NOI18N
        boss_hp1.setText("jLabel1");
        jPanel1.add(boss_hp1);
        boss_hp1.setBounds(700, 10, 50, 50);

        boss_hp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tag/bosshp (1).png"))); // NOI18N
        boss_hp2.setText("jLabel1");
        jPanel1.add(boss_hp2);
        boss_hp2.setBounds(750, 10, 50, 50);

        boss_hp3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tag/bosshp (1).png"))); // NOI18N
        boss_hp3.setText("jLabel1");
        jPanel1.add(boss_hp3);
        boss_hp3.setBounds(800, 10, 50, 50);

        boss_hp4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tag/bosshp (1).png"))); // NOI18N
        boss_hp4.setText("jLabel1");
        jPanel1.add(boss_hp4);
        boss_hp4.setBounds(850, 10, 50, 50);

        boss_hp5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tag/bosshp (1).png"))); // NOI18N
        boss_hp5.setText("jLabel1");
        jPanel1.add(boss_hp5);
        boss_hp5.setBounds(650, 50, 50, 50);

        boss_hp6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tag/bosshp (1).png"))); // NOI18N
        boss_hp6.setText("jLabel1");
        jPanel1.add(boss_hp6);
        boss_hp6.setBounds(700, 50, 50, 50);

        boss_hp7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tag/bosshp (1).png"))); // NOI18N
        boss_hp7.setText("jLabel1");
        jPanel1.add(boss_hp7);
        boss_hp7.setBounds(750, 50, 50, 50);

        boss_hp8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tag/bosshp (1).png"))); // NOI18N
        boss_hp8.setText("jLabel1");
        jPanel1.add(boss_hp8);
        boss_hp8.setBounds(800, 50, 50, 50);

        boss_hp9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tag/bosshp (1).png"))); // NOI18N
        boss_hp9.setText("jLabel1");
        jPanel1.add(boss_hp9);
        boss_hp9.setBounds(850, 50, 50, 50);

        GameCharacter.setBackground(new java.awt.Color(153, 255, 204));
        GameCharacter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/default.gif"))); // NOI18N
        GameCharacter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                GameCharacterKeyReleased(evt);
            }
        });
        jPanel1.add(GameCharacter);
        GameCharacter.setBounds(20, 600, 40, 50);

        FinalBoss.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FinalBoss.setIcon(new javax.swing.ImageIcon(getClass().getResource("/villain/boss_left_walk.gif"))); // NOI18N
        jPanel1.add(FinalBoss);
        FinalBoss.setBounds(460, 550, 100, 100);

        Border_LeftGame.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Border_LeftGame);
        Border_LeftGame.setBounds(0, 0, 20, 700);

        Border_RightGame.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Border_RightGame);
        Border_RightGame.setBounds(880, 0, 20, 700);

        BorderTopGame.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(BorderTopGame);
        BorderTopGame.setBounds(0, 0, 900, 70);

        Border_BottomGame.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Border_BottomGame);
        Border_BottomGame.setBounds(0, 680, 900, 20);

        Game_First_Floor.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.add(Game_First_Floor);
        Game_First_Floor.setBounds(0, 650, 900, 20);

        GameEnvirnmentBG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GameEnvirnmentBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall,blocks,Ground/boss_stage (1).png"))); // NOI18N
        GameEnvirnmentBG.setMaximumSize(new java.awt.Dimension(900, 700));
        GameEnvirnmentBG.setMinimumSize(new java.awt.Dimension(900, 700));
        GameEnvirnmentBG.setPreferredSize(new java.awt.Dimension(900, 700));
        jPanel1.add(GameEnvirnmentBG);
        GameEnvirnmentBG.setBounds(0, 0, 900, 700);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    private void setCharacterImage() {
        if (characterName.equalsIgnoreCase("Blaze")) {
            GameCharacter.setIcon(new ImageIcon(getClass().getResource("/imageBG/default.gif")));
        } else if (characterName.equalsIgnoreCase("Aqua")) {
            GameCharacter.setIcon(new ImageIcon(getClass().getResource("/Aqua/aqua-idle.gif")));
        }
    }
 private boolean canMoveTo(int newX) {
        return newX >= (Border_LeftGame.getX() + Border_LeftGame.getWidth()) &&
               newX + GameCharacter.getWidth() <= Border_RightGame.getX();
    }

    private void startGameThread() {
        new Thread(() -> {
            while (!levelCompleted) {
                gameLoopIteration();
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private void gameLoopIteration() {
        if (!onGround) {
            verticalSpeed += GRAVITY;
            y += verticalSpeed;
        }
        
        if (y + GameCharacter.getHeight() > Game_First_Floor.getY()) {
            y = Game_First_Floor.getY() - GameCharacter.getHeight();
            verticalSpeed = 0;
            onGround = true;
            if (isJumping) {
                setCharacterImage();
                isJumping = false;
            }
        }
        
        SwingUtilities.invokeLater(() -> {
            GameCharacter.setLocation(x, y);
        });
    }

    private void startGameTimer() {
    gameTimer = new javax.swing.Timer(1000, e -> {
        timeElapsed++;
        Timer.setText("" + timeElapsed + "s");
    });
    gameTimer.start();
}

    private void startQuestionTimer() {
        questionTimer = new javax.swing.Timer(10000, e -> {
            if (!questionActive && !levelCompleted) {
                askQuestion();
            }
        });
        questionTimer.start();
    }

    private void askQuestion() {
       questionActive = true;
       gameTimer.stop(); 
        String[] questions = {
            "<html>It is an OOP technique used <br>to hide data from direct access.</html>",
            "<html>This process enables one class to<br>acquire public methods and variables of another.</html>",
            "It refers to the idea of 'having many forms'.",
            "<html>This is the process of representing essential <br>features without including implementation details.</html>",
            "<html>He is known as the father of the <br>Java programming language.</html>",
            "<html>It is a special kind of method that is <br>invoked to construct objects.</html>",
            "<html>A text-based user interface (UI)<br>used to manage computer files.</html>",
            "<html>GUI components that are used as <br>containers for other GUI components.</html>",
            "<html>Information about returned data, <br>database, and driver.</html>",
            "<html>Loads database drivers and manages connections<br>between application and driver.</html>",
            "Which keyword is used to inherit a class?"
        };

        String[] answers = {
            "Encapsulation", "Inheritance", "Polymorphism", "Abstraction",
            "James Gosling", "Constructor", "Command Line Interface", 
            "Container classes", "Metadata", "Driver Manager", "extends"
        };

      int index = random.nextInt(questions.length);
    processBattleQuestion(questions[index], answers[index]);
    }

  private void processBattleQuestion(String question, String correctAnswer) {
    SwingUtilities.invokeLater(() -> {
        customQuestionMessage cqm = new customQuestionMessage(question);
        cqm.setLocationRelativeTo(this);
        cqm.setVisible(true);
        
        cqm.addSubmitListener(e -> {
            String userAnswer = cqm.getAnswer();
            cqm.dispose();
            questionActive = false;
            gameTimer.start(); // Resume timer after answering
            
            if (userAnswer != null && !userAnswer.trim().isEmpty()) {
                if (userAnswer.trim().equalsIgnoreCase(correctAnswer)) {
                    playerAttack();
                } else {
                    bossAttack();
                }
            }
        });
    });
}


    private void playerAttack() {
        bossHealth--;
        updateHealthDisplay();
        animateAttack(true);
//        Sounds.playAttackSound();
        
        if (bossHealth <= 0) {
            bossDefeated();
        }
    }

    private void bossAttack() {
        playerHealth--;
        updateHealthDisplay();
        animateAttack(false);
//        Sounds.playHitSound();
        
        if (playerHealth <= 0) {
            playerDefeated();
        }
    }

    private void animateAttack(boolean isPlayerAttacking) {
        if (isPlayerAttacking) {          
            String attackAnim = characterName.equalsIgnoreCase("Blaze") ?
                "/Blaze/BlazeJumpRight.gif" : "/Aqua/aqua-jump-right50.gif";
            GameCharacter.setIcon(new ImageIcon(getClass().getResource(attackAnim)));
            
            FinalBoss.setIcon(new ImageIcon(getClass().getResource("/villain/boss_death.gif")));
        } else {           
            FinalBoss.setIcon(new ImageIcon(getClass().getResource("/villain/boss_attack_left.gif")));            
           
            String hitAnim = characterName.equalsIgnoreCase("Blaze") ?
                "/Blaze/BlazeJumpRight.gif" : "/Aqua/aqua-jump-right50.gif";
            GameCharacter.setIcon(new ImageIcon(getClass().getResource(hitAnim)));
        }
      
        new javax.swing.Timer(1000, e -> {
            setCharacterImage();
            FinalBoss.setIcon(new ImageIcon(getClass().getResource("/villain/boss_left_walk.gif")));
            ((javax.swing.Timer)e.getSource()).stop();
        }).start();
    }

    private void updateHealthDisplay() {
        SwingUtilities.invokeLater(() -> {
            // Player health
            hp.setVisible(playerHealth >= 1);
            hp1.setVisible(playerHealth >= 2);
            hp2.setVisible(playerHealth >= 3);
            
            // Boss health
            boss_hp.setVisible(bossHealth >= 1);
            boss_hp1.setVisible(bossHealth >= 2);
            boss_hp2.setVisible(bossHealth >= 3);
            boss_hp3.setVisible(bossHealth >= 4);
            boss_hp4.setVisible(bossHealth >= 5);
            boss_hp5.setVisible(bossHealth >= 6);
            boss_hp6.setVisible(bossHealth >= 7);
            boss_hp7.setVisible(bossHealth >= 8);
            boss_hp8.setVisible(bossHealth >= 9);
            boss_hp9.setVisible(bossHealth >= 10);
        });
    }
private void bossDefeated() {
    levelCompleted = true;
    questionTimer.stop();
    gameTimer.stop();

    calculateFinalScore();
    
    SwingUtilities.invokeLater(() -> {
          Sounds.finish();
        new customerWarningMessage("<html>Congratulations!<br>You defeated the boss!</html>").setVisible(true);
        
        gamePanel panel = new gamePanel(playerName);                
        panel.saveLevelCompletion(3, score, timeElapsed);
        panel.updateGameStats(score, 21, timeElapsed);
        panel.setVisible(true);
        panel.setLocationRelativeTo(null);
        
        dispose();
        Sounds.BackgroundMusic();
    });
}
private void calculateFinalScore() {   
    score =0;
    score += playerHealth * 10;
    

    if (timeElapsed < 180) {
        score += 20;
    } else if (timeElapsed < 300) { 
        score += 10;
    }

    if (score < 0) {
        score = 0;
    }
}

    private void playerDefeated() {
        levelCompleted = true;
        questionTimer.stop();
        gameTimer.stop();
        
        SwingUtilities.invokeLater(() -> {
            Sounds.gameOver();
            new customerWarningMessage("<html>Game Over!<br>The boss defeated you!</html>").setVisible(true);
            
            gamePanel panel = new gamePanel(playerName);
            panel.setVisible(true);
            
            dispose();
            Sounds.BackgroundMusic();
        });
    }
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    int newX = x;
        boolean moved = false;

        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            newX = x - MOVEMENT_SPEED;
            if (characterName.equalsIgnoreCase("Blaze")) {
                GameCharacter.setIcon(new ImageIcon(getClass().getResource("/imageBG/BlazeWalkLeft.gif")));
            } else {
                GameCharacter.setIcon(new ImageIcon(getClass().getResource("/Aqua/aqua-walk-left50.gif")));
            }
            Sounds.walkSounds();
            moved = true;
        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            newX = x + MOVEMENT_SPEED;
            if (characterName.equalsIgnoreCase("Blaze")) {
                GameCharacter.setIcon(new ImageIcon(getClass().getResource("/imageBG/BlazeWalkRight.gif")));
            } else {
                GameCharacter.setIcon(new ImageIcon(getClass().getResource("/Aqua/aqua-walk-right50.gif")));
            }
            Sounds.walkSounds();
            moved = true;
        }
        if (evt.getKeyCode() == KeyEvent.VK_SPACE && onGround) {
            verticalSpeed = JUMP_STRENGTH;
            onGround = false;
            isJumping = true;
            if (characterName.equalsIgnoreCase("Blaze")) {
                GameCharacter.setIcon(new ImageIcon(getClass().getResource("/imageBG/BlazeJumpRight.gif")));
            } else {
                GameCharacter.setIcon(new ImageIcon(getClass().getResource("/Aqua/aqua-jump-right50.gif")));
            }
            Sounds.JumpSounds();
        }
        
        if (moved && canMoveTo(newX)) {
            x = newX;
        }
    }//GEN-LAST:event_formKeyPressed

    
    
    private void GameCharacterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GameCharacterKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_GameCharacterKeyReleased






    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BorderTopGame;
    private javax.swing.JLabel Border_BottomGame;
    private javax.swing.JLabel Border_LeftGame;
    private javax.swing.JLabel Border_RightGame;
    private javax.swing.JLabel FinalBoss;
    private javax.swing.JLabel GameCharacter;
    private javax.swing.JLabel GameEnvirnmentBG;
    private javax.swing.JLabel Game_First_Floor;
    private javax.swing.JLabel Timer;
    private javax.swing.JLabel boss_hp;
    private javax.swing.JLabel boss_hp1;
    private javax.swing.JLabel boss_hp2;
    private javax.swing.JLabel boss_hp3;
    private javax.swing.JLabel boss_hp4;
    private javax.swing.JLabel boss_hp5;
    private javax.swing.JLabel boss_hp6;
    private javax.swing.JLabel boss_hp7;
    private javax.swing.JLabel boss_hp8;
    private javax.swing.JLabel boss_hp9;
    private javax.swing.JLabel hp;
    private javax.swing.JLabel hp1;
    private javax.swing.JLabel hp2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel timerBG;
    // End of variables declaration//GEN-END:variables
}
