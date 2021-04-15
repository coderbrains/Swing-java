package swingByNonTelusko;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class Registration extends JFrame implements ActionListener{
	
	JLabel title, address, name, mob, gender, Dob, message;
	JTextField nam, mobi;
	JRadioButton male, female;
	JTextArea add, Message, details;
	JComboBox<String> day, month, year;
	JCheckBox box;
	JButton button;
	
	public Registration() {
		
		Container container = getContentPane();
		container.setLayout(null);
		
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
		JMenuItem paste = new JMenuItem("Paste");
		JMenuItem font = new JMenuItem("Font");
		JMenuItem Copy = new JMenuItem("Copy");
		edit.add(paste);
		edit.add(font);
		edit.add(Copy);
		jMenuBar.add(edit);
		
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
		
		title = new JLabel();
		title.setText("Registration Form");
		Font font1 = new  Font("arial", Font.BOLD, 20);
		title.setBounds(300, 40, 200, 30);
		title.setFont(font1);
		add(title);
		
		name = new JLabel();
		name.setBounds(40, 120, 60, 30);
		name.setText("Name - ");
		add(name);
		
		nam = new JTextField();
		nam.setBounds(150, 125, 170, 20);
		add(nam);
		
		mob = new JLabel();
		mob.setBounds(40, 180, 60, 30);
		mob.setText("Mobile - ");
		add(mob);
		
		mobi = new JTextField();
		mobi.setBounds(150, 180, 170, 20);
		add(mobi);
		
		gender = new JLabel();
		gender.setBounds(40, 235, 60, 30);
		gender.setText("Gender - ");
		add(gender);
		
		male = new JRadioButton();
		female = new JRadioButton();
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(male);
		buttonGroup.add(female);
		
		male.setBounds(150, 237, 60, 20);
		male.setText("Male");
		female.setBounds(220, 237, 90, 20);
		female.setText("Female");
		add(male);
		add(female);
		
		Dob = new JLabel();
		Dob.setBounds(40, 290, 60, 30);
		Dob.setText("DOB -");			
		add(Dob);
		
		String[] days = {
				"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18",
				"19","20","21","22","23","24","25","26","27","28","29","30","31"
		};
		
		String[] months = {
				"January", "February", "March", "April", "May", "June", "July", "August"
				,"September", "October", "november", "December"
		};
		
		String[] years = {
				"2001", "2002", "2003", "2004"
		};
		
		day = new JComboBox<String>(days);
		month = new JComboBox<String>(months);
		year = new JComboBox<String>(years);
		
		day.setBounds(150, 290, 50, 20);
		add(day);
		
		month.setBounds(210, 290, 80, 20);
		add(month);
		
		year.setBounds(300, 290, 60, 20);
		add(year);
		
		address = new JLabel();
		address.setBounds(40, 345, 60, 30);
		address.setText("Address -");
		add(address);
		
		add = new JTextArea();
		add.setBounds(150, 345, 210, 70);
		add.setLineWrap(true);
		add(add);
		
		box = new JCheckBox();
		box.setText("Accept The Terms and Conditions");
		box.setBounds(40, 450, 300, 30);
		add(box);
		
		button = new JButton();
		button.setText("Submit");
		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
		button.setCursor(cursor);
		button.setBounds(200, 500, 150, 40);
		add(button);
		
		message = new JLabel();
		message.setText("Please Fill the Whole Form and then click on Submit");
		message.setLocation(40, 600);
		message.setSize(500, 20);
		add(message);
		
		details = new JTextArea();
		details.setBounds(450, 130, 300, 300);
		add(details);
		details.setEditable(false);
		details.setLineWrap(false);
		
		button.addActionListener(this);
		
		
		
		

		setBounds(200,20, 800, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		new Registration();
		
		

		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			
			if(nam.getText().equals("")) {
				message.setText("Please Fill the name field");
				message.setForeground(Color.RED);
			}else if(mobi.getText().equals("")) {
				message.setText("Please Fill a valid field");
				message.setForeground(Color.RED);
			}else if(mobi.getText().length() != 10) {
				message.setText("Please Fill a valid Mobile Number");
				message.setForeground(Color.RED);
			}else if(male.isSelected() == false && female.isSelected()  == false) {
				message.setText("Please Select The Gender");
				message.setForeground(Color.RED);
			}else if(add.getText().equals("")) {
				message.setText("Please Fill The Address");
				message.setForeground(Color.RED);
			}else if(box.isSelected() == false) {
				message.setText("Please Accept the Terms And Conditions");
			}else {
				new BigInteger(mobi.getText());
				
				String gender ;
				if(male.isSelected()) {
					gender = "Male";
				}else gender = "Female";
				details.setText("Name - " + nam.getText() + "\n" +  "Mobile - " + mobi.getText() +"\n" +"Address - " + add.getText()
				+ "\n" + "Gender- " + gender + "\n" +"DOB - " + day.getSelectedItem() + " " 
				+ month.getSelectedItem() + " " + year.getSelectedItem());
				message.setText("Registration Is SuccessFull");
				message.setForeground(Color.GREEN);
			}
			
		}catch(NumberFormatException nfe) {
			message.setText("Please Fill a Valid Mobile number");
			message.setForeground(Color.RED);
		}
		
		
	}

}
