package AudioEcor;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Audio {
    private static Clip currentClip;

    public static void playMusic(String caminho) {
        try {
            File audio = new File(caminho);
            if (audio.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(audio);
                currentClip = AudioSystem.getClip();
                currentClip.open(audioInput);
                currentClip.start();
            }
        } catch (Exception e) {
            System.out.println();
        }
    }

    public static void stopMusic() {
        try {
            if (currentClip != null && currentClip.isRunning()) {
                currentClip.stop();
                currentClip.close();
            }
        } catch (Exception e) {
            System.out.println();
        }
    }
}
