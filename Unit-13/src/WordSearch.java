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
    	for(int i = 0; i < m.length; i++) {
    		for(int x = 0; x < m[i].length; x++) {
    			if(checkRight(word, i, x)) return true;
    			else if(checkLeft(word, i, x)) return true;
    			else if(checkUp(word, i, x)) return true;
    			else if(checkDown(word, i, x)) return true;
    			else if(checkDiagUpRight(word, i, x)) return true;
    			else if(checkDiagUpLeft(word, i, x)) return true;
    			else if(checkDiagDownRight(word, i, x)) return true;
    			else if(checkDiagDownLeft(word, i, x)) return true;
    		}
    	}
    	
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
    {
		String str = "";
		for(int i = c; i < m[r].length; i++) {
			str += m[r][i];
		}
		if(str.contains(w)) return true;
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		String str = "";
		for(int i = c; i > -1; i--) {
			str += m[r][i];
		}
		if(str.contains(w)) return true;
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		String str = "";
		for(int i = r; i > -1; i--) {
			str += m[i][c];
		}
		if(str.contains(w)) return true;
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
		String str = "";
		for(int i = r; i < m.length; i++) {
			str += m[i][c];
		}
		if(str.contains(w)) return true;
		return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		String str = "";
		int x = c;
		for(int i = r; i >= 0 && x < m[i].length; i--) {
			str += m[i][x++];
		}
		if(str.contains(w)) return true;
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		String str = "";
		int x = c;
		for(int i = r; i >= 0 && x >= 0; i--) {
			str += m[i][x--];
		}
		if(str.contains(w)) return true;
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		String str = "";
		int x = c;
		for(int i = r; i < m.length && x >= 0; i++) {
			str += m[i][x--];
		}
		if(str.contains(w)) return true;
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		String str = "";
		int x = c;
		for(int i = r; i < m.length && x < m[i].length; i++) {
			str += m[i][x++];
		}
		if(str.contains(w)) return true;
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
