package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard=new Scanner(System.in);
		String word="";
		String input = "y";
		while (input.equals("y")){
		System.out.println("Enter a word: ");
		word=keyboard.next();
		 TriangleWord.printTriangle(word);	
		 System.out.println("Do you want to continue? ");
		input=keyboard.next().toString();
		//System.out.println(input);
		//System.out.println(input.equals("y"));
		
		}
	}
}