package h04;

import java.awt.*;
        import java.applet.*;

public class Ellips
        extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillArc(20,20,300,250,90,360);
    }
}