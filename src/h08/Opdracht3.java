package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht3 extends Applet {
    TextField tekstvak;
    Label label;
    Button knop, wis;
    double getal;





    public void init() {
        tekstvak = new TextField("Vul hier het bedrag in", 20);
        tekstvak.addActionListener(new TekstvakListener() );

        label = new Label("Bereken hier uw BTW");

        knop = new Button();
        knop.setLabel( "OK" );
        knop.addActionListener(new TekstvakListener() );


        wis = new Button();
        wis.setLabel( "Wis" );
        wis.addActionListener(new WisListener() );


        add(label);
        add(tekstvak);
        add(knop);
        add(wis);


    }

    public void paint(Graphics g) {
        g.drawString("Bedrag incl. 21% BTW: " + getal, 70, 70 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
          String  s = tekstvak.getText();
          getal = Double.parseDouble( s );
          getal = getal * 1.21;
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

