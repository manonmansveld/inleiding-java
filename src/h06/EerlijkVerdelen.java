package h06;

import java.awt.*;
        import java.applet.*;


public class EerlijkVerdelen extends Applet {
    double totaal;
    double geldJan;
    double geldAli;
    double geldJeanette;
    double geldMij;



    public void init() {
        setBackground(Color.darkGray);
        totaal = 113;
        geldJan = (double)113 / 4;
        geldAli = (double)113 / 4;
        geldJeanette = (double)113 / 4;
        geldMij = (double)113 / 4;
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        g.drawString("Jan            :" + geldJan, 20, 20);
        g.drawString("Ali              :" + geldAli, 20, 40);
        g.drawString("Jeanette   :" + geldJeanette, 20, 60);
        g.drawString("Mijn geld   :" + geldMij, 20, 80);
    }
}