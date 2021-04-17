package swingByNonTelusko.advanceComponents;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

/**
 * 
 * @author Awanish kumar singh
 * 
 * 	1.It is used to implement divider lines.
 * 	2.it is used to draw a line to separate widgets in a layout
 * 	3.It can be horizontal or vertical
 *
 */
@SuppressWarnings("serial")
public class Jseparator extends JFrame {
	
	public Jseparator() {
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 56, 400, 500);
		
		JPanel jPanel = new JPanel(new GridLayout(1,0));
		jPanel.add(new JLabel("My First Page"));

		jPanel.add(new JSeparator(SwingConstants.VERTICAL));
		
		jPanel.add(new JLabel("My Second page"));
		
		add(jPanel);
		
		JMenuBar jBar = new JMenuBar();
		add(jBar, BorderLayout.PAGE_START);
		
		JMenu file, edit, format;
		JMenuItem New, save,saveas, cut, copy , paste, exit;
		file = new JMenu("File");
		edit = new JMenu("Edit");
		format = new JMenu("Format");
		
		copy = new JMenuItem("Copy");
		cut = new JMenuItem("cut");
		paste = new JMenuItem("Paste");
		
		New = new JMenuItem("New");
		save = new JMenuItem("Save");
		saveas = new JMenuItem("Save AS");
		exit = new JMenuItem("Exit");
		
		
		file.add(copy);
		file.add(cut);
		file.add(paste);

		
		file.addSeparator();
		file.add(New);
		file.add(saveas);
		file.addSeparator();
		file.add(save);
		file.add(exit);
		
		jBar.add(file);
		jBar.add(edit);
		jBar.add(format);
		
		validate();
		
		
	}

	public static void main(String[] args) {
		
		new Jseparator();

	}

}
