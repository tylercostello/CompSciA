//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
package Unit9;

import java.util.ArrayList;
import java.util.Arrays;

public class SumFirstRunner
{
	public static void main( String args[] )
	{			
		ArrayList<Integer> numArray = new ArrayList<Integer>( Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,5) );
		System.out.println(ListSumFirst.go(numArray));
	}
}