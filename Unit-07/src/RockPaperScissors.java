//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		this("R");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		int com;
		playChoice = player;
		com = (int)(Math.random()*3);
		if(com == 0) {
			compChoice = "R";
		} else if(com == 1) {
			compChoice = "P";
		} else if(com == 2) {
			compChoice = "S";
		}
	}

	public String determineWinner()
	{
		String winner="";
		if((playChoice.equals("R") && compChoice.equals("S")) || (playChoice.equals("P") && compChoice.equals("R")) || (playChoice.equals("S") && compChoice.equals("P"))) {
			winner = "player";
		} else if ((playChoice.equals("R") && compChoice.equals("P")) || (playChoice.equals("P") && compChoice.equals("S")) || (playChoice.equals("S") && compChoice.equals("R"))) {
			winner = "computer";
		} else if (playChoice.equals(compChoice)){
			winner = "nobody";
		}
		return winner;
	}

	public String toString()
	{
		String winner = determineWinner();
		String output = "";
		if(winner.equals("player") || winner.equals("computer"))
			output="computer chooses: " + compChoice + "\n" + winner + " wins!";
		else if(winner.equals("nobody"))
			output="computer chooses: " + compChoice + "\n" + "draw game!";
		else
			output="computer chooses: " + compChoice + "\n" + "invalid character, try again";
		return output;
	}
}