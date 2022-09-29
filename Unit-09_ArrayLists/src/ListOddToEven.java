//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int oddindex = -1, length = 0;
		for (int i = 0; i<ray.size(); i++) {
			if(ray.get(i)%2 == 1) {
				oddindex = i;
				break;
			}
		}
		if(oddindex == -1) return oddindex;
		for(int i = oddindex +1; i<ray.size(); i++) {
			length++;
			if(ray.get(i)%2 == 0) break;
		}
		if(length == ray.size()-oddindex-1) return -1;
		return length;
	}
}