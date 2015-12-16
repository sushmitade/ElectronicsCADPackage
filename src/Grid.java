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
	private GridLayout gridLayout;
	
	public Grid(){		
		
		//drawList = new ArrayList<Shape>(1000);
		
		setLayout(new BorderLayout());
		
		gridLayout = new GridLayout();
		
		Container c = getContentPane();
		c.setSize(1200, 700);
		//c.add(gridPanel,BorderLayout.WEST);
		c.add(gridLayout,BorderLayout.CENTER);
		
		
	}

	public static void main(String[] args) {
		Grid s = new Grid ();
	  }
}
