import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javafx.application.*;


/**
 * 
 * @author Shrikant Limaye
 * @author Sushmita De
 *
 * Click Run and check Help -> About to learn more about this project.
 * 
 */
public class Grid extends JFrame{
	//private int width, height, row, column;
	//private ArrayList<Shape> drawList; 
	//private int startX, startY, endX, endY;
	//private JPanel j1, j2, j3, j4, j5, j6;
	//JButton[] button1 = new JButton[30];
	//Font font = null;
	//JTextField textField = null;
	
	public Grid(){
		//drawList = new ArrayList<Shape>(1000);	
		JFrame f = new JFrame("Electronics CAD Package");  //creating a JFrame
		f.setSize(1200, 700); //setting the size of the JFrame
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to set exit on close
		JPanel panel = new JPanel(new GridBagLayout()); //arrange labels and buttons in a panel using GridBagLayout
		f.getContentPane().add(panel, BorderLayout.PAGE_START); //added the panel to the frame as well as set the orientation to the top of the screen
		GridBagConstraints c = new GridBagConstraints();
		JButton j1 = new JButton("Welcome");
		c.gridx = 0; c.gridy = 0;
		panel.add(j1, c);	
		JButton j2 = new JButton("Breadboard");
		c.gridx = 1; c.gridy = 0;
		panel.add(j2, c);
		JButton j3 = new JButton("Schematic");
		c.gridx = 2; c.gridy = 0;
		panel.add(j3, c);
		JButton j4 = new JButton("PCB");
		c.gridx = 3; c.gridy = 0;
		panel.add(j4, c);
		JButton j5 = new JButton("Code");
		c.gridx = 4; c.gridy = 0;
		panel.add(j5, c);
		c.insets = new Insets(10,10,10,10);
			
		//font = new Font("Helvetica", Font.PLAIN, 40);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu file = new JMenu("File"); menuBar.add(file);
		JMenu edit = new JMenu("Edit");	menuBar.add(edit);
		JMenu part = new JMenu("Part");	menuBar.add(part);
		JMenu view = new JMenu("View");	menuBar.add(view);
		JMenu window = new JMenu("Window"); menuBar.add(window);
		JMenu help = new JMenu("Help");	menuBar.add(help);
		
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
	
		
		JOptionPane.showMessageDialog(null,"       Electronics CAD Package\n"+ "by Shrikant Limaye & Sushmita De");
	
		f.setVisible(true); //setting the visibility to true
	}

	public static void main(String[] args) {
		Grid s = new Grid ();
	
	  }
}
