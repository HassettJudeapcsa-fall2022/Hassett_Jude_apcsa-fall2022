//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{			
		RayDown test = new RayDown();
		int[] a = {-99,1,2,3,4,5,6,7,8,9,10,12345};
		System.out.println(test.go(a));
		int[] b = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println(test.go(b));
		int[] c = {10,20,30,40,50,-11818,40,30,20,10};
		System.out.println(test.go(c));
		int[] d = {32767};
		System.out.println(test.go(d));
		int[] e = {255,255};
		System.out.println(test.go(e));
		int[] f = {9,10,-88,100,-555,1000};
		System.out.println(test.go(f));
		int[] g = {10,10,10,11,456};
		System.out.println(test.go(g));
		int[] h = {-111,1,2,3,9,11,20,30};
		System.out.println(test.go(h));
		int[] i = {9,8,7,6,5,4,3,2,0,-2,-989};
		System.out.println(test.go(i));
		int[] j = {12,15,18,21,23,1000};
		System.out.println(test.go(j));
		int[] k = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
		System.out.println(test.go(k));
		int[] l = {9,10,-8,10000,-5000,1000};
		System.out.println(test.go(l));
	}
}