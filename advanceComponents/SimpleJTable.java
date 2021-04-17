package swingByNonTelusko.advanceComponents;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author Awanish kumar singh
 *
 *	There are following Constructor to create a table.
 *	1. Jtable(data, columnNames);
 *	2. Jtable(dataModel);  --> recommended
 */

@SuppressWarnings("serial")
public class SimpleJTable extends JFrame {
	
	public SimpleJTable() {
		
		setVisible(true);
		setTitle("Table Program");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200,56,500, 600);
		
		String[][] str = {
				
				{"001", "Awanish Kumar Singh", "9102504188"},
				{"002", "Manish Kumar Singh",  "910XXXXXXX"},
				{"003", "Sunish Kumar Singh",  "910XXXXXXX"},
				{"004", "Ram Kumar Singh",     "910XXXXXXX"}				
		};
		
		String columns[] = {"Roll_no", "Name", "Mobile number"};
		
//		JTable jTable = new JTable(str, columns);
//		
//		add(new JScrollPane(jTable));
		
		DefaultTableModel defaultTableModel = new DefaultTableModel(str, columns);
		JTable jTable = new JTable(defaultTableModel);
		add(new JScrollPane(jTable));
		
		validate();
		
		
	}

	public static void main(String[] args) {
		
		new SimpleJTable();

	}

}
