package swingByNonTelusko;

import java.awt.Container;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox {

	public static void main(String[] args) {
		
		JFrame jFrame = new JFrame();
		jFrame.setLocationRelativeTo(null);
		jFrame.setSize(400, 400);
		Container container = jFrame.getContentPane();
		container.setLayout(null);
		
		String string[] = {"A", "B", "C", "D"};
		JComboBox<String> jComboBox = new JComboBox<>(string);
		jComboBox.setBounds(100, 30, 100, 60);
		container.add(jComboBox);
		jComboBox.setEditable(true);
		jComboBox.setSelectedIndex(2);
		jComboBox.addItem("E");
		jComboBox.removeItem("A");
		
		
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);

	}

}
