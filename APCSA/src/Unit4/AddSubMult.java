//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit4;
import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		if (a>b) 
			return Math.floor((a-b)* 100) / 100;
		else if (b>a)
			return Math.floor((b-a)* 100) / 100;
		else
			return Math.floor((a*b)* 100) / 100;
	}
}