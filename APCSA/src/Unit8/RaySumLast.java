//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
package Unit8;
public class RaySumLast
{
	public static int go(int[] ray)
	{
		int output=0;
		boolean worked=false;
		if (ray.length>1) {
			int end=ray[ray.length-1];
			for (int i =0; i<ray.length-1;i++) {
				if (ray[i]>end) {
					worked=true;
					output=output+ray[i];
				}
			}
			if (worked)
				return output;
			return -1;
		}
		
		return -1;
	}
}