
package gamelogin;

import java.awt.Color;
import java.awt.event.KeyEvent;

public class customQuestionMessage extends javax.swing.JFrame {

   
    public customQuestionMessage(String question) {
           initComponents();
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        questionMessage.setText(question );      
   
        
       
        answerField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    submitButton.doClick();
                }
            }
        });
        
        jPanel1.setComponentZOrder(jLabel1, jPanel1.getComponentCount()-1);
    }

    public String getAnswer() {
        return answerField.getText();
    }
    
    public void addSubmitListener(java.awt.event.ActionListener listener) {
        submitButton.addActionListener(listener);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        submitButton = new javax.swing.JButton();
        answerField = new javax.swing.JTextField();
        questionMessage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        setSize(new java.awt.Dimension(400, 200));

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 200));
        jPanel1.setLayout(null);

        submitButton.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.setBorder(null);
        submitButton.setContentAreaFilled(false);
        submitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                submitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                submitButtonMouseExited(evt);
            }
        });
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(submitButton);
        submitButton.setBounds(150, 143, 100, 35);

        answerField.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        answerField.setForeground(new java.awt.Color(255, 255, 255));
        answerField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        answerField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        answerField.setOpaque(false);
        jPanel1.add(answerField);
        answerField.setBounds(40, 106, 320, 30);

        questionMessage.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        questionMessage.setForeground(new java.awt.Color(255, 255, 255));
        questionMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        questionMessage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        questionMessage.setMaximumSize(new java.awt.Dimension(360, 70));
        questionMessage.setMinimumSize(new java.awt.Dimension(360, 70));
        questionMessage.setPreferredSize(new java.awt.Dimension(360, 70));
        jPanel1.add(questionMessage);
        questionMessage.setBounds(20, 20, 360, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MessageBackground/warning.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 400, 200);

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

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed

    }//GEN-LAST:event_submitButtonActionPerformed

    private void submitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMouseEntered
        submitButton.setForeground(new Color(200, 200, 200));
    }//GEN-LAST:event_submitButtonMouseEntered

    private void submitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitButtonMouseExited
       submitButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_submitButtonMouseExited

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
            java.util.logging.Logger.getLogger(customQuestionMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customQuestionMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customQuestionMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customQuestionMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         java.awt.EventQueue.invokeLater(() -> {
            new customQuestionMessage("Sample question?").setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField answerField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel questionMessage;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
