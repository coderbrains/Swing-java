package swingByNonTelusko.layoutTypo;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Flowlayout extends JFrame{
	
	public Flowlayout() {
		
		Container c = getContentPane();
//		FlowLayout f = new FlowLayout();//This constructor actually do not align the components anyway
		
//		FlowLayout f = new FlowLayout(FlowLayout.RIGHT);//Align in the Right Screen
		
//		FlowLayout f = new FlowLayout(FlowLayout.LEFT);//Align in the left position
		
//		FlowLayout f = new FlowLayout(FlowLayout.CENTER);//align in the center
		
//		FlowLayout f = new FlowLayout(FlowLayout.RIGHT, 10, 20);//Align in the right and sets 
		//vertical and the horizontal gap to 10 and the 20 respectively.
		
		FlowLayout f = new FlowLayout();
		
		// also sets the gaps to 10 and 20 respectively
		
		f.setHgap(10);
		f.setVgap(20);
		
		c.setLayout(f);
		
		JButton j1 = new JButton("Button1");
		JButton j2 = new JButton("Button2");
		JButton j3 = new JButton("Button3");
		JButton j4 = new JButton("Button4");
		JButton j5 = new JButton("Button5");
		
		c.add(j1);
		c.add(j2);
		c.add(j3);
		c.add(j4);
		c.add(j5);
		
		// We can also pass the Index while adding the components 
		
		c.add(j5, 0);
		
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 40, 500, 600);
	}

	public static void main(String[] args) {
		
		new Flowlayout();

	}

}
