/*  
<APPLET CODE="CheckerApplet.class" WIDTH=480 HEIGHT=320>
    <PARAM NAME="num1" VALUE="30">
    <PARAM NAME="num2" VALUE="20">
</APPLET> 
*/
import java.applet.*;
import java.awt.*;

public class CheckerApplet extends Applet {
  int n1 = 0;
  int n2 = 0;
  int sum = 0;
 
  public void init() {
 	String s1 = getParameter("num1");
 	n1 = Integer.parseInt(s1);
 	String s2 = getParameter("num2"); 
	n2 = Integer.parseInt(s2);
	sum = n1 + n2;
    setBackground (Color.gray);
 	setForeground (Color.red);
  }

  public void paint(Graphics g) {
  	g.drawString("Num1: " + n1, 50, 50);
    g.drawString("Num2: " + n2, 50, 70);
	g.drawString("Sum: " + sum, 50, 90);
  }

}

