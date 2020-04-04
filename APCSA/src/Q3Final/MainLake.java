package Q3Final;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainLake {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<Fish> fishList = new ArrayList<Fish>();
		Scanner file = new Scanner(new File("C:/Users/tyc64/Desktop/CompSciGithub/CompSciA/APCSA/src/Q3Final/fish.dat"));
		String lakeName = file.nextLine();
		
		int fishCount = file.nextInt();
		file.nextLine();
		String nextLine=file.nextLine();
		String nameString="";
		String sizeString="";
		for (int i=0;i<fishCount;i++){
			
			for (int j=0;j<nextLine.length();j++){
				if (nextLine.charAt(j)==';'){
					
					int semiSpot=j;
					nameString=nextLine.substring(0,semiSpot);
					sizeString=nextLine.substring(semiSpot+1);
					fishList.add(new Fish(sizeString,nameString));
					try{
					nextLine=file.nextLine();
					}
					catch(Exception e){
						
					}
					break;
				}
			}
			
			
		}
		
		//Sorting
		fishList=Size.alphaSort(fishList);

		
		Lake lake = new Lake(fishList,lakeName);
		
		//Searching
		System.out.println(Size.searchLake("Blue Fish", lake.getList()).toString());
		Fish myFish=Size.searchLake("Blue Fish", lake.getList());
		System.out.println(myFish.getSize().largestWeight());
		System.out.println(myFish.getSize().averageWeight());
		System.out.println(myFish.getSize().averageLength());
		
		//other methods
		for (Fish thisFish : lake.getList()){
			System.out.println(thisFish.toString());
			System.out.println(thisFish.getSize().largestWeight());
			System.out.println(thisFish.getSize().averageWeight());
			System.out.println(thisFish.getSize().averageLength());
		}

	}

}
