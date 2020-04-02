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
		Lake lake = new Lake(fishList,lakeName);
		
		//Fish redFish = new Fish("Weights:1,2,3;Lengths:1,2,3;","Red Fish");
		
		//fishList.add(redFish);
		
		System.out.println(lake.toString());
	}

}
