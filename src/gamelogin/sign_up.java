package gamelogin;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sign_up extends javax.swing.JFrame {
    public sign_up() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        SignUp_Button = new javax.swing.JButton();
        gameName = new javax.swing.JTextField();
        reEnter_passwordField = new javax.swing.JPasswordField();
        SignUpBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 700));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 700));
        jPanel1.setLayout(null);

        username.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username);
        username.setBounds(210, 340, 480, 35);

        password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(password);
        password.setBounds(210, 420, 480, 35);

        SignUp_Button.setFont(new java.awt.Font("Tempus Sans ITC", 1, 26)); // NOI18N
        SignUp_Button.setForeground(new java.awt.Color(153, 153, 153));
        SignUp_Button.setText("SIGN UP");
        SignUp_Button.setBorder(null);
        SignUp_Button.setBorderPainted(false);
        SignUp_Button.setContentAreaFilled(false);
        SignUp_Button.setFocusable(false);
        SignUp_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignUp_ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignUp_ButtonMouseExited(evt);
            }
        });
        SignUp_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUp_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(SignUp_Button);
        SignUp_Button.setBounds(385, 550, 130, 65);

        gameName.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        gameName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        gameName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameNameActionPerformed(evt);
            }
        });
        jPanel1.add(gameName);
        gameName.setBounds(210, 260, 480, 35);

        reEnter_passwordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(reEnter_passwordField);
        reEnter_passwordField.setBounds(210, 500, 480, 35);

        SignUpBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GameBackground/SignUpBg.png"))); // NOI18N
        jPanel1.add(SignUpBG);
        SignUpBG.setBounds(0, 0, 900, 700);

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

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        
    }//GEN-LAST:event_usernameActionPerformed

    private void gameNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameNameActionPerformed
       
    }//GEN-LAST:event_gameNameActionPerformed

    private void SignUp_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUp_ButtonActionPerformed
       Sounds.clickSounds();
    String gname = gameName.getText();
    String uname = username.getText();       
    String pass = password.getText();
    String reEnterpass = reEnter_passwordField.getText();

    if (uname.isEmpty() || pass.isEmpty() || gname.isEmpty() || reEnterpass.isEmpty()) {
        new customerWarningMessage("All fields must be filled!").setVisible(true);
        return;
    }

    if (!pass.equals(reEnterpass)) {
        new customerWarningMessage("Passwords do not match!").setVisible(true);
        return;
    }

    try (Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/GameDb", "game", "game")) {
        // Check if gamename exists
        String checkSql = "SELECT * FROM PLAYERTABLES WHERE GAME_NAME = ?";
        try (PreparedStatement checkStmt = con.prepareStatement(checkSql)) {
            checkStmt.setString(1, gname);
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next()) {
                new customerWarningMessage("Gamename already taken!").setVisible(true);
                return;
            }
        }
           String checkUsername = "SELECT * FROM PLAYERTABLES WHERE USERNAME = ?";
        try (PreparedStatement checkStmt = con.prepareStatement(checkUsername)) {
            checkStmt.setString(1, uname);
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next()) {
                new customerWarningMessage("Username already taken!").setVisible(true);
                return;
            }
        }

        // Insert new player
        String insertSql = "INSERT INTO PLAYERTABLES (GAME_NAME, USERNAME, PASSWORD) VALUES (?, ?, ?)";
        try (PreparedStatement insertStmt = con.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS)) {
            insertStmt.setString(1, gname);
            insertStmt.setString(2, uname);
            insertStmt.setString(3, pass); 
            insertStmt.executeUpdate();
            
            // Get the generated player ID
            try (ResultSet generatedKeys = insertStmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    int playerId = generatedKeys.getInt(1);
                    // Initialize level completion records (all levels locked except beginner)
                    String initLevelsSql = "INSERT INTO LEVEL_COMPLETION (PLAYER_ID, LEVEL_NUMBER, SCORE, TIME_ELAPSED) VALUES (?, 0, 0, 0)";
                    try (PreparedStatement initStmt = con.prepareStatement(initLevelsSql)) {
                        initStmt.setInt(1, playerId);
                        initStmt.executeUpdate();
                    }
                }
            }
        }
     
        new customerWarningMessage("Sign Up Successful!").setVisible(true);
        this.dispose();
    } catch (SQLException ex) {
        System.out.println("Connection Failed!");
        ex.printStackTrace();
    }
    }//GEN-LAST:event_SignUp_ButtonActionPerformed

    private void SignUp_ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUp_ButtonMouseEntered
        SignUp_Button.setForeground(Color.white);
    }//GEN-LAST:event_SignUp_ButtonMouseEntered

    private void SignUp_ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUp_ButtonMouseExited
        SignUp_Button.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_SignUp_ButtonMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SignUpBG;
    private javax.swing.JButton SignUp_Button;
    private javax.swing.JTextField gameName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField reEnter_passwordField;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
