//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
		sort();
	}

	public void sort()
	{
		for(int i = 0; i < wordRay.length; i++) {
			for(int x = i; x < wordRay.length; x++) {
				if(wordRay[i].compareTo(wordRay[x]) > 0) {
					String temp = wordRay[i];
					wordRay[i] = wordRay[x];
					wordRay[x] = temp;
				}
			}
		}
	}

	public String toString()
	{
		String output="";
		for(int i = 0; i < wordRay.length; i++) {
			output+= wordRay[i];
			output+= "\n";
		}
		return output+"\n\n";
	}
}