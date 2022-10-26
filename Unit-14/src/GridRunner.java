//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] )
	{
		String[] testArr = {"A", "B", "C", "D", "E", "F"};
		Grid test = new Grid(10,20, testArr);
		System.out.print(test + "\n");
		
		String max = testArr[0];
		for(int i = 0; i < testArr.length; i++) {
			System.out.println(testArr[i] + " count is " + test.countVals(testArr[i]) + ".");
		}
		System.out.println("\n" + test.findMax(testArr) + " occurs the most.");
	}
}