package swingByNonTelusko.advanceComponents;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

@SuppressWarnings("serial")
public class Jtabbedpane extends JFrame{
	
	public Jtabbedpane() {
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JTabbedPane jTabbedPane = new JTabbedPane();
		jTabbedPane.setBounds(50, 50, 200, 100);
		add(jTabbedPane);
		
		JPanel jPanel = new JPanel();
		JPanel jPanel1 = new JPanel();
		JPanel jPanel2 = new JPanel();
		JPanel jPanel3 = new JPanel();
		
		jPanel.add(new JLabel("This is my first page"));
		jPanel1.add(new JLabel("This is my Second page"));
		jPanel2.add(new JLabel("This is my Third page"));
		jPanel3.add(new JLabel("This is my Fourth page"));
		
		jTabbedPane.add("First",jPanel);
		jTabbedPane.add("second",jPanel1);
		jTabbedPane.add("Third",jPanel2);
//		jTabbedPane.add("Fourth",jPanel3);
		
		jPanel.setBackground(Color.RED);
		
		setVisible(true);
		setBounds(100, 56, 400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		new Jtabbedpane();

	}

}
