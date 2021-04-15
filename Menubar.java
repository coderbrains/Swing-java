package swingByNonTelusko;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Menubar extends JFrame implements ActionListener{
	
	JTextArea jTextField;
	JMenuItem paste;
	JMenuItem font;
	JMenuItem Copy;
	
	public Menubar(){
		
		Container c = getContentPane();
		c.setLayout(null);
		setTitle("Awanish Notepad");
		
		JMenuBar jMenuBar = new JMenuBar();
		setJMenuBar(jMenuBar);
		
		JMenu file = new JMenu("File");
		JMenuItem save = new JMenuItem("Save");
		JMenuItem newfile = new JMenuItem("New");
		JMenuItem saveas = new JMenuItem("Save As");
		file.add(newfile);
		file.add(saveas);
		file.add(save);
		jMenuBar.add(file);
		
		
		JMenu edit = new JMenu("Edit");
		paste = new JMenuItem("Paste");
		font = new JMenuItem("Cut");
		Copy = new JMenuItem("Copy");
		edit.add(paste);
		edit.add(font);
		edit.add(Copy);
		jMenuBar.add(edit);
		
		paste.addActionListener(this);
		font.addActionListener(this);
		Copy.addActionListener(this);
		
		JMenu format = new JMenu("Format");
		JMenuItem selectAll = new JMenuItem("Select All");
		JMenuItem Wordwrap = new JMenuItem("WordWrap");
		JMenuItem Undo = new JMenuItem("undo");
		format.add(selectAll);
		format.add(Wordwrap);
		format.add(Undo);
		jMenuBar.add(format);
		
		JMenu help = new JMenu("Help");
		JMenuItem Faq = new JMenuItem("FAQ ?");
		JMenuItem search = new JMenuItem("Query");
		JMenuItem online = new JMenuItem("Online Query");
		help.add(Faq);
		help.add(search);
		help.add(online);
		jMenuBar.add(help);
		
		jTextField = new JTextArea();
		jTextField.setBounds(5, 5, 580, 640);
		add(jTextField);
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 56, 600, 650);
		setResizable(false);
	}

	public static void main(String[] args) {
		
		new Menubar();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == Copy) {
			jTextField.copy();
		}if(e.getSource() == font) {
			jTextField.cut();
		}if(e.getSource() == paste) {
			jTextField.paste();
		}
		
	}

}
