package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups=new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		if (spot<pups.length){
		pups[spot]=new Dog(age,name);
		}
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		String oldestName="";
		int oldestAge=0;
		for (Dog dog : pups){
			if (dog.getAge()>oldestAge){
				oldestName=dog.getName();
				oldestAge=dog.getAge();
			}
		}
		return oldestName;
	}

	public String getNameOfYoungest()
	{
		String youngestName="";
		int youngestAge=1000;
		for (Dog dog : pups){
			if (dog.getAge()<youngestAge){
				youngestName=dog.getName();
				youngestAge=dog.getAge();
			}
		}
		return youngestName;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}