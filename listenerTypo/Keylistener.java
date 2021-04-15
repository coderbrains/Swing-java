package swingByNonTelusko.listenerTypo;

import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Keylistener extends JFrame implements KeyListener{
	
	JTextArea jTextField;
	
	public Keylistener(){
		
		Container c = getContentPane();
		c.setLayout(null);
		
		jTextField = new JTextArea();
		jTextField.setBounds(20, 50, 200, 100);
		add(jTextField);
		
		jTextField.addKeyListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150,75, 500, 600);
	}

	public static void main(String[] args) {
		
		new Keylistener();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		jTextField.setText(jTextField.getText() + "\n" + "Key is typed :");
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		jTextField.setText(jTextField.getText() + "\n" +"Key is pressed");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		jTextField.setText(jTextField.getText() + "\n" + "Key is released");
		
	}
	
	

}
