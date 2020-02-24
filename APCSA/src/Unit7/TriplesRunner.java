//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  
package Unit7;
import static java.lang.System.*;

import java.util.Scanner;


public class TriplesRunner
{
   public static void main(String args[])
   
   {
	    String output="";
	   	Scanner keyboard = new Scanner(System.in);
	   	System.out.println("Give a number: ");
	   	int number=keyboard.nextInt();
	   	Triples triple = new Triples(number);
	   	
	   	int a=0;
		int b=0;
		int c=0;
		for (a=1; a < number; a++) {
			for (b=a; b < number; b++) {
				for (c=b; c < number; c++) {
					if (a*a+b*b==c*c && a%2!=b%2 && c%2 != 0 && triple.getGreatestCommonFactor(a,b,c) <2) {
						output=output+triple.toString(a,b,c);
					}
				}
			}
		}
		System.out.println(output);
	}
}