package PracticeApTest;

public class hailstone {
	
	
	public static int hailstoneLength(int n){
		int currentNumber = n;
		int length=1;
		while (currentNumber != 1){
			if (n%2==0){
				currentNumber=currentNumber/2;
			}
			else{
				currentNumber=3*currentNumber+1;
			}
			length++;
		}
		return length;
	}
	/*
	 * The method header would be public static double propLong(int n). Prop long would loop through the numbers from 1 to 
	 * n and run isLongSeq on them and if isLongSeq returns true increment the double variable count. Then when it is finished
	 * it would make a double variable sum equal to count divided by n minus 1. propLong would then return sum.
	 * 
	 */
	
}
