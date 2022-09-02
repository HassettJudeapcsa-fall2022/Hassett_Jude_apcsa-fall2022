//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleOne
{
   private String sentence;

	public TriangleOne()
	{
		setWord("");
	}

	//add in second constructor
	public TriangleOne(String s) {
		setWord(s);
	}
	
	public void setWord(String s)
	{
		sentence = s;
	}

	public String makeTriangle()
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
		return makeTriangle();
	}
}