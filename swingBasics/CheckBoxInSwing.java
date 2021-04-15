package swingByNonTelusko.swingBasics;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CheckBoxInSwing {

	public static void main(String[] args) {
		
		CheckDemo checkDemo = new CheckDemo();

	}

}

class CheckDemo extends JFrame implements ActionListener{
	
	JTextField jTextField;
	JCheckBox c1, c2;
	JButton jButton;
	JLabel jLabel;
	JRadioButton jRadioButton1, jRadioButton2;
	ButtonGroup buttonGroup;
	
	public CheckDemo() {
		
		
		jTextField = new JTextField(10);
		c1 = new JCheckBox("Dancer");
		c2 = new JCheckBox("Singer");
		jButton = new JButton("OK");
		jLabel = new JLabel("answer");
		jRadioButton1 = new JRadioButton("Male");
		jRadioButton2 = new JRadioButton("Female");
		buttonGroup = new ButtonGroup();
		buttonGroup.add(jRadioButton1);
		buttonGroup.add(jRadioButton2);
		
		add(jTextField);
		add(c1);
		add(c2);
		add(jRadioButton1);
		add(jRadioButton2);
		add(jButton);
		add(jLabel);
		
		jButton.addActionListener(this);
		
		c1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				System.out.println("Dancer");
				
			}
		});
		
		
		setSize(500, 600);
		setVisible(true);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String string = jTextField.getText();
		if(c1.isSelected()) {
			
			string = string + " Dancer";
			
		}if(c2.isSelected()) {
			string = string + " Singer";
			
		}if(jRadioButton1.isSelected()) {
			string = string + " male";
		}if(jRadioButton2.isSelected()) {
			string = string + " female";
		}
		jLabel.setText(string);
		
		
		
		
		
	}
	
}
