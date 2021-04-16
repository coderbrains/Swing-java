package swingByNonTelusko.swingBasics;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

public class ProgressBar {

	public static void main(String[] args) {
		
		new XYZ();

	}

}

@SuppressWarnings("serial")
class XYZ extends JFrame implements ActionListener{
	
	JButton jButton;
	javax.swing.Timer timer;
	JProgressBar jProgressBar;
	int i = 0;
	
	public XYZ() {
		
		jButton = new JButton("OK");
		timer = new javax.swing.Timer(100, this);
		jProgressBar = new JProgressBar(0, 20);
		add(jButton);
		add(jProgressBar);
		
		
		
		
		setSize(500, 500);
		setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				timer.start();
				
			}
		});
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(i == 20) {
			new XY();
			dispose();
		}
		i++;
		jProgressBar.setValue(i);
		
	}
}

@SuppressWarnings("serial")
class XY extends JFrame{
	
	JTextField jTextField, jTextField1;
	JButton jButton;
	JLabel jLabel;
	
	public XY() {
		
		jTextField = new JTextField(10);
		jTextField1 = new JTextField(10);
		jButton = new JButton("Result");
		jLabel = new JLabel("result");
		
		add(jTextField);
		add(jTextField1);
		add(jButton);
		add(jLabel);
		
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
}
