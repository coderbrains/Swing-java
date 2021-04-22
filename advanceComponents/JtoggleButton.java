package swingByNonTelusko.advanceComponents;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JToggleButton;


public class JtoggleButton extends JFrame{

	private static final long serialVersionUID = 1L;
	
	JToggleButton j1;
	//private Color bg;
	
	public JtoggleButton() {
		
		j1 = new JToggleButton();
		Container c = getContentPane();
		c.setLayout(null);
		j1.setBounds(50, 5, 100, 50);
		//bg = c.getBackground();
		add(j1);
		
		j1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(j1.isSelected()) {
					j1.setText("ON");
					//j1.setBackground(bg.YELLOW);
				}else {
					j1.setText("OFF");
					//j1.setBackground(bg.RED);
				}
				
			}
		});
		
		
		setBounds(200, 100, 800, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		new JtoggleButton();

	}

}
