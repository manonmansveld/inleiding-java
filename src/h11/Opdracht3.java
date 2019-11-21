package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht3 extends Applet {

    public void init() {

        setSize(500, 500);

    }


    public void paint(Graphics g) {
        int teller = 1;
        int x = 0;
        int a = 1;
        int b = 0;

        while (teller < 100){
            x += 20;
            teller = a + b;
            a = b;
            b = teller;
            g.drawString("" + teller, x, 50);
            teller++;
        }

    }
}

