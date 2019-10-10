package h06;

        import java.awt.*;
        import java.applet.*;


public class Tijd extends Applet {
    int Seconde;
    int Uur;
    int Dag;
    int Jaar;



    public void init() {
        setBackground(Color.darkGray);
        Seconde = 60;
        Uur = 60;
        Dag = 24;
        Jaar = 365;
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        g.drawString("Eén uur heeft   " + Seconde * Uur, 20, 20);
        g.drawString("Eén uur heeft   " + Seconde * Uur * Dag,  20, 40);
        g.drawString("Eén jaar heeft  " + Seconde * Uur * Dag * Jaar, 20, 60);
    }
}