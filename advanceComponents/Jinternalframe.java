package swingByNonTelusko.advanceComponents;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 * 
 * @author Awanish kumar singh
 * 
 * JInternalFrame is a light weight JFrame that can be added to any Container which
 * comes into play because JFrame is a Heavy-weight component which cannot be added
 * to any of the container.
 * It has all the features of the JFrame.
 *
 */
@SuppressWarnings("serial")
public class Jinternalframe  extends JFrame{
	
	public Jinternalframe() {
		
		Container c = getContentPane();
		c.setLayout(null);		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 500, 600);
		
		JInternalFrame jInternalFrame = new JInternalFrame("This is Internal jFrame", true, true, true, true);
		
		jInternalFrame.setLayout(new FlowLayout());
		jInternalFrame.add(new JButton("Button 1"));
		
		add(jInternalFrame);
		jInternalFrame.setBounds(50, 50, 200, 300);
		jInternalFrame.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
		jInternalFrame.setVisible(true);
		
		
		
		
		validate();
		
	}

	public static void main(String[] args) {
		
		new Jinternalframe();

	}

}
