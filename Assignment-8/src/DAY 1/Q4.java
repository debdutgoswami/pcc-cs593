import java.applet.Applet;
import java.awt.*;

/* <applet width=300 height=300 code="Q4.class"> </applet> */

public class Q4 extends Applet {
    @Override
    public void paint(Graphics graphics) {
        int xc, yc;

        Dimension d = getSize();
        xc=d.width;
        yc=d.height;
        boolean up = true;
        for(int i=1;i<xc;i+=40){
            if (up){
                // upper half
               graphics.drawLine(i, yc/2, i+20, yc/2 - 50);
               graphics.drawLine(i+20, yc/2 - 50, i+40, yc/2);
               up = false;
            }else {
                // lower half
                graphics.drawLine(i, yc/2, i + 20, yc/2 + 50);
                graphics.drawLine(i + 20, yc/2 + 50, i+40, yc/2);
                up = true;
            }
        }
        graphics.setColor(Color.blue);
        // drawing x-axis
        graphics.drawLine(1, yc/2, 1, 1);
        // drawing y-axis
        graphics.drawLine(1, yc/2, xc, yc/2);
    }
}