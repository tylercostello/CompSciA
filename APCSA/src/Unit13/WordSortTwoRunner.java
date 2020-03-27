//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit13;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class WordSortTwoRunner
{
	public static void main( String args[] ) throws IOException
	{

		Scanner file = new Scanner(new File("C:\\Users\\tyc64\\Desktop\\CompSciGithub\\CompSciA\\APCSA\\src\\Unit13\\wordsorttwo.dat"));
		int size = file.nextInt();
		file.nextLine();
		for(int i = 0; i<size; i++)
		{
			String sentence = file.nextLine();
			WordSortTwo sort = new WordSortTwo(sentence);
			sort.sort();
			System.out.println();
			//instantiate a new WordSort
		}
	}
}