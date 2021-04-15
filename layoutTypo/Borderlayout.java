package swingByNonTelusko.layoutTypo;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Borderlayout  extends JFrame {
	
	public Borderlayout() {
		
		Container c = getContentPane();
		
		JButton jButton = new JButton("Page_Start");
		JButton jButton1 = new JButton("Page_End");
		JButton jButton2 = new JButton("Page_Left");
		JButton jButton3 = new JButton("Page_Right");
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Hello");
				
				
			}
		});
		
		c.add(jButton, BorderLayout.PAGE_START);
		c.add(jButton1, BorderLayout.PAGE_END);
		c.add(jButton2, BorderLayout.LINE_START);
		c.add(jButton3, BorderLayout.LINE_END);
		
		
		setBounds(100, 56, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		

		new Borderlayout();
		
	}

}
