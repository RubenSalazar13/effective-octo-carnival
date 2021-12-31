package SkeletonRun;

import static SkeletonRun.sound.PlaySound;
import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.URL;
import javax.swing.JFrame;

public class Main 
{
    public static void main(String[] args) throws Throwable
    {
        
        JFrame f = new JFrame("Skeleton Run");
        SkeletonRun wr = new SkeletonRun();
        f.add(wr);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 610);

        URL url = Main.class.getResource("/sound/bluish.wav");
		AudioClip clip = Applet.newAudioClip(url);
		clip.play();
		Thread.sleep(1000);
    }
    
}
