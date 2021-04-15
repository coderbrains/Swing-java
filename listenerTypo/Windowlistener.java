package swingByNonTelusko.listenerTypo;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Windowlistener extends JFrame implements WindowListener{
	
	public Windowlistener() {
		
		this.addWindowListener(this);
		
		setBounds(100, 56, 500, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new Windowlistener();

	}

	@Override
	public void windowOpened(WindowEvent e) {
		
		System.out.println("Window opened");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		
		System.out.println("Window Closed");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
		System.out.println("Window Closed");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
		System.out.println("Window Iconified");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
		System.out.println("Window Deiconified");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		
		System.out.println("Window Activated");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
		System.out.println("Window Deactivated");
		
	}

}
