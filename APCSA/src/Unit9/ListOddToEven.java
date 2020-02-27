//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
package Unit9;
import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int firstOdd=-1;
		int lastEven=-1;
		for (int i=0; i<ray.size(); i++){
			if (ray.get(i)%2==1 && firstOdd==-1){
				firstOdd=i;
			}
			if (firstOdd!=-1){
				if (ray.get(i)%2==0){
					lastEven=i;
				}
			}
		}
		if (firstOdd==-1 || lastEven==-1){
			return -1;
		}
		else{
			return lastEven-firstOdd;
		}
	}
}