import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.*;


public class Gui extends JFrame {
	
	public JFrame f;
	public JPanel p;
	public JButton resistor;
	
	public Gui (){
		
		f = new JFrame();
		f.setSize(200,200);
		p = new JPanel();
		Container c = getContentPane();
		
		Icon r = new ImageIcon("C:\\r1.png");
		resistor = new JButton( r);
		f.add(resistor);
		f.setVisible(true);
		
		resistor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});		
	}
	
	private class HandlerClass implements ActionListener {
		public void actionPerformed(ActionEvent e){
	
		}
	}
}

