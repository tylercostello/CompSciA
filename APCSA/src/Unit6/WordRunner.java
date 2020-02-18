//(c) A+ Computer Science
//www.apluscompsci.com
//Name
package Unit6;
import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases	
		Word word = new Word();
		word.setString("Hello");
		System.out.println(word.getBackWards());
		System.out.println(word);
		
		word.setString("World");
		System.out.println(word.getBackWards());
		System.out.println(word);
		
		word.setString("Jukebox");
		System.out.println(word.getBackWards());
		System.out.println(word);
		
		word.setString("TCEA");
		System.out.println(word.getBackWards());
		System.out.println(word);
		
		word.setString("UIL");
		System.out.println(word.getBackWards());
		System.out.println(word);
	}
}
/*
Output
olleH
Hello
dlroW
World
xobekuJ
Jukebox
AECT
TCEA
LIU
UIL
*/