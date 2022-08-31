//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;

	public LetterRemover()
	{
		setRemover("");
	}

	//add in second constructor
	public LetterRemover(String s) {
		setRemover(s);
	}
	
	public void setRemover(String s)
	{
		sentence = s;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		for(int i = 0; i<sentence.length(); i++){
			cleaned = sentence.substring(i);
			out.println(cleaned);
		}
		return cleaned;
	}

	public String toString()
	{
		return removeLetters();
	}
}