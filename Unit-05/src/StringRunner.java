//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keys = new Scanner(System.in);
		out.print("Input a word :: ");
		String word = keys.next();
		StringOddOrEven test = new StringOddOrEven(word);
		out.print(test);
	}
}