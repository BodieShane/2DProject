package morning.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

import morning.conttoller.TwoDController;

public class TwoDPanel extends JPanel
{

	private TwoDController baseController;
	private SpringLayout baseLayout;
	private JTextField rowField;
	private JTextField columnField;
	private JTextField editField;
	private JLabel currentBackPackLable;
	private JButton changeButton;
	private JButton displayButton;
	
	private JTable backpackTable;
	
	
	public TwoDPanel(TwoDController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		rowField = new JTextField (5);
		columnField = new JTextField(5);
		editField = new JTextField(20);
		currentBackPackLable = new JLabel ("the Current card");
		changeButton = new JButton("Change the inicated card");
		displayButton = new JButton("Display the CARD");
		
		
		setupTable();
		setupPanel();
		setupLayout();
		setupListeners();
	}

	
	

	private void setupListeners()
	{
		// TODO Auto-generated method stub
		
	}




	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, changeButton, 0, SpringLayout.NORTH, displayButton);
		baseLayout.putConstraint(SpringLayout.WEST, displayButton, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, displayButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, editField, -6, SpringLayout.NORTH, changeButton);
		baseLayout.putConstraint(SpringLayout.EAST, changeButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, editField, 72, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, rowField, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, rowField, 166, SpringLayout.WEST, this);
		
		
		
		
		
	}




	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(backpackTable);
		this.add(tablePane);
		this.add(currentMugLable);
		this.add(ColumnField);
		this.add(rowField);
		this.add(editField);
		this.add(changeButton);
		this.add(displayButton);
		this.setBackground(Color.blue );
		
		
	}

	
	// Helper method to load information from the model into the GUI as a 2D array.

	private void setupTable()
	{
		String [] columnHeaders = { "Column 0","Column 1","Column 2"};
		DefaultTableModel tableModel = new DefaultTableModel(baseController.getMyCards(),columnHeaders);
		backpackTable = new JTable ( tableModel);
		//tablePane = new JScrollPane ( backpackTable);
		DefaultTableModel mugTableModel = new DefaultTableModel( baseController.getMyCards(), columnHeaders);
		backpackTable = new JTable(mugTableModel);
		}
}
