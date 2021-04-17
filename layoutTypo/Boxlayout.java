package swingByNonTelusko.layoutTypo;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 
 * @author Awanish kumar singh
 * 
 *  Arranges the components in single row or single column
 *  only one constructor is used - BoxLayout(Container target, int axis);
 *  Four different axis could be choosen
 *  1.X_AXIS
 *  2.Y_AXIS
 *  3.LINE_AXIS
 *  4.PAGE_AXIS
 *  same as flow layout but has some extra features.
 */
@SuppressWarnings("serial")
public class Boxlayout extends JFrame {
	
	public Boxlayout() {
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 56, 400, 600);
		Container c = getContentPane();
		
		BoxLayout b = new BoxLayout(c, BoxLayout.Y_AXIS);//Here Y_AXIS is a integer value which 
														 //tends to allow the buttons in the vertical direction
		
		c.setLayout(b);
		
		JButton j1 = new JButton("Button1");
		JButton j2 = new JButton("Button2");
		JButton j3 = new JButton("Button3");
		JButton j4 = new JButton("Button4");
		
		//Aligns the components in the given direction
		j1.setAlignmentX(RIGHT_ALIGNMENT);
		j2.setAlignmentX(RIGHT_ALIGNMENT);
		j3.setAlignmentX(RIGHT_ALIGNMENT);
		j4.setAlignmentX(RIGHT_ALIGNMENT);
		
		add(j1);
		//we can create a verical gap of given pixel using the following code.
		c.add(Box.createRigidArea(new Dimension(0,50)));
		add(j2);
		add(j3);
		add(j4);
	}

	public static void main(String[] args) {
		
		new Boxlayout();

	}

}
