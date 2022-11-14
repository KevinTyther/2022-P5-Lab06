// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet
{

    public void paint(Graphics g)
    {
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);



        // Draw Random Lines
        Random rand = new Random();
        int linex = rand.nextInt(150)+20;
        int linex2 = rand.nextInt(390)+10;
        int liney = rand.nextInt(100)+20;
        int liney2 = rand.nextInt(290)+10;
        int R = rand.nextInt(255);
        int G = rand.nextInt(255);
        int B = rand.nextInt(255);

        for (int k = 0; k < 100; k++)
        {
            g.setColor(new Color(R,G,B));
            g.drawLine(linex, liney, linex2, liney2);
            linex = rand.nextInt(150)+20;
            linex2 = rand.nextInt(390)+10;
            liney = rand.nextInt(100)+20;
            liney2 = rand.nextInt(290)+10;
            R = rand.nextInt(255);
            G = rand.nextInt(255);
            B = rand.nextInt(255);
        }


        // Draw Random Squares

        int sqrx = rand.nextInt(250)+450;
        int sqry = rand.nextInt(150)+50;
        int sqrH = rand.nextInt(50)+10;
        int sqrW = rand.nextInt(50)+10;
        for (int k = 0; k < 100; k++)
        {
            g.setColor(new Color(R,G,B));
            g.fillRect(sqrx,sqry,sqrW, sqrH);
            sqrx = rand.nextInt(250)+450;
            sqry = rand.nextInt(150)+50;
            sqrH = rand.nextInt(50)+10;
            sqrW = rand.nextInt(50)+10;
            R = rand.nextInt(255);
            G = rand.nextInt(255);
            B = rand.nextInt(255);
        }



        // Draw Random Circles





        // Draw 3-D Box





    }

}



    
 