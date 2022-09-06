//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		Scanner key = new Scanner(System.in);
		out.print("input a word :: ");
		String word = key.next();
		out.print("input char to remove :: ");
		char lookFor = key.next().charAt(0);
		LetterRemover test = new LetterRemover(word, lookFor);
		out.print(test);
											
	}
}