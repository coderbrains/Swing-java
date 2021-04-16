package swingByNonTelusko.swingBasics;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MouseListener_Java {

	public static void main(String[] args) {
		
		new MouseActivity();

	}

}

@SuppressWarnings("serial")
class MouseActivity extends JFrame{
	
	public MouseActivity() {
		
		setSize(400, 400);
		setVisible(true);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("Mouse button is released");
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				int x = e.getX();
				int y = e.getY();
				
				System.out.println("X position is : " + x + " and y Position is : " + y);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				System.out.println("Mouse is out of the Box");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				System.out.println("Mouse entered The Box ");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				System.out.println("Mouse Clicked");
				
			}
		});
		
		
		
		
		
		
	}
}
