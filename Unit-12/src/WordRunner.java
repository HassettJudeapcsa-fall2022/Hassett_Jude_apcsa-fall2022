//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\super\\Documents\\GitHub\\Hassett_Jude_apcsa-fall2022\\Unit-12\\src\\words.dat"));

		int size = file.nextInt();
		file.nextLine();
		ArrayList<Word> words = new ArrayList<Word>();
		while(file.hasNextLine()) {
			String word = file.nextLine();
			if(word.length() > 0) words.add(new Word(word));
		}
		
		
		for(int i = 0; i<words.size(); i++) {
			for(int x = 0; x<words.size(); x++) {
				Word temp;
				if(words.get(i).compareTo(words.get(x)) == 0) {
					temp = words.get(i);
					words.set(i, words.get(x));
					words.set(x, temp);
				}
			}
		}
		
		for(int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i));
		}
	}
}