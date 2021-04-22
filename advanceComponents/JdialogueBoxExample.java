package swingByNonTelusko.advanceComponents;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 
 * @author Awanish kumar singh
 *
 */


@SuppressWarnings("serial")
public class JdialogueBoxExample extends JFrame{
	JButton jButton;
	public JdialogueBoxExample() {
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		jButton = new JButton();
		jButton.setText("Button");
		add(jButton);
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JDialog j = new JDialog();
				j.setTitle("Hello");
				j.add(new JLabel("This is my check1"));
				j.setVisible(true);
				j.setBounds(0, 0, 100, 200);
//				add(j);
				
			}
		});
		
		setBounds(200, 100, 800, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		new JdialogueBoxExample();

	}

}
