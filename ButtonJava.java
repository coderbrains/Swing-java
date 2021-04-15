package swingByNonTelusko;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonJava {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		
		Container container = jFrame.getContentPane();
		
		JButton jButton= new JButton();
		
		jButton.setText("Click me");
		
		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
		
		jButton.setCursor(cursor);
		
		container.add(jButton);
		
		jButton.setBackground(Color.blue);
		jButton.setForeground(Color.WHITE);
		
		
		
		jFrame.setVisible(true);
		jFrame.setBounds(100, 40, 400, 500);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setLayout(new FlowLayout());

	}

}
