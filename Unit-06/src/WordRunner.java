//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

import java.util.Scanner;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Scanner key = new Scanner(System.in);
		out.print("input a word :: ");
		String word = key.next();
		Word test = new Word(word);
		out.print(test);
	}
}