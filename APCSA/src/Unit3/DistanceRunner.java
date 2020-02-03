//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -
package Unit3;

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner {
	public static void main(String[] args) {
		int x1, x2, y1, y2;
		// add test cases
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter X1 :: ");
		x1 = sc.nextInt();
		System.out.print("Enter Y1 :: ");
		y1 = sc.nextInt();
		System.out.print("Enter X2 :: ");
		x2 = sc.nextInt();
		System.out.print("Enter Y2 :: ");
		y2 = sc.nextInt();
		Distance distance = new Distance();
		distance.setCoordinates(x1, y1, x2, y2);
		distance.calcDistance();
		distance.print();

	}
}