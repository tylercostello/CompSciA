//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  
package Unit7;
import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one=a;
		two=b;
		three=c;
		four=d;
		
		
	}

	public double getBiggest()
	{
		double max=one;
		if (two>max) {
			max=two;
		}
		if (three>max) {
			max=three;
		}
		if (four>max) {
			max=four;
		}
		
		return max;
	}

	public String toString()
	{
	   return "";
	}
}