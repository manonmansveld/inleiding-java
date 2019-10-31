package h08;

    import java.awt.*;
    import java.applet.*;
    import java.awt.event.*;

public class Opdracht2  extends Applet {
    Button manknop, vrouwknop, jongenknop, meisjeknop;
    int tellerman, tellervrouw, tellerjongen, tellermeisje;




    public void init(){
    manknop = new Button();
    manknop.setLabel( "Mannen" );
    manknop.addActionListener(new ManknopListener() );

    vrouwknop = new Button();
    vrouwknop.setLabel( "Vrouwen" );
    vrouwknop.addActionListener(new VrouwknopListener() );

    jongenknop = new Button();
    jongenknop.setLabel( "Jongens" );
    jongenknop.addActionListener(new JongenknopListener() );

    meisjeknop = new Button();
    meisjeknop.setLabel( "Meisjes" );
    meisjeknop.addActionListener(new MeisjeknopListener() );


    add(manknop);
    add(vrouwknop);
    add(jongenknop);
    add(meisjeknop);

    tellerman = 0;
    tellervrouw = 0;
    tellerjongen = 0;
    tellermeisje = 0;
}



    public void paint(Graphics g){
        g.setColor(Color.magenta);
        g.setFont(new Font("Century Gothic", Font.PLAIN, 25));
        g.drawString("Aantal Mannen: " + tellerman, 50, 60 );
        g.drawString("Aantal Vrouwen: " + tellervrouw, 50, 160 );
        g.drawString("Aantal Jongens: " + tellerjongen, 50, 260 );
        g.drawString("Aantal Meisjes: " + tellermeisje, 50, 360 );
        g.drawString("Aantal Totaal: " + (tellerman + tellervrouw + tellerjongen + tellermeisje), 50, 460 );


    }

        class ManknopListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {

                tellerman++;
                repaint();
            }
        }

    class VrouwknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tellervrouw++;
            repaint();
        }
    }

    class JongenknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tellerjongen++;
            repaint();
        }
    }

    class MeisjeknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tellermeisje++;
            repaint();
        }
    }



}