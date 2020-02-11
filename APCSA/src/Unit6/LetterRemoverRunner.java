//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit6;
import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases		
		LetterRemover remove = new LetterRemover();
		remove.setRemover("ssssssssxssssesssssesss", 's');
		System.out.println(remove.removeLetters());
											
	}
}