package h04;

import java.awt.*;
        import java.applet.*;

public class Stoplicht
        extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRoundRect(20,20,200,400,45,45);

        g.setColor(Color.lightGray);
        g.fillRect(105,420, 30,400);

        g.setColor(Color.red);
        g.fillOval(75, 65, 90, 90);

        g.setColor(Color.orange);
        g.fillOval(75, 175, 90, 90);

        g.setColor(Color.green);
        g.fillOval(75, 285, 90, 90);

    }
}