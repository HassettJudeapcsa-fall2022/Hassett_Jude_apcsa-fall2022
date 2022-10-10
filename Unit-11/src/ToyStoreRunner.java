//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		String toyStr = "sorry bat sorry sorry sorry train train teddy teddy ball ball ";
		ToyStore test = new ToyStore();
		test.loadToys(toyStr);
		System.out.println(test);
	}
}