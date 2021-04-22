package swingByNonTelusko.advanceComponents;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JToolBar;

@SuppressWarnings("serial")
public class Jtoolbar extends JFrame{
	
	JToolBar jToolBar = new JToolBar();
	JButton jButton = new JButton();
	JButton jButton2 = new JButton();
	JTextField jTextField = new JTextField();
	String[] a = {"Awanish","2","3","4","5","6","7","8","9"};
	JComboBox<String> jComboBox = new JComboBox<String>(a);
	
	
	Jtoolbar(){
		setBounds(200, 100, 800, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jToolBar.setFloatable(false);   // make the toolbar floatable and donot allow the user to do so.
		
		jButton.setText("Button1");
		jButton2.setText("Button2");
		
		jToolBar.add(jButton);
		jToolBar.add(jButton2);

		jToolBar.addSeparator();  // used to separate the componenets
		jToolBar.add(jTextField);

		jToolBar.addSeparator();
		jToolBar.add(jComboBox);
		
		add(jToolBar, BorderLayout.NORTH);
		revalidate();
		
		
	}

	public static void main(String[] args) {
		
		new Jtoolbar();

	}

}
