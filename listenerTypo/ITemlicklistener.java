package swingByNonTelusko.listenerTypo;

import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class ITemlicklistener extends JFrame implements ItemListener{
	
	JTextArea jtextField;
	JCheckBox jCheckBox,c2, c3, c4;
	JRadioButton male, female;
	
	public ITemlicklistener() {
		
		Container c = getContentPane();
		c.setLayout(null);
		
		jtextField = new JTextArea();
		jtextField.setBounds(200, 50, 200, 60);
		add(jtextField);
		
		male = new JRadioButton();
		female = new JRadioButton();
		ButtonGroup bg = new ButtonGroup();
		bg.add(male);
		bg.add(female);
		male.setText("Male");
		female.setText("Female");
		male.setBounds(50, 50, 100, 30);
		female.setBounds(50, 90, 100, 30);
		add(male);
		add(female);
		
		male.addItemListener(this);
		female.addItemListener(this);
		
		jCheckBox = new JCheckBox();
		c2 = new JCheckBox();
		c3 = new JCheckBox();
		c4 = new JCheckBox();
		
		jCheckBox.setText("Awanish");
		c2.setText("Manish");
		c3.setText("Siwan");
		c4.setText("Bihar");
		
		jCheckBox.setBounds(50, 150, 100, 30);
		add(jCheckBox);
		c2.setBounds(50, 182, 100, 30);
		add(c2);
		c3.setBounds(50, 220, 100, 30);
		add(c3);
		c4.setBounds(50, 250, 100, 30);
		add(c4);
		
		
		
		jCheckBox.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150,75, 500, 600);
	}

	public static void main(String[] args) {
		
		new ITemlicklistener();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if(male.isSelected()){
			jtextField.setText(jtextField.getText() + "Male is Clicked");
		}if(female.isSelected()) {
			jtextField.setText(jtextField.getText() + "Female is Clicked");
		}if(jCheckBox.isSelected()) {
			jtextField.setText(jtextField.getText() +"\n" + "Awanish is Selected");
		}if(c2.isSelected()) {
			jtextField.setText(jtextField.getText() + "\n" + "Manish is Selected");
		}if(c3.isSelected()) {
			jtextField.setText(jtextField.getText() + "\n" + "Siwan is Selected");
		}if(c4.isSelected()) {
			jtextField.setText(jtextField.getText() +"\n" + "Bihar is Selected");
		}
		
	}

}
