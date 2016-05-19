package morning.conttoller;

import java.awt.Color;

import morning.model.Cards;
import morning.view.*;

public class TwoDController
{
	private TwoDFrame baseFrame;
	private Cards [][] myCards;
	
	public TwoDController()
	{
		myCards = new Cards[5][5];
		setupArray();
		baseFrame = new TwoDFrame(this);
		
	}
	
	public void start()
	{
		
	}
	
	private void setupArray()
	{
		for(int row =0; row < myCards.length; row++)
		{
			for(int col =0; col < myCards.length; col++)
			{
				myCards[row][col]= new Cards();
				if(col % 2 == 0)
				{
					myCards[row][col].setnumberOfCards(col + 5);
				}
				else
				{
					myCards[row][col].setcardColor(Color.black);
					
				}
			}
		}
	}
	
	
	public Cards [][] getMyCards()
	{
		return myCards;
	}
}
