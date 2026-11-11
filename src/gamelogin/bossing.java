package gamelogin;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

public class bossing extends javax.swing.JFrame {
    
    // Game constants
    private static final int INITIAL_X = 20;
    private static final int INITIAL_Y = 630;
    private static final int MOVEMENT_SPEED = 5;
    private static final int JUMP_STRENGTH = -13;
    private static final int GRAVITY = 1;
    
    // Game state
    private final String playerName;
    private final String characterName;
    private int x = INITIAL_X, y = INITIAL_Y;
    private int verticalSpeed = 0;
    private boolean onGround = false;
    private int timeElapsed = 0;
    private boolean levelCompleted = false;
    
    // Boss battle variables
    private int playerHealth = 3;
    private int bossHealth = 10;
    private javax.swing.Timer questionTimer;
    private boolean questionActive = false;
    private final java.util.Random random = new java.util.Random();
   
    private final GameStages parentStage;
    private static final int GEM_REAPPEAR_DELAY = 3000;
    private int score = 0;
    private javax.swing.Timer gameTimer;
  
    private boolean[] usedQuestions = new boolean[11];    
    
        public bossing(String characterName, String playerName, GameStages parentStage) {
               initComponents();
               this.characterName = characterName;
        this.playerName = playerName;
        this.parentStage = parentStage;

     
        setLocationRelativeTo(null);
        setCharacterImage();
        setupKeyListeners();
        
        y = Game_First_Floor.getY() - GameCharacter.getHeight();
        onGround = true;
        GameCharacter.setLocation(x, y);
        
        startGameThread();
        startGameTimer();
        startQuestionTimer();
        updateHealthDisplay();
        startBossAnimation();
        
        Sounds.stopBackgroundMusic();
        Sounds.zombieSounds();
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
        FinalBoss = new javax.swing.JLabel();
        GameCharacter = new javax.swing.JLabel();
        Game_First_Floor = new javax.swing.JLabel();
        Border_BottomGame = new javax.swing.JLabel();
        BorderTopGame = new javax.swing.JLabel();
        Border_RightGame = new javax.swing.JLabel();
        Border_LeftGame = new javax.swing.JLabel();
        GameEnvirnmentBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        hp1.setBounds(150, 10, 50, 50);

        hp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tag/hp.png"))); // NOI18N
        hp2.setText("jLabel1");
        jPanel1.add(hp2);
        hp2.setBounds(200, 10, 50, 50);

        boss_hp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tag/bosshp (1).png"))); // NOI18N
        boss_hp.setText("jLabel1");
        jPanel1.add(boss_hp);
        boss_hp.setBounds(840, 10, 50, 50);

        boss_hp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tag/bosshp (1).png"))); // NOI18N
        boss_hp1.setText("jLabel1");
        jPanel1.add(boss_hp1);
        boss_hp1.setBounds(790, 10, 50, 50);

        boss_hp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tag/bosshp (1).png"))); // NOI18N
        boss_hp2.setText("jLabel1");
        jPanel1.add(boss_hp2);
        boss_hp2.setBounds(740, 10, 50, 50);

        boss_hp3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tag/bosshp (1).png"))); // NOI18N
        boss_hp3.setText("jLabel1");
        jPanel1.add(boss_hp3);
        boss_hp3.setBounds(690, 10, 50, 50);

        boss_hp4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tag/bosshp (1).png"))); // NOI18N
        boss_hp4.setText("jLabel1");
        jPanel1.add(boss_hp4);
        boss_hp4.setBounds(640, 10, 50, 50);

        boss_hp5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tag/bosshp (1).png"))); // NOI18N
        boss_hp5.setText("jLabel1");
        jPanel1.add(boss_hp5);
        boss_hp5.setBounds(640, 60, 50, 50);

        boss_hp6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tag/bosshp (1).png"))); // NOI18N
        boss_hp6.setText("jLabel1");
        jPanel1.add(boss_hp6);
        boss_hp6.setBounds(690, 60, 50, 50);

        boss_hp7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tag/bosshp (1).png"))); // NOI18N
        boss_hp7.setText("jLabel1");
        jPanel1.add(boss_hp7);
        boss_hp7.setBounds(740, 60, 50, 50);

        boss_hp8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tag/bosshp (1).png"))); // NOI18N
        boss_hp8.setText("jLabel1");
        jPanel1.add(boss_hp8);
        boss_hp8.setBounds(790, 60, 50, 50);

        boss_hp9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tag/bosshp (1).png"))); // NOI18N
        boss_hp9.setText("jLabel1");
        jPanel1.add(boss_hp9);
        boss_hp9.setBounds(850, 60, 50, 50);

        FinalBoss.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FinalBoss.setIcon(new javax.swing.ImageIcon(getClass().getResource("/villain/boss_left_walk.gif"))); // NOI18N
        jPanel1.add(FinalBoss);
        FinalBoss.setBounds(460, 550, 100, 100);

        GameCharacter.setBackground(new java.awt.Color(153, 255, 204));
        GameCharacter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/default.gif"))); // NOI18N
        GameCharacter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                GameCharacterKeyReleased(evt);
            }
        });
        jPanel1.add(GameCharacter);
        GameCharacter.setBounds(20, 600, 40, 50);

        Game_First_Floor.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.add(Game_First_Floor);
        Game_First_Floor.setBounds(0, 650, 900, 20);

        Border_BottomGame.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Border_BottomGame);
        Border_BottomGame.setBounds(0, 680, 900, 20);

        BorderTopGame.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(BorderTopGame);
        BorderTopGame.setBounds(0, 0, 900, 70);

        Border_RightGame.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Border_RightGame);
        Border_RightGame.setBounds(880, 0, 20, 700);

        Border_LeftGame.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(Border_LeftGame);
        Border_LeftGame.setBounds(0, 10, 20, 700);

        GameEnvirnmentBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall,blocks,Ground/boss_stage.png"))); // NOI18N
        GameEnvirnmentBG.setText("jLabel1");
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

    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
    }//GEN-LAST:event_formKeyPressed
   
    private void setCharacterImage() {
        String basePath = characterName.equalsIgnoreCase("Blaze") ? 
            "/imageBG/" : "/Aqua/";
        String idleImage = characterName.equalsIgnoreCase("Blaze") ? 
            "default.gif" : "aqua-idle.gif";
        GameCharacter.setIcon(new ImageIcon(getClass().getResource(basePath + idleImage)));
    }
    private void setupKeyListeners() {
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                handleKeyPress(evt);
            }
        });
        jPanel1.setFocusable(true);
    }
 private void handleKeyPress(KeyEvent evt) {
        int newX = x;
        boolean moved = false;

        if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            newX = x - MOVEMENT_SPEED;
            setWalkingAnimation("left");
            Sounds.walkSounds();
            moved = true;
        }
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            newX = x + MOVEMENT_SPEED;
            setWalkingAnimation("right");
            Sounds.walkSounds();
            moved = true;
        }
        if (evt.getKeyCode() == KeyEvent.VK_SPACE && onGround) {
            verticalSpeed = JUMP_STRENGTH;
            onGround = false;
            setJumpAnimation();
            Sounds.JumpSounds();
        }
        
        if (moved && canMoveTo(newX)) {
            x = newX;
        }
    }
 
    private void setWalkingAnimation(String direction) {
        String animPath;
        if (characterName.equalsIgnoreCase("Blaze")) {
            animPath = "/imageBG/BlazeWalk" + 
                      (direction.equals("left") ? "Left.gif" : "Right.gif");
        } else {
            animPath = "/Aqua/aqua-walk-" + direction + "50.gif";
        }
        GameCharacter.setIcon(new ImageIcon(getClass().getResource(animPath)));
    }
