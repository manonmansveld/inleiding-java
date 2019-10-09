package h05;

import java.awt.*;
        import java.applet.*;

public class Variabelen
        extends Applet {
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        //lijn
        g.drawLine(210,10,10,10);
        g.drawString("Lijn", 90, 30);
        //rechthoek
        g.drawRect(10, 35, breedte, hoogte);
        g.drawString("Rechthoek", 75, 150);
        //afgeronde rechthoek
        g.drawRoundRect(10,155,breedte,hoogte,30,30);
        g.drawString("Afgeronde rechthoek", 50, 270);
        //gevulde rechthoek met ovaal
        g.setColor(opvulkleur);
        g.fillRect(225, 35, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde rechthoek met ovaal", 250, 150);
        g.drawOval(225,35,breedte,hoogte);
        //gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(225,155,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal", 285, 270);
        //taartpunt met ovaal eromheen
        g.drawOval(450, 35, breedte, hoogte);
        g.setColor(opvulkleur);
        g.fillArc(450,35,breedte,hoogte,0,45);
        g.setColor(lijnkleur);
        g.drawString("Taartpunt met ovaal eromheen", 475, 150);
        //cirkel
        g.drawOval(500, 160, 95, 95);
        g.drawString("Cirkel", 535, 270);

    }
}