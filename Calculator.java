package swingByNonTelusko;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator {

	public static void main(String[] args) {
		
		new CalculatorImplementation();

	}
}

@SuppressWarnings("serial")
class CalculatorImplementation extends JFrame implements ActionListener{
	
	JLabel jLabel, jLabel2,jLabel3;
	JTextField jTextField, jTextField2;
	JButton mul, div, sub, add;
	
	public CalculatorImplementation() {
		
		final Container container = getContentPane();
		container.setLayout(null);
		
		jLabel = new JLabel();
		jLabel.setText("First Number - ");
		jLabel.setBounds(50, 30, 200, 40);
		add(jLabel);
		
		jTextField = new JTextField();
		jTextField.setBounds(180, 35, 200, 30);
		add(jTextField);
		
		jLabel2 = new JLabel();
		jLabel2.setText("Second Number - ");
		jLabel2.setBounds(50, 70, 200, 40);
		add(jLabel2);
		
		jTextField2 = new JTextField();
		jTextField2.setBounds(180, 70, 200, 30);
		add(jTextField2);
		
		jLabel3 = new JLabel();
		jLabel3.setText("Result :");
		jLabel3.setBounds(180, 110, 200, 30);
		add(jLabel3);
		
		
		add = new JButton();
		add.setText("+");
		add.setBounds(30, 150, 100, 50);
		add(add);
		
		mul = new JButton();
		mul.setText("*");
		mul.setBounds(130, 150, 100,50);
		add(mul);
		
		div = new JButton();
		div.setText("/");
		div.setBounds(230, 150, 100, 50);
		add(div);
		
		sub = new JButton();
		sub.setText("-");
		sub.setBounds(330, 150, 100, 50);
		add(sub);
		
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
	
		
		
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setBounds(200, 100, 500, 400);
	}
	
	 public void actionPerformed(ActionEvent e) {
		 
		 try {
			 int result = 0;
			 int a , b;
			 jLabel3.setForeground(Color.BLACK);
			 
			 if(e.getSource() == add) {
				 a = Integer.parseInt(jTextField.getText());
				 b = Integer.parseInt(jTextField2.getText());
				 result = a + b;
				 jLabel3.setText("Result : " + result);
			 }if(e.getSource() == sub) {
				 
				 a = Integer.parseInt(jTextField.getText());
				 b = Integer.parseInt(jTextField2.getText());
				 result = a - b;
				 jLabel3.setText("Result : " + result);
				 
			 }if(e.getSource() == mul) {
				 
				 a = Integer.parseInt(jTextField.getText());
				 b = Integer.parseInt(jTextField2.getText());
				 result = a * b;
				 jLabel3.setText("Result : " + result);
			 }if(e.getSource() == div) {
				 
				 a = Integer.parseInt(jTextField.getText());
				 b = Integer.parseInt(jTextField2.getText());
				 result = a / b;
				 jLabel3.setText("Result : " + result);
			 }
			 
		 }catch(ArithmeticException ae){
			 
			 jLabel3.setText("/ by Zero not Possible");
			 
		 }catch(NumberFormatException nfe) {
			 jLabel3.setText("Please Enter a number");
			 jLabel3.setForeground(Color.RED);
		 }
	 }
	
}
