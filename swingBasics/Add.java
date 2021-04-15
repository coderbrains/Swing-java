/**
 * @author Awanish kumar singh
 */

package swingByNonTelusko.swingBasics;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Add {
	
	
	
	public static void main(String[] args) {
		
		Add2num add2num = new Add2num();
		
		
	}

}

//class Add2num extends JFrame implements ActionListener{
//	
//	JTextField jTextField, jTextField2;
//	JButton jButton;
//	JLabel jLabel;
//	
//	public Add2num() {
//		
//		jTextField = new JTextField(10);
//		jTextField2 = new JTextField(10);
//		jButton = new JButton("Result");
//		jLabel = new JLabel("Ans");
//		
//		add(jTextField);
//		add(jTextField2);
//		add(jButton);
//		add(jLabel);
//		
//		jButton.addActionListener(this);
//		
//		
//		setSize(400, 600);
//		setVisible(true);
//		setLayout(new FlowLayout());
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		
//		int a = Integer.parseInt(jTextField.getText());
//		int b = Integer.parseInt(jTextField2.getText());
//		a = a + b;
//		jLabel.setText(a + "");
//	}
//}


/**
 * 
 * @author Awanish kumar singh
 * 
 * This is the second method
 *
 */




//class Add2num extends JFrame{
//	
//	JTextField jTextField, jTextField2;
//	JButton jButton;
//	JLabel jLabel;
//	
//	public Add2num() {
//		
//		jTextField = new JTextField(10);
//		jTextField2 = new JTextField(10);
//		jButton = new JButton("Result");
//		jLabel = new JLabel("Ans");
//		
//		add(jTextField);
//		add(jTextField2);
//		add(jButton);
//		add(jLabel);
//		
//		ActionListener actionListener = new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				int a = Integer.parseInt(jTextField.getText());
//				int b = Integer.parseInt(jTextField2.getText());
//				a = a + b;
//				jLabel.setText(a + "");
//				
//			}
//		};
//		
//		jButton.addActionListener(actionListener);
//		
//		
//		setSize(400, 600);
//		setVisible(true);
//		setLayout(new FlowLayout());
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
//
//}


/**
 * 
 * @author Awanish kumar singh
 * 
 * This is the Third method
 *
 */



class Add2num extends JFrame{
	
	JTextField jTextField, jTextField2;
	JButton jButton;
	JLabel jLabel;
	
	public Add2num() {
		
		jTextField = new JTextField(10);
		jTextField2 = new JTextField(10);
		jButton = new JButton("Result");
		jLabel = new JLabel("Ans");
		
		add(jTextField);
		add(jTextField2);
		add(jButton);
		add(jLabel);
		
		ActionListener actionListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(jTextField.getText());
				int b = Integer.parseInt(jTextField2.getText());
				a = a + b;
				jLabel.setText(a + "");
				
			}
		};
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int a = Integer.parseInt(jTextField.getText());
				int b = Integer.parseInt(jTextField2.getText());
				a = a + b;
				jLabel.setText(a + "");
			}
		});
		
		
		setSize(400, 600);
		setVisible(true);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
