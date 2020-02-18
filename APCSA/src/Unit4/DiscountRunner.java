//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -
package Unit4;
import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		amt=Discount.getDiscountedBill(amt);
		System.out.print("Bill after discount :: ");
		System.out.printf("%.2f\n",amt);
		
		amt=Discount.getDiscountedBill(500);
		System.out.print("Bill after discount :: ");
		System.out.printf("%.2f\n",amt);   
		
		amt=Discount.getDiscountedBill(2500);
		System.out.print("Bill after discount :: ");
		System.out.printf("%.2f\n",amt);   
		
		amt=Discount.getDiscountedBill(4000);
		System.out.print("Bill after discount :: ");
		System.out.printf("%.2f\n",amt);   
		
		amt=Discount.getDiscountedBill(333.33);
		System.out.print("Bill after discount :: ");
		System.out.printf("%.2f\n",amt);  
		
		amt=Discount.getDiscountedBill(95874.2154);
		System.out.print("Bill after discount :: ");
		System.out.printf("%.2f\n",amt);  

	}
}
/*
Output
Enter the original bill amount :: 123
Bill after discount :: 123.00
Bill after discount :: 500.00
Bill after discount :: 2125.00
Bill after discount :: 3400.00
Bill after discount :: 333.33
Bill after discount :: 81493.08
*/