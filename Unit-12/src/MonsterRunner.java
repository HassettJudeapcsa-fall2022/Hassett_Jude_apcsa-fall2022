//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.print("Input monster 1's name :: ");
		String nm = keyboard.next();
		System.out.print("Input monster 1's size :: ");
		int sz = keyboard.nextInt();
		//instantiate monster one
		Monster mon1 = new Skeleton(nm, sz);
		//ask for name and size
		System.out.print("Input monster 2's name :: ");
		nm = keyboard.next();
		System.out.print("Input monster 2's size :: ");
		sz = keyboard.nextInt();
		//instantiate monster two
		Monster mon2 = new Skeleton(nm,sz);
		
		if(mon1.isBigger(mon2)) System.out.println("Monster One is bigger than Monster Two");
		else System.out.println("Monster One is smaller than Monster Two");
		
		if(mon1.namesTheSame(mon2))System.out.println("Monster One has the same name as Monster Two");
		else System.out.println("Monster One does not have the same name as Monester Two");
	}
}