// (c) A+ Computer Science
// www.apluscompsci.com
// Name -
package Unit10;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore33 sto = new ToyStore33();
		System.out.println( sto.toString() );
		sto.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball" );
		System.out.println( sto );	
		System.out.println( "max == " + sto.getMostFrequentToy() );		
	}
}

