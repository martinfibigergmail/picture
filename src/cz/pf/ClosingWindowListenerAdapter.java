package cz.pf;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ClosingWindowListenerAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent windowEvent){
        // kill application on closing the window
        System.exit(0);
    }

}
