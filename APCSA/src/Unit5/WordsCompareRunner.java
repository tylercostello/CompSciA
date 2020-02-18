//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -
package Unit5;
import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   WordsCompare comp = new WordsCompare("abe", "ape");
	   System.out.println(comp.toString());
	   
	    comp = new WordsCompare("giraffe", "gorilla");
	   System.out.println(comp.toString());
	   
	    comp = new WordsCompare("one", "two");
	   System.out.println(comp.toString());
	   
	    comp = new WordsCompare("fun", "funny");
	   System.out.println(comp.toString());
	   
	    comp = new WordsCompare("123", "19");
	   System.out.println(comp.toString());
	   
	    comp = new WordsCompare("193", "1910");
	   System.out.println(comp.toString());
	   
	    comp = new WordsCompare("goofy", "godfather");
	   System.out.println(comp.toString());
	   
	    comp = new WordsCompare("funnel", "fun");
	   System.out.println(comp.toString());
	   
	}
}
/*
Output
abe should be placed before ape

giraffe should be placed before gorilla

one should be placed before two

fun should be placed before funny

123 should be placed before 19

193 should be placed after 1910

goofy should be placed after godfather

funnel should be placed after fun

*/