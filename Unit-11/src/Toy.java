//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Toy
{
	private String name;
	private int count;

	public Toy()
	{
		this("");
	}

	public Toy( String nm )
	{
		setName(nm);
	}
	
	public int getCount()
	{
		return 0;
	}
	
	public void setCount( int cnt )
	{
		count = cnt;
	}
	
	public String getName()
	{
		return null;
	}
	
	public void setName( String nm )
	{
		name = nm;
	}

	public String toString()
	{
	   return "";
	}
}