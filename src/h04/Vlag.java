
import java.awt.*;
        import java.applet.*;

public class Vlag
        extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.fillOval(60,450,120,50);
        g.fillRect(110,60,10,400);
        g.setColor(Color.red);
        g.fillRect(120,80,150,30);
        g.setColor(Color.white);
        g.fillRect(120,110,150,30);
        g.setColor(Color.blue);
        g.fillRect(120,140,150,30);
        g.setColor(Color.black);
        g.drawRect(120,80,150,90);
        g.setColor(Color.black);

    }
}