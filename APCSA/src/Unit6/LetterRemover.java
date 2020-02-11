//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit6;
import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
		
	}
	
	public LetterRemover(String s, char rem)
	{
		setRemover(s, rem);
	}

	//add in second constructor
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		int x=0;
		int length = sentence.length();
		String temp = "";
		while (x<length) {
			if (sentence.charAt(x)!=lookFor) {
				temp=temp+sentence.substring(x,x+1);
			}
			x++;
		}
		sentence=temp;
		String cleaned=sentence;
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}