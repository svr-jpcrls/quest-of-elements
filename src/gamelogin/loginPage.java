
package gamelogin;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class loginPage extends javax.swing.JFrame {

    public loginPage() {
        initComponents();        
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        SignUp_Button = new javax.swing.JButton();
        ForgotPassword_Button = new javax.swing.JButton();
        LoginBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In ");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(900, 700));
        setMinimumSize(new java.awt.Dimension(900, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(900, 700));

        jPanel1.setMaximumSize(new java.awt.Dimension(900, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 700));
        jPanel1.setLayout(null);

        username.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        username.setBorder(null);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username);
        username.setBounds(200, 260, 500, 35);

        password.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        password.setBorder(null);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(200, 380, 500, 35);

        LoginButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 28)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(153, 153, 153));
        LoginButton.setText("LOG IN");
        LoginButton.setBorder(null);
        LoginButton.setContentAreaFilled(false);
        LoginButton.setFocusable(false);
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginButtonMouseExited(evt);
            }
        });
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LoginButton);
        LoginButton.setBounds(255, 499, 130, 65);

        SignUp_Button.setFont(new java.awt.Font("Tempus Sans ITC", 1, 28)); // NOI18N
        SignUp_Button.setForeground(new java.awt.Color(153, 153, 153));
        SignUp_Button.setText("SIGN UP");
        SignUp_Button.setBorder(null);
        SignUp_Button.setContentAreaFilled(false);
        SignUp_Button.setDefaultCapable(false);
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
        SignUp_Button.setBounds(541, 499, 120, 65);

        ForgotPassword_Button.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ForgotPassword_Button.setForeground(new java.awt.Color(153, 153, 153));
        ForgotPassword_Button.setText("FORGOT PASSWORD");
        ForgotPassword_Button.setBorder(null);
        ForgotPassword_Button.setBorderPainted(false);
        ForgotPassword_Button.setContentAreaFilled(false);
        ForgotPassword_Button.setFocusable(false);
        ForgotPassword_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ForgotPassword_ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ForgotPassword_ButtonMouseExited(evt);
            }
        });
        ForgotPassword_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ForgotPassword_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ForgotPassword_Button);
        ForgotPassword_Button.setBounds(190, 430, 200, 30);

        LoginBG.setBackground(new java.awt.Color(204, 204, 204));
        LoginBG.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        LoginBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GameBackground/LogInBG.png"))); // NOI18N
        jPanel1.add(LoginBG);
        LoginBG.setBounds(0, 0, 900, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void SignUp_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUp_ButtonActionPerformed
        Sounds.clickSounds();
        sign_up sp = new sign_up();
        sp.setVisible(true);
        sp.setLocationRelativeTo(null);
    }//GEN-LAST:event_SignUp_ButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        Sounds.clickSounds();
        String uname = username.getText();
        String pass = new String(password.getPassword());

    try {
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/GameDb", "game", "game");

        String sql = "SELECT * FROM PLAYERTABLES WHERE USERNAME = ? AND PASSWORD = ?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, uname);
        pst.setString(2, pass);

        ResultSet rs = pst.executeQuery();

        if (uname.isEmpty() || pass.isEmpty()) {         
            new customerWarningMessage("Please enter username and password!").setVisible(true);
        }     
        else if (rs.next()) {
            
        String playerName = rs.getString("GAME_NAME");  
        new customerWarningMessage( "WELCOME BACK " + playerName + "!").setVisible(true);
        gamePanel gameMenu = new gamePanel(playerName);
        gameMenu.setVisible(true);
        gameMenu.setLocationRelativeTo(null);
        
        dispose();
        }
        else  {           
            new customerWarningMessage("Invalid username or password!").setVisible(true);
        }

        rs.close();
        pst.close();
        con.close();

    } catch (SQLException ex) {
        System.out.println("Database Connection Failed!");
        ex.printStackTrace();
    }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void LoginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseEntered

       LoginButton.setForeground(Color.white); // Change text color when hovered
    }//GEN-LAST:event_LoginButtonMouseEntered

    private void LoginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseExited
          LoginButton.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_LoginButtonMouseExited

    private void SignUp_ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUp_ButtonMouseEntered
       SignUp_Button.setForeground(Color.white); // Change text color when hovered
    }//GEN-LAST:event_SignUp_ButtonMouseEntered

    private void SignUp_ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUp_ButtonMouseExited
        SignUp_Button.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_SignUp_ButtonMouseExited

    private void ForgotPassword_ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPassword_ButtonMouseEntered
        ForgotPassword_Button.setForeground(Color.white);
    }//GEN-LAST:event_ForgotPassword_ButtonMouseEntered

    private void ForgotPassword_ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPassword_ButtonMouseExited
        ForgotPassword_Button.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_ForgotPassword_ButtonMouseExited

    private void ForgotPassword_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForgotPassword_ButtonActionPerformed
        Sounds.clickSounds();
        ForgotPassword lp = new ForgotPassword();
        lp.setVisible(true);
        lp.setLocationRelativeTo(null);
    }//GEN-LAST:event_ForgotPassword_ButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ForgotPassword_Button;
    private javax.swing.JLabel LoginBG;
    private javax.swing.JButton LoginButton;
    private javax.swing.JButton SignUp_Button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
