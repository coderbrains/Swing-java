package swingByNonTelusko;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginPage{

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		Container container = jFrame.getContentPane();
		jFrame.setTitle("Login Page");
		String user = "admin123", password = "123456789";
		container.setLayout(null);
		Cursor cursor = new Cursor(Cursor.TEXT_CURSOR);
		
		JLabel jLabel = new JLabel();
		jLabel.setText("User_Name - ");
		jLabel.setBounds(100, 30, 200, 40);
		container.add(jLabel);
		
		JTextField jTextField = new JTextField();
		jTextField.setBounds(203, 35, 200, 30);
		jTextField.setCursor(cursor);
		container.add(jTextField);
		
		
		JLabel jLabel1 = new JLabel();
		jLabel1.setText("Password -  ");
		jLabel1.setBounds(100, 94, 200, 40);
		container.add(jLabel1);
		
		JPasswordField jTextField1 = new JPasswordField();
		jTextField1.setBounds(203, 99, 200, 30);
		jTextField1.setEchoChar('*');
		jTextField1.setCursor(cursor);
		container.add(jTextField1);		
		
		JCheckBox jCheckBox = new JCheckBox();
		jCheckBox.setText("Show Password");
		jCheckBox.setBounds(203, 135, 300, 20);
		container.add(jCheckBox);
		jCheckBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(jCheckBox.isSelected()) {
					jTextField1.setEchoChar((char)0);
				}else {
					jTextField1.setEchoChar('*');
				}
				
			}
		});
		
		JLabel jLabel2 = new JLabel();
		jLabel2.setText("Login Required");
		jLabel2.setBounds(150, 200, 190, 60);
		container.add(jLabel2);
		
		
		JButton jButton = new JButton();
		jButton.setText("Login");
		Cursor cursor1 = new Cursor(Cursor.HAND_CURSOR);
		jButton.setCursor(cursor1);
		jButton.setBounds(100, 160, 100, 30);
		container.add(jButton);
		jButton.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(jTextField.getText().equals(user) && jTextField1.getText().equals(password)) {
					new Check1();
					jFrame.dispose();
				}else {
					
					jLabel2.setText("This is a illigal Login Method " );
					
				}
				
			}
		});
		
		
		

		
		jFrame.setVisible(true);
		jFrame.setSize(300, 300);
		jFrame.setResizable(false);
		jFrame.setBounds(200, 200, 500, 300);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

@SuppressWarnings("serial")
class Check1 extends JFrame{
	JTextField jTextField1,jTextField2;
	JButton jButton;
	JLabel jLabel;
	
	public Check1() {
		
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
		setBounds(100, 60, 400, 200);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
