//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.*;

public class TriangleOneRunner
{
	public static void main( String args[] )
	{
		Scanner key = new Scanner(System.in);
		out.print("input a word :: ");
		String triangle = key.next();
		TriangleOne test = new TriangleOne(triangle);
		test.makeTriangle();
	}
}