//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		out.print("Input word 1 :: ");
		String word1 = keyboard.next();
		out.print("Input word 2 :: ");
		String word2 = keyboard.next();
		StringEquality test = new StringEquality(word1, word2);
		out.print(test);
		
	}
}