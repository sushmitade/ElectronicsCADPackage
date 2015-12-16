import java.awt.*;
import javax.swing.*;

public class GridLayout extends JFrame{
	public GridLayout(){
		JFrame f = new JFrame("Electronics CAD Package");  //creating a JFrame
		f.setSize(1300, 700); //setting the size of the JFrame
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to set exit on close

		
		//Panel 2
		JPanel panel2 = new JPanel(new GridBagLayout()); //arrange labels and buttons in a panel using GridBagLayout
		f.getContentPane().add(panel2, BorderLayout.EAST); //added the panel to the frame as well as set the orientation to the top of the screen
		//panel2.setSize(200,700);
		GridBagConstraints c2 = new GridBagConstraints();
		c2.anchor = GridBagConstraints.NORTH;
		c2.fill = GridBagConstraints.BOTH;
		c2.weightx = 0; c2.weighty = 0.5;
		
		
		JTextField t1 = new JTextField();
		//c2.anchor = GridBagConstraints.WEST;
		c2.gridx = 0; c2.gridy = 3;
		panel2.add(t1, c2);	
		
		JLabel l1 = new JLabel("Core Parts");
		//c2.anchor = GridBagConstraints.EAST;
		//c2.fill = GridBagConstraints.BOTH;
		c2.weightx = 0; c2.weighty = 0.5;
		c2.gridx = 1; c2.gridy = 2;
		panel2.add(l1, c2);	
		JButton b11 = new JButton("Resistor");
		c2.gridx = 1; c2.gridy = 3;
		panel2.add(b11, c2);
		JButton b12 = new JButton("Capacitor");
		c2.gridx = 2; c2.gridy = 3;
		panel2.add(b12, c2);
		JButton b13 = new JButton("Inductor");
		c2.gridx = 3; c2.gridy = 3;
		panel2.add(b13, c2);
		JButton b14 = new JButton("Diode");
		c2.gridx = 4; c2.gridy = 3;
		panel2.add(b14, c2);
		JButton b15 = new JButton("Pushbutton");
		c2.gridx = 5; c2.gridy = 3;
		panel2.add(b15, c2);
			
		JLabel l3 = new JLabel("Arduino");
		c2.gridx = 1; c2.gridy = 4;
		panel2.add(l3, c2);	
		JButton b31 = new JButton("Arduino Uno");
		c2.gridx = 1; c2.gridy = 5;
		panel2.add(b31, c2);
		JButton b32 = new JButton("Arduino Yun");
		c2.gridx = 2; c2.gridy = 5;
		panel2.add(b32, c2);
		JButton b33 = new JButton("Arduino BT");
		c2.gridx = 3; c2.gridy = 5;
		panel2.add(b33, c2);
		JButton b34 = new JButton("Arduino Mega 2560");
		c2.gridx = 4; c2.gridy = 5;
		panel2.add(b34, c2);
		JButton b35 = new JButton("Arduino Mega ADK");
		c2.gridx = 5; c2.gridy = 5;
		panel2.add(b35, c2);

		JLabel l4 = new JLabel("Sparkfun");
		c2.gridx = 1; c2.gridy = 6;
		panel2.add(l4, c2);	
		JButton b41 = new JButton("Arduino Voicebox Shield");
		c2.gridx = 1; c2.gridy = 7;
		panel2.add(b41, c2);
		JButton b42 = new JButton("Arduino Motor Shield");
		c2.gridx = 2; c2.gridy = 7;
		panel2.add(b42, c2);
		JButton b43 = new JButton("Arduino Can-Bus Shield");
		c2.gridx = 3; c2.gridy = 7;
		panel2.add(b43, c2);
		JButton b44 = new JButton("Arduino Cellular Shield");
		c2.gridx = 4; c2.gridy = 7;
		panel2.add(b44, c2);
		JButton b45 = new JButton("Arduino Color LCD Shield");
		c2.gridx = 5; c2.gridy = 7;
		panel2.add(b45, c2);
		
		JLabel l5 = new JLabel("Seeed Studio");
		c2.gridx = 1; c2.gridy = 8;
		panel2.add(l5, c2);	
		JButton b51 = new JButton("Arch Pro V1.0");
		c2.gridx = 1; c2.gridy = 9;
		panel2.add(b51, c2);
		JButton b52 = new JButton("Arch V1.1");
		c2.gridx = 2; c2.gridy = 9;
		panel2.add(b52, c2);
		JButton b53 = new JButton("Seeeduino V3.0");
		c2.gridx = 3; c2.gridy = 9;
		panel2.add(b53, c2);
		JButton b54 = new JButton("Grove OLED 128x96");
		c2.gridx = 4; c2.gridy = 9;
		panel2.add(b54, c2);
		JButton b55 = new JButton("Grove Light Sensor");
		c2.gridx = 5; c2.gridy = 9;
		panel2.add(b55, c2);
		
		JLabel l6 = new JLabel("Intel");
		c2.gridx = 1; c2.gridy = 10;
		panel2.add(l6, c2);	
		JButton b61 = new JButton("EDISON");
		c2.gridx = 1; c2.gridy = 11;
		panel2.add(b61, c2);
		JButton b62 = new JButton("Intel Galileo Gen2");
		c2.gridx = 2; c2.gridy = 11;
		panel2.add(b62, c2);
		JButton b63 = new JButton("Intel Galileo");
		c2.gridx = 3; c2.gridy = 11;
		panel2.add(b63, c2);
		JButton b64 = new JButton("Intel Edison Arduino Breakout");
		c2.gridx = 4; c2.gridy = 11;
		panel2.add(b64, c2);
		JButton b65 = new JButton("Edison Breakoutboard");
		c2.gridx = 5; c2.gridy = 11;
		panel2.add(b65, c2);
		
		JLabel l7 = new JLabel("Analog Devices");
		c2.gridx = 1; c2.gridy = 12;
		panel2.add(l7, c2);
		JButton b71 = new JButton("AD8226");
		c2.gridx = 1; c2.gridy = 13;
		panel2.add(b71, c2);
		JButton b72 = new JButton("SSM2220");
		c2.gridx = 2; c2.gridy = 13;
		panel2.add(b72, c2);
		JButton b73 = new JButton("SSM2212");
		c2.gridx = 3; c2.gridy = 13;
		panel2.add(b73, c2);
		JButton b74 = new JButton("ADTL082");
		c2.gridx = 4; c2.gridy = 13;
		panel2.add(b74, c2);
		JButton b75 = new JButton("AD8541");
		c2.gridx = 5; c2.gridy = 13;
		panel2.add(b75, c2);
		
		JLabel l8 = new JLabel("Atlas Scientific");
		c2.gridx = 1; c2.gridy = 14;
		panel2.add(l8, c2);
		JButton b81 = new JButton("PWR-SNS");
		c2.gridx = 1; c2.gridy = 15;
		panel2.add(b81, c2);
		JButton b82 = new JButton("Serial Port Connector");
		c2.gridx = 2; c2.gridy = 15;
		panel2.add(b82, c2);
		JButton b83 = new JButton("pH Circuit");
		c2.gridx = 3; c2.gridy = 15;
		panel2.add(b83, c2);
		JButton b84 = new JButton("ORP Circuit");
		c2.gridx = 4; c2.gridy = 15;
		panel2.add(b84, c2);
		JButton b85 = new JButton("FLO-30 Circuit");
		c2.gridx = 5; c2.gridy = 15;
		panel2.add(b85, c2);
		
		//Top Panel
		//GridBagConstraints c1 = new GridBagConstraints();
		JButton b1 = new JButton("     Welcome     ");
		//c1.anchor = GridBagConstraints.NORTH;
		//c1.fill = GridBagConstraints.HORIZONTAL;
		c2.gridx = 0; c2.gridy = 0;
		panel2.add(b1, c2);	
		JButton b2 = new JButton("   Breadboard   ");
		c2.gridx = 1; c2.gridy = 0;
		panel2.add(b2, c2);
		JButton b3 = new JButton("    Schematic    ");
		c2.gridx = 2; c2.gridy = 0;
		panel2.add(b3, c2);
		JButton b4 = new JButton("       PCB       ");
		c2.gridx = 3; c2.gridy = 0;
		panel2.add(b4, c2);
		JButton b5 = new JButton("       Code     ");
		c2.gridx = 4; c2.gridy = 0;
		panel2.add(b5, c2);
		//c2.insets = new Insets(10,10,10,10);
		
		
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
	
		
		//JOptionPane.showMessageDialog(null,"       Electronics CAD Package\n"+ "by Shrikant Limaye & Sushmita De");
	
		f.setVisible(true); //setting the visibility to true

		
	}
	

}
