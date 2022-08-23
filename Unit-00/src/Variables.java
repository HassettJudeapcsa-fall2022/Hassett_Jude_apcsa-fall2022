//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

public class Variables
{
	public static void main ( String[] args )
	{
		//define 1 variable of each of the
		//following data types
		//byte		short		int 		long
		//float		double
		//char      boolean		String

		//integer variables
		byte byteOne = 127;
		short shortOne = 32767;
		int intOne = 1000000999;
		long longOne = 1230912310;
		
		//decimal variables
		float floatOne = 99990;
		double doubleOne = 212109;

		//other integer types
		char charOne = 65535;
		boolean booleanOne = true;
		String stringOne = "abcdefg";
		//other types


		//output your information here
		System.out.println("/////////////////////////////////");
		System.out.println("*                               *");
		System.out.println("*        integer types          *");
		System.out.println("*                               *");
		System.out.println("*8 bit - byteOne = "+byteOne+"\t\t*");
		System.out.println("*16 bit - shortOne = "+shortOne+"\t\t*");
		System.out.println("*32 bit - intOne = "+intOne+"\t\t*");
		System.out.println("*64 bit - longOne = "+longOne+"\t\t*");
		System.out.println("*                               *");
		System.out.println("*        decimal types          *");
		System.out.println("*                               *");
		System.out.println("*32 bit - floatOne = "+floatOne+"\t\t*");
		System.out.println("*64 bit - doubleOne = "+doubleOne+"\t\t*");
		System.out.println("*                               *");
		System.out.println("*         other types           *");
		System.out.println("*                               *");
		System.out.println("*16 bit - charOne = "+charOne+"\t\t*");
		System.out.println("*booleanOne = "+booleanOne+"\t\t*");
		System.out.println("*stringOne = "+stringOne+"\t\t*");
		System.out.println("*                               *");
		System.out.println("/////////////////////////////////");
	}
}