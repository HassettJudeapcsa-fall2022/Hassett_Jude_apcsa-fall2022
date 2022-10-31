//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		NumberShifter test = new NumberShifter();
		int[] arr = test.makeLucky7Array(10);
		System.out.println(Arrays.toString(arr));
		test.shiftEm(arr);
		System.out.println(Arrays.toString(arr));
		//add test cases
	}
}



