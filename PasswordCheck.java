package swingByNonTelusko;

import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class PasswordCheck {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		
		
		JPasswordField jPasswordField = new JPasswordField(10);
		
		jFrame.add(jPasswordField);
		
		JCheckBox jCheckBox = new JCheckBox("Show Password");
		
		jFrame.add(jCheckBox);
		
		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
		jCheckBox.setCursor(cursor);
		
		jCheckBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				if(jCheckBox.isSelected()) {
					jPasswordField.setEchoChar((char)0);
				}else {
					jPasswordField.setEchoChar('*');
				}
				
				
				
				
			}
		});
		

		jFrame.setVisible(true);
		jFrame.setLayout(new FlowLayout());
		jFrame.setBounds(150, 50, 400, 500);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
