package swingByNonTelusko.advanceComponents;

import java.awt.Container;

/**
 * @author Awanish kumar singh
 * 	
 * 	ToolTip :- it is a message that appears when a cursur is positioned over an icon
 * 				imageLink, hyperLink, or other elemnt in GUI.
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class Tool_tip extends JFrame {
	
	public Tool_tip() {
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel password = new JLabel("Password : - ");
		password.setBounds(100, 100, 100, 30);
		add(password);
		
		JPasswordField jPasswordField = new JPasswordField();
		jPasswordField.setBounds(220, 100, 100, 30);
		add(jPasswordField);
		
		//For Single Line
//		jPasswordField.setToolTipText("Enter Your password ");
		
		//For multiple line, we use :-
		
		String str = "<html>"
				+ "<div bgcolor = '#800080' color = '#ffffff'>"
				+ "Enter Your password <br/>"
				+ "Password should be at length 8"
				+ "</div>"
				+ "</html>";
		
		jPasswordField.setToolTipText(str);
				
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 500, 600);
		
	}

	public static void main(String[] args) {
		
		new Tool_tip();
	}

}
