package swingByNonTelusko.advanceComponents;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

@SuppressWarnings("serial")
public class Popupmenu extends JFrame implements MouseListener{
	
	JPopupMenu popupMenu;
	JMenuItem menuItem1, menuItem2, menuItem3;
	
	public Popupmenu() {
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 56, 400, 500);
		
		popupMenu = new JPopupMenu();
		menuItem1 = new JMenuItem("Item 1");
		menuItem2 = new JMenuItem("Item 2");
		menuItem3 = new JMenuItem("Item 3");
		
		popupMenu.add(menuItem1);
		popupMenu.add(menuItem2);
		popupMenu.add(menuItem3);
		
		add(popupMenu);
		c.addMouseListener(this);
		
		
	}
	

	public static void main(String[] args) {
		
		new Popupmenu();
		

	}


	@Override
	public void mouseClicked(MouseEvent e) {
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getButton() == MouseEvent.BUTTON3) {
			popupMenu.show(this, e.getX(), e.getY());
		}
		
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
