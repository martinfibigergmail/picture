package cz.pf;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;

public class ThirdExample {
    public static void main(String args[]) throws java.io.IOException{
        Frame f = new Frame();

        //frame size 1400 width and 1400 height
        f.setSize(1400,1400);
        f.setLayout(null);//no layout manager

      /*  WindowAdapter w = new WindowAdapter() {
            // react to window close
            public void windowClosing(WindowEvent windowEvent){
                // kill application on closing the window
                System.exit(0);
            }
        };*/
        ClosingWindowListenerAdapter w = new ClosingWindowListenerAdapter();

        // set reaction to closing window
        // add and create class that will handle window close event
        f.addWindowListener(w);
        // Load file with JPG picture and create an image
        Image image = ImageIO.read(new File("c:\\Users\\martas\\Pictures\\david_20171207_193013.jpg"));

        // Define canvas class with paint method overrided
        // will be called when window is drawn
        Canvas myCanvas = new Canvas(){
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
                /*
                if(image!=null) {
                    // for all rows (this will happen after set size so it will be running 10 times
                    for(int x = 99;x<this.getWidth();x+=100)
                        // for all columns (this will happen after set size so it will be running 10 times
                        for(int y = 0;y<this.getHeight();y+=100)
                            // draw image
                            g.drawImage(image,x,y,100,100,this);
                }
*/
            }
        };
        // set background to gray
        // myCanvas.setBackground (new Color(5,0xe,6));
        myCanvas.setBackground (new Color(200,10,200));

        // set size of the canvas
        myCanvas.setSize(1000, 1000);

        // add the canvas to the window which is larger
        f.add(myCanvas);
        // switch the frame on
        f.setVisible(true);
        //now frame will be visible, by default not visible



    }
}
