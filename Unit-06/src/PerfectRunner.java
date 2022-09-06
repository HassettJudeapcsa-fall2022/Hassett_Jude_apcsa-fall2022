//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

import java.util.Scanner; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Scanner key = new Scanner(System.in);
		out.print("input a whole number :: ");
		int integer = key.nextInt();
		Perfect test = new Perfect(integer);
		out.print(test);
	}
}