//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -



public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int oddindex = -1;
		int length = 0;
		for(int i=0; i<ray.length; i++) {
			if(ray[i]%2 == 1) {
				oddindex = i;
				break;
			}
		}
		if(oddindex == -1) return oddindex;
		for(int i=oddindex+1; i<ray.length; i++) {
			length++;
			if(ray[i]%2 == 0) {
				break;
			}
		}
		System.out.print(length + " " + oddindex +1 + ray.length);
		if(length == ray.length-oddindex+1) {
			return -1;
		}
		return length;
	}
}