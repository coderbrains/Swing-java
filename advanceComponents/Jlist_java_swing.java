package swingByNonTelusko.advanceComponents;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class Jlist_java_swing extends JFrame {
	
	JList<String> jList;
	String str[] = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7",
			"Item 8", "Item 9", "Item 10", "Item 11"};
	public Jlist_java_swing() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 30, 700, 500);
		
		jList = new JList<String>(str);
		jList.setVisibleRowCount(10);
		JPanel jPanel = new JPanel();
		jPanel.add(new JScrollPane(jList));
		add(jPanel);
		revalidate();
	}

	public static void main(String[] args) {
		
		new Jlist_java_swing();

	}

}
