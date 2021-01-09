import java.applet.Applet;
import java.awt.*;

/* <applet width=300 height=300 code="Q5.class"> </applet> */

public class Q5 extends Applet {
    @Override
    public void init() {
        System.out.println("init() called");
    }

    @Override
    public void start() {
        System.out.println("start() called");
    }

    @Override
    public void stop() {
        System.out.println("stop() called");
    }

    @Override
    public void destroy() {
        System.out.println("destroy() called");
    }
}