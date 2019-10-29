package h07;

import java.awt.*;
        import java.applet.*;

public class Venster extends Applet {

    public void init() {
        setSize(400, 300);
    }

    public void paint(Graphics g) {
        g.drawString("Welcome to Java!!", 50, 60 );
    }
}

//Vragen
//1. Kun je in de Java API deze methode ergens vinden?
//-  De methode zelf niet, maar wel de uitleg over setSize.
//2. In welke klasse wordt deze methode gedefineerd?
//-  In de klasse Show.
//3. Dezelfde klasse heeft een tweede methode met dezelfde naam.
//   Wat is het verschil?
//-  Een klasse kan verschillende methoden bevatten met dezelfde naam,
//   maar met verschillende argumenten.