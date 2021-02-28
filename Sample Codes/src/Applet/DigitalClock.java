/* <applet code="DigitalClock.class" width=300 height=250></applet> */
import java.applet.*;
import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;


//Applet program to implement simple digital clock
public class DigitalClock extends Applet implements Runnable {
    String str = ""; //Empty string
    Thread t; //Thread class reference
    boolean stopFlag; //flag variable

    @Override
    public void init() { //method of Applet class
        setBackground(Color.gray);
        setForeground(Color.red);
    }

    @Override
    public void start() { //method of Applet class
        t = new Thread(this);
        t.start(); //method of Thread class
    }
    
    @Override
    public void run() { //method of Runnable interface
        for(;;) {
            try {
                repaint();
                Thread.sleep(1000);
                if(stopFlag)
                    break;
            } 
            catch (InterruptedException ex) {  }
        }
    }

    @Override
    public void stop() { //method of Applet class
        stopFlag = true;
        t = null;
    }

    // repaint() --> update(Graphics g) --> paint(Graphics g)
    @Override
    public void paint(Graphics g) { //method of Component class
        Calendar cal = new GregorianCalendar();
        String hh = String.valueOf(cal.get(Calendar.HOUR));
        String mm = String.valueOf(cal.get(Calendar.MINUTE));
        String ss = String.valueOf(cal.get(Calendar.SECOND));
        int am_pm = cal.get(Calendar.AM_PM);
        String ampm = "";
        if(am_pm == 0)
            ampm = "AM";
        else
            ampm = "PM";
        str = hh + ":" + mm + ":" + ss + " " + ampm;
        g.drawString(str, 70, 70);
    }  
}
