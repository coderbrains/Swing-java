package swingByNonTelusko.listenerTypo;

import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Focuslistener extends JFrame implements FocusListener{
	
	JTextArea jTextArea;
	JTextField jTextField;
	
	public Focuslistener() {
		
		Container c = getContentPane();
		c.setLayout(null);
		
		jTextArea = new JTextArea();
		jTextArea.setBounds(120, 40, 150, 300);
		add(jTextArea);
		
		jTextField = new JTextField();
		jTextField.setBounds(10, 10, 100, 30);
		add(jTextField);
		
		jTextField.addFocusListener(this);
		
		setBounds(100, 56, 500, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		
		new Focuslistener();

	}

	@Override
	public void focusGained(FocusEvent e) {
		
		jTextArea.setText(jTextArea.getText() + "\n" + "Focus Gained");
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		
		jTextArea.setText(jTextArea.getText() + "\n" + "Focus Lost");
		
	}

}
