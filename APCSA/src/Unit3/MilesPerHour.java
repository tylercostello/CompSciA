//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -
package Unit3;
import java.util.Scanner; 

import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist,hrs,mins);
		mph=0.0;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		this.distance=dist;
		this.hours=hrs;
		this.minutes=mins;
	}

	public void calcMPH()
	
	{
		mph=(double)distance/((double)hours+(double)minutes/60);
	}

	public void print()
	{
		
		System.out.println(distance+" miles in "+hours+" hours and "+minutes+" minutes = "+Math.round(mph)+" MPH");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}

/*
Output
Enter the distance :: 1
Enter the hours :: 1
Enter the minutes :: 1
1 miles in 1 hours and 1 minutes = 1 MPH
45 miles in 0 hours and 32 minutes = 84 MPH
96 miles in 1 hours and 43 minutes = 56 MPH
100 miles in 2 hours and 25 minutes = 41 MPH
50 miles in 2 hours and 25 minutes = 21 MPH
*/