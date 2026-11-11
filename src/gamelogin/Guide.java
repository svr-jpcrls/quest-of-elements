package gamelogin;

import java.awt.Color;

public class Guide extends javax.swing.JFrame {

    /**
     * Creates new form Guide
     */
    public Guide() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nextButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        GameMechanicsBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Game Mechanics");

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 700));
        jPanel1.setLayout(null);

        nextButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nextButton.setForeground(new java.awt.Color(153, 153, 153));
        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ButtonBackground/next .png"))); // NOI18N
        nextButton.setBorder(null);
        nextButton.setBorderPainted(false);
        nextButton.setContentAreaFilled(false);
        nextButton.setFocusable(false);
        nextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nextButtonMouseExited(evt);
            }
        });
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });
        jPanel1.add(nextButton);
        nextButton.setBounds(740, 645, 50, 50);

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
        backButton.setBounds(80, 645, 50, 50);

        GameMechanicsBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GameBackground/Guide_GameMechanics.png"))); // NOI18N
        jPanel1.add(GameMechanicsBG);
        GameMechanicsBG.setBounds(0, 0, 900, 700);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseEntered
        nextButton.setForeground(Color.white);
    }//GEN-LAST:event_nextButtonMouseEntered

    private void nextButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextButtonMouseExited
        nextButton.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_nextButtonMouseExited

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        Sounds.clickSounds();
        guideBeginner gb = new guideBeginner();
        gb.setVisible(true);
        gb.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_nextButtonActionPerformed

    private void backButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonMouseEntered

    private void backButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonMouseExited

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Sounds.clickSounds();
        String gameName = null;
        gamePanel lp = new gamePanel(gameName);
        lp.setVisible(true);
        lp.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Guide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guide.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guide().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GameMechanicsBG;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nextButton;
    // End of variables declaration//GEN-END:variables
}
