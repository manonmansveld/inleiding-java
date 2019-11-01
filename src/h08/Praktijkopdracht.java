package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Praktijkopdracht extends Applet {
    TextField tekstvak1, tekstvak2;
    Button vermenigvuldigen, delen, optellen, aftrekken;



    public void init() {
        tekstvak1 = new TextField("Vul hier wat in", 20);

        tekstvak2 = new TextField("Vul hier wat in", 20);

        vermenigvuldigen = new Button();
        vermenigvuldigen.setLabel("*");
        vermenigvuldigen.addActionListener(new VermenigvuldigenListener());

        delen = new Button();
        delen.setLabel("/");
        delen.addActionListener(new DelenListener());

        optellen = new Button();
        optellen.setLabel("+");
        optellen.addActionListener(new OptellenListener());

        aftrekken = new Button();
        aftrekken.setLabel("-");
        aftrekken.addActionListener(new AftrekkenListener());


        add(tekstvak1);
        add(tekstvak2);
        add(vermenigvuldigen);
        add(delen);
        add(optellen);
        add(aftrekken);


    }



    class VermenigvuldigenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak1.getText();
            double input1 = Double.parseDouble(s);
            String s2 = tekstvak2.getText();
            double input2 = Double.parseDouble(s2);
            double uitkomst = input1 * input2;


            tekstvak1.setText("" + uitkomst);
            tekstvak2.setText("");
        }
    }

    class DelenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak1.getText();
            double input1 = Double.parseDouble(s);
            String s2 = tekstvak2.getText();
            double input2 = Double.parseDouble(s2);
            double uitkomst = input1 / input2;


            tekstvak1.setText("" + uitkomst);
            tekstvak2.setText("");
        }
    }

    class OptellenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak1.getText();
            double input1 = Double.parseDouble(s);
            String s2 = tekstvak2.getText();
            double input2 = Double.parseDouble(s2);
            double uitkomst = input1 + input2;


            tekstvak1.setText("" + uitkomst);
            tekstvak2.setText("");
        }
    }

    class AftrekkenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak1.getText();
            double input1 = Double.parseDouble(s);
            String s2 = tekstvak2.getText();
            double input2 = Double.parseDouble(s2);
            double uitkomst = input1 - input2;


            tekstvak1.setText("" + uitkomst);
            tekstvak2.setText("");
        }
    }


}





