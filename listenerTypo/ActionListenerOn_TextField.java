package swingByNonTelusko.listenerTypo;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ActionListenerOn_TextField  extends JFrame implements ActionListener{
	
	JTextField jTextField ;
	
	public ActionListenerOn_TextField() {
		
		Container c = getContentPane();
		c.setLayout(null);
		
		jTextField = new JTextField();
		jTextField.setBounds(150, 200, 100, 30);
		add(jTextField);
		
		jTextField.addActionListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 50, 500, 600);
	}

	public static void main(String[] args) {
		
		new ActionListenerOn_TextField();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		jTextField.setText(jTextField.getText().toUpperCase());
		
	}

}
