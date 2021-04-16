package swingByNonTelusko.swingBasics;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AdditionOfTwoNumbers {

	public static void main(String[] args) {
		
		Addition addition = new Addition();
		
		addition.setSize(400, 600);
		

	}

}

@SuppressWarnings("serial")
class Addition extends JFrame{
	
	JTextField jTextField, jTextField1;
	JButton jButton;
	JLabel jLabel;
	
	public Addition() {
		
		jTextField = new JTextField(10);
		jTextField1 = new JTextField(10);
		jButton = new JButton("Result");
		jLabel = new JLabel("result");
		
		add(jTextField);
		add(jTextField1);
		add(jButton);
		add(jLabel);
		
		//jButton.addActionListener(this); // This is an Interface
		
		// Instead of using the above 45th line we can use the following code.We have 
		// to remove the Action Listener from implementation from the top class.
		
		/**
		 * This is the method two
		 */
		
//		ActionListener actionListener = new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				int num1 = Integer.parseInt(jTextField.getText());
//				int num2 = Integer.parseInt(jTextField1.getText());
//				num1 = num1 + num2;
//				jLabel.setText(num1 + "");
//				
//			}
//		};
//		
//		jButton.addActionListener(actionListener);
		
		/**
		 * Now method three.........
		 */
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int num1 = Integer.parseInt(jTextField.getText());
				int num2 = Integer.parseInt(jTextField1.getText());
				num1 = num1 + num2;
				jLabel.setText(num1 + "");
				
			}
		});
		
		
		setLayout(new FlowLayout());
		setSize(500, 500);
		setVisible(true);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		
//		int num1 = Integer.parseInt(jTextField.getText());
//		int num2 = Integer.parseInt(jTextField1.getText());
//		num1 = num1 + num2;
//		
//		jLabel.setText(num1 + "");
//		
//	}
}
