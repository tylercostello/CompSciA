//(c) A+ Computer Science
//www.apluscompsci.com
//Name
package Unit6;
import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		TriangleOne tri = new TriangleOne("hippo");
		tri.print();
		
		tri = new TriangleOne("abcd");
		tri.print();
		
		tri = new TriangleOne("it");
		tri.print();
		
		tri = new TriangleOne("a");
		tri.print();
		
		tri = new TriangleOne("chicken");
		tri.print();
		//add test cases		
	}
}
/*
Output
hippo
hipp
hip
hi
h
abcd
abc
ab
a
it
i
a
chicken
chicke
chick
chic
chi
ch
c
*/