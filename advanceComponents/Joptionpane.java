package swingByNonTelusko.advanceComponents;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 
 * @author Awanish kumar singh
 * Joptionpane is used for the following:-
 * 1.Show an input dialogue - 
 * 		String str = JoptionPane.showInputDialogue("Enter your name");
 * 2.show a message dialogue
 * 		JOptionPane.showMessageDialogue(parent, message, title, message_type); 
 * 		Message_types:-
 * 
 * 		1.JOptionPane.PLAIN_MESSAGE
 * 		2.JOptionPane.INFORMATION_MESSAGE
 * 		3.JOptionPane.QUESTION_MESSAGE
 * 		4.JOptionPane.ERROR_MESSAGE
 * 		5.JOptionPane.WARNING_MESSAGE
 * 	
 * 3.show a confirm dialogue
 * 
 * JOptionPane.showConfirmDialoge(parent, message, title, optionType, message_Type);
 * 		
 *
 */

public class Joptionpane {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		Container c = jFrame.getContentPane();
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setBounds(100, 45, 400, 500);
		jFrame.setVisible(true);
		c.setLayout(new FlowLayout());
		
		JButton jButton = new JButton("ShowInputDialogue");
		jButton.setBounds(50, 50, 200, 30);
		c.add(jButton);
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String str = JOptionPane.showInputDialog("Enter Your name");
				if(str.length() > 0) {
					System.out.println("Your name is : " + str);
				}else {
					System.out.println("No name is entered");
				}
				
			}
		});
		
		
		
		JButton jButton1 = new JButton("Plain_Message");
		jButton1.setBounds(50, 80, 200, 30);
		c.add(jButton1);
		
		jButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(c, "You are right !", "Plain_message", JOptionPane.PLAIN_MESSAGE);
				
			}
		});
		
		
		
		
		
		JButton jButton2 = new JButton("Question_Message");
		jButton2.setBounds(50, 110, 200, 30);
		c.add(jButton2);
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(c, "Are you all right?", "Question", JOptionPane.QUESTION_MESSAGE);

				
			}
		});
		
		
		JButton jButton3 = new JButton("Information_Message");
		jButton3.setBounds(50, 140, 200, 30);
		c.add(jButton3);
		
		jButton3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(c, "You have to fill this", "Information", JOptionPane.INFORMATION_MESSAGE);

				
			}
		});
		
		
		JButton jButton4 = new JButton("Error_Message");
		jButton4.setBounds(50, 170, 200, 30);
		c.add(jButton4);
		
		jButton4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(c, "This is an error in java", "Error", JOptionPane.ERROR_MESSAGE);

				
			}
		});
		
		
		JButton jButton5 = new JButton("Warning_Message");
		jButton5.setBounds(50, 200, 200, 30);
		c.add(jButton5);
		
		jButton5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(c, "This is a warning message", "Warning", JOptionPane.WARNING_MESSAGE);

				
			}
		});
		
		JButton jButton6 = new JButton("Confirmation_Message");
		jButton6.setBounds(50, 230, 200, 30);
		c.add(jButton6);
		
		jButton6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int result = JOptionPane.showConfirmDialog(c, "Do you want to Exit?", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
				
				if(result == JOptionPane.YES_OPTION) {
					System.out.println("Yes button clicked");
				}else if(result == JOptionPane.NO_OPTION) {
					System.out.println("No button is clicked");
				}else {
					System.out.println("Cancel button is clicked");
				}
			}
		});
		
		
		
		

	}

}
