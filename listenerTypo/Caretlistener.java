package swingByNonTelusko.listenerTypo;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

@SuppressWarnings("serial")
public class Caretlistener extends JFrame implements CaretListener{
	
	JTextArea jTextArea;
	JTextField jTextField;
	
	public Caretlistener() {
		
		Container c = getContentPane();
		c.setLayout(null);
		
		jTextArea = new JTextArea();
		jTextArea.setBounds(2, 80, 500, 300);
		add(jTextArea);
		
		jTextField = new JTextField();
		jTextField.setBounds(10, 10, 100, 30);
		add(jTextField);
		
		jTextField.addCaretListener(this);
		
		setBounds(100, 56, 500, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new Caretlistener();

	}

	@Override
	public void caretUpdate(CaretEvent e) {
		
		jTextArea.setText(jTextArea.getText() + "\n" + "Caret Updated : " + e.getDot() + " " + 
		e.getMark() );
		
	}

}
