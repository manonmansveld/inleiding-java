package h04;

import java.awt.*;
        import java.applet.*;

public class Dobbelsteen
        extends Applet {

    public void init() {
        setBackground(Color.lightGray);
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRoundRect(110,60,400,400, 45, 45);

        g.setColor(Color.black);
        g.fillOval(180, 125, 75, 75);
        g.fillOval(180, 325, 75, 75);
        g.fillOval(370, 325, 75, 75);
        g.fillOval(370, 125, 75, 75);


    }
}