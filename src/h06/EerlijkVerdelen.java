package h06;

import java.awt.*;
        import java.applet.*;


public class EerlijkVerdelen extends Applet {
    double Totaal;
    double GeldJan;
    double GeldAli;
    double GeldJeanette;
    double GeldMij;



    public void init() {
        setBackground(Color.darkGray);
        Totaal = 113;
        GeldJan = (double)113 / 4;
        GeldAli = (double)113 / 4;
        GeldJeanette = (double)113 / 4;
        GeldMij = (double)113 / 4;
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        g.drawString("Jan            :" + GeldJan, 20, 20);
        g.drawString("Ali              :" + GeldAli, 20, 40);
        g.drawString("Jeanette   :" + GeldJeanette, 20, 60);
        g.drawString("Mijn geld   :" + GeldMij, 20, 80);
    }
}