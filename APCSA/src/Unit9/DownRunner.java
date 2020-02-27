//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
package Unit9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class DownRunner
{
	public static void main( String args[] )
	{						
		//ArrayList<Integer> numArray = new ArrayList<Integer>(ArrayList.asList() );
		 ArrayList<Integer> numArray = new ArrayList<Integer>( Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,-455) );
		System.out.println(ListDown.go(numArray));
	}
}