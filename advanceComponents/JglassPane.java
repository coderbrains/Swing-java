package swingByNonTelusko.advanceComponents;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * @author Awanish kumar singh
 * 
 * 	GlassPane is a conatiner showing like a glass showing at the top of a content pane.
 * 	It is transparent and hidden by default.
 * 	
 *
 */

@SuppressWarnings("serial")
public class JglassPane extends JFrame{
	
	JglassPane(){
		setVisible(true);
		setLayout(new FlowLayout());
		setBounds(200, 100, 800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton click = new JButton("CLick me");
		JButton show = new JButton("Show");
		
		JLabel jLabel = new JLabel();
		jLabel.setText("Hi !! Everyone this is Awanish Singh");
		add(jLabel);
		
		add(click);
		add(show);
		
		click.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				jLabel.setVisible(!jLabel.isVisible());
				
			}
		});
		
		setGlassPane(new JComponent() {
			
			@Override
			protected void paintComponent(Graphics g) {
				g.setColor(new Color(0,0,0,150));
				g.fillRect(0, 0, getWidth()	, getHeight());
				
			}
		});
		
		final Container c = (Container)getGlassPane();

		c.addMouseListener(new MouseAdapter() {
		});
		JButton jButton = new JButton("Hide");
		jButton.setBounds(getWidth()/3, getHeight() / 2, 100, 50);
		c.add(jButton);
		
		show.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				c.setVisible(true);
				
				
			}
		});
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				c.setVisible(false);
				
				
			}
		});
		
		
	}

	public static void main(String[] args) {
		
		new JglassPane();

	}

}
