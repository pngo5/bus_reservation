package Testing;

import javax.swing.JFrame;

public class newWindow {
	
	JFrame frame;
	
	public newWindow() {	
		initComponant();
	}
	
	public void initComponant() {
		frame = new JFrame("example");
		frame.setSize(300, 300);
		frame.setVisible(true);	
	}
	
	public static void main (String args[]) {
		new newWindow();
	}

}