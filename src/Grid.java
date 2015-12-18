import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * 
 * @author Shrikant Limaye
 * @author Sushmita De
 *
 * Click Run and check Help -> About to learn more about this project.
 * 
 */

public class Grid extends JPanel{
	private int width = 1200, height = 700, rows, column;
	private ArrayList<Shape> drawList; 
	private int startX, startY, endX, endY;
	protected GridBagLayout1 gridBagLayout1;
	//protected BufferedImage img;
	protected Image img,img2;
	protected int imageX = 0, imageY = 0;
	protected int mouseX = -1, mouseY = -1;
	protected boolean draggingImage = false;
	
	
	public Grid(){	
		
		try {
			img = ImageIO.read(new File("/res.jpg"));
			img2 = ImageIO.read(new File("/tran.jpg"));
	}
	 catch (Exception ex) {
		// TODO: handle exception
		 ex.printStackTrace();
	}
		setVisible(true);
	
			/*@Override			
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mousePressed(e);
				imageX = e.getX();
				imageY = e.getY();
				draggingImage = true;
			}
			@Override
            public void mouseReleased(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
				System.out.println("x coordinat is " + imageX +" & " + " y coordinate is " + imageY);
				draggingImage = false;
				//repaint();

            }

            @Override
            public void mouseDragged(MouseEvent e) {
                // Drag the selected component to a new location...
                mouseX = e.getX();
                mouseY = e.getY();
                if(draggingImage){
                	repaint();
                }
            }
			*/
			 

		};
		
		class MyMouseAdapter extends MouseAdapter {
			
	
			
			
			  private Point initialLoc;
			   private Point initialLocOnScreen;

			   @Override
			   public void mousePressed(MouseEvent e) {
			      Component comp = (Component)e.getSource();
			      initialLoc = comp.getLocation();
			      initialLocOnScreen = e.getLocationOnScreen();
			   }

			   @Override
			   public void mouseReleased(MouseEvent e) {
			      Component comp = (Component)e.getSource();
			      Point locOnScreen = e.getLocationOnScreen();
			      
			      //int x = getX();
			      //int y = getY();
			      int x = locOnScreen.x - initialLocOnScreen.x + initialLoc.x;
			      int y = locOnScreen.y - initialLocOnScreen.y + initialLoc.y;
			      comp.setLocation(x, y);
			      repaint();
			      e.consume();
			   }

			   @Override
			   public void mouseDragged(MouseEvent e) {
			      Component comp = (Component)e.getSource();
			      Point locOnScreen = e.getLocationOnScreen();

			      int x = locOnScreen.x - initialLocOnScreen.x + initialLoc.x;
			      int y = locOnScreen.y - initialLocOnScreen.y + initialLoc.y;
			      comp.setLocation(x, y);
			   }
			}
	

	
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		ImageIcon i = new ImageIcon("/res.jpg");
		ImageIcon i1 = new ImageIcon("/tran.jpg");
		img = i.getImage();
		img2 = i1.getImage();
		//g.drawImage(img, 50	, 50, null);
		g.drawImage(img, -150, -150, this);
		g.drawImage(img2, 50, 50, this);
	}
}