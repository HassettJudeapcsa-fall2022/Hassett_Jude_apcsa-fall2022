//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover() {
		setRemover("",' ');
	}

	public LetterRemover(String s, char rem) {
		setRemover(s, rem);
	}
		
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned = "";
		for(int i=0; i<sentence.length();i++) {
			if(!(sentence.charAt(i) == lookFor)) {
				cleaned = cleaned.concat(sentence.substring(i,i+1));
			}
		}
		return cleaned;
	}

	public String toString()
	{
		return removeLetters() + " - letter to remove " + lookFor;
	}
}