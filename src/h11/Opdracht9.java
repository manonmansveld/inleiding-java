package h11;

import java.awt.*;
import java.applet.*;

public class Opdracht9 extends Applet {

    int a = 10;

    public void init() {
        setSize(1000, 1000);
    }

    public void paint(Graphics g) {
        int x, y;

        for (int rij = 0; rij < a; rij++) {
            for (int kolom = 0; kolom < a; kolom++){
                x = rij * 40;

                y = kolom * 40;

                if ((rij % 2 == 0) == (kolom % 2 == 0))
                    g.setColor(Color.black);
                else
                    g.setColor(Color.white);

                g.fillRect(x,y,40,40);
            }
        }

    }
}