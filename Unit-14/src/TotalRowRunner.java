//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		TotalRow test = new TotalRow();
		int[][] t = {{1,2,3}, {5,5,5,5}};
		System.out.println(test.getRowTotals(t));
		t = new int[][] {{1,2,3},{5},{1},{2,2}};
		System.out.println(test.getRowTotals(t));
		t = new int[][] {{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}};
		System.out.println(test.getRowTotals(t));
	}
}



