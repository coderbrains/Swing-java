package swingByNonTelusko.swingBasics;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator {

	public static void main(String[] args) {
		
		Calci calci = new Calci();
		

	}

}


class Calci extends JFrame implements ActionListener{
	
	JTextField jTextField1, jTextField2;
	JButton add, mul, sub, div;
	JLabel answer;
	
	public Calci() {
		
		
		
		jTextField1 = new JTextField(23);
		jTextField2 = new JTextField(23);
		add = new JButton("+");
		sub = new JButton("-");
		mul = new JButton("*");
		div = new JButton("/");
		answer = new JLabel("Answer");
		add(jTextField1);
		add(jTextField2);
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(answer);
		
		setLayout(new FlowLayout());
		setSize(500, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/**
		 * Method1
		 */
		
//		add.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				int a = Integer.parseInt(jTextField1.getText());
//				int b = Integer.parseInt(jTextField2.getText());
//				
//				int value  = a + b;
//				answer.setText(value + "");
//			}
//		});
//		
//		mul.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				int a = Integer.parseInt(jTextField1.getText());
//				 int b = Integer.parseInt(jTextField2.getText());
//				int value  = a * b;
//				answer.setText(value + "");
//			}
//		});
//		
//		div.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				int a = Integer.parseInt(jTextField1.getText());
//				int b = Integer.parseInt(jTextField2.getText());
//				if(b==0) {
//					answer.setText("Undefined");
//				}else {
//					int value  = a / b;
//					answer.setText(value + "");
//				}
//				
//				
//			}
//		});
//		
//		sub.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//				int a = Integer.parseInt(jTextField1.getText());
//				int b = Integer.parseInt(jTextField2.getText());
//				int value  = a - b;
//				answer.setText(value + "");
//				
//			}
//		});
		
		/**
		 * Method two 
		 * We have to implement the Action Click Listener for this method
		 */
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int a = Integer.parseInt(jTextField1.getText());
		int b = Integer.parseInt(jTextField2.getText());
		int value = 0;
		
		if(e.getSource() == add) {
			value  = a + b;
			
			
		}else if(e.getSource() == sub) {
			value  = a - b;
			
			
		}else if(e.getSource() == mul) {
			value  = a * b;
			
			
		}else {
			value  = a / b;
			
			
		}
		
		answer.setText(value + "");
		
		
	}
}
