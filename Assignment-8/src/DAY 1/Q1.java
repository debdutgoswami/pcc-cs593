import java.applet.Applet;
import java.awt.*;

/* <applet width=300 height=300 code="Q1.class"> </applet> */

public class Q1 extends Applet {
    @Override
    public void paint(Graphics graphics) {
        int xc,yc;
        String str = "Debdut Goswami";

        FontMetrics fm = graphics.getFontMetrics();
        Dimension d = getSize();
        xc=d.width/2 - fm.stringWidth(str)/2;
        yc=d.height/2 + fm.getDescent();

        graphics.drawString(str, xc, yc);
    }
}
