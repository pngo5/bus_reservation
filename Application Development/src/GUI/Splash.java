package GUI;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

import javafx.application.Application;
import javafx.stage.Stage;

public class Splash extends Application {
	public  static void main(String[] args) throws Exception {
    launch(args);	
}
	/****
	 * Error
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		 JWindow window = new JWindow();
		 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		    int centerX = screenSize.width/2;
		    int centerY = screenSize.height/2;
	      window.getContentPane().add(new JLabel("",new ImageIcon("/Users/Phat/Desktop/yup.gif"),SwingConstants.CENTER));
	      window.setBounds(centerX, centerY, 500, 500);
	      window.setLocationRelativeTo(null);;

	      window.setVisible(true);
	      try {
	    	 Thread.sleep(4342);    	  
	         }
	   catch(InterruptedException e) {}	
		window.dispose();
		
		MainMenu mm = new MainMenu();
		
		try {
		mm.start(primaryStage);
		}catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}	
		
	}

		

	

	
