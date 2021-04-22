package swingByNonTelusko.advanceComponents;

/**
 * @author Awanish kumar singh
 * JWindowPane is a component by which 
 */

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class JwindowPane extends JFrame {
	
	public JwindowPane() {
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 500, 600);
	}

	public static void main(String[] args) {
		
		

	}

}
