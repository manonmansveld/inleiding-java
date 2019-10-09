package h05;

import java.awt.*;
        import java.applet.*;

public class Staafdiagram2
        extends Applet {

    public void init() {
        setBackground(Color.black);
    }

    public void paint(Graphics g) {
        //body
        g.setColor(Color.white);
        g.drawRect(100, 100, 800, 600);

        //staven
        g.setColor(Color.blue);
        g.fillRect(150, 500, 200, 200);

        g.setColor(Color.green);
        g.fillRect(400, 300, 200, 400);

        g.setColor(Color.magenta);
        g.fillRect(650, 200, 200, 500);

        //lijntjes gewicht
        g.setColor(Color.white);
        g.drawLine(100,100,80,100);
        g.drawLine(100,200,80,200);
        g.drawLine(100,300,80,300);
        g.drawLine(100,400,80,400);
        g.drawLine(100,500,80,500);
        g.drawLine(100,600,80,600);
        g.drawLine(100,700,80,700);


        g.setColor(Color.white);
        g.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        g.drawString("Gewicht in KG", 25, 50);

        //gewicht
        g.drawString("120", 25, 100);
        g.drawString("100", 25, 200);
        g.drawString("80", 25, 300);
        g.drawString("60", 25, 400);
        g.drawString("40", 25, 500);
        g.drawString("20", 25, 600);
        g.drawString("0", 25, 700);

        //namen
        g.drawString("Valerie", 230, 750);
        g.drawString("Hans", 480, 750);
        g.drawString("Jeroen", 730, 750);

    }

}