package swingByNonTelusko.advanceComponents;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Colorchooser extends JFrame{
	
	Colorchooser(){
		
		setLayout(null);
		setBounds(200, 50, 800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout());
		
		JButton color = new JButton("Color");
		c.add(color);
		
	}

	public static void main(String[] args) {
		
		new Colorchooser();

	}

}
