package swingByNonTelusko.advanceComponents;
/**
 * @author Awanish kumar singh
 * 
 */

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSplitPane;

@SuppressWarnings("serial")
public class Jsplitpane extends JFrame{
	
	public Jsplitpane() {
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 55, 500, 600);
		
		JSplitPane jSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		
		
		JButton jButton = new JButton("Left");
		JButton jButton2 = new JButton("Right");
		
		jSplitPane.setTopComponent(jButton);
		jSplitPane.setBottomComponent(jButton2);
		
		jSplitPane.setDividerSize(20);
		jSplitPane.setDividerLocation(100);
		jSplitPane.setOneTouchExpandable(false);
		
		add(jSplitPane);
		
		validate();
		
		
	}

	public static void main(String[] args) {
		
		new Jsplitpane();

	}

}
