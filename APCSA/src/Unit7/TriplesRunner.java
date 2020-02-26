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
//
//Output
//Give a number: 
//110
//3 4 5
//5 12 13
//7 24 25
//8 15 17
//9 12 15
//9 40 41
//11 60 61
//12 35 37
//13 84 85
//15 20 25
//15 36 39
//16 63 65
//20 21 29
//20 99 101
//21 28 35
//21 72 75
//24 45 51
//25 60 65
//27 36 45
//28 45 53
//33 44 55
//33 56 65
//35 84 91
//36 77 85
//39 52 65
//39 80 89
//40 75 85
//45 60 75
//48 55 73
//51 68 85
//57 76 95
//60 63 87
//60 91 109
//63 84 105
//65 72 97
//
