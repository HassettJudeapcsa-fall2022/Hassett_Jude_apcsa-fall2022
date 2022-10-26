//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] testArr = {"a", "b", "c", "d", "e", "f"};
		Grid test = new Grid(10,10, testArr);
		System.out.print(test + "\n");
		
		String max = testArr[0];
		for(int i = 0; i < testArr.length; i++) {
			System.out.println(testArr[i] + " count is " + test.countVals(testArr[i]) + ".");
		}
		System.out.println("\n" + test.findMax(testArr) + " occurs the most.");
	}
}