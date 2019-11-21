package h11;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Praktijkopdracht extends Applet {

    TextField tekstvak;
    Button knop;
    Label label;
    String s, tekst;


    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TekstvakListener());
        label = new Label("Vul hier een cijfer in");
        knop = new Button("OK");
        knop.addActionListener(new TekstvakListener());
        tekst = "";

        add(label);
        add(tekstvak);
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 160, 80);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();


        }
    }
}
