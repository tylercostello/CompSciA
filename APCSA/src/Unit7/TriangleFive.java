//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit7;
import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		this.letter = c;
	}

	public void setAmount(int amt)
	{
		this.amount=amt;
	}

	public String toString()
	{
		String output="";
		int count=amount;
		char myLetter=letter;
		//System.out.println(count);
		//System.out.println(letter);
		//int newAmount=amount;
		for (int j=amount; j>0;j--){
		count=amount;
		myLetter=letter;
		
		for (int i =0; i<j; i++) {
			//System.out.println("e");
			for (int x=0; x<count; x++) {
				output=output+myLetter;
				
			}
			output=output+" ";
			myLetter++;
			if (myLetter=='[') {
				myLetter='A';
			}
			count--;
			
		}
		output+="\n";
		}
		return output;
	}
}