package h11;

import java.awt.*;
import java.applet.*;

public class Test extends Applet {

    public void init (){}

    public void paint(Graphics g){
        int eind = 5;
        int y = 0;
        for(int i = 10;  i < eind;  i++) {
            y+= 20;
            g.drawLine(50, y, 305, y );
        }

    }
}



