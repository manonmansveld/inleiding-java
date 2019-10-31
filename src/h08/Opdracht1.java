package h08;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

    public class Opdracht1 extends Applet {
        TextField tekstvak;
        Label label;
        Button knop, wis;
        String s;



        public void init() {
            tekstvak = new TextField("Klik op mij", 20);
            tekstvak.addActionListener(new TekstvakListener() );

            label = new Label("Type iets in het  tekstvakje");

            knop = new Button();
            knop.setLabel( "OK" );
            knop.addActionListener(new KnopListener() );


            wis = new Button();
            wis.setLabel( "Wis" );
            wis.addActionListener(new WisListener() );


            add(label);
            add(tekstvak);
            add(knop);
            add(wis);
            s = "";


        }

        public void paint(Graphics g) {
            g.drawString(s, 70, 70 );
        }

        class TekstvakListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                s = tekstvak.getText();
                repaint();
            }
        }

        class KnopListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                s = tekstvak.getText();
                repaint();
            }
        }

            class WisListener implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                    tekstvak.setText("");
                    repaint();
                }
            }

    }
