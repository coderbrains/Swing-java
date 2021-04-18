package swingByNonTelusko.advanceComponents;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


@SuppressWarnings("serial")
public class Jslider extends JFrame implements ChangeListener{

	JSlider jSlider;
	JLabel jLabel;
	public Jslider() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 50, 500, 600);
		
		jSlider = new JSlider();

		add(jSlider);
		jSlider.setMaximum(200);
		jSlider.setMinimum(0);
		jSlider.setPaintLabels(true);
		jSlider.setPaintTicks(true);
		jSlider.setMajorTickSpacing(50);
		jSlider.setMinorTickSpacing(5);
		jSlider.addChangeListener(this);
		
		jLabel = new JLabel();
		jLabel.setText("The value of the label is : " + jSlider.getValue());
		add(jLabel);
		
	}
	public static void main(String[] args) {
		
		new Jslider();

	}
	@Override
	public void stateChanged(ChangeEvent e) {
		
		jLabel.setText("The value of the label is : " + jSlider.getValue());
		
	}

}
