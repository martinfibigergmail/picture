package cz.pf;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;

public class DrawingSample {
    public static void main(String args[]){
        Frame f = new Frame();

        //frame size 1400 width and 1400 height
        f.setSize(1600,600);
        f.setLayout(null);//no layout manager


        ClosingWindowListenerAdapter w = new ClosingWindowListenerAdapter();

        // set reaction to closing window
        // add and create class that will handle window close event
        f.addWindowListener(w);

        // Define canvas class with paint method overrided
        // will be called when window is drawn
        Canvas myCanvas = new DrawingCanvas();
        // set background to gray
        // myCanvas.setBackground (new Color(5,0xe,6));
        myCanvas.setBackground (new Color(200,10,200));

        // set size of the canvas
        f.setVisible(true);
        f.setSize(f.getWidth()+f.getInsets().left+f.getInsets().right,f.getHeight()+f.getInsets().top + f.getInsets().bottom);
        myCanvas.setLocation(f.getInsets().left,f.getInsets().top);
        myCanvas.setSize(f.getWidth()-f.getInsets().left - f.getInsets().right, f.getHeight()-f.getInsets().top - f.getInsets().bottom);
        // add the canvas to the window which is larger
        f.add(myCanvas);
        // switch the frame on

        //now frame will be visible, by default not visible



    }
}
