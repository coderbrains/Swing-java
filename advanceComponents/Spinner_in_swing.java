package swingByNonTelusko.advanceComponents;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * 
 * @author Awanish kumar singh
 * 
 * 	1.It has upper and lower button
 * 	2.Do not need drop down list
 * 	3.It has textField as well as arrows
 * 
 * -> JSpinner()- creates an empty spinner and has no constraints
 * -> JSpinner(SpinnerModel model) - creates a spinner having a model passed as an argument
 * Methods:-
 * ->SpinnerListModel(List l)
 * ->SpinnerNumberModel(int value, int max, int min, int step) 
 * ->setValue(Object v)
 * ->getPreviousValue()
 * ->getNextValue() 
 * 
 * SpinnerModel day = new SpinnerNumberModel(cur_value, min, max, step)
 * SpinnerModel year = new SpinnerNumberModel(cur_value, min, max, step)
 * SpinnerModel month = new SpinnerListModel(cur_value, min, max, step)
 * 	
 */
@SuppressWarnings("serial")
public class Spinner_in_swing extends JFrame implements ChangeListener{
	
		
	JSpinner d, m, y;
	SpinnerModel day, month, year;
	JLabel jLabel;
	
	public Spinner_in_swing() {
		
		Container c = getContentPane();
		c.setLayout(null);
		
		String[] months = {
				"January", "February", "March", "April", "May", "June", "July", "August"
				,"September", "October", "november", "December"
		};
		
		day = new SpinnerNumberModel(1, 1, 31, 1);
		year = new SpinnerNumberModel(2021, 1990, 2021, 1);
		month = new SpinnerListModel(months);
		
		d = new JSpinner(day);
		m = new JSpinner(month);
		y = new JSpinner(year);
		
		d.setBounds(100, 30, 100, 50);
		m.setBounds(100, 100, 100, 50);
		y.setBounds(100, 170, 100, 50);
		
		add(d);
		add(m);
		add(y);
		
		jLabel = new JLabel("DOB : ");
		jLabel.setBounds(100, 250, 200, 100);
		add(jLabel);
		
		setDob();
		
		d.addChangeListener(this);
		y.addChangeListener(this);
		m.addChangeListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 500, 600);
	}

	public static void main(String[] args) {
		
		new Spinner_in_swing();

	}
	
	public void setDob() {
		int day = (int)d.getValue();
		int year = (int)y.getValue();
		String month = m.getValue().toString();
		
		jLabel.setText("DOB : " + day + " " + month+ " " + year );
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		
		setDob();
		
	}

}
