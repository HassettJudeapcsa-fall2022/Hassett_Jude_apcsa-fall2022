//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	List<Integer> Arr = new ArrayList<>();
    	int sum = 0;
    	for(int r = 0; r < m.length; r++) {
    		for(int c = 0; c < m[r].length; c++) {
    			sum += m[r][c];
    		}
    		Arr.add(sum);
    		sum = 0;
    	}
		return Arr;
    }
}
