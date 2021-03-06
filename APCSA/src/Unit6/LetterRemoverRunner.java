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
		remove.setRemover("I am Sam I am", 'a');
		System.out.println(remove.toString());
		
		remove.setRemover("ssssssssxssssesssssesss", 's');
		System.out.println(remove.toString());
		
		remove.setRemover("qwertyqwertyqwerty", 'a');
		System.out.println(remove.toString());
		
		remove.setRemover("abababababa", 'b');
		System.out.println(remove.toString());
		
		remove.setRemover("abaababababa", 'x');
		System.out.println(remove.toString());
											
	}
}
/*
Output
I am Sam I am - letter to remove a
I m Sm I m
ssssssssxssssesssssesss - letter to remove s
xee
qwertyqwertyqwerty - letter to remove a
qwertyqwertyqwerty
abababababa - letter to remove b
aaaaaa
abaababababa - letter to remove x
abaababababa
*/