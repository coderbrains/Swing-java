package swingByNonTelusko.advanceComponents;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;

/**
 * 
 * @author Awanish kumar singh
 * JEditorPane - A class used to create a simple text editor window. It has the following window:
 * 
 * 1.setContentType()
 * 2.setText();
 *
 */

@SuppressWarnings("serial")
public class JeditorPane extends JFrame{
	
	JEditorPane j1;
	
	public JeditorPane() {
		
		j1 = new JEditorPane();
		j1.setContentType("text/html");
		
		j1.setText("<h1 align=\"center\">Hi 👋, I'm Awanish kumar singh Pandey</h1>\r\n" + 
				"<h3 align=\"center\">Programming enthusiast || Developer || Data structures & Algorithms (Java) || Geeks for geeks || PHILANTHROPIST ||Active Open Source Contributor @github || </h3>\r\n" + 
				"\r\n" + 
				"- 🔭 I’m currently working on **JAVA DEVELOPMENT,ANDROID DEVELOPMENT and a passionate doing open source Contribution**\r\n" + 
				"\r\n" + 
				"- 🤝 I’m looking for help with **Developers and Like minded people**\r\n" + 
				"\r\n" + 
				"- 💬 Ask me about **C/JAVA Datastructures and Algorithms**\r\n" + 
				"\r\n" + 
				"- 📫 How to reach me **awanishkumarsingh03@gmail.com**\r\n" + 
				"- 📫 How to Contact me **9102504188**\r\n" + 
				"\r\n" + 
				"- ⚡ Fun fact **Coding/Development is the only thing that brings immense joy as well as immense pain :)**\r\n" + 
				"- Ultimate Life Motto: Character and Perspective is everything :)\r\n" + 
				"\r\n" + 
				"<h3 align=\"left\">Connect with me:</h3>\r\n" + 
				"<p align=\"left\">\r\n");
		
		add(j1, BorderLayout.CENTER);
		
		JButton jButton = new JButton();
		jButton.setText("Show html code");
		add(jButton, BorderLayout.PAGE_END);
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("" + j1.getText());
				
			}
		});
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 60, 700, 500);
	}

	public static void main(String[] args) {
		
		new JeditorPane();

	}

}
