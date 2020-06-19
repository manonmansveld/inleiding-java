package h13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {


    public void init() {
        setSize(650, 650);
        setBackground(Color.lightGray);

    }

    public void paint(Graphics g) {

        tekenMuur(g);

    }

    void tekenMuur(Graphics g){

        int x, y;

        for (int rijx = 0; rijx < 5; rijx++) {
            for (int rijy = 0; rijy < 5; rijy++){
                x = rijx * 55;
                y = rijy * 25;


                g.setColor(Color.red);
                g.fillRect(x, y, 50, 20);
            }

        }

    }

}
