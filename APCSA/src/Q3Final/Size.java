package Q3Final;

import java.util.ArrayList;

public class Size {
	int[] weights;
	int[] lengths;

	public Size(int[] weights, int[] lengths){
		setWeights(weights);
		setLengths(lengths);
		
	}
	public void setWeights(int[] weights){
		this.weights=new int[weights.length];
		for (int i=0;i<weights.length;i++){
			
			this.weights[i]=weights[i];
		}
	}
	public void setLengths(int[] lengths){
		this.lengths=new int[lengths.length];
		for (int i=0; i<lengths.length;i++){
			this.lengths[i]=lengths[i];
		}
	}
	
	public static ArrayList<Fish> alphaSort(ArrayList<Fish> fishList){
		ArrayList<Fish> tempList = new ArrayList<Fish>();
		Fish fakeFish = new Fish("}");
		Fish nextFish=fishList.get(0);
		int nextFishSpot=0;
		for (int i=0; i<fishList.size();i++){
			for (int j=0;j<fishList.size();j++){
				if (compareFunction(nextFish.getName(),fishList.get(j).getName())>0){
					nextFish=fishList.get(j);
					nextFishSpot=j;
				}
			}
			tempList.add(nextFish);
			fishList.set(nextFishSpot, fakeFish);
			nextFish=fishList.get(0);
			nextFishSpot=0;
			
		}
		fishList=tempList;
		
		
		
		return fishList;
	}
	public static int compareFunction(String one, String two){
		int returnInt=0;
		one=one.toLowerCase();
		two=two.toLowerCase();
		returnInt=one.compareTo(two);
		returnInt=returnInt<0 ? -1 : returnInt>0 ? 1 : 0;
		return returnInt;
	}
	
	public static Fish searchLake(String fishName, ArrayList<Fish> fishList){
		int spot=0;
		int min=0;
		int max=fishList.size()-1;
		while (min<=max){
			spot=min+(max-min)/2-1;
			//System.out.println(spot);
			if (fishList.get(spot).getName().equals(fishName)){
				return fishList.get(spot);
			}
			else if (compareFunction(fishName,fishList.get(spot).getName())>0){
				max++;
			}
			else if (compareFunction(fishName,fishList.get(spot).getName())<0){
				min++;
			}
		}
		//Shouldn't happen
		return null;
		
	}
	
	public float averageLength(){
		int sum=0;
		for (int i : lengths){
			sum+=i;
		}
		return (float)sum/lengths.length;
	}
	
	public float averageWeight(){
		int sum=0;
		for (int i : weights){
			sum+=i;
		}
		return (float)sum/weights.length;
	}
	
	public int largestWeight(){
		int largest=0;
		for (int i : weights){
			largest=i>largest ? i : largest;
		}
		return largest;
	}
	
	
	
	public String toString(){
		String returnString="Weights ";
		for (int i : weights){
			
			returnString+=i+" ";
		}
		returnString+="Lengths ";
		for (int i : lengths){
			returnString+=i+" ";
		}
		return returnString;
	}
}
