//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   Scanner keys = new Scanner(System.in);
	   out.print("Input word 1: ");
	   String word1 = keys.next();
	   out.print("Input word 2: ");
	   String word2 = keys.next();
	   WordsCompare test = new WordsCompare(word1, word2);
	   test.compare();
	   out.print(test);
	}
}