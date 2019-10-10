
package h06;

        import java.awt.*;
        import java.applet.*;


public class Tijd2 extends Applet {
    int Secondes;
    int Uur;
    int Dag;
    int Jaar;
    int UitkomstUur;
    int UitkomstDag;
    int UitkomstJaar;



    public void init() {
        setBackground(Color.darkGray);
        Secondes = 60;
        Uur = 60;
        Dag = 24;
        Jaar = 365;
        UitkomstUur = Secondes * Uur;
        UitkomstDag = UitkomstUur * Dag;
        UitkomstJaar = UitkomstDag * Jaar;
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        g.drawString("Eén uur heeft   " + UitkomstUur, 20, 20);
        g.drawString("Eén uur heeft   " + UitkomstDag,  20, 40);
        g.drawString("Eén jaar heeft  " + UitkomstJaar, 20, 60);
    }
}