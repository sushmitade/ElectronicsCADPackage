
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class MovingLabels extends JFrame {
   private static final int PREF_W = 500;
   private static final int PREF_H = 500;
   protected Image img;

   private static void createAndShowGui() {
      Random random = new Random();
      final JPanel panel = new JPanel();
      

      Color[] colors = {Color.red, Color.orange, Color.yellow, Color.green, Color.blue, Color.cyan};
      panel.setPreferredSize(new Dimension(PREF_W, PREF_H)); // sorry kleopatra
      panel.setLayout(null);

      MyMouseAdapter myMouseAdapter = new MyMouseAdapter();

     // for (int i = 0; i < colors.length; i++) {
         //Color c = colors[i];
         JLabel label = new JLabel(new ImageIcon("/res.jpg"));
         JLabel label2	= new JLabel(new ImageIcon("/res.jpg"));
         //Border outsideBorder = new LineBorder(Color.black);
        // int eb = 10;
         //Border insideBorder = new EmptyBorder(eb, eb, eb, eb);
         //label.setBorder(BorderFactory.createCompoundBorder(outsideBorder , insideBorder));
         label.setSize(label.getPreferredSize());
         label2.setSize(label2.getPreferredSize());
         //label.setBackground(c);
         label.setOpaque(true);
         label2.setOpaque(true);
         int x = random.nextInt(PREF_W - 200) + 100;
         int y = random.nextInt(PREF_H - 200) + 100;
         label.setLocation(x, y);
         label2.setLocation(x, y);
         label.addMouseListener(myMouseAdapter);
         label2.addMouseListener(myMouseAdapter);
         label.addMouseMotionListener(myMouseAdapter);
         label2.addMouseMotionListener(myMouseAdapter);
         panel.add(label);
         panel.add(label2);
      

      JFrame frame = new JFrame("MovingLabels");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(panel);
      frame.pack();
      frame.setLocationByPlatform(true);
      frame.setVisible(true);
   }

   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            createAndShowGui();
         }
      });
   }
   public void paint(Graphics g){
		super.paint(g);
		ImageIcon i = new ImageIcon("/res.jpg");
		img = i.getImage();
		g.drawImage(img, 50	, 50, null);
	}
}

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

      int x = locOnScreen.x - initialLocOnScreen.x + initialLoc.x;
      int y = locOnScreen.y - initialLocOnScreen.y + initialLoc.y;
      comp.setLocation(x, y);
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