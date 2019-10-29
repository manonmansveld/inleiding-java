package h06;

        import java.awt.*;
        import java.applet.*;


public class Tijd extends Applet {
    int seconde;
    int uur;
    int dag;
    int jaar;



    public void init() {
        setBackground(Color.darkGray);
        seconde = 60;
        uur = 60;
        dag = 24;
        jaar = 365;
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        g.drawString("Eén uur heeft   " + seconde * uur, 20, 20);
        g.drawString("Eén uur heeft   " + seconde * uur * dag,  20, 40);
        g.drawString("Eén jaar heeft  " + seconde * uur * dag * jaar, 20, 60);
    }
}