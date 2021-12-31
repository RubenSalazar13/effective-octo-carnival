package SkeletonRun;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SkeletonRun extends JPanel implements ActionListener
{
    // declare and initialize variables
    private Timer animator;
    private ImageIcon imageArray[];
    private int delay = 50, totalFrames = 8, currentFrame = 0;

    
    // Method to load images into the array
    public SkeletonRun()
    {
        imageArray = new ImageIcon[totalFrames];
        for(int i = 0; i < imageArray.length; i++)
        {
            imageArray[i] = new ImageIcon(getClass().getResource("/image/pic" + (i + 1) + ".gif"));
        }
        animator = new Timer(delay, this);
        animator.start();
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if(currentFrame >= imageArray.length) // Reset to first frame if it's the last frame
        {
            currentFrame = 0;
        }
        currentFrame++;
        imageArray[currentFrame].paintIcon(this,g,0,0);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        repaint();
    }
    
}