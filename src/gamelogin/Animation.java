package gamelogin;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

public class Animation extends javax.swing.JFrame {

    pbThread t1;
    public Animation() {
        initComponents();        
        t1 = new pbThread(jProgressBar1);
        t1.start();        
    }
public class pbThread extends Thread{
    JProgressBar pbar;
    
    pbThread(JProgressBar pbar){
    this.pbar = pbar;
    }
    
    public void run(){
        int min = 0;
        int max = 50;

        jProgressBar1.setMinimum(min);
        jProgressBar1.setMaximum(max);
        jProgressBar1.setValue(0);
        pbar.setStringPainted(true); 
        
            for( int i= min; i<max; i++){
                jProgressBar1.setValue(i);
                
                try{
                    sleep(100);
                } catch (InterruptedException ex) {
                Logger.getLogger(Animation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        LandingPage lp = new LandingPage();     
        lp.setVisible(true);
        lp.setLocationRelativeTo(null);
        dispose();         
    }
    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        pleaseWait = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Animation");
        setBackground(new java.awt.Color(51, 255, 0));
        setPreferredSize(new java.awt.Dimension(900, 700));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                WindowOpen(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 700));
        jPanel1.setLayout(null);

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(153, 255, 51));
        jProgressBar1.setBorderPainted(false);
        jProgressBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jProgressBar1.setEnabled(false);
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(0, 630, 900, 40);

        pleaseWait.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        pleaseWait.setForeground(new java.awt.Color(255, 255, 255));
        pleaseWait.setText("Please wait.....");
        jPanel1.add(pleaseWait);
        pleaseWait.setBounds(380, 590, 190, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imageBG/SplashScreen.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 938, 700);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void WindowOpen(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_WindowOpen
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_WindowOpen

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Animation().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel pleaseWait;
    // End of variables declaration//GEN-END:variables
}
