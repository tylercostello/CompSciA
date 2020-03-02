//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Elevens;
import static java.lang.System.*;

public class DeckRunner
{
	public static void main( String args[] )
	
	{
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		Deck d = new Deck(ranks, suits, pointValues);
		System.out.println( "All cards in order." );
		System.out.println(d.size());
		for( int j = 1; j <= 6; j++ )
		{
			System.out.println("Ran");
			System.out.println( d.dealCard() );
		}
		Deck test = new Deck();
		
		System.out.println( "All cards in order." );
		for( int j = 1; j < 52; j++ )
		{
			System.out.println( test.dealCard() );
		}
		
		test.shuffle();	
		test.reset();
		
		System.out.println( "\n\nAll cards after shuffling." );
		for( int j = 1; j < 52; j++ )
		{
			System.out.println( test.dealCard() );
		}				
	}
}