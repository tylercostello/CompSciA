//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit13;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] luckyArray = new int[size];
		for (int i=0;i<size;i++){
			luckyArray[i]=(int)(Math.random()*11);
		}
		return luckyArray;
	}
	public static void shiftEm(int[] array)
	{
		int[] newArray=new int[array.length];
		int sevenCounter=0;
		for (int i=0;i<array.length;i++){
			if (array[i]==7){
				sevenCounter++;
				array[i]=-1;
			}
		}
		for (int i=0;i<sevenCounter;i++){
			newArray[i]=7;
		}
		int openSpot=sevenCounter;
		for (int i=0;i<array.length;i++){
			if (array[i]!=-1){
				newArray[openSpot]=array[i];
				openSpot++;
			}
			
		}
		
		for (int i=0;i<array.length;i++){
			array[i]=newArray[i];
		}
	}
}