package gamelogin;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sounds {

   
    private static Clip bgsounds;

    public static void BackgroundMusic() {
        try {
            if (bgsounds == null || !bgsounds.isRunning()) { 
                File sound = new File("src/GameMusic/bgSounds.wav");
                bgsounds = AudioSystem.getClip();
                bgsounds.open(AudioSystem.getAudioInputStream(sound));
                bgsounds.loop(Clip.LOOP_CONTINUOUSLY);
                bgsounds.start();
            }
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }

    public static void stopBackgroundMusic() {
        if (bgsounds != null && bgsounds.isRunning()) {
            bgsounds.stop();
            bgsounds.close();
            bgsounds = null; // Reset so it can be started again later if needed
        }
    }
    public static void clickSounds() {
        try {
            File sound = new File("src/GameMusic/click.wav");
            Clip c = AudioSystem.getClip();
            c.open(AudioSystem.getAudioInputStream(sound));
            c.start();
            c.loop(0);
        } catch (Exception e) {
            e.printStackTrace(); // For debugging
        }
    }
     
     
      public static void walkSounds() {
        try {
            File sound = new File("src/GameMusic/walk.wav");

            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(sound));
            clip.start();
             clip.loop(0);
        } catch (Exception e) {
            e.printStackTrace(); // For debugging
        }
    }
      public static void JumpSounds() {
        try {
            File sound = new File("src/GameMusic/jump.wav");

            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(sound));
            clip.start();
             clip.loop(0);
        } catch (Exception e) {
            e.printStackTrace(); // For debugging
        }
      }
       public static void finish() {
        try {
            File sound = new File("src/GameMusic/Finish.wav");

            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(sound));
            clip.start();
             clip.loop(0);
        } catch (Exception e) {
            e.printStackTrace(); // For debugging
        }
        
        
    }
        public static void gemCollect() {
        try {
            File sound = new File("src/GameMusic/getGem.wav");

            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(sound));
            clip.start();
            clip.loop(0);
        } catch (Exception e) {
            e.printStackTrace(); // For debugging
        }
    }
        public static void loadingSounds() {
        try {
            File sound = new File("src/GameMusic/loadingBar.wav");

            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(sound));
            clip.start();
            clip.loop(0);
        } catch (Exception e) {
            e.printStackTrace(); // For debugging
        }
    }
      public static void gameOver() {
        try {
            File sound = new File("src/GameMusic/gameOverSounds.wav");

            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(sound));
            clip.start();
            clip.loop(0);
        } catch (Exception e) {
            e.printStackTrace(); // For debugging
        }
    }
        public static void zombieSounds() {
        try {
            File sound = new File("src/GameMusic/zombieSounds.wav");

            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(sound));
            clip.start();
            clip.loop(0);
        } catch (Exception e) {
            e.printStackTrace(); // For debugging
        }
    }
        public static void WrongAnswer() {
        try {
            File sound = new File("src/GameMusic/WrongAnswerSounds.wav");

            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(sound));
            clip.start();
            clip.loop(0);
        } catch (Exception e) {
            e.printStackTrace(); // For debugging
        }
    }
}
