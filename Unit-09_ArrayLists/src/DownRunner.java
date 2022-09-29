import java.util.ArrayList;
import java.util.List;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{
		List<Integer> a;
		a = new ArrayList<Integer>();
		a.add(-99);
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		a.add(6);
		a.add(7);
		a.add(8);
		a.add(9);
		a.add(10);
		a.add(12345);
		System.out.println(ListDown.go(a));
		
		List<Integer> b;
		b = new ArrayList<Integer>();
		b.add(10);
		b.add(9);
		b.add(8);
		b.add(7);
		b.add(6);
		b.add(5);
		b.add(4);
		b.add(3);
		b.add(2);
		b.add(1);
		b.add(-99);
		System.out.println(ListDown.go(b));
	}
}