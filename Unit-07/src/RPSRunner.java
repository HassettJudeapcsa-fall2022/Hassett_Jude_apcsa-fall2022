//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response;
		char playing;
		//add in a do while loop after you get the basics up and running
		do {
			String player = "";
		
			out.print("type in your prompt [R,P,S] :: ");
			response = keyboard.next().toUpperCase();
			response = response.substring(0,1);
			out.println("player chooses: " + response);
			//read in the player value
			RockPaperScissors game = new RockPaperScissors(response);
			out.println(game);
			out.println("\nwould you like to play again?");
			playing = keyboard.next().toUpperCase().charAt(0);
		} while(playing == 'Y');
	}
}



