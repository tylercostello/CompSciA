package Q3Final;

import java.util.ArrayList;

public class Fish {
	Size sizes;
	String name;

	public Fish(String stringSize, String name){
		this.name=name;
		setSize(stringSize);
	}
	public Fish(String name){
		this.name=name;
		
	}
	public void setSize(String stringSize){
		int semiSpot=0;
		String tempInt="";
		ArrayList<Integer> weightList = new ArrayList<Integer>();
		ArrayList<Integer> lengthList = new ArrayList<Integer>();
		for(int i=8;i<stringSize.length();i++){
			
			if (stringSize.charAt(i)==';'){
				weightList.add(Integer.parseInt(tempInt));
				tempInt="";
				semiSpot=i;
				break;
			}
			else if (stringSize.charAt(i)!=','){
				tempInt+=stringSize.charAt(i);
			}
			else if (stringSize.charAt(i)==','){
				weightList.add(Integer.parseInt(tempInt));
				tempInt="";
			}
		}
		for(int i=semiSpot+9;i<stringSize.length();i++){
			
				if (stringSize.charAt(i)==';'){
					lengthList.add(Integer.parseInt(tempInt));
					tempInt="";
					semiSpot=i;
					break;
				}
				else if (stringSize.charAt(i)!=','){
					tempInt+=stringSize.charAt(i);
				}
				else if (stringSize.charAt(i)==','){
					lengthList.add(Integer.parseInt(tempInt));
					tempInt="";
				}
		}
		int[] weights = new int[weightList.size()];
		int[] lengths = new int[lengthList.size()];
		int counter=0;
		for (int i : weightList){
			
			weights[counter]=i;
			counter++;
		}
		counter=0;
		for (int i : lengthList){
			lengths[counter]=i;
			counter++;
		}
		this.sizes=new Size(weights,lengths);
	}
	public String getName(){
		return name;
	}
	public Size getSize(){
		return sizes;
	}
	public String toString(){
		String returnString="";
		returnString=sizes.toString()+" Fish Name: "+name;
		return returnString;
	}
}
