package gamelogin;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

public class mid_level extends javax.swing.JFrame {
    
    private final String playerName;
    private final GameStages parentStage;
    private final String characterName;   
    private static final int MONSTER_CHASE_DURATION = 20000;

    
    private static final int INITIAL_X = 20;
    private static final int INITIAL_Y = 630;
    private static final int MOVEMENT_SPEED = 5;
    private static final int JUMP_STRENGTH = -13;
    private static final int GRAVITY = 1; 
    private static final int REQUIRED_KEYS = 5;
    private static final int GEM_REAPPEAR_DELAY = 3000;
    private static final int MONSTER_SPEED = 2;
    
    private int x = INITIAL_X; 
    private int y = INITIAL_Y; 
    private int verticalSpeed = 0; 
    private boolean onGround = false; 
    private boolean isJumping = false;
    private int score = 0;
    private boolean levelCompleted = false;      
    private int timeElapsed = 0;
    private int keys = 0;
    private int hpCount = 3; 
    private boolean monsterChasing = false;
    private int monsterX = 360;
    private int monsterY = 610;
    
    private javax.swing.Timer monsterDisappearTimer;
    private javax.swing.Timer gameTimer;
    private javax.swing.Timer monsterTimer;
    private final java.util.Random random = new java.util.Random();
    private boolean[] usedQuestions = new boolean[11];    
    
    
    private final javax.swing.JLabel[] gems;
    private final javax.swing.JLabel[] platforms;
    private final javax.swing.JLabel[] walls;
    private final javax.swing.JLabel[] jumpPreventors;

       
    public mid_level(String characterName, String playerName, GameStages parentStage) {
        this.characterName = characterName;
        this.playerName = playerName;
        this.parentStage = parentStage;
      
        monsterChasing = false;
        initComponents();
        setLocationRelativeTo(null);        
        setCharacterImage();

     
        if (Game_First_Floor != null && GameCharacter != null) {
            y = Game_First_Floor.getY() - GameCharacter.getHeight();
            onGround = true;
            GameCharacter.setLocation(x, y);
        } else {           
            y = INITIAL_Y;
            onGround = true;
            GameCharacter.setLocation(x, y);
        }

     
        walls = new javax.swing.JLabel[]{wall1, wall2, wall3};
        gems = new javax.swing.JLabel[]{gem, gem1, gem2, gem3, gem4, gem5, gem6, gem7, gem8, gem9};
        platforms = new javax.swing.JLabel[]{Game_First_Floor, Game_Second_Floor, Game_Third_Floor, 
            Game_Fourth_Floor, Game_Fifth_Floor, Game_Sixth_Floor, Game_Seventh_Floor, wall1, wall2, wall3};
        jumpPreventors = new javax.swing.JLabel[]{characterpreventforjump, characterpreventforjump1,
            characterpreventforjump3, characterpreventforjump4, characterpreventforjump5, characterpreventforjump6};

        if (zombie != null) {
            zombie.setVisible(false);
        }

        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        startGameThread();
        startGameTimer();
        startMonsterTimer();
        updateScoreDisplay();
        updateKeyDisplay();
        updateHpDisplay();
    }
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Timer = new javax.swing.JLabel();
        settingsbutton = new javax.swing.JLabel();
        timerBG = new javax.swing.JLabel();
        Key_Earn = new javax.swing.JLabel();
        keyBG = new javax.swing.JLabel();
        score_earn = new javax.swing.JLabel();
        scoreBG = new javax.swing.JLabel();
        Game_First_Floor = new javax.swing.JLabel();
        Game_Second_Floor = new javax.swing.JLabel();
        Game_Third_Floor = new javax.swing.JLabel();
        Game_Fourth_Floor = new javax.swing.JLabel();
        Game_Fifth_Floor = new javax.swing.JLabel();
        Game_Sixth_Floor = new javax.swing.JLabel();
        Game_Seventh_Floor = new javax.swing.JLabel();
        GameCharacter = new javax.swing.JLabel();
        zombie = new javax.swing.JLabel();
        gem = new javax.swing.JLabel();
        gem1 = new javax.swing.JLabel();
        gem2 = new javax.swing.JLabel();
        gem3 = new javax.swing.JLabel();
        gem4 = new javax.swing.JLabel();
        gem5 = new javax.swing.JLabel();
        gem6 = new javax.swing.JLabel();
        gem7 = new javax.swing.JLabel();
        gem8 = new javax.swing.JLabel();
        gem9 = new javax.swing.JLabel();
        wall1 = new javax.swing.JLabel();
        wall2 = new javax.swing.JLabel();
        wall3 = new javax.swing.JLabel();
        characterpreventforjump = new javax.swing.JLabel();
        characterpreventforjump1 = new javax.swing.JLabel();
        characterpreventforjump3 = new javax.swing.JLabel();
        characterpreventforjump4 = new javax.swing.JLabel();
        characterpreventforjump5 = new javax.swing.JLabel();
        characterpreventforjump6 = new javax.swing.JLabel();
        Door = new javax.swing.JLabel();
        hp = new javax.swing.JLabel();
        hp1 = new javax.swing.JLabel();
        hp2 = new javax.swing.JLabel();
        Border_BottomGame = new javax.swing.JLabel();
        Border_LeftGame = new javax.swing.JLabel();
        BorderTopGame = new javax.swing.JLabel();
        Border_RightGame = new javax.swing.JLabel();
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

