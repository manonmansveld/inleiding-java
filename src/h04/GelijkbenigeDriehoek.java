
import java.awt.*;
        import java.applet.*;

public class GelijkbenigeDriehoek
        extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawPolygon(new int[] {10, 20, 30}, new int[] {100, 20, 100}, 3);
    }
}