import java.applet.Applet;
import java.awt.*;

/* <applet width=300 height=300 code="Q2.class"> </applet> */

public class Q2 extends Applet {
    @Override
    public void paint(Graphics graphics) {
        int xc, yc;

        Dimension d = getSize();
        xc=d.width/2;
        yc=d.height/2;

        graphics.drawOval(xc-250, yc-250, 250*2, 250*2);
    }
}