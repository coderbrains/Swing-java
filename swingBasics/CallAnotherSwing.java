package swingByNonTelusko.swingBasics;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CallAnotherSwing {

	public static void main(String[] args) {
		X x = new X();
		

	}

}

class X extends JFrame{
	
	JButton jButton;
	
	X(){
		
		jButton = new JButton("OK");
		add(jButton);
		
		setSize(500, 500);
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new Y();
				
				//If it is called then the calling Frame turns off automatically when calls anoth
				//er GUI frame.
				dispose();
				
				
			}
		});
		
		
		
		
	}
	
}

class Y extends JFrame{
	
	JLabel jButton = new JLabel();
	
	Y(){
		
		jButton = new JLabel("OK");
		add(jButton);
		
		setSize(500, 500);
		setLocation(200, 200);
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
