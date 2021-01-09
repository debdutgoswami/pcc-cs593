import java.applet.Applet;
import java.awt.*;

/* <applet width=300 height=300 code="Q3.class"> </applet> */

public class Q3 extends Applet {
    @Override
    public void paint(Graphics graphics) {
        int xc, yc;

        Dimension d = getSize();
        xc=d.width/2;
        yc=d.height/2;

        graphics.setColor(Color.blue);
        graphics.fillOval(xc-200, yc-200, 200*2, 200*2);
    }
}