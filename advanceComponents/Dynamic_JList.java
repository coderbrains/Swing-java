package swingByNonTelusko.advanceComponents;
/**
 * @author Awanish kumar singh
 */

import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class Dynamic_JList extends JFrame{
	int index = 0;
	public Dynamic_JList() {
		setVisible(true);
		setLayout(new GridLayout(1,2));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 30, 700, 500);
		
		JList<String> jList = new JList<String>();
		JPanel jPanel = new JPanel();
		jPanel.add(new JScrollPane(jList));
		add(jPanel);
		
		DefaultListModel<String> dModel = new DefaultListModel<>();
		dModel.add(0, "Hello kaun");
		dModel.add(1, "Awanish Kumar Singh");
		dModel.add(2, "Manish Kumar Singh");
		dModel.add(3, "Arjun Kumar Singh");
		jList.setModel(dModel);
		
		JPanel jPanel2 = new JPanel();
		JTextField jTextField = new JTextField(30);
		JButton jButton = new JButton("ADD");
		JButton jButton2 = new JButton("REMOVE");
		JButton jButton3 = new JButton("UPDATE");
		jPanel2.add(jTextField);
		jPanel2.add(jButton2);
		jPanel2.add(jButton3);
		jPanel2.add(jButton);
		add(jPanel2);
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				dModel.remove(jList.getSelectedIndex());
				
			}
		});
		
		jButton3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(!jTextField.getText().toString().equals("")) {
					
					String s = jTextField.getText().toString();
					dModel.setElementAt(s, index);
					jTextField.setText(null);
				}
				
			}
		});
		
		jList.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				if(e.getClickCount() == 2) {
					String s = jList.getSelectedValue().toString();
					jTextField.setText(s);
					index = jList.getSelectedIndex();
					
				}
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		jButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(!jTextField.getText().toString().equals("")) {
					
					String s = jTextField.getText().toString();
					dModel.addElement(s);
					jTextField.setText(null);
				}
				
			}
		});
		
		
		revalidate();
	}

	public static void main(String[] args) {
		
		new Dynamic_JList();
	}

}
