package morning.model;

import java.awt.Color;

public class Cards
{
 private int numberOfCards;
 private Color cardColor;
 
public Cards()
{
	this.numberOfCards = 52;
			
	this.cardColor = Color.RED;
}
 
 
 
 public String toString()
 {
	 String CardDeckDescription="This card deck has" + numberOfCards + " cards, and its color is" + cardColor;
	 
	 return CardDeckDescription;
 }



public void setnumberOfCards(int i)
{
	// TODO Auto-generated method stub
	
}



public void setcardColor(Color black)
{
	// TODO Auto-generated method stub
	
}
 
}
