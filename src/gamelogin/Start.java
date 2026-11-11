package gamelogin;

import java.awt.Color;

public class Start extends javax.swing.JFrame {

    /**
     * Creates new form Start
     */
    public Start() {
        initComponents();
         Sounds.BackgroundMusic();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Start_Button = new javax.swing.JButton();
        LandingPageBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Landing Page");

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 100));
        jPanel1.setLayout(null);

        Start_Button.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        Start_Button.setForeground(new java.awt.Color(153, 153, 153));
        Start_Button.setText("START");
        Start_Button.setBorder(null);
        Start_Button.setBorderPainted(false);
        Start_Button.setContentAreaFilled(false);
        Start_Button.setFocusable(false);
        Start_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Start_ButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Start_ButtonMouseExited(evt);
            }
        });
        Start_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start_ButtonActionPerformed(evt);
            }
        });
        jPanel1.add(Start_Button);
        Start_Button.setBounds(360, 570, 170, 90);

        LandingPageBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GameBackground/bading.png"))); // NOI18N
        jPanel1.add(LandingPageBG);
        LandingPageBG.setBounds(0, 0, 900, 700);

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

    private void Start_ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start_ButtonMouseEntered
        Start_Button.setForeground(Color.white);
    }//GEN-LAST:event_Start_ButtonMouseEntered

    private void Start_ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Start_ButtonMouseExited
        Start_Button.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_Start_ButtonMouseExited

    private void Start_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start_ButtonActionPerformed

        Sounds.clickSounds();
        loginPage lp = new loginPage();
        lp.setVisible(true);
        lp.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_Start_ButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LandingPageBG;
    private javax.swing.JButton Start_Button;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
