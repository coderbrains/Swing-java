package swingByNonTelusko.swingBasics;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Minus {

	public static void main(String[] args) {
		
		Subtraction subtraction = new Subtraction();
		
		
		
		
		

	}

}

@SuppressWarnings("serial")
class Subtraction extends JFrame {
	
	JTextField jTextField1,jTextField2;
	JButton jButton;
	JLabel jLabel;
	
	public Subtraction() {
		
		JTextField jTextField1,jTextField2;
		JButton jButton;
		JLabel jLabel;
		
		jTextField1 = new JTextField(10);
		jTextField2 = new JTextField(10);
		jButton = new JButton("-");
		jLabel = new JLabel("Answer");
		
		add(jTextField1);
		add(jTextField2);
		add(jButton);
		add(jLabel);
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(jTextField1.equals(null) && jTextField2.equals(null)) {
					jLabel.setText("Plz Fill the Specified block to get the Answer");
					
				}else {
					int a = Integer.parseInt(jTextField1.getText());
					int b = Integer.parseInt(jTextField2.getText());
					a = a - b;
					jLabel.setText(a + " ");
				}
				
				
			}
		});
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(200, 400);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
