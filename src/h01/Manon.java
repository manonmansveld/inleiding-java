
import java.applet.Applet;
import java.awt.*;


/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
        import java.applet.*;

//een klasse met de naam Manon van het type Applet
public class Manon extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.white);
    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.setFont(new Font("Century Gothic", Font.PLAIN, 100));
        g.drawString("Manon", 100, 110 );
        g.setColor(Color.red);
        g.drawString("Mansveld", 100, 170 );

    }

}