//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
package Unit9;

import java.util.ArrayList;

public class RayOddToEven
{
	public static int go(ArrayList<Integer> ray)
	{
		int firstOdd=-1;
		int nextEven=-1;
		for (int i=0;i<ray.size();i++) {
			if (firstOdd==-1) {
				if (ray.get(i)%2==1) {
					firstOdd=i;
					//System.out.println(firstOdd);
				}
			}
			if (firstOdd!=-1) {
				if (ray.get(i)%2==0) {
					nextEven=i;
					//System.out.println(nextEven);
					return nextEven-firstOdd;
				}
			}
		}
		

		return -1;
	}
}