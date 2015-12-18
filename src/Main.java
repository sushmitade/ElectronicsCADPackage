import javax.swing.SwingUtilities;

public class Main extends Grid{

	public static void main(String[] args) {
		 SwingUtilities.invokeLater(new Runnable() {
	         public void run() {
	            new GridBagLayout1();
	         }
	      });
	}

}
