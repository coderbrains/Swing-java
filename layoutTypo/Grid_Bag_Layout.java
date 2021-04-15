package swingByNonTelusko.layoutTypo;

import java.awt.Container;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


@SuppressWarnings("serial")
public class Grid_Bag_Layout extends JFrame{
	
	public Grid_Bag_Layout() {
		
		Container c = getContentPane();
		GridBagLayout gb = new GridBagLayout();
		c.setLayout(gb);
		
		JButton j1 = new JButton("Button1");
		JButton j2 = new JButton("Button2");
		JButton j3 = new JButton("Button3");
		JButton j4 = new JButton("Button4");
		JButton j5 = new JButton("Button5");
		
		c.add(j1);
		c.add(j2);
		c.add(j3);
		c.add(j4);
		c.add(j5);
		
		
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 23, 600, 400);
	}

	public static void main(String[] args) {
		
		new Grid_Bag_Layout();

	}

}
