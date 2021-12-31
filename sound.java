package SkeletonRun;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class sound
{
    public static void main(String[] args)
    {
        File bluish = new File("src/sound/bluish.wav");
        PlaySound(bluish);
    }
    public static void PlaySound(File Sound)
    {
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(Sound));
            clip.start();
            
            Thread.sleep(clip.getMicrosecondLength()/1000);
        }catch(Exception e)
        {
          
        }
    }
}
