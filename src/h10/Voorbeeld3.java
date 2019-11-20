package h10;

import java.awt.*;
import java.applet.*;

public class Voorbeeld3 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        g.drawString("" + 6 + " is kleiner dan " + 5 + ": " +
                (!(6 > 5)), 50, 60 );
        g.drawString("" + 6 + " is groter dan " + 5 + ": " +
                (! (6 < 5)), 50, 100 );
    }
}