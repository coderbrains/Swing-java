package swingByNonTelusko.listenerTypo;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Mousemotionlistener extends JFrame implements MouseMotionListener{
	
	JTextArea jTextArea;
	public Mousemotionlistener() {
		
		Container c = getContentPane();
		c.setLayout(null);
		
		jTextArea = new JTextArea();
		jTextArea.setBounds(120, 40, 150, 300);
		add(jTextArea);
		
		c.addMouseMotionListener(this);
		
		setBounds(100, 56, 500, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	

	public static void main(String[] args) {
		
		new Mousemotionlistener();

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
		jTextArea.setText(jTextArea.getText() + "\n" + "Mouse is Dragged");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		jTextArea.setText(jTextArea.getText() + "\n" + "Mouse is moved");
		
	}

}
