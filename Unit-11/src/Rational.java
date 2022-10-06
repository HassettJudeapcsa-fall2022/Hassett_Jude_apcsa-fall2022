//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int num;
	private int den;

	//write two constructors
	public Rational() {
		this(1,2);
	}
	
	public Rational(int n,int d) {
		setRational(n,d);
	}

	//write a setRational method
	public void setRational(int n, int d) {
		num = n;
		den = d;
	}

	//write  a set method for numerator and denominator
	public void setNumerator(int n) {
		num = n;
	}
	
	public void setDenominator(int d) {
		den = d;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		int num2 = other.getNumerator();
		int den2 = other.getDenominator();
		num = (num*den2 + num2 * den);
		den = (den * den2);
		reduce();
	}

	private void reduce()
	{
		for (int i = 1; i <= den; i++) {
			if(num%i == 0 && den%i == 0) {
				num = num / i;
				den = den / i;
			}
		}
	}

	private int gcd(int numOne, int numTwo)
	{
		

		return 1;
	}

	public Object clone ()
	{
		int newDen = den;
		int newNum = num;
		return new Rational(newNum, newDen);
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator() {
		return num;
	}
	
	public int getDenominator() {
		return den;
	}
	
	
	public boolean equals( Rational obj)
	{
		obj.reduce();
		if(obj.getNumerator() == num && obj.getDenominator() == den) return true;
		return false;
	}

	public int compareTo(Rational other)
	{
		double rone = ((double)num)/((double)den);
		double rtwo = ((double)other.getNumerator())/((double)other.getDenominator());
		if (rone > rtwo) {
			return 1;
		}

		return -1;
	}



	
	//write  toString() method
	public String toString() {
		return num + "/" + den;
	}
	
	
}