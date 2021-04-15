package swingByNonTelusko;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ChangeColor2 {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		final Container container = jFrame.getContentPane();
		container.setLayout(null);
		
		JButton jButton = new JButton();
		jButton.setText("red");
		jButton.setBounds(50, 20, 80, 20);
		container.add(jButton);
		
		JButton jButton2 = new JButton();
		jButton2.setText("Black");
		jButton2.setBounds(120, 20, 80, 20);
		container.add(jButton2);
		
		JButton jButton3 = new JButton();
		jButton3.setText("Green");
		jButton3.setBounds(200, 20, 80, 20);
		container.add(jButton3);
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				container.setBackground(Color.RED);
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				container.setBackground(Color.BLACK);
				
			}
		});
		
		jButton3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				container.setBackground(Color.GREEN);
				
			}
		});
		
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
		jFrame.setBounds(100, 56, 400, 300);
		

	}

}
