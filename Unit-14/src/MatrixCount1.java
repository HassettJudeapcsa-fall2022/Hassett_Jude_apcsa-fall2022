//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class MatrixCount1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 6, 7, 1, 2, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 5, 4, 3, 2, 1}};

    public static int count( int val  )
    {
		int cnt = 0;
		for(int r = 0; r< m.length; r++) {
			for(int c = 0; c< m[0].length;c++) {
				if(m[r][c] == val) cnt++;
			}
		}
		return cnt;
    }
    
    public String toString() {
    	String output = "";
    	for(int r = 0; r < m.length; r++) {
    		for(int c = 0; c < m[0].length; c++) {
    			output+=m[r][c];
    		}
    		output+="\n";
    	}
    	return output;
    }
}
