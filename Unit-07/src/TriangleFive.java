//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		this('c',0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		for (int i = amount-1; i>=0; i--) {
			for(int x = 0; x<=i; x++) {
				for(int n = 0; n <= amount-x-1; n++) {
					if(letter + x <= 'Z') output+=(char)(letter+x);
					if(letter + x > 'Z') output+=(char)(letter+x-26);
				}
				output+=" ";
			}
			output+="\n";
		}
		return output;
	}
}