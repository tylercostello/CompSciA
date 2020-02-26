//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
package Unit9;

import java.util.ArrayList;

public class RaySumLast
{
	public static int go(ArrayList<Integer> ray)
	{
		//(c) A+ Computer Science
		//www.apluscompsci.com
		//Name -
		//Date -

				int output=0;
				boolean worked=false;
				if (ray.size()>1) {
					int end=ray.get(ray.size()-1);
					for (int i =0; i<ray.size()-1;i++) {
						if (ray.get(i)>end) {
							worked=true;
							output=output+ray.get(i);
						}
					}
					if (worked)
						return output;
					return -1;
				}
				
				return -1;
			}
		
	}
