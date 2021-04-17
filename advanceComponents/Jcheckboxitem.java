package swingByNonTelusko.advanceComponents;

import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Jcheckboxitem extends JFrame implements ItemListener{
	
	JTextArea j1;
	JMenuBar m1;
	JMenu jm1, jm2, jm3;
	JMenuItem save, saveas, newfile, copy , paste, cut;
	JCheckBoxMenuItem wrapline;
	Container c;
	
	public Jcheckboxitem() {
		
		c = getContentPane();
		
		
		m1 = new JMenuBar();
		setJMenuBar(m1);
		jm1 = new JMenu("File");
		jm2 = new JMenu("Edit");
		jm3 = new JMenu("Format");
		
		copy = new JMenuItem("Copy");
		paste = new JMenuItem("Paste");
		cut = new JMenuItem("Cut");
		save = new JMenuItem("Save");
		saveas = new JMenuItem("Saveas");
		newfile = new JMenuItem("New");
		wrapline = new JCheckBoxMenuItem("Wrap Line");
		
		jm1.add(newfile);
		jm1.add(save);
		jm1.add(saveas);
		
		jm2.add(copy);
		jm2.add(cut);
		jm2.add(paste);
		
		jm3.add(wrapline);
		
		wrapline.addItemListener(this);
		
		
		m1.add(jm1);
		m1.add(jm2);
		m1.add(jm3);
		
		
		
		j1 = new JTextArea();
		j1.setBounds(0, 0, 390, 500);
		add(j1);
		
		
		c.setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 56, 400, 500);
		
		
	}

	public static void main(String[] args) {
		
		new Jcheckboxitem();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if(wrapline.isSelected()) {
			j1.setLineWrap(true);
			j1.setWrapStyleWord(true);
		}if(!wrapline.isSelected()) {
			j1.setWrapStyleWord(false);
			j1.setLineWrap(false);
		}
		
	}

}
