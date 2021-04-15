package swingByNonTelusko;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class BasicMethods {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		
		jFrame.setVisible(true);
		jFrame.setLayout(new FlowLayout());
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		jFrame.setLocation(200, 200);
//		jFrame.setSize(200, 200);
		
		/**
		 * Instead of using the below two methods 
		 * jFrame.setLocation(200, 200);
		 * jFrame.setSize(200, 200);
		 * We can also use :
		 */
		
		jFrame.setBounds(200, 200, 500, 500);
		jFrame.setTitle("Awanish Here");
		
		ImageIcon icon = new ImageIcon("D:\\New folder\\JAVA PROJECTS\\java programs\\swing\\src\\swingByNonTelusko");
		jFrame.setIconImage(icon.getImage());
		
		Container c = jFrame.getContentPane();
		c.setBackground(Color.RED);
		
		jFrame.setResizable(false);

	}

}
