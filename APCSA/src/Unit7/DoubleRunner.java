//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  
package Unit7;
import static java.lang.System.*;

public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble run = new BiggestDouble(4.5, 6.7, 7.8, 9.0);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");
		
		run = new BiggestDouble(14.51, 6.17, 71.8, 1.0);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");
		
		run = new BiggestDouble(41.15, 816.7, 17.8, 19.0);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");
		
		run = new BiggestDouble(884.5, 16.7, 7.8, 9.0);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");
		
		run = new BiggestDouble(4.5, -456.7, 677.8, 9.0);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");
		
		run = new BiggestDouble(4.5, 16.7, -7.8, -9.0);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");

		//add more test cases



				
	}
}

//output
//biggest = 9.0
//
//
//biggest = 71.8
//
//
//biggest = 816.7
//
//
//biggest = 884.5
//
//
//biggest = 677.8
//
//
//biggest = 16.7