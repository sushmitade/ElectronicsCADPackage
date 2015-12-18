import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javafx.application.*;
import java.awt.EventQueue;

/**
 * 
 * @author Shrikant Limaye
 * @author Sushmita De
 *
 * Click Run and check Help -> About to learn more about this project.
 * 
 */

public class Grid extends JFrame{
	private int width = 1200, height = 800, rows, column;
	private ArrayList<Shape> drawList; 
	//private int startX, startY, endX, endY;
	private GridBagLayout1 gridBagLayout1;
	
	public Grid(){		
		drawList = new ArrayList<Shape>(1000);
		setLayout(new BorderLayout());
		gridBagLayout1 = new GridBagLayout1();
		
		Container c = getContentPane();
		c.setSize(width, height);
		c.add(gridBagLayout1,BorderLayout.EAST);
		
		
	}

	public static void main(String[] args) {
		Grid s = new Grid ();
	  }
	
}