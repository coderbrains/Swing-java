package swingByNonTelusko.advanceComponents;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;

/**
 * @author Awanish kumar singh
 * 
 * JWindow is  a top levelcontainer like jFrame but the major difference is that JWindow 
 * doesnot have title bar .
 * It has no close, maximize, minimize buttons
 * It can be displayed anywhere on the user's screen.
 *
 */

@SuppressWarnings("serial")
public class Jwindow extends JFrame{

	public Jwindow() {
setLayout(null);
		
		
		
		JButton j = new JButton();
		j.setText("Send");
		j.setBounds(220, 10, 100	, 30);
		add(j);
		
		j.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JWindow j1 = new JWindow();
				j1.setBounds(300, 200, 200, 200);
				JPanel jPanel = new JPanel();
				jPanel.setBackground(Color.RED);
				jPanel.add(new JLabel("This is JPanel"));
				j1.add(jPanel);
				j1.setVisible(true);
				
				
				
			}
		});
		
		setBounds(200, 100, 800, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		
		new Jwindow();
	}
	
}
