package swingByNonTelusko.swingBasics;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingDemo {
	



	public static void main(String[] args) {
		
		new Swingdemoo();
		
		/**This is not the recomended way to do so .
		 * The best way is to use the below code in the constructor
		 * swingdemo.setVisible(true);
		 * swingdemo.setSize(5000, 2000);
		 */
		
		
		
		

	}
	
	
}

@SuppressWarnings("serial")
class Swingdemoo extends JFrame{
	
	public Swingdemoo() {
		
		// to overcome the covering of the one onto aother when run we use following.
		
		setLayout(new FlowLayout());
		
		setVisible(true);
		setSize(400, 400);
		
		//This is used to label something in your jFrame
		
		JLabel jLabel = new JLabel("Awanish here");
		add(jLabel);
		
		//We will see only Good morning on the swing GUI. WHY ? - One covers the others
		JLabel jLabel1 = new JLabel("Good morning");
		add(jLabel1);
		
		/**
		 * Even we close the GUI after testing the program never terminates.We have to terminate it
		 * manually so use the following line to do so.
		 */
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/**
		 * The value of EXIT_ON_CLOSE is always 3 
		 * so we can also use -  setDefaultCloseOperation(3);
		 */
		
		
		
	}
	
}
