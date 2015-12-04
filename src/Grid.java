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

public class Grid extends JFrame implements ActionListener {
	
	private int width, height, rows, column;
	private ArrayList<Shape> drawList; 
	private int startX, startY, endX, endY;
	JButton[] button1 = new JButton[30];
	Font font = null;
	JTextField textField = null;

	  public void backgroundLayout(Graphics g) {
		    int i;
		    width = getSize().width;
		    height = getSize().height;

		    int rowHeightt = height / (rows);
		    for (i = 0; i < rows; i++)
		    g.drawLine(0, i * rowHeightt, width, i * rowHeightt);

		    int rowWidth = width / (column);
		    for (i = 0; i < column; i++)
		    g.drawLine(i * rowWidth, 0, i * rowWidth, height);
		  }
		
	public Grid(){
		drawList = new ArrayList<Shape>(10000);	
		JFrame f = new JFrame("Electronics CAD Package");
		f.setLayout(new BorderLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1200, 700);
		JPanel j1 = new JPanel(new GridLayout(10,10));
		j1.setSize(50,15);
		font = new Font("Helvetica", Font.PLAIN, 40);
		createToolBar();

        setTitle("Simple toolbar");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
   
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
		
		JOptionPane.showMessageDialog(null,"       Electronics CAD Package\n"+ "by Shrikant Limaye & Sushmita De");
			
		f.setJMenuBar(menuBar);

		JPanel p = new JPanel();
		p.setBackground(Color.GRAY);

		f.add(j1,BorderLayout.NORTH);
		f.setVisible(true);

		f.add(p, BorderLayout.CENTER);
		
		}
		
		/*addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {

			}
			public void mousePressed(MouseEvent e) {

			}
			
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {
				setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
			}
			
			public void mouseClicked(MouseEvent e) {
			}
		});
		addMouseMotionListener(new MouseMotionListener() {
			public void mouseMoved(MouseEvent e) {
			}
			public void mouseDragged(MouseEvent e) {
				Graphics g = getGraphics();
				g.setXORMode(Color.WHITE);
			}
		});*/
	private void createToolBar() {
		
	}

	public class ToolbarEx extends JFrame {	
    public ToolbarEx() {
        
        JToolBar toolBar = new JToolBar();
        initUI();
        JButton welcome = new JButton("Welcome");toolBar.add(welcome);
        JButton breadboard = new JButton("Breadboard");toolBar.add(breadboard);
        JButton schematic = new JButton("Schematic");toolBar.add(schematic);
        JButton pcb = new JButton("PCB");toolBar.add(pcb);
        JButton code = new JButton("Code");toolBar.add(code);
        
        welcome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        add(toolBar, BorderLayout.NORTH);        
    
    }
    private void initUI() {

        createToolBar();
        setTitle("Tool Bar");
        setSize(1200, 30);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
	public void actionPerformed(ActionEvent arg0) {
		
	}
	 public void main(String[] args) {
	
	  }
	    
	}

	public void actionPerformed(ActionEvent e) {
		
	}
}