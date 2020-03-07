//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit10;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList=new ArrayList<Toy>();
	}
	public String myName(){
		System.out.println("Tyler Costello");
		return "Tyler Costello";
	}

	public void loadToys( String toys )
	{
	 boolean isDuplicate=false;
	 int count = 0;
	 String[] temp = toys.split(" ");
	 
	 for (String type1 : temp){
		 if (toyList.size()>1){
			
			 for (Toy toy : toyList){
				 
				
				 if (toy.getName().equals(type1)){
					 isDuplicate=true;
					 break;
				 }
				
			 }
		 }
		 
		 if (!isDuplicate){
			 for (String type2 : temp){
				 if (type1.equals(type2)){
					 count++;
				 }
			 }
			 toyList.add(new Toy(type1));
			 toyList.get(toyList.size()-1).setCount(count);
		 }
		 
		 isDuplicate=false;
		 count=0;
	 }
	 
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (Toy toy : toyList){
  			if (nm.equals(toy.getName())){
  				return toy;
  			}
  				
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		
  		int maxCount=toyList.get(0).getCount();
  		Toy maxToy=toyList.get(0);
  		for (Toy toy : toyList){
  			if (toy.getCount()>maxCount){
  				maxCount=toy.getCount();
  				maxToy=toy;
  			}
  		}
  		return maxToy.getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		ArrayList<Toy> sortedList = new ArrayList<Toy>();
  		for (Toy toy : toyList){
  			if (sortedList.size()==0){
  				sortedList.add(toy);
  			}
  			for (Toy toy2 : sortedList){
  				if (toy.getCount()<toy2.getCount()){
  					sortedList.add(sortedList.indexOf(toy2),toy);
  				}
  			}
  		}
  		toyList=sortedList;
  	}  
  	  
	public String toString()
	{
	   toyList.add(null);
	   String outputString="";
	   if (toyList.get(0)!=null){
		   toyList.remove(null);
		   for (Toy toy : toyList){
			   
			   outputString+=toy.toString()+", ";
		   }
	  }
	   else{
		   toyList.remove(null);
	   }
	   return outputString;
	}
}

//Output
//
//sorry 4, bat 1, train 2, teddy 2, ball 2, 
//max == sorry