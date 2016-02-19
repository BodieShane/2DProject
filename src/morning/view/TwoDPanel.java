package morning.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import morning.conttoller.TwoDController;

public class TwoDPanel
{

	private TwoDController baseController;
	private SpringLayout baseLayout;
	private JTextField rowField;
	private JTextField columnField;
	private JTextField ediField;
	private JLabel currentBackPack;
	private JButton changeButton;
	private JButton displayButton;
	
	private JTable backpackTable;
	
	
	public TwoDPanel(TwoDController baseController)
	{
		this.baseController = baseController;
		baseLayout = SpringLayout();
		
		rowField = new JTextField (5);
		columnField = new JTextField(5);
		editField = new JTexteld(20);
		currentBackpckLable = new JLable ("the Current card");
		changeButton = new JButton("Change the inicated card");
		cisplayButton = new JButton("Display the CARD");
		
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
		// TODO Auto-generated method stub
		
	}




	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add
		
	}

	
	// Helper method to load information from the model into the GUI as a 2D array.

	private void setupTable()
	{
		String [] columnHeaders = { "Column 0","Column 1","Column 2",
		DefaultTebleModel tableModel = new DefaltTableMode(baseController.getMyCards(),columnHeaders);
		backpackTable = new JTable ( tableModel);
		}
}
