package swingByNonTelusko.advanceComponents;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class AddingInTable  extends JFrame implements ActionListener ,MouseListener{
	
	JTable tabel;
	int rowIndex, columnIndex;
	JPanel jPanel, jPanel1;
	JButton j1, j2, j3;
	JLabel l1, l2, l3;
	JTextField jf1, jf2, jf3;
	DefaultTableModel model;
	
	public AddingInTable() {
		
		setLayout(new GridLayout(3, 1));
		String data[][] = {
				{"001", "Awanish Kumar Singh", "9102504188"},
				{"002", "Manish Kumar Singh",  "910XXXXXXX"},
				{"003", "Sunish Kumar Singh",  "910XXXXXXX"},
				{"004", "Ram Kumar Singh",     "910XXXXXXX"}
		};
		
		String columns[] = {"ROll", "Name", "Mobile"};
		model = new DefaultTableModel(data, columns);
		tabel = new JTable(model);
		add(new JScrollPane(tabel));
		
		jPanel = new JPanel();
		add(jPanel);
		
		jPanel1 = new JPanel(new GridLayout(3,3));
		add(jPanel1);
		
		j1 = new JButton("ADD");
		j2 = new JButton("UPDATE");
		j3 = new JButton("DELETE");
		
		l1 = new JLabel("ROLL");
		l2 = new JLabel("Name");
		l3 = new JLabel("Mobile");
		
		jf1 = new JTextField();
		jf2 = new JTextField();
		jf3 = new JTextField();
		
		jPanel1.add(l1);
		jPanel1.add(jf1);
		jPanel1.add(j1);
		
		jPanel1.add(l2);
		jPanel1.add(jf2);
		jPanel1.add(j2);
		
		jPanel1.add(l3);
		jPanel1.add(jf3);
		jPanel1.add(j3);
		
		j1.addActionListener(this);
		j2.addActionListener(this);
		tabel.addMouseListener(this);
		j3.addActionListener(this);
		
		
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 100, 600, 500);
		validate();
	}

	public static void main(String[] args) {
		
		

		new AddingInTable();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == j1) {
			if(jf1.getText().toString().equals("") || jf2.getText().toString().equals("")||
					jf3.getText().toString().equals("")) {
				
				JOptionPane.showMessageDialog(null, "Please fill every fields", "Error message", JOptionPane.ERROR_MESSAGE);
			}else {
				String roll = jf1.getText().toString();
				String name = jf2.getText().toString();
				String mobile = jf3.getText().toString();
				String[] model1 = {roll, name, mobile};
				model.addRow(model1);
				jf1.setText(null);
				jf2.setText(null);
				jf3.setText(null);
			}
			
		}if(e.getSource() == j2) {
			
			
			String roll = jf1.getText().toString();
			String name = jf2.getText().toString();
			String mobile = jf3.getText().toString();
			
			tabel.setValueAt(roll, tabel.getSelectedRow(), 0);
			tabel.setValueAt(name, tabel.getSelectedRow(), 1);
			tabel.setValueAt(mobile, tabel.getSelectedRow(), 2);
			
			jf1.setText(null);
			jf2.setText(null);
			jf3.setText(null);
			
		}if(e.getSource()== j3) {
			if(tabel.getSelectedColumn() == -1) {
				JOptionPane.showMessageDialog(null, "Please Select a row", "Error", JOptionPane.ERROR_MESSAGE);
			}else {
				int result = JOptionPane.showConfirmDialog(null, "Do you want to delete", "Confirmation", JOptionPane.OK_CANCEL_OPTION);
				jf1.setText(null);
				jf2.setText(null);
				jf3.setText(null);
				if(result == JOptionPane.OK_OPTION) {
					model.removeRow(rowIndex);
				}
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		jf1.setText(null);
		jf2.setText(null);
		jf3.setText(null);
		try {
			rowIndex = tabel.getSelectedRow();
			columnIndex = tabel.getSelectedColumn();
			String roll = model.getValueAt(rowIndex, 0).toString();
			String name = model.getValueAt(rowIndex, 1).toString();
			String mobile = model.getValueAt(rowIndex, 2).toString();
			
			jf1.setText(roll);
			jf2.setText(name);
			jf3.setText(mobile);
		}catch(Exception Ae) {}
		
		
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
