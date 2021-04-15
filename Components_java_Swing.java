package swingByNonTelusko;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * @author Awanish kumar singh
 * 
 * Heavy Components - those which cannot be added to any other components e.g Jframe, JDialogueBox etc.
 * Light-Weight-Components - Those which can be added to any other components like Jlabel, JButton etc.
 *
 */

@SuppressWarnings("serial")
public class Components_java_Swing extends JFrame {
	
	public Components_java_Swing() {
		
		Container c = getContentPane();
		c.setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 26, 500, 600);
		
		JPanel jPanel = new JPanel();
		jPanel.setBackground(Color.RED);
		jPanel.setBounds(0, 0, 200, 300);
		add(jPanel);
		
		
	}

	public static void main(String[] args) {
		
		new Components_java_Swing();

	}

}
