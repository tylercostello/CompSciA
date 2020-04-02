package Q3Final;

import java.util.ArrayList;

public class Lake {
	
	ArrayList<Fish> lake;
	String name;
	
	public Lake(ArrayList<Fish> lake, String name){
		this.lake=new ArrayList<Fish>(lake);
		this.name=name;
	}
	public String toString(){
		
		String returnString="";
		for (Fish fish : lake){
			
			returnString+=fish.toString()+"\n";
		}
		returnString+="Lake Name "+name;
		return returnString;
	}
}
