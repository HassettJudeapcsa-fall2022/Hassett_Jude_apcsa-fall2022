//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
	}

	//add in second constructor
	public LetterRemover(String s, char rem) {
		setRemover(s,rem);
	}
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		for(int i= sentence.length(); i==0; i--){
			
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}