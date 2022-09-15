//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumLastRunner
{
	public static void main( String args[] )
	{
		int[] sample1 = {-99,1,2,3,4,5,6,7,8,9,10,5};
		System.out.println(RaySumLast.go(sample1));
		int[] sample2 = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println(RaySumLast.go(sample2));
		int[] sample3 = {10,20,30,40,50,-11818,40,30,20,10};
		System.out.println(RaySumLast.go(sample3));
		int[] sample4 = {32767};
		System.out.println(RaySumLast.go(sample4));
		int[] sample5 = {255,255};
		System.out.println(RaySumLast.go(sample5));
		int[] sample6 = {9,10,-88,100,-555,2};
		System.out.println(RaySumLast.go(sample6));
		int[] sample7 = {10,10,10,11,456};
		System.out.println(RaySumLast.go(sample7));
		int[] sample8 = {-111,1,2,3,9,11,20,1};
		System.out.println(RaySumLast.go(sample8));
		int[] sample9 = {9,8,7,6,5,4,3,2,0,-2,6};
		System.out.println(RaySumLast.go(sample9));
		int[] sample10 = {12,15,8,21,23,1000};
		System.out.println(RaySumLast.go(sample10));
		int[] sample11 = {250,19,17,15,13,11,10,9,6,3,2,1,0};
		System.out.println(RaySumLast.go(sample11));
		int[] sample12 = {9,10,-8,10000,-5000,-3000};
		System.out.println(RaySumLast.go(sample12));
	}
}