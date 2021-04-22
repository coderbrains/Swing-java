package swingByNonTelusko.advanceComponents;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Html_Inspect_code extends JFrame{
	
	JEditorPane pane;
	public Html_Inspect_code() {
		
		pane = new JEditorPane();
		pane.setContentType("text/plain");
		add(pane, BorderLayout.CENTER);
		
		JButton jButton = new JButton();
		jButton.setText("Show html view");
		add(jButton, BorderLayout.PAGE_END);
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				display();
				
			}

		});
		
		setBounds(200, 100, 800, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	private void display() {
		
		JFrame jFrame = new JFrame();
		jFrame.setBounds(200, 200, 800, 500);
		jFrame.setVisible(true);
//		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JEditorPane j = new JEditorPane();
		j.setContentType("text/html");
		j.setText(pane.getText());
		jFrame.add(j, BorderLayout.CENTER);
		JButton jButton = new JButton("Correct Html");
		jFrame.add(jButton, BorderLayout.PAGE_END);
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				pane.setText(j.getText());
				
			}
		});
		
	}

	public static void main(String[] args) {
		
		new Html_Inspect_code();

	}

}
