//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for(int r = 0; r<rows; r++) {
			for(int c = 0; c < cols; c++) {
				grid[r][c] = vals[(int)(Math.random()*vals.length)];
			}
		}
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		String max = grid[0][0];
		for(int r = 0; r < grid.length; r++) {
			for(int c=0; c<grid[0].length; c++) {
				if(countVals(grid[r][c]) > countVals(max)) {
					max = grid[r][c];
				}
			}
		}
		return max;
	}
	//returns a count of how many times val occurs in the matrix
	public int countVals( String val )
	{
		int cnt = 0;
		for(int r = 0; r < grid.length; r++) {
			for(int c = 0; c < grid[0].length; c++) {
				if(val.equals(grid[r][c])) cnt++;
			}
		}
		return cnt;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for(int r = 0; r < grid.length; r++) {
			for(int c = 0; c < grid[0].length; c++) {
				output+=grid[r][c];
			}
			output+="\n";
		}
		return output;
	}
}