package swingByNonTelusko;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Textarea {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		Container container = jFrame.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.BLUE);
		
		JTextArea jTextArea = new JTextArea();
		jTextArea.setBounds(20, 30, 200, 150);
		container.add(jTextArea);
		jTextArea.setLineWrap(true);
		Font f = new Font("Arial", Font.BOLD, 30);
		jTextArea.setFont(f);

		jFrame.setVisible(true);
		jFrame.setBounds(150, 55, 450, 300);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
