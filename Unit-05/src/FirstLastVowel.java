//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   char first = a.charAt(0);
	   char last = a.charAt(a.length()-1);
	   String vowels = "aeiouAEIOU";
	   
	   for(int i=0; i<9; i++) {
		   if (first == vowels.charAt(i) || last == vowels.charAt(i)) {
			   return "yes";
		   }
	   }
	   return "no";
	}
}