package h08;

import java.awt.*;
        import java.applet.*;

public class Tekstvak extends Applet {
    TextField tekstvak;


    public void init() {
        tekstvak = new TextField("Klik op mij", 20);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString("Type iets in het tekstvakje", 50, 60 );
    }
}