        settingsbutton.setBackground(new java.awt.Color(255, 255, 255));
        settingsbutton.setForeground(new java.awt.Color(0, 102, 255));
        settingsbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonBackground/set.png"))); // NOI18N
        settingsbutton.setText("jLabel1");
        settingsbutton.setOpaque(true);
        settingsbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                settingsbuttonMousePressed(evt);
            }
        });
        settingsbutton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                settingsbuttonKeyPressed(evt);
            }
        });
        jPanel1.add(settingsbutton);
        settingsbutton.setBounds(830, 10, 50, 50);

        timerBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traps/timerBG.png"))); // NOI18N
        timerBG.setText("jLabel1");
        jPanel1.add(timerBG);
        timerBG.setBounds(400, 10, 100, 50);

        Key_Earn.setBackground(new java.awt.Color(255, 255, 255));
        Key_Earn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        Key_Earn.setForeground(new java.awt.Color(255, 255, 255));
        Key_Earn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Key_Earn.setText("0/0");
        Key_Earn.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel1.add(Key_Earn);
        Key_Earn.setBounds(40, 8, 40, 20);

        keyBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traps/score_key.png"))); // NOI18N
        jPanel1.add(keyBG);
        keyBG.setBounds(20, 1, 70, 30);

        score_earn.setBackground(new java.awt.Color(255, 255, 255));
        score_earn.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        score_earn.setForeground(new java.awt.Color(255, 255, 255));
        score_earn.setText("50");
        jPanel1.add(score_earn);
        score_earn.setBounds(40, 40, 20, 30);

        scoreBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/traps/score_key.png"))); // NOI18N
        jPanel1.add(scoreBG);
        scoreBG.setBounds(20, 38, 70, 30);

        Game_First_Floor.setBackground(new java.awt.Color(102, 102, 102));
        Game_First_Floor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall,blocks,Ground/midlevelFloor900.png"))); // NOI18N
        Game_First_Floor.setOpaque(true);
        jPanel1.add(Game_First_Floor);
        Game_First_Floor.setBounds(10, 660, 870, 20);

        Game_Second_Floor.setBackground(new java.awt.Color(51, 51, 51));
        Game_Second_Floor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall,blocks,Ground/midLevel60.png"))); // NOI18N
        Game_Second_Floor.setOpaque(true);
        jPanel1.add(Game_Second_Floor);
        Game_Second_Floor.setBounds(820, 575, 60, 20);

        Game_Third_Floor.setBackground(new java.awt.Color(51, 51, 51));
        Game_Third_Floor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall,blocks,Ground/midLevel800.png"))); // NOI18N
        Game_Third_Floor.setOpaque(true);
        jPanel1.add(Game_Third_Floor);
        Game_Third_Floor.setBounds(20, 490, 800, 20);

        Game_Fourth_Floor.setBackground(new java.awt.Color(51, 51, 51));
        Game_Fourth_Floor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall,blocks,Ground/midLevel60.png"))); // NOI18N
        Game_Fourth_Floor.setOpaque(true);
        jPanel1.add(Game_Fourth_Floor);
        Game_Fourth_Floor.setBounds(20, 405, 60, 20);

        Game_Fifth_Floor.setBackground(new java.awt.Color(51, 51, 51));
        Game_Fifth_Floor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall,blocks,Ground/midLevel800.png"))); // NOI18N
        Game_Fifth_Floor.setOpaque(true);
        jPanel1.add(Game_Fifth_Floor);
        Game_Fifth_Floor.setBounds(80, 320, 800, 20);

        Game_Sixth_Floor.setBackground(new java.awt.Color(51, 51, 51));
        Game_Sixth_Floor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall,blocks,Ground/midLevel60.png"))); // NOI18N
        Game_Sixth_Floor.setOpaque(true);
        jPanel1.add(Game_Sixth_Floor);
        Game_Sixth_Floor.setBounds(820, 235, 60, 20);

        Game_Seventh_Floor.setBackground(new java.awt.Color(51, 51, 51));
        Game_Seventh_Floor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall,blocks,Ground/midLevel800.png"))); // NOI18N
        Game_Seventh_Floor.setOpaque(true);
        jPanel1.add(Game_Seventh_Floor);
        Game_Seventh_Floor.setBounds(20, 150, 800, 20);

        GameCharacter.setBackground(new java.awt.Color(153, 255, 204));
        GameCharacter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/default.gif"))); // NOI18N
        GameCharacter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                GameCharacterKeyReleased(evt);
            }
        });
        jPanel1.add(GameCharacter);
        GameCharacter.setBounds(20, 610, 40, 50);

        zombie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/villain/zombie.gif"))); // NOI18N
        zombie.setText("jLabel1");
        jPanel1.add(zombie);
        zombie.setBounds(360, 610, 70, 50);

        gem.setBackground(new java.awt.Color(255, 255, 0));
        gem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/Diamond_29.png"))); // NOI18N
        gem.setText("gem");
        gem.setOpaque(true);
        jPanel1.add(gem);
        gem.setBounds(140, 520, 30, 30);

        gem1.setBackground(new java.awt.Color(255, 255, 0));
        gem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/Diamond_29.png"))); // NOI18N
        gem1.setText("gem");
        gem1.setOpaque(true);
        jPanel1.add(gem1);
        gem1.setBounds(450, 520, 30, 30);

        gem2.setBackground(new java.awt.Color(255, 255, 0));
        gem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/Diamond_29.png"))); // NOI18N
        gem2.setText("gem");
        gem2.setOpaque(true);
        jPanel1.add(gem2);
        gem2.setBounds(850, 630, 30, 30);

        gem3.setBackground(new java.awt.Color(255, 255, 0));
        gem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/Diamond_29.png"))); // NOI18N
        gem3.setText("gem");
        gem3.setOpaque(true);
        jPanel1.add(gem3);
        gem3.setBounds(850, 360, 30, 30);

        gem4.setBackground(new java.awt.Color(255, 255, 0));
        gem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/Diamond_29.png"))); // NOI18N
        gem4.setText("gem");
        gem4.setOpaque(true);
        jPanel1.add(gem4);
        gem4.setBounds(670, 350, 30, 30);

        gem5.setBackground(new java.awt.Color(255, 255, 0));
        gem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/Diamond_29.png"))); // NOI18N
        gem5.setText("gem");
        gem5.setOpaque(true);
        jPanel1.add(gem5);
        gem5.setBounds(350, 350, 30, 30);

        gem6.setBackground(new java.awt.Color(255, 255, 0));
        gem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/Diamond_29.png"))); // NOI18N
        gem6.setText("gem");
        gem6.setOpaque(true);
        jPanel1.add(gem6);
        gem6.setBounds(20, 460, 30, 30);

        gem7.setBackground(new java.awt.Color(255, 255, 0));
        gem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/Diamond_29.png"))); // NOI18N
        gem7.setText("gem");
        gem7.setOpaque(true);
        jPanel1.add(gem7);
        gem7.setBounds(20, 220, 30, 30);

        gem8.setBackground(new java.awt.Color(255, 255, 0));
        gem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/Diamond_29.png"))); // NOI18N
        gem8.setText("gem");
        gem8.setOpaque(true);
        jPanel1.add(gem8);
        gem8.setBounds(560, 210, 30, 30);

        gem9.setBackground(new java.awt.Color(255, 255, 0));
        gem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/Diamond_29.png"))); // NOI18N
        gem9.setText("gem");
        gem9.setOpaque(true);
        jPanel1.add(gem9);
        gem9.setBounds(850, 290, 30, 30);

        wall1.setBackground(new java.awt.Color(102, 0, 0));
        wall1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall,blocks,Ground/mid_levelBlocks.png"))); // NOI18N
        wall1.setText("wall");
        wall1.setOpaque(true);
        jPanel1.add(wall1);
        wall1.setBounds(260, 610, 100, 50);

        wall2.setBackground(new java.awt.Color(102, 0, 0));
        wall2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall,blocks,Ground/mid_levelBlocks.png"))); // NOI18N
        wall2.setText("wall");
        wall2.setOpaque(true);
        jPanel1.add(wall2);
        wall2.setBounds(450, 440, 100, 50);

        wall3.setBackground(new java.awt.Color(102, 0, 0));
        wall3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall,blocks,Ground/mid_levelBlocks.png"))); // NOI18N
        wall3.setText("wall");
        wall3.setOpaque(true);
        jPanel1.add(wall3);
        wall3.setBounds(370, 270, 100, 50);

        characterpreventforjump.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(characterpreventforjump);
        characterpreventforjump.setBounds(820, 255, 60, 5);

        characterpreventforjump1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(characterpreventforjump1);
        characterpreventforjump1.setBounds(820, 595, 60, 5);

        characterpreventforjump3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(characterpreventforjump3);
        characterpreventforjump3.setBounds(20, 510, 800, 5);

        characterpreventforjump4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(characterpreventforjump4);
        characterpreventforjump4.setBounds(20, 425, 60, 5);

        characterpreventforjump5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(characterpreventforjump5);
        characterpreventforjump5.setBounds(80, 340, 800, 5);

        characterpreventforjump6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(characterpreventforjump6);
        characterpreventforjump6.setBounds(20, 170, 800, 5);

        Door.setBackground(new java.awt.Color(153, 255, 51));
        Door.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/door.png"))); // NOI18N
        Door.setText("door");
        Door.setOpaque(true);
        jPanel1.add(Door);
        Door.setBounds(20, 80, 48, 70);

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

        Border_BottomGame.setBackground(new java.awt.Color(0, 0, 0));
        Border_BottomGame.setOpaque(true);
        jPanel1.add(Border_BottomGame);
        Border_BottomGame.setBounds(0, 680, 900, 20);

        Border_LeftGame.setBackground(new java.awt.Color(0, 0, 0));
        Border_LeftGame.setOpaque(true);
        jPanel1.add(Border_LeftGame);
        Border_LeftGame.setBounds(0, 0, 20, 700);

        BorderTopGame.setBackground(new java.awt.Color(0, 0, 0));
        BorderTopGame.setOpaque(true);
        jPanel1.add(BorderTopGame);
        BorderTopGame.setBounds(0, 0, 900, 70);

        Border_RightGame.setBackground(new java.awt.Color(0, 0, 0));
        Border_RightGame.setOpaque(true);
        jPanel1.add(Border_RightGame);
        Border_RightGame.setBounds(880, 0, 20, 700);

        GameEnvirnmentBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall,blocks,Ground/midLevelWall.png"))); // NOI18N
        GameEnvirnmentBG.setText("jLabel1");
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
   
       private void startMonsterTimer() {
        monsterTimer = new javax.swing.Timer(50, e -> {
            if (monsterChasing) {               
                if (monsterX < x) {
                    monsterX += MONSTER_SPEED;
                } else if (monsterX > x) {
                    monsterX -= MONSTER_SPEED;
                }
                
                monsterX = Math.max(Border_LeftGame.getWidth(), 
                    Math.min(monsterX, Border_RightGame.getX() - zombie.getWidth()));

                if (Math.abs(monsterX - x) < 30 && Math.abs(monsterY - y) < 50) {
                    loseHp();
                }

                zombie.setLocation(monsterX, monsterY);
            }
        });
        monsterTimer.start();
    }
    private void loseHp() {
        hpCount--;
        updateHpDisplay();

        monsterX = 360;
        monsterY = 610;
        zombie.setLocation(monsterX, monsterY);
        zombie.setVisible(false);
        monsterChasing = false;

        if (monsterDisappearTimer != null) {
            monsterDisappearTimer.stop();
        }

        x = INITIAL_X;
        y = INITIAL_Y;
        GameCharacter.setLocation(x, y);

        if (hpCount <= 0) {
            gameOver();
        } else {
            new customerWarningMessage("Ouch! Monster got you. HP: " + hpCount).setVisible(true);
        }
    }

    private void gameOver() {
        gameTimer.stop();
        monsterTimer.stop();
        new customerWarningMessage("<html>Game Over!<br>You ran out of HP.<html>").setVisible(true);
        Sounds.gameOver();
        gamePanel panel = new gamePanel(playerName);
        panel.setVisible(true);
        panel.setLocationRelativeTo(null);
        dispose();
        
        if (parentStage != null) {
            parentStage.dispose();
        }
        Sounds.BackgroundMusic();
    }

    private void updateHpDisplay() {
        hp.setVisible(hpCount >= 1);
        hp1.setVisible(hpCount >= 2);
        hp2.setVisible(hpCount >= 3);
    }

    private void setCharacterImage() {
       if (characterName.equalsIgnoreCase("Blaze")) {
           GameCharacter.setIcon(new ImageIcon(getClass().getResource("/imageBG/default.gif")));
       } else if (characterName.equalsIgnoreCase("Aqua")) {
           GameCharacter.setIcon(new ImageIcon(getClass().getResource("/Aqua/aqua-idle.gif")));
       }
   }
    
    private void startGameThread() {
            new Thread(() -> {
                while (true) {
                    gameLoopIteration();
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
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
   
    private void gameLoopIteration() {
        if (!onGround) {
            verticalSpeed += GRAVITY;
            y += verticalSpeed;
        }
        
        checkPlatformCollisions();
        checkGemCollisions();     

        if (y + GameCharacter.getHeight() > Game_First_Floor.getY()) {
            y = Game_First_Floor.getY() - GameCharacter.getHeight();
            verticalSpeed = 0;
            onGround = true;
        }
        
        for (javax.swing.JLabel blocker : jumpPreventors) {
            if (GameCharacter.getBounds().intersects(blocker.getBounds())) {
                verticalSpeed = GRAVITY;
            }
        }

        checkDoorCollision();
        
        SwingUtilities.invokeLater(() -> {
            GameCharacter.setLocation(x, y);
        });
    }

private void checkDoorCollision() {
    if (!levelCompleted && GameCharacter.getBounds().intersects(Door.getBounds())) {
        if (keys >= REQUIRED_KEYS) {
            levelCompleted = true;  
            SwingUtilities.invokeLater(() -> {
                Sounds.finish();         
                new customerWarningMessage("<html>Congratulations!<br> You finished the beginner level.<html>").setVisible(true);

                gamePanel panel = new gamePanel(playerName);              
                panel.saveLevelCompletion(2, score, timeElapsed);                
                panel.setVisible(true);
                panel.setLocationRelativeTo(null);

                dispose();  
                gameTimer.stop();
                Sounds.BackgroundMusic();

                if (parentStage != null) {
                    parentStage.dispose();
                }
            });
        }
    }
}

    private boolean canMoveTo(int newX) {
        Rectangle newBounds = new Rectangle(newX, y, GameCharacter.getWidth(), GameCharacter.getHeight());        
       
        for (javax.swing.JLabel wall : walls) {
            if (newBounds.intersects(wall.getBounds())) {
                if (y + GameCharacter.getHeight() > wall.getY() + 5) {
                    return false;
                }
            }
        }
               
        if (newX < Border_LeftGame.getX() + Border_LeftGame.getWidth()) {
            return false;
        }
        if (newX + GameCharacter.getWidth() > Border_RightGame.getX()) {
            return false;
        }
        
        return true;
    }
     private void checkGemCollisions() {
        String[] questions = {
        "<html>It refer to the methods and protocols used to<br> transfer information between different systems or networks.</html>",
        "<html>Is a software architecture that allows for <br>the integration of several IT components</html>",
        "<html>Is another way of thinking about integration<br>architecture as the \"skeleton\" of some computer systems.</html>",
        "<html>It also known as one-to-one integration.</html>",
        "<html>It refers to the layers and protocols <br>involved in enabling communication between distributed<br> software components.</html>",
        "<html>Is an XML-based file that simply informs <br>the client what the web services is doing.</html>",
        "<html>It refers to a network that covers <br>an entire city.</html>",
        "<html>It refers to a network that connects <br>countries or continents.</html>",
        "<html>This are the ways information<br> travels between devices</html>",
        "<html>Is a set of rules that all <br>devices follow when they share information.</html>",
        "<html>Basic hardware interconnecting<br> network nodes.</html>"
    };

    String[] answers = {
        "intersystem Communication", "Integration architecture", "System Integration", "point to point integration",
        "Protocol Stack", "Web Services Description Language", "Metropolitan Area Network", 
        "Wide area network", "Links", "Communication Protocol", "Network Device"
    };

        for (javax.swing.JLabel gemLabel : gems) {
        if (gemLabel.isVisible() && GameCharacter.getBounds().intersects(gemLabel.getBounds())) {
            gemLabel.setVisible(false);
            
            boolean isReappearedGem = gemLabel.getClientProperty("question") != null;

            if (isReappearedGem) {                  
                String storedQuestion = (String) gemLabel.getClientProperty("question");
                String storedAnswer = (String) gemLabel.getClientProperty("answer");
                processQuestion(storedQuestion, storedAnswer, gemLabel, true);
            } else {                  
               
                if (keys < REQUIRED_KEYS) {
                    int index = getUnusedQuestionIndex();
                    if (index != -1) {
                        usedQuestions[index] = true;
                        processQuestion(questions[index], answers[index], gemLabel, false);
                    } else {
                        handleRegularGemCollection(questions, answers, gemLabel);
                    }
                } else {
                    handleRegularGemCollection(questions, answers, gemLabel);
                }
            }
        }
    }
    }
   private void handleRegularGemCollection(String[] questions, String[] answers, javax.swing.JLabel gemLabel) {   
    score += 5;
    updateScoreDisplay();
    Sounds.gemCollect();    
    
    if (keys < REQUIRED_KEYS || random.nextBoolean()) {
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
   
   private int getUnusedQuestionIndex() {
    for (int i = 0; i < usedQuestions.length; i++) {
        if (!usedQuestions[i]) {
            return i;
        }
    }

    usedQuestions = new boolean[11]; 
    for (int i = 0; i < 5; i++) { 
        usedQuestions[i] = false;
    }
    return 0;
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
                    keys++;
                    updateKeyDisplay();
                    new customerWarningMessage("Correct! You earned a key.").setVisible(true);
                    Sounds.gemCollect();
                } else {                      
                    score = Math.max(0, score - 2);
                    updateScoreDisplay();                    
                    Sounds.WrongAnswer();
                    customerWarningMessage warning = new customerWarningMessage("Incorrect! -2 score.");
                    warning.setVisible(true);
                    
                    warning.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosed(java.awt.event.WindowEvent evt) {
                           
                            zombie.setVisible(true);
                            monsterChasing = true;
                            monsterX = 360;
                            monsterY = 610;
                            zombie.setLocation(monsterX, monsterY);                            
                             Sounds.zombieSounds();
                            if (monsterDisappearTimer != null) {
                                monsterDisappearTimer.stop();
                            }
                            monsterDisappearTimer = new javax.swing.Timer(MONSTER_CHASE_DURATION, ee -> {
                                zombie.setVisible(false);
                                monsterChasing = false;
                                monsterDisappearTimer.stop();
                            });
                            monsterDisappearTimer.setRepeats(false);
                            monsterDisappearTimer.start();
                        }
                    });

                    if (!isReappearedGem) {
                        reappearQuestionGemAfterDelay(gemLabel, question, correctAnswer);
                    }
                }
            }
        });
    });
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

            for (javax.swing.JLabel obs : platforms) {
                if (gemBounds.intersects(obs.getBounds())) {
                    overlaps = true;
                    break;
                }
            }

        } while (overlaps);

        gemLabel.setVisible(true);
    }

    private void checkPlatformCollisions() {
        onGround = false;    
        int nextFloorY = -1;  

        for (javax.swing.JLabel platform : platforms) {
            if (isOnPlatform(platform)) {
                if (nextFloorY == -1 || platform.getY() < nextFloorY) {
                    nextFloorY = platform.getY();
                }
            }
        }
        
        if (nextFloorY != -1) {
            if (y + GameCharacter.getHeight() < nextFloorY) {
                verticalSpeed = GRAVITY;
                y += verticalSpeed;
            } else {
                y = nextFloorY - GameCharacter.getHeight();
                verticalSpeed = 0;
                onGround = true;
                isJumping = false;
            }
        }
    }

    private boolean isOnPlatform(javax.swing.JLabel platform) {
        Rectangle characterBounds = new Rectangle(x, y + GameCharacter.getHeight(),GameCharacter.getWidth(), 1);
        return characterBounds.intersects(platform.getBounds());
    }
    
    private void startGameTimer() {
    gameTimer = new javax.swing.Timer(1000, e -> {
        timeElapsed++;
        Timer.setText("" + timeElapsed + "s");
    });
    gameTimer.start();
}
    private void updateScoreDisplay() {
        score_earn.setText("" + score);
    }

    private void updateKeyDisplay() {

        Key_Earn.setText("" + keys + "/" + REQUIRED_KEYS);
    }

    private void GameCharacterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GameCharacterKeyReleased

    }//GEN-LAST:event_GameCharacterKeyReleased

    private void settingsbuttonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_settingsbuttonKeyPressed
  
    }//GEN-LAST:event_settingsbuttonKeyPressed

    private void settingsbuttonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsbuttonMousePressed
        Sounds.clickSounds();
        settings settingsWindow = new settings("GAME SETTINGS", playerName);
        settingsWindow.setVisible(true);  

        gameTimer.stop();

        settingsWindow.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent evt) {
                gameTimer.start(); 
            }
        });
    }//GEN-LAST:event_settingsbuttonMousePressed






    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BorderTopGame;
    private javax.swing.JLabel Border_BottomGame;
    private javax.swing.JLabel Border_LeftGame;
    private javax.swing.JLabel Border_RightGame;
    private javax.swing.JLabel Door;
    private javax.swing.JLabel GameCharacter;
    private javax.swing.JLabel GameEnvirnmentBG;
    private javax.swing.JLabel Game_Fifth_Floor;
    private javax.swing.JLabel Game_First_Floor;
    private javax.swing.JLabel Game_Fourth_Floor;
    private javax.swing.JLabel Game_Second_Floor;
    private javax.swing.JLabel Game_Seventh_Floor;
    private javax.swing.JLabel Game_Sixth_Floor;
    private javax.swing.JLabel Game_Third_Floor;
    private javax.swing.JLabel Key_Earn;
    private javax.swing.JLabel Timer;
    private javax.swing.JLabel characterpreventforjump;
    private javax.swing.JLabel characterpreventforjump1;
    private javax.swing.JLabel characterpreventforjump3;
    private javax.swing.JLabel characterpreventforjump4;
    private javax.swing.JLabel characterpreventforjump5;
    private javax.swing.JLabel characterpreventforjump6;
    private javax.swing.JLabel gem;
    private javax.swing.JLabel gem1;
    private javax.swing.JLabel gem2;
    private javax.swing.JLabel gem3;
    private javax.swing.JLabel gem4;
    private javax.swing.JLabel gem5;
    private javax.swing.JLabel gem6;
    private javax.swing.JLabel gem7;
    private javax.swing.JLabel gem8;
    private javax.swing.JLabel gem9;
    private javax.swing.JLabel hp;
    private javax.swing.JLabel hp1;
    private javax.swing.JLabel hp2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel keyBG;
    private javax.swing.JLabel scoreBG;
    private javax.swing.JLabel score_earn;
    private javax.swing.JLabel settingsbutton;
    private javax.swing.JLabel timerBG;
    private javax.swing.JLabel wall1;
    private javax.swing.JLabel wall2;
    private javax.swing.JLabel wall3;
    private javax.swing.JLabel zombie;
    // End of variables declaration//GEN-END:variables
}
