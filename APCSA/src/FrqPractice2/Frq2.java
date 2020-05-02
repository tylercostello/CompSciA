package FrqPractice2;

public class Frq2 {
public static int getPeakIndex(int[] array)
{
	for (int i=1;i<array.length-1;i++){
		if (array[i-1]<array[i] && array[i+1]<array[i]){
			return i;
		}
	}
	return -1;
}
public static boolean isMountain(int[] array)
{
	
	int peak = getPeakIndex(array);
	if (isIncreasing(array, peak) && isDecreasing(array, peak)){
		return true;
	}
	return false;
	
}
}
