package gamelogin;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class level1 extends javax.swing.JFrame {
    
    private int x = 20; 
    private int y = 630; 
    private final int speed = 5;
    private final int jumpStrength = -13;
    private final int gravity = 1;
    private int verticalSpeed = 0; 
    private boolean onGround = false; 
    private boolean isJumping = false;
    private int score = 0;
    private final int requiredScore = 7;
    private boolean levelCompleted = false;  
    private boolean doorMessageShown = false;
       
    public level1() {
        Sounds.stopBackgroundMusic();
        initComponents();
        setLocationRelativeTo(null);        
       
        y = startingGround.getY() - GameCharacter.getHeight();
        onGround = true;
        GameCharacter.setLocation(x, y);
        
        jPanel1.setFocusable(true);
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        new Thread(() -> gameLoop()).start();
    }

    level1(String gameName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        leftGameBorder = new javax.swing.JLabel();
        rightGameBorder = new javax.swing.JLabel();
        topGameBorder = new javax.swing.JLabel();
        startingGround = new javax.swing.JLabel();
        seventhLandingGround = new javax.swing.JLabel();
        gem = new javax.swing.JLabel();
        sixithLandingGround = new javax.swing.JLabel();
        gem1 = new javax.swing.JLabel();
        secondLandingGround = new javax.swing.JLabel();
        fourthLandingGround = new javax.swing.JLabel();
        Door = new javax.swing.JLabel();
        wall1 = new javax.swing.JLabel();
        firstLandingGround = new javax.swing.JLabel();
        thirdLandingGround = new javax.swing.JLabel();
        fiffthLandingGround = new javax.swing.JLabel();
        gem2 = new javax.swing.JLabel();
        gem3 = new javax.swing.JLabel();
        gem4 = new javax.swing.JLabel();
        wall2 = new javax.swing.JLabel();
        wall3 = new javax.swing.JLabel();
        GameCharacter = new javax.swing.JLabel();
        bottomGameBorder = new javax.swing.JLabel();
        gem5 = new javax.swing.JLabel();
        gem6 = new javax.swing.JLabel();
        gem7 = new javax.swing.JLabel();
        gem8 = new javax.swing.JLabel();
        gem9 = new javax.swing.JLabel();
        Stage1_BeginnerLevelBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Level 1");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 700));
        jPanel1.setLayout(null);

        leftGameBorder.setBackground(new java.awt.Color(51, 51, 51));
        leftGameBorder.setOpaque(true);
        jPanel1.add(leftGameBorder);
        leftGameBorder.setBounds(0, 0, 20, 700);

        rightGameBorder.setBackground(new java.awt.Color(51, 51, 51));
        rightGameBorder.setOpaque(true);
        jPanel1.add(rightGameBorder);
        rightGameBorder.setBounds(880, 0, 20, 700);

        topGameBorder.setBackground(new java.awt.Color(51, 51, 51));
        topGameBorder.setOpaque(true);
        jPanel1.add(topGameBorder);
        topGameBorder.setBounds(0, 0, 900, 20);

        startingGround.setBackground(new java.awt.Color(102, 102, 102));
        startingGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/startingFloor.png"))); // NOI18N
        startingGround.setOpaque(true);
        jPanel1.add(startingGround);
        startingGround.setBounds(10, 660, 900, 20);

        seventhLandingGround.setBackground(new java.awt.Color(51, 51, 51));
        seventhLandingGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/floorbg.png"))); // NOI18N
        seventhLandingGround.setOpaque(true);
        jPanel1.add(seventhLandingGround);
        seventhLandingGround.setBounds(80, 100, 800, 20);

        gem.setBackground(new java.awt.Color(255, 255, 0));
        gem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/Diamond_29.png"))); // NOI18N
        gem.setText("gem");
        gem.setOpaque(true);
        jPanel1.add(gem);
        gem.setBounds(660, 360, 30, 30);

        sixithLandingGround.setBackground(new java.awt.Color(51, 51, 51));
        sixithLandingGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/floorbg.png"))); // NOI18N
        sixithLandingGround.setOpaque(true);
        jPanel1.add(sixithLandingGround);
        sixithLandingGround.setBounds(20, 180, 800, 20);

        gem1.setBackground(new java.awt.Color(255, 255, 0));
        gem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/Diamond_29.png"))); // NOI18N
        gem1.setText("gem");
        gem1.setOpaque(true);
        jPanel1.add(gem1);
        gem1.setBounds(150, 520, 30, 30);

        secondLandingGround.setBackground(new java.awt.Color(51, 51, 51));
        secondLandingGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/floorbg.png"))); // NOI18N
        secondLandingGround.setOpaque(true);
        jPanel1.add(secondLandingGround);
        secondLandingGround.setBounds(20, 500, 800, 20);

        fourthLandingGround.setBackground(new java.awt.Color(51, 51, 51));
        fourthLandingGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/floorbg.png"))); // NOI18N
        fourthLandingGround.setOpaque(true);
        jPanel1.add(fourthLandingGround);
        fourthLandingGround.setBounds(80, 340, 800, 20);

        Door.setBackground(new java.awt.Color(153, 255, 51));
        Door.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/door.png"))); // NOI18N
        Door.setText("door");
        Door.setOpaque(true);
        jPanel1.add(Door);
        Door.setBounds(830, 30, 48, 70);

        wall1.setBackground(new java.awt.Color(102, 0, 0));
        wall1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/blocks.png"))); // NOI18N
        wall1.setText("wall");
        wall1.setOpaque(true);
        jPanel1.add(wall1);
        wall1.setBounds(260, 610, 100, 50);

        firstLandingGround.setBackground(new java.awt.Color(51, 51, 51));
        firstLandingGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/Floor (1).png"))); // NOI18N
        firstLandingGround.setOpaque(true);
        jPanel1.add(firstLandingGround);
        firstLandingGround.setBounds(820, 580, 60, 20);

        thirdLandingGround.setBackground(new java.awt.Color(51, 51, 51));
        thirdLandingGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/Floor (1).png"))); // NOI18N
        thirdLandingGround.setOpaque(true);
        jPanel1.add(thirdLandingGround);
        thirdLandingGround.setBounds(20, 420, 60, 20);

        fiffthLandingGround.setBackground(new java.awt.Color(51, 51, 51));
        fiffthLandingGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/Floor (1).png"))); // NOI18N
        fiffthLandingGround.setOpaque(true);
        jPanel1.add(fiffthLandingGround);
        fiffthLandingGround.setBounds(820, 260, 60, 20);

        gem2.setBackground(new java.awt.Color(255, 255, 0));
        gem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/Diamond_29.png"))); // NOI18N
        gem2.setText("gem");
        gem2.setOpaque(true);
        jPanel1.add(gem2);
        gem2.setBounds(840, 290, 30, 30);

        gem3.setBackground(new java.awt.Color(255, 255, 0));
        gem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/Diamond_29.png"))); // NOI18N
        gem3.setText("gem");
        gem3.setOpaque(true);
        jPanel1.add(gem3);
        gem3.setBounds(840, 620, 30, 30);

        gem4.setBackground(new java.awt.Color(255, 255, 0));
        gem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/Diamond_29.png"))); // NOI18N
        gem4.setText("gem");
        gem4.setOpaque(true);
        jPanel1.add(gem4);
        gem4.setBounds(20, 460, 30, 30);

        wall2.setBackground(new java.awt.Color(102, 0, 0));
        wall2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/blocks.png"))); // NOI18N
        wall2.setText("wall");
        wall2.setOpaque(true);
        jPanel1.add(wall2);
        wall2.setBounds(450, 450, 100, 50);

        wall3.setBackground(new java.awt.Color(102, 0, 0));
        wall3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/blocks.png"))); // NOI18N
        wall3.setText("wall");
        wall3.setOpaque(true);
        jPanel1.add(wall3);
        wall3.setBounds(370, 290, 100, 50);

        GameCharacter.setBackground(new java.awt.Color(153, 255, 204));
        GameCharacter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/default.gif"))); // NOI18N
        GameCharacter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                GameCharacterKeyReleased(evt);
            }
        });
        jPanel1.add(GameCharacter);
        GameCharacter.setBounds(20, 610, 40, 50);

        bottomGameBorder.setBackground(new java.awt.Color(51, 51, 51));
        bottomGameBorder.setOpaque(true);
        jPanel1.add(bottomGameBorder);
        bottomGameBorder.setBounds(0, 680, 900, 20);

        gem5.setBackground(new java.awt.Color(255, 255, 0));
        gem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/Diamond_29.png"))); // NOI18N
        gem5.setText("gem");
        gem5.setOpaque(true);
        jPanel1.add(gem5);
        gem5.setBounds(850, 360, 30, 30);

        gem6.setBackground(new java.awt.Color(255, 255, 0));
        gem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/Diamond_29.png"))); // NOI18N
        gem6.setText("gem");
        gem6.setOpaque(true);
        jPanel1.add(gem6);
        gem6.setBounds(270, 200, 30, 30);

        gem7.setBackground(new java.awt.Color(255, 255, 0));
        gem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/Diamond_29.png"))); // NOI18N
        gem7.setText("gem");
        gem7.setOpaque(true);
        jPanel1.add(gem7);
        gem7.setBounds(20, 200, 30, 30);

        gem8.setBackground(new java.awt.Color(255, 255, 0));
        gem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/Diamond_29.png"))); // NOI18N
        gem8.setText("gem");
        gem8.setOpaque(true);
        jPanel1.add(gem8);
        gem8.setBounds(450, 520, 30, 30);

        gem9.setBackground(new java.awt.Color(255, 255, 0));
        gem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/Diamond_29.png"))); // NOI18N
        gem9.setText("gem");
        gem9.setOpaque(true);
        jPanel1.add(gem9);
        gem9.setBounds(230, 360, 30, 30);

        Stage1_BeginnerLevelBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GameBackground/gameEnvironment.png"))); // NOI18N
        Stage1_BeginnerLevelBG.setText("jLabel1");
        jPanel1.add(Stage1_BeginnerLevelBG);
        Stage1_BeginnerLevelBG.setBounds(0, 0, 900, 700);

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
    int newX = x;
    
    if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
        newX = x - speed;
        GameCharacter.setIcon(new ImageIcon(getClass().getResource("/imageBG/BlazeWalkLeft.gif"))); 
        Sounds.walkSounds();
    }
    if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
        newX = x + speed;
         GameCharacter.setIcon(new ImageIcon(getClass().getResource("/imageBG/BlazeWalkRight.gif"))); 
       
        Sounds.walkSounds();
    }
    if (evt.getKeyCode() == KeyEvent.VK_SPACE && onGround) {
        verticalSpeed = jumpStrength;
        onGround = false;
        isJumping = true;
        GameCharacter.setIcon(new ImageIcon(getClass().getResource("/imageBG/BlazeJumpRight.gif")));
        Sounds.JumpSounds();
    }
    
   
    Rectangle newBounds = new Rectangle(newX, y, GameCharacter.getWidth(), GameCharacter.getHeight());
    boolean canMove = true;
    
    for (javax.swing.JLabel wall : new javax.swing.JLabel[]{wall1, wall2, wall3}) {
        if (newBounds.intersects(wall.getBounds())) {
          
            if (y + GameCharacter.getHeight() > wall.getY() + 5) {
                canMove = false;
                break;
            }
        }
    }
    

    if (newX < leftGameBorder.getX() + leftGameBorder.getWidth()) {
        newX = leftGameBorder.getX() + leftGameBorder.getWidth();
    }
    if (newX + GameCharacter.getWidth() > rightGameBorder.getX()) {
        newX = rightGameBorder.getX() - GameCharacter.getWidth();
    }
    
    if (canMove) {
        x = newX;
    }
    }//GEN-LAST:event_formKeyPressed

    private void GameCharacterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GameCharacterKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_GameCharacterKeyReleased
