
package h06;

        import java.awt.*;
        import java.applet.*;


public class NegatieveInt extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;



    public void init() {
        setBackground(Color.darkGray);
        a = 7000000;
        b = 8000000;
        c = 30000000;
        uitkomst = (a + b) * c;
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Century Gothic", Font.PLAIN, 20));
        g.drawString("Hello negative int    " + uitkomst, 20, 20);
    }
}