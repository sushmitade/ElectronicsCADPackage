import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Drawing extends JFrame {
	public Drawing(int w, int h, Color bg) {
		setSize(w,h);
		Container c = getContentPane();
		c.setBackground(bg);
		c.add(new Grid());
		setVisible(true);		
	}
	public static void main(String[] a) {
		new Drawing(1200,700, Color.BLACK);
	}

}
