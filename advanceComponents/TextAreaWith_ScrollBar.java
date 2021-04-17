package swingByNonTelusko.advanceComponents;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class TextAreaWith_ScrollBar extends JFrame{
	
	public TextAreaWith_ScrollBar() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JTextArea j = new JTextArea(10,15);
		j.setLineWrap(true);
		j.setForeground(Color.WHITE);
		j.setBackground(Color.BLUE);
		
		JScrollPane jScrollPane = new JScrollPane(j, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		add(jScrollPane);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 55, 500, 600);
	}

	public static void main(String[] args) {
		
		new TextAreaWith_ScrollBar();
		
	}

}
