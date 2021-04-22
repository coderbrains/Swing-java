package swingByNonTelusko.advanceComponents;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author Awanish kumar singh
 *
 */

public class Call_Frame_to_Frame{

	public static void main(String[] args) {
		
		new JFrame1();

	}
	
	
}

@SuppressWarnings("serial")
class JFrame1 extends JFrame{
	
	public JFrame1() {			
		
		setLayout(null);
		
		JTextField j1 = new JTextField();
		j1.setBounds(10,10,200, 30);
		add(j1);
		
		JButton j = new JButton();
		j.setText("Send");
		j.setBounds(220, 10, 100	, 30);
		add(j);
		
		j.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = j1.getText().toString();
				dispose();
				new Frame2(str);
			}
		});
		
		setBounds(200, 100, 800, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

@SuppressWarnings("serial")
class Frame2 extends JFrame{
	
	public Frame2(String str) {
		setLayout(null);
		JLabel j1 = new JLabel(str);
		j1.setBounds(100, 50, 150, 40);
		add(j1);
		
		JButton b1 = new JButton();
		b1.setBounds(150, 100, 100, 30);
		b1.setText("Back");
		add(b1);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new JFrame1();
				dispose();
			}
		});
		
		setBounds(200, 100, 800, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}


