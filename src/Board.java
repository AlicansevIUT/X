import java.util.Arrays;

/**
 * Board of a ChineseCheckers' Game
 * 
 * @author canseva, berarddy
 *
 */
public class Board
{
	/**
	 * The limit number of line in the tab
	 */
	private final static int TAB_LINE = 16;

	/**
	 * The limit number of column in the tab
	 */
	private final static int TAB_COLUMN = 13;
	
	/**
	 * Array which represents position of the board
	 */
	private int[][] tab = new int[TAB_LINE][TAB_COLUMN];
	
	
	/**
	 * Initial value of x in order to create the board
	 */
	private final static int DEFAULT_X = 0;

	/**
	 * Initial value of y in order to create the board
	 */
	private final static int DEFAULT_Y = 0;

	// TODO (done) fix comment (how, in which state, is the board once created?)
	/**
	 * Create a new ChineseCheckers' board using an array which contains empty
	 * positions
	 */

	public Board()
	{int x;
	 int y;	
		for (y = 0; y < this.tab.length; y++)
		{
			this.tab[y] = new int[y + 1];
		}

		for (y = 0; y < this.tab.length; y++)
		{
			for (x = 0; x < this.tab[y].length; x++)
			{
				this.tab[x] = new int[x + 1];
			}

		}
	}

	public String toString()
	{
		return "Board [tab=" + (tab != null ? Arrays.asList(tab) : null) + "]";
	}	
	
	
}
