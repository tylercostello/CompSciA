//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit13;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		int[] luckyArray = NumberShifter.makeLucky7Array(20);
		for (int i=0;i<luckyArray.length;i++){
			System.out.print(luckyArray[i]);
		}
		NumberShifter.shiftEm(luckyArray);
		System.out.println();
		for (int i=0;i<luckyArray.length;i++){
			System.out.print(luckyArray[i]);
		}
		//add test cases
	}
}
/*
179530525505506080105
719530525505506080105
 */


