//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] arr = new int[size];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 11);
		}
		return arr;
	}
	public static void shiftEm(int[] array)
	{
		for(int i = 0,x = 0; i < array.length; i++) {
			int temp = 0;
			if(array[i] == 7) {
				temp = array[x];
				array[x] = array[i];
				array[i] = temp;
				x++;
			}
		}
	}
}