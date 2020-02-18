//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 
package Unit5;
import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality checker = new StringEquality("hello","goodbye");
		System.out.println(checker.toString());
		
		 checker = new StringEquality("one","two");
		System.out.println(checker.toString());
		
		 checker = new StringEquality("three","four");
		System.out.println(checker.toString());
		
		 checker = new StringEquality("TCEA","UIL");
		System.out.println(checker.toString());
		
		 checker = new StringEquality("State","Champions");
		System.out.println(checker.toString());
		
		 checker = new StringEquality("ABC","ABC");
		System.out.println(checker.toString());
		
		 checker = new StringEquality("ABC","CBA");
		System.out.println(checker.toString());
		
		 checker = new StringEquality("Same","Same");
		System.out.println(checker.toString());
		//add test cases
		
	}
}
/*
Output
hello does not have the same letters as goodbye

one does not have the same letters as two

three does not have the same letters as four

TCEA does not have the same letters as UIL

State does not have the same letters as Champions

ABC has the same letters as ABC

ABC does not have the same letters as CBA

Same has the same letters as Same

*/