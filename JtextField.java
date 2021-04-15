package swingByNonTelusko;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class JtextField {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		
		Container c = jFrame.getContentPane();
		
		JTextField jTextField = new JTextField(15);
		
		c.add(jTextField);
		
		jTextField.setText("Awanish Kumar Singh");
		jTextField.setForeground(Color.WHITE);
		jTextField.setBackground(Color.red);
		
		Font font = new Font("Arial", Font.BOLD, 10);
		
		jTextField.setFont(font);
		
		jTextField.setEditable(false);
		
		jFrame.setLayout(new FlowLayout());
		jFrame.setVisible(true);
		jFrame.setSize(300, 300);
//		jFrame.setResizable(false);
		jFrame.setLocation(200, 200);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		

	}

}

@SuppressWarnings("serial")
class Check extends JFrame{
	
	public Check() {
		
		
		
		
	}
	
}


