package swingByNonTelusko;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ColorChange  extends JFrame implements ActionListener{
	
	JButton jButton, jButton2, jButton3;
	Container container;
	
	public ColorChange() {
		
		
		container = getContentPane();
		container.setLayout(null);
		
		jButton = new JButton();
		jButton.setText("red");
		jButton.setBounds(50, 20, 80, 20);
		container.add(jButton);
		
		jButton2 = new JButton();
		jButton2.setText("Black");
		jButton2.setBounds(120, 20, 80, 20);
		container.add(jButton2);
		
		jButton3 = new JButton();
		jButton3.setText("Green");
		jButton3.setBounds(200, 20, 80, 20);
		container.add(jButton3);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setBounds(100, 56, 400, 300);
		
		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
		
		jButton.setCursor(cursor);
		jButton2.setCursor(cursor);
		jButton3.setCursor(cursor);
		
		jButton.addActionListener(this);
		jButton2.addActionListener(this);
		jButton3.addActionListener(this);
		
	}

	public static void main(String[] args) {
		
		new ColorChange();
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(e.getSource() == jButton) {
			
			container.setBackground(Color.RED);
			
		}if(e.getSource() == jButton2) {
			
			container.setBackground(Color.BLACK);
			
		}if(e.getSource() == jButton3) {
			
			container.setBackground(Color.GREEN);
			
		}
		
	}

}
