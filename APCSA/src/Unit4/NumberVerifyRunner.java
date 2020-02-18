//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -
package Unit4;
import static java.lang.System.*;

import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a whole number :: ");
		int input = keyboard.nextInt();
		System.out.println(input+ " is odd :: " + NumberVerify.isOdd(input));
		System.out.println(input+ " is even :: " + NumberVerify.isEven(input));
		
		System.out.println("111 is odd :: " + NumberVerify.isOdd(111));
		System.out.println("111 is even :: " + NumberVerify.isEven(111));
		
		System.out.println("2000 is odd :: " + NumberVerify.isOdd(2000));
		System.out.println("2000 is even :: " + NumberVerify.isEven(2000));
		//add in more test cases
		System.out.println("-99 is odd :: " + NumberVerify.isOdd(-99));
		System.out.println("-99 is even :: " + NumberVerify.isEven(-99));
		
		System.out.println("1111 is odd :: " + NumberVerify.isOdd(1111));
		System.out.println("1111 is even :: " + NumberVerify.isEven(1111));
		
		System.out.println("-850 is odd :: " + NumberVerify.isOdd(-850));
		System.out.println("-850 is even :: " + NumberVerify.isEven(-850));
	}
}