package h05;

import java.awt.*;
import java.applet.*;

public class Staafdiagram2
        extends Applet {
        int hoogteXas;
        int gewichtJeroen;
        int gewichtHans;
        int gewichtValerie;


    public void init() {
        setBackground(Color.black);
        gewichtJeroen = 100;
        gewichtHans = 80;
        gewichtValerie = 40;
        hoogteXas = 240;
    }
    public void paint(Graphics g) {
        //body
        g.setColor(Color.white);
        g.drawRect(90, 60, 200, 200);

        //staven
        g.setColor(Color.blue);
        g.fillRect(132, hoogteXas - gewichtValerie, 40, gewichtValerie);

        g.setColor(Color.green);
        g.fillRect(172, hoogteXas - gewichtHans, 40, gewichtHans);

        g.setColor(Color.magenta);
        g.fillRect(212, hoogteXas - gewichtJeroen, 40, gewichtJeroen);

        //lijntjes gewicht
        g.setColor(Color.white);
        g.drawLine(132, 120, 128, 120);
        g.drawLine(132, 140, 128, 140);
        g.drawLine(132, 160, 128, 160);
        g.drawLine(132, 180, 128, 180);
        g.drawLine(132, 200, 128, 200);
        g.drawLine(132, 220, 128, 220);
        g.drawLine(132, 240, 128, 240);


        g.setColor(Color.white);
        g.setFont(new Font("Century Gothic", Font.PLAIN, 10));
        g.drawString("Gewicht in KG", 25, 50);

        //gewicht
        g.drawString("120", 105, 124);
        g.drawString("100", 105, 144);
        g.drawString("80", 113, 164);
        g.drawString("60", 113, 184);
        g.drawString("40",113, 204);
        g.drawString("20", 113, 224);
        g.drawString("0", 120, 244);

        //namen
        g.drawString("Jeroen", 215, 255);
        g.drawString("Hans", 175, 255);
        g.drawString("Valerie", 130, 255);

    }

}