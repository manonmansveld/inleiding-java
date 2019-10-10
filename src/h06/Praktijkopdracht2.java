package h06;

        import java.awt.*;
        import java.applet.*;


public class Praktijkopdracht2 extends Applet {
    double a;
    double b;
    double c;
    double uitkomst;



    public void init() {
        setBackground(Color.darkGray);
        a = 5.9;
        b = 6.3;
        c = 6.9;
        uitkomst = (a + b + c) / 3;
        uitkomst = uitkomst * 10;
        uitkomst = (int) uitkomst;
        uitkomst = uitkomst /10;

       // uitkomst = (a + b + c) / 3;
        //uitkomst = (int) uitkomst * 10;
        //uitkomst = uitkomst /10;



    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        g.drawString("Het gemiddelde is:   " + uitkomst, 20, 20);
    }
}