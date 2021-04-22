package swingByNonTelusko.advanceComponents;
/**
 * @author Awanish kumar singh
 */

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

@SuppressWarnings("serial")
public class Jtextpane extends JFrame{
	
	public Jtextpane() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 800, 500);
		

		JTextPane j = new JTextPane();
		SimpleAttributeSet s = new SimpleAttributeSet();
		StyleConstants.setBold(s, true);
		j.setCharacterAttributes(s, true);
		j.setText("Hello Everyone ! This is Awanish Kumar Singh");
		add(j);
		
		revalidate();
	}

	public static void main(String[] args) {
		
		new Jtextpane();

	}

}
