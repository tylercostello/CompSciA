//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Elevens;
import static java.lang.System.*;
import java.awt.Color;

public class CardRunner
{
	public static void main( String args[] )
	{

		Card one = new Card("SPADES", 9);
		out.println(one.getSuit());
		out.println(one.getFace());

		Card two = new Card("DIAMONDS", 1);
		out.println(two);
		two.setFace(3);
		out.println(two);

		Card three = new Card("CLUBS", 4);
		out.println(three);

		Card four = new Card("CLUBS", 4);
		out.println(four);

		Card five = new Card("HEARTS", 12);
		out.println(five);
		
		Card six = new Card("Queen", "Clubs", 12);
		out.println(six.toString());
		
		Card seven = new Card("Jack", "Clubs", 11);
		out.println(four.matches(three));
	}
}