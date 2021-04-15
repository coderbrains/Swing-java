package swingByNonTelusko.listenerTypo;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class MouseclickListener extends JFrame implements MouseListener{
	
	
	JTextArea jTextArea;
	public MouseclickListener() {

		Container c = getContentPane();
		c.setLayout(null);
		
		jTextArea = new JTextArea();
		jTextArea.setBounds(120, 40, 150, 300);
		add(jTextArea);
		
		c.addMouseListener(this);
		
		setBounds(100, 56, 500, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new MouseclickListener();
		

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		jTextArea.setText(jTextArea.getText() + "\n" + "Mouse is Clicked");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		jTextArea.setText(jTextArea.getText() + "\n" + "Mouse is Pressed");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		jTextArea.setText(jTextArea.getText() + "\n" + "Mouse is Realesed");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
		jTextArea.setText(jTextArea.getText() + "\n" + "Mouse is Entered");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
		jTextArea.setText(jTextArea.getText() + "\n" + "Mouse is Exited");
		
	}

}
