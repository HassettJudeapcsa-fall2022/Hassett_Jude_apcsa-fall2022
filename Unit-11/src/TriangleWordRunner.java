//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner key = new Scanner(System.in);
		TriangleWord test = new TriangleWord();
		char confirm = 'y';
		do {
			System.out.println("Enter the word :: ");
			String word = key.next();
			test.printTriangle(word);
			System.out.println("\nWould you like to go again? (y/n) :: ");
			confirm = key.next().charAt(0);
		} while(confirm == 'y');
	}
}