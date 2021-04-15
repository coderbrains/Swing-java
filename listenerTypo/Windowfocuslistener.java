package swingByNonTelusko.listenerTypo;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Windowfocuslistener extends JFrame implements WindowFocusListener{
	
	public Windowfocuslistener() {
		
		this.addWindowFocusListener(this);
		
		
		setBounds(100, 56, 500, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Windowfocuslistener();
		

	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		System.out.println("Window gained Focus");
		
	}

	@Override
	public void windowLostFocus(WindowEvent e) {

		System.out.println("Window Lost Focus");
		
	}

}
