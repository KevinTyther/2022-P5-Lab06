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

        int R = rand.nextInt(255);
        int G = rand.nextInt(255);
        int B = rand.nextInt(255);

        for (int k = 0; k < 100; k++)
        {
            int lineX = rand.nextInt(391)+10;
            int lineY = rand.nextInt(291)+10;
            int lineX2 = rand.nextInt(391)+10;
            int lineY2 = rand.nextInt(291)+10;
            R = rand.nextInt(255);
            G = rand.nextInt(255);
            B = rand.nextInt(255);
            g.setColor(new Color(R,G,B));
            g.drawLine(lineX, lineY,lineX2, lineY2);
        }


        // Draw Random Squares


        int sqrx = rand.nextInt(340)+400;
        int sqry = rand.nextInt(240)+10;
        int sqrH = 50;
        int sqrW = 50;
        for (int k = 0; k < 100; k++)
        {
            g.setColor(new Color(R,G,B));
            g.fillRect(sqrx,sqry,sqrW, sqrH);
            sqrx = rand.nextInt(340)+400;
            sqry = rand.nextInt(240)+10;
            R = rand.nextInt(255);
            G = rand.nextInt(255);
            B = rand.nextInt(255);
        }



        // Draw Random Circles

        for (int k = 0; k < 100; k++)
        {
            int diameter = rand.nextInt(200);
            int cirX = rand.nextInt(391-diameter)+10;
            int cirY = rand.nextInt(291-diameter)+300;
            R = rand.nextInt(255);
            G = rand.nextInt(255);
            B = rand.nextInt(255);
            g.setColor(new Color(R,G,B));
            g.drawOval(cirX, cirY, diameter, diameter);

        }



        // Draw 3-D Box

        Polygon poly = new Polygon();
        Polygon poly1 = new Polygon();
        Polygon poly2 = new Polygon();
        Polygon poly3 = new Polygon();
        poly.addPoint(500,400);
        poly.addPoint(550,400);
        poly.addPoint(550,450);
        poly.addPoint(500,450);

        poly1.addPoint(525,425);
        poly1.addPoint(575,425);
        poly1.addPoint(575,475);
        poly1.addPoint(525,475);

        poly2.addPoint(550,425);
        poly2.addPoint(550,450);
        poly2.addPoint(575,450);
        g.setColor(Color.YELLOW);
        g.fillPolygon(poly);
        g.setColor(Color.RED);
        g.fillPolygon(poly1);
        g.setColor(Color.BLUE);
        g.fillPolygon(poly2);


    }

}



    
 