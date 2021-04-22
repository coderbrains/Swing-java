package swingByNonTelusko.advanceComponents;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

/**
 * 
 * @author Awanish kumar singh
 *
 *	Provides depth to the swing container
 *	It is used to provide third dimension to the Swing for placing the componenet.
 *	Used to overlap eleemnts when needed.
 *	JLayered divides the depth-range into several different layers:
 *	1. FRAME_CONTENT_LAYER(-30000)
 *	2.DEFAULT_LAYER(0)
 *	3.PALETTE_LAYER(100)
 *	4.MODAL_LAYER(200)
 *	5.POP_UP_LAYER(300)
 *	6.DRAG_LAYER(400)
 *
 *	How to add?
 *	layeredPane.add(componenet, LayeredPane.DEFAULT_LAYER);
 *				or,
 *	layeredPane.add(componenet, new Integer(12));
 *	
 */

@SuppressWarnings("serial")
public class JcontainerClass extends JFrame {
	
	public JcontainerClass() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 800, 500);
		
		JLayeredPane pane = getLayeredPane();
		
		JButton jButton = new JButton("Button1");
		jButton.setBackground(Color.RED);
		jButton.setBounds(150, 80, 100, 50);
		JButton jButton1 = new JButton("Button2");
		jButton1.setBackground(Color.GREEN);
		jButton1.setBounds(180, 110, 100, 50);
		JButton jButton2 = new JButton("Button3");
		jButton2.setBackground(Color.BLUE);
		jButton2.setBounds(210, 140, 100, 50);
		
//		pane.add(jButton, new Integer(10));
//		pane.add(jButton1, new Integer(20));
//		pane.add(jButton2, new Integer(30));
		
		// Or We can directlt use the index number too define the layer of a componenet
		
		pane.add(jButton, 0);
		pane.add(jButton1, 1);
		pane.add(jButton2, 2);
	}

	public static void main(String[] args) {
		
		new JcontainerClass();

	}

}
