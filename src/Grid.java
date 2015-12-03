
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Grid extends JFrame implements ActionListener {

	int r;
	JButton[] button1 = new JButton[30];

	Font font = null;
	JTextField textField = null;

	public static void main(String[] args) {
		new Grid();
}
	public Grid()
	{
		JFrame f = new JFrame("Electronics CAD Package");
		f.setLayout(new BorderLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1200, 700);
		JPanel j1 = new JPanel(new GridLayout(10,10));
		j1.setSize(50,15);
		font = new Font("Helvetica", Font.PLAIN, 40);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu file = new JMenu("File");
		menuBar.add(file);
		JMenu edit = new JMenu("Edit");
		menuBar.add(edit);
		JMenu part = new JMenu("Part");
		menuBar.add(part);
		JMenu view = new JMenu("View");
		menuBar.add(view);
		JMenu window = new JMenu("Window");
		menuBar.add(window);
		JMenu help = new JMenu("Help");
		menuBar.add(help);
		
		JMenuItem new1 = new JMenuItem("New      Ctrl+N"); file.add(new1);
		JMenuItem open = new JMenuItem("Open     Ctrl+O"); file.add(open);
		JMenuItem save = new JMenuItem("Save     Ctrl+S");	file.add(save);
		JMenuItem saveas = new JMenuItem("Save As  Ctrl+Shift+S"); file.add(saveas);
		JMenuItem orderPCB = new JMenuItem("Order a PCB"); file.add(orderPCB);
		JMenuItem quit = new JMenuItem("Quit     Ctrl+Q");	file.add(quit);
		JMenuItem undo = new JMenuItem("Undo     Ctrl+Z");	edit.add(undo);
		JMenuItem redo = new JMenuItem("Redo     Ctrl+Y");	edit.add(redo);
		JMenuItem pref = new JMenuItem("Preferences"); edit.add(pref);
		JMenuItem flip = new JMenuItem("Flip");	part.add(flip);
		JMenuItem rotate = new JMenuItem("Rotate");	part.add(rotate);
		JMenuItem zoomin = new JMenuItem("Zoom In  Ctrl++"); view.add(zoomin);
		JMenuItem zoomout = new JMenuItem("Zoom Out Ctrl--"); view.add(zoomout);
		JMenuItem minimize = new JMenuItem("Minimize Ctrl+M"); window.add(minimize);
		JMenuItem parts = new JMenuItem("Parts"); window.add(parts);
		JMenuItem inspector = new JMenuItem("Inspector"); window.add(inspector);
		JMenuItem onlinetut = new JMenuItem("Online Tutorials  Ctrl+?"); help.add(onlinetut);
		JMenuItem checkupdates = new JMenuItem("Check for Updates"); help.add(checkupdates);
		JMenuItem about = new JMenuItem("About"); help.add(about);
		
			
		f.setJMenuBar(menuBar);

		JPanel p = new JPanel();
		p.setBackground(Color.GRAY);

		f.add(j1,BorderLayout.NORTH);
		f.setVisible(true);

		f.add(p, BorderLayout.CENTER);
	}
	
	
	public void actionPerformed(ActionEvent arg0) {
		
	}
}
	