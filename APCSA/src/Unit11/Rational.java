package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	int numerator;
	int denominator;
	//write two constructors
	public Rational(){
		numerator=0;
		denominator=1;
	}
	public Rational(int n, int d){
		setRational(n,d);
	}

	public void setRational(int n, int d){
		numerator=n;
		denominator=d;
	}
	//write a setRational method
	

	//write  a set method for numerator and denominator

	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		numerator=numerator*other.denominator+other.numerator*denominator;
		//System.out.println(numerator);
		denominator=denominator*other.denominator;
		//System.out.println(denominator);
		
		


		reduce();
	}

	private void reduce()
	{
		
		int gcd=gcd(numerator,denominator);
		numerator=numerator/gcd;
		denominator=denominator/gcd;


	}

	private int gcd(int numOne, int numTwo)
	{
		int gcd=1;
		for (int i=numOne+numTwo;i>0;i--){
			if ((double)numOne/i%1==0&&(double)numTwo/i%1==0){
				gcd=i;
				//System.out.println(i);
				break;
			}
		}
		return gcd;
	}

	public Object clone ()
	{
		Rational clone = new Rational(numerator,denominator);
		return clone;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator(){
		return numerator;
	}
	public int getDenominator(){
		return denominator;
	}
	
	public boolean equals( Object obj)
	{
		

		return false;
	}

	public int compareTo(Rational other)
	{
		if (other.numerator==numerator&&other.denominator==denominator){
			return 1;
		}

		return -1;
	}



	
	//write  toString() method
	public String toString(){
		return (numerator+"/"+denominator);
	}
	
}