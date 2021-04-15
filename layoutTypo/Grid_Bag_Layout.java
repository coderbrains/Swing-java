package swingByNonTelusko.layoutTypo;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


@SuppressWarnings("serial")
public class Grid_Bag_Layout extends JFrame{
	
	public Grid_Bag_Layout() {
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 23, 600, 400);
		Container c = getContentPane();
		GridBagLayout gb = new GridBagLayout();
		c.setLayout(gb);
		
		JButton j1 = new JButton("Button1");
		JButton j2 = new JButton("Button2");
		JButton j3 = new JButton("Button3");
		JButton j4 = new JButton("Button4");
		JButton j5 = new JButton("Button5");
		
		
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		//These are the weight constraints which shows the extra space around the button grow as the 
		//size of the window grows
		gbc.weightx = 1.0;
		
		//The following function grows the size of the buttons.
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		//These gridx and gridy are the constraints variable for the placement of the buttons
		gbc.gridx = 0;
		gbc.gridy = 0;
		c.add(j1, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		c.add(j2, gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 0;
		c.add(j3, gbc);
		
		gbc.gridwidth = 3;
		gbc.ipady = 40;    // for looking the taller button
		gbc.weightx = 0;
		gbc.weighty = 0;
		gbc.gridx = 0;
		gbc.gridy = 1;
		c.add(j4, gbc);

		gbc.ipady = 0;
		gbc.gridwidth = 2;
		gbc.weighty = 1.0;
		gbc.anchor = GridBagConstraints.PAGE_END;
		gbc.gridx = 1;
		gbc.gridy = 3;
		c.add(j5, gbc);
		
		pack();
		
		
		
	}

	public static void main(String[] args) {
		
		new Grid_Bag_Layout();

	}

}
