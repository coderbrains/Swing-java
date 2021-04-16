package swingByNonTelusko.layoutTypo;


/**
 * @author Awanish kumar singh
 * This is card layout . It converts each and every Component as card shows only one card at a time.
 */
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class CardLayout_Java extends JFrame{
	
	public CardLayout_Java() {
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 45, 500, 600);
		Container c = getContentPane();
		CardLayout l = new CardLayout();
		c.setLayout(l);
		
		JButton j1 = new JButton("Button1");
		JButton j2 = new JButton("Button2");
		JButton j3 = new JButton("Button3");
		JButton j4 = new JButton("Button4");
		
		add(j1);
		add(j2);
		add(j3);
		add(j4);
		
		j1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				l.next(c);  // Shows The next card 
				
			}
		});
		
		j2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				l.previous(c);  // Shows the previous button
				
				
			}
		});
		
	}
	

	public static void main(String[] args) {
		
		new CardLayout_Java();

	}

}
