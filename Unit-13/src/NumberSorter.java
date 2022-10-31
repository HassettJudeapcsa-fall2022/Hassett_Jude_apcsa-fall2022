//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		if(number == 0) {
			return 0;
		}
		return 1 + getNumDigits(number/10);
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		for(int i = 0; i < sorted.length; i++) {
			sorted[i] = number%10;
			number/=10;
		}
		for(int i = 0; i < sorted.length; i++) {
			for(int x = i; x < sorted.length; x++) {
				int temp = 0;
				if(sorted[x] < sorted[i]) {
					temp = sorted[x];
					sorted[x] = sorted[i];
					sorted[i] = temp;
				}
			}
		}
		return sorted;
	}
}