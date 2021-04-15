package swingByNonTelusko.listenerTypo;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;

/**
 * 
 * @author Awanish kumar singh
 *
 *Commonly works on the minimize, maximize, close button ;
 */
@SuppressWarnings("serial")
public class Windowstatelistener extends JFrame implements WindowStateListener{
	
	public Windowstatelistener() {
		
		this.addWindowStateListener(this);
		
		
		setBounds(100, 56, 500, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Windowstatelistener();

	}

	@Override
	public void windowStateChanged(WindowEvent e) {
		
		System.out.println("Window state changed");
		
	}

}
