//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	int len = 0;
    	for(int i = 0; i < m.length; i++) {
    		for (int x = 0; x < m[0].length; x++) {
    			m[i][x] = str.substring(len,len+1);
    			len++;
    		}
    	}
    }

    public boolean isFound( String word )
    {
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
	   return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		return false;
	}

    public String toString()
    {
 		String output = "";
 		for(int i = 0; i < m.length; i++) {
 			for(int x = 0; x < m[0].length; x++) {
 				output+= m[i][x];
 				output += " ";
 			}
 			output+= "\n";
 		}
 		return output;
    }
}
