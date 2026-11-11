package gamelogin;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JProgressBar;

public class SplashScreen extends javax.swing.JFrame {

    pbThread t1;
    public SplashScreen() {
        initComponents();        
        t1 = new pbThread(jProgressBar1);
        t1.start();    
        Sounds.loadingSounds();
    }
public class pbThread extends Thread{
    JProgressBar pbar;
    
    pbThread(JProgressBar pbar){
    this.pbar = pbar;
    }
    
    public void run(){
        int min = 0;
        int max = 75;

        jProgressBar1.setMinimum(min);
        jProgressBar1.setMaximum(max);
        jProgressBar1.setValue(0);
        jProgressBar1.setOpaque(false);
        pbar.setStringPainted(true); 
        
            for( int i= min; i<max; i++){
                jProgressBar1.setValue(i);
                
                try{
                    sleep(100);
                } catch (InterruptedException ex) {
                Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Start lp = new Start();     
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
        ProgressbarBG = new javax.swing.JLabel();
        pleaseWait = new javax.swing.JLabel();
        SplashScreenBG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Splash Screen");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setFocusableWindowState(false);
        setMinimumSize(new java.awt.Dimension(900, 700));
        setName("AnimationFrame"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(900, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                WindowOpen(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 700));
        jPanel1.setLayout(null);

        jProgressBar1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jProgressBar1.setForeground(new java.awt.Color(153, 255, 51));
        jProgressBar1.setBorderPainted(false);
        jProgressBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jProgressBar1.setEnabled(false);
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(70, 644, 760, 25);

        ProgressbarBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wall,blocks,Ground/ProgressBar.png"))); // NOI18N
        ProgressbarBG.setText("jLabel1");
        jPanel1.add(ProgressbarBG);
        ProgressbarBG.setBounds(40, 630, 820, 50);

        pleaseWait.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        pleaseWait.setForeground(new java.awt.Color(255, 255, 255));
        pleaseWait.setText("Please wait.....");
        jPanel1.add(pleaseWait);
        pleaseWait.setBounds(400, 600, 190, 30);

        SplashScreenBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GameBackground/SplashScreen.png"))); // NOI18N
        SplashScreenBG.setText("jLabel2");
        SplashScreenBG.setMinimumSize(new java.awt.Dimension(900, 700));
        SplashScreenBG.setPreferredSize(new java.awt.Dimension(900, 700));
        jPanel1.add(SplashScreenBG);
        SplashScreenBG.setBounds(0, 0, 900, 700);

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
                new SplashScreen().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ProgressbarBG;
    private javax.swing.JLabel SplashScreenBG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel pleaseWait;
    // End of variables declaration//GEN-END:variables
}
