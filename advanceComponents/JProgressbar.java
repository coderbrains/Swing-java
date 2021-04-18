package swingByNonTelusko.advanceComponents;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

/**
 * @author Awanish kumar singh
 *
 *	Constructors :-
 *	1.JProgressBar() :- creates ProgressBar with no text on it.
 *	2.JProgressBar(int orientation) :-  creates ProgressBar with specified orientation. e.g. - VERTICAL, HORIZONTAL;
 *	3.JProgressBar(int max, int min) :- creates ProgressBar with specified min and max value.
 *	4.JProgressBar(int orientation, int min, int max) :-
 *			creates ProgressBar with specified orientation.creates ProgressBar with specified min and max value.
 */
@SuppressWarnings("serial")
public class JProgressbar extends JFrame{
	
	public JProgressbar() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 500, 600);
		
		JProgressBar jProgressBar = new JProgressBar(JProgressBar.VERTICAL, 0, 100);
		jProgressBar.setStringPainted(true);
		add(jProgressBar);
		
		//for increasing the loading of the bar , we use loop:-
		
		for(int i = 0; i < 101; i+=10) {
					
					try {
						Thread.sleep(500);
					}catch(Exception e) {}
					
					if(i >= 70) {
						jProgressBar.setString("About to complete....");
					}else {
						jProgressBar.setValue(i);
					}
					
					
				}
			}

	public static void main(String[] args) {
		new JProgressbar();

	}

}
