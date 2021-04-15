package swingByNonTelusko.layoutTypo;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class NullLayout extends JFrame{

	public NullLayout() {
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JButton jButton = new JButton("Button1");
		jButton.setBounds(50, 40, 100, 30);
		add(jButton);
		
		setBounds(100, 56, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		
		new NullLayout();

	}

}
