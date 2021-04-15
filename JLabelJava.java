package swingByNonTelusko;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelJava {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		
		jFrame.setBounds(100, 100, 400, 600);
		jFrame.setLayout(new FlowLayout());
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel jLabel = new JLabel("Awanish Here", JLabel.LEFT);
		jLabel.setBounds(0, 100, 200, 200);
		
		jLabel.setText("Manish");
		

		
		jFrame.setTitle("DEMO");
		
		Font font = new Font("Arial",	Font.PLAIN, 50);
		
		jLabel.setFont(font);
		
		Container container = jFrame.getContentPane();
		
		container.add(jLabel);
		
	

	}

}
