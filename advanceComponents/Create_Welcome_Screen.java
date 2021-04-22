
package swingByNonTelusko.advanceComponents;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
@SuppressWarnings("serial")
public class Create_Welcome_Screen  extends JFrame{
	
	javax.swing.Timer timer;
	public Create_Welcome_Screen() {
		
		display();
		
		setLayout(null);
		
		setBounds(200, 100, 800, 500);
		//setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void display() {
		
		JWindow jWindow = new JWindow();
		jWindow.setBounds(200, 150, 600, 500);
		JPanel jPanel = new JPanel();
		jPanel.add(new JLabel("Welcome to coder brains"));
		jPanel.setBorder(BorderFactory.createLineBorder(Color.RED));
		jWindow.add(jPanel);
		
		JProgressBar jProgressBar = new JProgressBar(0, 100);
		jWindow.add(BorderLayout.PAGE_END, jProgressBar);
		
		timer = new javax.swing.Timer(100, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int x = jProgressBar.getValue();
				
				if(x == 100) {
					jWindow.dispose();
					Create_Welcome_Screen.this.setVisible(true);
					timer.stop();
				}else {
					jProgressBar.setValue(x+5);
				}
				
			}
		});
		
		timer.start();
		jWindow.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		
		new Create_Welcome_Screen();

	}

}
