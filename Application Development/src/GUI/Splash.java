package GUI;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

public class Splash {
 	
	public  static void main(String[] args) {
		
      JWindow window = new JWindow();
      window.getContentPane().add(new JLabel("",new ImageIcon("/Users/Phat/Desktop/giphy.gif"),SwingConstants.CENTER));
      window.setBounds(450,300,320,250);
      window.setVisible(true);
      try {
    	 Thread.sleep(3000);    	  
         }
   catch(InterruptedException e) {}	
	window.dispose();
	
	
}
	

	}
