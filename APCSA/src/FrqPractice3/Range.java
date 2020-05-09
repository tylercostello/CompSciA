package FrqPractice3;

public class Range implements NumberGroup{
	
	int[] theGroup;
	public Range (int start, int end){
		int length = Math.abs(end)+Math.abs(start)+1;
		theGroup=new int[length];
		int openSpot=0;
		for(int i=start;i<=end;i++){
			theGroup[openSpot]=i;
			openSpot++;
		}
	}
	public boolean contains(int containsInt){
		for (int i=0;i<theGroup.length;i++){
			if (theGroup[i] == containsInt){
				return true;
			}
		}
		return false;
		
	}
	
	
}
