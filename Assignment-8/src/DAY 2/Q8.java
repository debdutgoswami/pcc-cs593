import java.applet.Applet;
import java.awt.*;

/* <applet width=300 height=300 code="Q8.class"> </applet> */

public class Q8 extends Applet implements Runnable {
    String str = "This is a moving banner ";
    Thread t;
    boolean stopFlag;

    @Override
    public void start() {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        for (;;) {
            try{
                repaint();
                Thread.sleep(250);
                if(stopFlag == true)
                    stop();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paint(Graphics graphics){
        String last = str.substring(str.length()-1);
        System.out.println(str);
        str = last + str.substring(0, str.length()-1);
        graphics.drawString(str, 70, 70);
    }

    @Override
    public void stop() {
        stopFlag = true;
    }
}