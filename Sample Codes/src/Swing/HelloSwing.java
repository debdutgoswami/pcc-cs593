/* <applet code="HelloSwing.class" width="400" height="350"></applet>  */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JTextField;

public class HelloSwing extends JApplet implements ActionListener {
    JButton b;
    JTextField tf;

    @Override
    public void init() {
        tf = new JTextField();
        tf.setBounds(30, 40, 150, 20);
        b = new JButton("Click");
        b.setBounds(80, 150, 70, 40);
        add(b);
        add(tf);
        b.addActionListener(this);
        setLayout(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText("Welcome");
    }
    
}
