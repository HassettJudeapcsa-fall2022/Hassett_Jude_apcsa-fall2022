//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy sorry = new Toy("sorry");
		sorry.addCnt(1);
		System.out.println(sorry);
		Toy gijoe = new Toy("gi joe");
		gijoe.addCnt(5);
		System.out.println(gijoe);
	}
}