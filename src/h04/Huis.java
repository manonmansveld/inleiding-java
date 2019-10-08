
import java.awt.*;
        import java.applet.*;

public class Huis extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        //hetdak
        g.drawLine(120, 40, 20, 100);
        g.drawLine(120, 40, 220, 100);

        //body van het huis
        g.drawRect(20, 100, 200, 180);

//de deur
        g.drawRect(100, 220, 35, 60);
        g.drawOval(110, 230, 15, 15);
        g.drawRect(125, 250, 5, 10);

//ramen naast de deur
        g.drawRect(50, 220, 35, 30);
        g.drawRect(150, 220, 35, 30);

//ramen boven
        g.drawRect(50, 125, 35, 30);
        g.drawRect(50, 150, 35, 30);

        g.drawRect(100, 125, 35, 30);
        g.drawRect(100, 150, 35, 30);

        g.drawRect(150, 125, 35, 30);
        g.drawRect(150, 150, 35, 30);



    }
}