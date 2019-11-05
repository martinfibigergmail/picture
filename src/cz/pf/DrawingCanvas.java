package cz.pf;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;

public class DrawingCanvas extends Canvas {
    Image image;
        DrawingCanvas(){
            // Load file with JPG picture and create an image
            try {
                 image = ImageIO.read(new File("c:\\Users\\martas\\Pictures\\david_20171207_193013.jpg"));
            } catch( java.io.IOException e){
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.exit(1);
            }

        }
        // painting method is called when window is being closed
        public void paint(Graphics g){
            super.paint(g);
            // set color to red
            g.setColor(Color.red);
            // fill in ellipse
            g.fillOval(75, 75, 150, 75);

            // set color to green
            g.setColor(Color.green);
            // draw a line from one point to another
            g.drawLine(10,1,30,300);

            // draw photos if picture loaded

                if(image!=null) {
                    // for all rows (this will happen after set size so it will be running 10 times
                    for(int x = 0;x<this.getWidth();x+=100)
                        // for all columns (this will happen after set size so it will be running 10 times
                        for(int y = 0;y<this.getHeight();y+=100)
                            // draw image
                            g.drawImage(image,x,y,100,100,this);
                }

        }



}
