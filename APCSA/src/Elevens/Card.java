//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Elevens;
public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	
	//instance variables
		String suit="";
		int face=0;

  	//constructors
		public Card(String suit,int face) {
			this.suit=suit;
			this.face=face;
		}

	// modifiers
		//set methods
		public void setFace(int face) {
			this.face=face;
		}
		public void setSuit(String suit) {
			this.suit=suit;
		}


  	//accessors
		//get methods
		public int getFace() {
			return face;
		}
		public String getSuit() {
			return suit;
		}
		

  	//toString
		public String toString() {
			return ""+FACES[face]+" of "+getSuit();
		}

 }