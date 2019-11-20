package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht5 extends Applet{

    TextField tekstvak;
    Label label;
    Button knop;
    String s,tekst;
    double optelsom;
    int aantal;


    public void init(){
    tekstvak = new TextField("", 20);
    tekstvak.addActionListener(new TekstvakListener());
    label = new Label("Type hier uw cijfers");
    knop = new Button("OK");
    knop.addActionListener(new KnopListener());
    tekst = "";

    optelsom = 0;
    aantal = 0;

    add(label);
    add(tekstvak);
    add(knop);

    }

    public void paint(Graphics g){
    g.drawString(tekst, 900,80);
    g.drawString("Druk op ENTER om te zien of u een voldoende of een onvoldoende heeft", 80,80);
    g.drawString("Druk op OK om uw gemiddelde te bekijken", 80,100);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            aantal++;
            s = tekstvak.getText();
            double cijfer = Double.parseDouble(s);
            optelsom += cijfer;
            tekstvak.setText(" ");
            if ( cijfer >= 5.5 ) {
                tekst = "Voldoende";
            }
            else {
                tekst = "Onvoldoende";
            }
            repaint();
        }


    }

    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            double gemiddelde = optelsom / aantal;
            getGraphics().drawString("Het gemiddelde is: " + gemiddelde, 900, 100);
        }
    }
}