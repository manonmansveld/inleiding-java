package h04;

import java.awt.*;
        import java.applet.*;

public class Praktijkopdracht
        extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        //lijn
        g.drawLine(210,10,10,10);
        g.drawString("Lijn", 90, 30);
        //rechthoek
        g.drawRect(10, 35, 200, 100);
        g.drawString("Rechthoek", 75, 150);
        //afgeronde rechthoek
        g.drawRoundRect(10,155,200,100,30,30);
        g.drawString("Afgeronde rechthoek", 50, 270);
        //gevulde rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(225, 35, 200, 100);
        g.setColor(Color.black);
        g.drawString("Gevulde rechthoek met ovaal", 250, 150);
        g.drawOval(225,35,200,100);
        //gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(225,155,200,100);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 285, 270);
        //taartpunt met ovaal eromheen
        g.drawOval(450, 35, 200, 100);
        g.setColor(Color.magenta);
        g.fillArc(450,35,200,100,0,45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 475, 150);
        //cirkel
        g.drawOval(500, 160, 95, 95);
        g.drawString("Cirkel", 535, 270);

    }
}