private void setJumpAnimation() {
        String animPath = characterName.equalsIgnoreCase("Blaze") ?
            "/imageBG/BlazeJumpRight.gif" : "/Aqua/aqua-jump-right50.gif";
        GameCharacter.setIcon(new ImageIcon(getClass().getResource(animPath)));
    }

  private void startBossAnimation() {
        new javax.swing.Timer(2000, e -> {
            String anim = random.nextBoolean() ? 
                "/villain/boss_left_walk.gif" : "/villain/boss_right_walk.gif";
            FinalBoss.setIcon(new ImageIcon(getClass().getResource(anim)));
        }).start();
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
        // Handle gravity and jumping
        if (!onGround) {
            verticalSpeed += GRAVITY;
            y += verticalSpeed;
        }
        
        // Check floor collision
        if (y + GameCharacter.getHeight() > Game_First_Floor.getY()) {
            y = Game_First_Floor.getY() - GameCharacter.getHeight();
            verticalSpeed = 0;
            onGround = true;
            boolean isJumping = false;
            if (isJumping) {
                setCharacterImage();
                isJumping = false;
            }
        }
        
        // Update character position
        SwingUtilities.invokeLater(() -> {
            GameCharacter.setLocation(x, y);
        });
    }

    private boolean canMoveTo(int newX) {
        return newX >= 20 && newX + GameCharacter.getWidth() <= 880;
    }

    private void startGameTimer() {
        gameTimer = new javax.swing.Timer(1000, e -> {
            timeElapsed++;
            Timer.setText(timeElapsed + "s");
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
        QuestionAnswer qa = QuestionBank.getRandomQuestion();
        
        SwingUtilities.invokeLater(() -> {
            customQuestionMessage cqm = new customQuestionMessage(qa.question);
            cqm.setLocationRelativeTo(this);
            cqm.setVisible(true);
            
            cqm.addSubmitListener(e -> {
                String userAnswer = cqm.getAnswer();
                cqm.dispose();
                questionActive = false;
                
                if (userAnswer != null && !userAnswer.trim().isEmpty()) {
                    if (userAnswer.trim().equalsIgnoreCase(qa.answer)) {
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
        showAttackAnimation(true);
        Sounds.zombieSounds();
        
        if (bossHealth <= 0) {
            bossDefeated();
        } else if (bossHealth <= 3) {
            // Boss enraged mode
            questionTimer.setDelay(7000); // Questions come faster
            Sounds.zombieSounds();
        }
    }

    private void bossAttack() {
        playerHealth--;
        updateHealthDisplay();
        showAttackAnimation(false);
        Sounds.zombieSounds();
        
        if (playerHealth <= 0) {
            playerDefeated();
        }
    }

    private void showAttackAnimation(boolean isPlayerAttacking) {
        if (isPlayerAttacking) {
            // Player attack animation
            String attackAnim = characterName.equalsIgnoreCase("Blaze") ?
                "/Blaze/BlazeWalkRight.gif" : "/Aqua/aqua-walk-left50.gif";
            GameCharacter.setIcon(new ImageIcon(getClass().getResource(attackAnim)));
            
            // Boss hit animation
            FinalBoss.setIcon(new ImageIcon(getClass().getResource("/villain/boss_attack_left.gif")));
        } else {
            // Boss attack animation
            FinalBoss.setIcon(new ImageIcon(getClass().getResource("/villain/boss_attack_left.gif")));
            
            // Player hit animation
            String hitAnim = characterName.equalsIgnoreCase("Blaze") ?
                "/Blaze/BlazeWalkRight.gif" : "/Aqua/aqua-walk-left50.gif";
            GameCharacter.setIcon(new ImageIcon(getClass().getResource(hitAnim)));
        }
        
        // Reset animations after 1 second
        new javax.swing.Timer(1000, e -> {
            setCharacterImage();
            FinalBoss.setIcon(new ImageIcon(getClass().getResource("/villain/boss_left_walk.gif")));
            ((javax.swing.Timer)e.getSource()).stop();
        }).start();
    }

    private void updateHealthDisplay() {
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
    }

    private void bossDefeated() {
        levelCompleted = true;
        questionTimer.stop();
        gameTimer.stop();
        
        SwingUtilities.invokeLater(() -> {
            Sounds.finish();
            new customerWarningMessage("<html>Congratulations!<br>You defeated the boss!</html>").setVisible(true);
            
            // Save game results
            gamePanel panel = new gamePanel(playerName);                
            panel.saveLevelCompletion(3, score, timeElapsed);
            panel.updateGameStats(score, 21, timeElapsed);
            panel.setVisible(true);
            panel.setLocationRelativeTo(null);

           
            
            dispose();
            Sounds.BackgroundMusic();
        });
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

    // Helper class for questions
    private static class QuestionBank {
        private static final QuestionAnswer[] QUESTIONS = {
            new QuestionAnswer(
                "<html>It is an OOP technique used <br>to hide data from direct access.</html>",
                "Encapsulation"
            ),
            // Add all other questions here
        };
        
        public static QuestionAnswer getRandomQuestion() {
            return QUESTIONS[new java.util.Random().nextInt(QUESTIONS.length)];
        }
    }
    
    private static class QuestionAnswer {
        public final String question;
        public final String answer;
        
        public QuestionAnswer(String question, String answer) {
            this.question = question;
            this.answer = answer;
        }
    }
    private void checkGemCollisions() {
       String[] questions = {
        "<html> It is an OOP technique used <br>to hide data from direct access.</html>",
        "<html> This process enables one class to<br> acquire public methods and variables of another.</html>",
        "It refers to the idea of 'having many forms'.",
        "<html> This is the process of representing essential <br>features without including implementation details.</html>",
        "<html> He is known as the father of the <br>Java programming language.</html>",
        "<html> It is a special kind of method that is <br>invoked to construct objects.</html>",
        "<html> A text-based user interface (UI)<br> used to manage computer files.</html>",
        "<html> GUI components that are used as <br>containers for other GUI components.</html>",
        "<html> Information about returned data, <br>database, and driver.</html>",
        "<html> Loads database drivers and manages connections<br> between application and driver.</html>",
        "Which keyword is used to inherit a class?"
    };

    String[] answers = {
        "Encapsulation", "Inheritance", "Polymorphism", "Abstraction",
        "James Gosling", "Constructor", "Command Line Interface", 
        "Container classes", "Metadata", "Driver Manager", "extends"
    };

       
    }

    private void handleRegularGemCollection(String[] questions, String[] answers, javax.swing.JLabel gemLabel) {   
    score += 5;

    Sounds.gemCollect();    
  
    if (random.nextBoolean()) {
        int index = getUnusedQuestionIndex();
        if (index != -1) {
            usedQuestions[index] = true;
            processQuestion(questions[index], answers[index], gemLabel, false);
        } else {
            SwingUtilities.invokeLater(() -> {               
                  new customerWarningMessage("No more questions left!").setVisible(true);
            });
        }
    }
}

    private void processQuestion(String question, String correctAnswer, javax.swing.JLabel gemLabel, boolean isReappearedGem) {
        SwingUtilities.invokeLater(() -> {           
            customQuestionMessage cqm = new customQuestionMessage(question);
            cqm.setLocationRelativeTo(this); 
            cqm.setVisible(true);
          
            cqm.addSubmitListener(e -> {
                String userAnswer = cqm.getAnswer();
                cqm.dispose(); 

                if (userAnswer != null && !userAnswer.trim().isEmpty()) {
                    if (userAnswer.trim().equalsIgnoreCase(correctAnswer)) {                      
                  
                        new customerWarningMessage("Correct! You earned a key.").setVisible(true);
                        Sounds.gemCollect();
                    } else {                      
                        score -= 2;
                      
                        new customerWarningMessage("Incorrect! -2 score.").setVisible(true);

                        if (!isReappearedGem) {
                            reappearQuestionGemAfterDelay(gemLabel, question, correctAnswer);
                        }
                    }
                }
            });
        });
    }

    private void processQuestion(String question, String correctAnswer, javax.swing.JLabel gemLabel) {
        processQuestion(question, correctAnswer, gemLabel, false);
    }

    private void reappearQuestionGemAfterDelay(javax.swing.JLabel gemLabel, String question, String correctAnswer)  {
        new java.util.Timer().schedule(new java.util.TimerTask() {
            @Override
            public void run() {
                SwingUtilities.invokeLater(() -> {
                    placeGemRandomly(gemLabel);               
                    gemLabel.putClientProperty("question", question);
                    gemLabel.putClientProperty("answer", correctAnswer);
                });
            }
        }, GEM_REAPPEAR_DELAY);
    }

    private int getUnusedQuestionIndex() {
        for (int i = 0; i < usedQuestions.length; i++) {
            if (!usedQuestions[i]) {
                return i;
            }
        }
        usedQuestions = new boolean[11];
        return 0;
    }

    private void placeGemRandomly(javax.swing.JLabel gemLabel) {
        java.awt.Dimension panelSize = getSize();
        java.awt.Rectangle gemBounds;
        boolean overlaps;

        do {
            int newX = random.nextInt(panelSize.width - gemLabel.getWidth());
            int newY = random.nextInt(panelSize.height - gemLabel.getHeight() - 50);

            gemLabel.setLocation(newX, newY);
            gemBounds = gemLabel.getBounds();
            overlaps = false;

            if (gemBounds.intersects(GameCharacter.getBounds())) {
                overlaps = true;
            }

        } while (overlaps);

        gemLabel.setVisible(true);
    }




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
