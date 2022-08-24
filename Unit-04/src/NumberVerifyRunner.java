//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		int number;
		Scanner keys = new Scanner(System.in);
		System.out.print("Input a whole number :: ");
		number = keys.nextInt();
		System.out.println(number + " is odd :: " + NumberVerify.isOdd(number));
		System.out.println(number + " is even :: " + NumberVerify.isEven(number));
	}
}