private void gameLoop() {
    while (true) {
        if (!onGround) {
            verticalSpeed+= gravity;
            y += verticalSpeed;
        }
        checkPlatformCollisions();
        checkGemCollisions();     

        if (y + GameCharacter.getHeight() > startingGround.getY()) {
            y = startingGround.getY() - GameCharacter.getHeight();
            verticalSpeed = 0;
            onGround = true;
        }
       
       if (!levelCompleted && GameCharacter.getBounds().intersects(Door.getBounds()) && score >= requiredScore) {
        levelCompleted = true;  
        Sounds.finish();
        javax.swing.JOptionPane.showMessageDialog(this, "Congratulations! You finished the level.");
        String gameName = "PlayerName";
        gamePanel gameMenu = new gamePanel(gameName); 
        gameMenu.setVisible(true);
        gameMenu.setLocationRelativeTo(null);
        dispose();  
        Sounds.BackgroundMusic();

} else if (!levelCompleted && GameCharacter.getBounds().intersects(Door.getBounds()) && score < requiredScore && !doorMessageShown) {
    doorMessageShown = true; 
    javax.swing.JOptionPane.showMessageDialog(this, "You need to gain at least " + requiredScore + " score.");
} else if (!GameCharacter.getBounds().intersects(Door.getBounds())) {
    doorMessageShown = false;
}

        GameCharacter.setLocation(x, y);

        try {
            Thread.sleep(20); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


private void checkGemCollisions() {
    javax.swing.JLabel[] gems = {gem, gem1, gem2, gem3, gem4, gem5, gem6, gem7, gem8, gem9};

    String[] questions = {
        "It is an OOP technique used to hide data from direct access.",
        "This process enables one class to acquire public methods and variables of another.",
        "It refers to the idea of 'having many forms'.",
        "This is the process of representing essential features without including implementation details.",
        "He is known as the father of the Java programming language.",
        "It is a special kind of method that is invoked to construct objects.",
        "A text-based user interface (UI) used to manage computer files.",
        "GUI components that are used as containers for other GUI components.",
        "Information about returned data, database, and driver.",
        "Loads database drivers and manages connections between application and driver.",
        "Which keyword is used to inherit a class?"
    };

    String[] answers = {
        "Encapsulation", "Inheritance", "Polymorphism", "Abstraction",
        "James Gosling", "Constructor", "Command Line Interface", 
        "Container classes", "Metadata", "Driver Manager", "extends"
    };

    for (javax.swing.JLabel gemLabel : gems) {
        if (gemLabel.isVisible() && GameCharacter.getBounds().intersects(gemLabel.getBounds())) {
            
            int randomIndex = (int) (Math.random() * questions.length);
            String question = questions[randomIndex];
            String correctAnswer = answers[randomIndex];

         
            String userAnswer = javax.swing.JOptionPane.showInputDialog(this, question);

            if (userAnswer != null && userAnswer.trim().equalsIgnoreCase(correctAnswer)) {
                score++;
                javax.swing.JOptionPane.showMessageDialog(this, "Correct! You gain 1 score.");
                   Sounds.gemCollect();
            } else if(userAnswer == null ){
                
            }
            else {
                javax.swing.JOptionPane.showMessageDialog(this,
                    "Incorrect! The correct answer was: " + correctAnswer + ". You gain 0 score.");
            }

            gemLabel.setVisible(false);
            reappearGem(gemLabel);
        }
    }
}


private void reappearGem(javax.swing.JLabel gemLabel) {
    new java.util.Timer().schedule(new java.util.TimerTask() {
        @Override
        public void run() {
            gemLabel.setVisible(true);
        }
    }, 30000);
}



private void checkPlatformCollisions() {
    onGround = false;    
    int nextFloorY = -1;  

    
    for (javax.swing.JLabel platform : new javax.swing.JLabel[]{
        startingGround, firstLandingGround, thirdLandingGround, fiffthLandingGround,
        secondLandingGround, fourthLandingGround, sixithLandingGround, seventhLandingGround,
        wall1, wall2, wall3  
    }) {
        if (isOnPlatform(platform)) {
           
            if (nextFloorY == -1 || platform.getY() < nextFloorY) {
                nextFloorY = platform.getY();
            }
        }
    }
    
   
    if (nextFloorY != -1) {
        
        if (y + GameCharacter.getHeight() < nextFloorY) {
            verticalSpeed = gravity;
            y += verticalSpeed;
        } else {
            y = nextFloorY - GameCharacter.getHeight();
            verticalSpeed= 0;
            onGround = true;
            isJumping = false;
        }
    }
}

private boolean isOnPlatform(javax.swing.JLabel platform) {
    Rectangle characterBounds = new Rectangle(x, y + GameCharacter.getHeight(), 
                                             GameCharacter.getWidth(), 1);
    return characterBounds.intersects(platform.getBounds());
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Door;
    private javax.swing.JLabel GameCharacter;
    private javax.swing.JLabel Stage1_BeginnerLevelBG;
    private javax.swing.JLabel bottomGameBorder;
    private javax.swing.JLabel fiffthLandingGround;
    private javax.swing.JLabel firstLandingGround;
    private javax.swing.JLabel fourthLandingGround;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel leftGameBorder;
    private javax.swing.JLabel rightGameBorder;
    private javax.swing.JLabel secondLandingGround;
    private javax.swing.JLabel seventhLandingGround;
    private javax.swing.JLabel sixithLandingGround;
    private javax.swing.JLabel startingGround;
    private javax.swing.JLabel thirdLandingGround;
    private javax.swing.JLabel topGameBorder;
    private javax.swing.JLabel wall1;
    private javax.swing.JLabel wall2;
    private javax.swing.JLabel wall3;
    // End of variables declaration//GEN-END:variables
}
