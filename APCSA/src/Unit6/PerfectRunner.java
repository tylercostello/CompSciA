//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit6;
import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect perfect = new Perfect();

		perfect.setNumber(496);
		System.out.println(perfect.toString());
		
		perfect.setNumber(45);
		System.out.println(perfect.toString());
		
		perfect.setNumber(6);
		System.out.println(perfect.toString());
		
		perfect.setNumber(14);
		System.out.println(perfect.toString());
		
		perfect.setNumber(8128);
		System.out.println(perfect.toString());
		
		perfect.setNumber(1245);
		System.out.println(perfect.toString());
		
		perfect.setNumber(1245);
		System.out.println(perfect.toString());
		
		perfect.setNumber(33);
		System.out.println(perfect.toString());
		
		perfect.setNumber(28);
		System.out.println(perfect.toString());
			
		perfect.setNumber(27);
		System.out.println(perfect.toString());
		
		perfect.setNumber(33550336);
		System.out.println(perfect.toString());
		
	}
}
/*
Output
496 is perfect
45 is not perfect
6 is perfect
14 is not perfect
8128 is perfect
1245 is not perfect
1245 is not perfect
33 is not perfect
28 is perfect
27 is not perfect
33550336 is perfect

*/