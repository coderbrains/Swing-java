package swingByNonTelusko.advanceComponents;

import java.awt.BorderLayout;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;

/**
 * 
 * @author Awanish kumar singh
 * 
 * JDeskTopPane is a multicontent component which can add multiple windows
 * instances to the main window.
 *
 */
@SuppressWarnings("serial")
public class JdesktopPane extends JFrame{
	
	JDesktopPane dp;
	public JdesktopPane() {
		
		dp = new JDesktopPane();
		display(dp);
		add(dp, BorderLayout.CENTER);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 60, 700, 500);
		
//		JInternalFrame j1 = new JInternalFrame("true", true, true, true, true);
//		add(j1);
//		j1.setBounds(30, 50, 100, 100);
//		j1.setVisible(true);
//		j1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//		
//		JInternalFrame j2 = new JInternalFrame("true", true, true, true, true);
//		add(j2);
//		j2.setBounds(150, 50, 50, 50);
//		j2.setVisible(true);
//		j2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		
		
		
	}

	private void display(JDesktopPane dp) {
		
		int numOfFrames = 3, x = 30, y = 30;
		for(int i = 0; i < numOfFrames ; i++) {
			JInternalFrame j1 = new JInternalFrame("frame:" + i, true, true, true, true);
			j1.setBounds(x, y, 200, 100);
			j1.setVisible(true);
			j1.add(new JLabel("Hello everyone "));
			j1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			dp.add(j1);
			y+=100;
		}
		
	}

	public static void main(String[] args) {
		
		new JdesktopPane();

	}

}
