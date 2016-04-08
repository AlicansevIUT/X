/**
 * Board of a ChineseCheckers' Game
 * 
 * @author canseva, berarddy
 *
 */
public class Board
{
	/**
	 * Array which represents position of the board
	 */
	int tab[][] = new int[16][13];

	/**
	 * Initial value of x in order to create the board
	 */
	private final static int DEFAULT_X = 0;

	/**
	 * Initial value of y in order to create the board
	 */
	private final static int DEFAULT_Y = 0;

	/**
	 * Position X of the board
	 */
	private int X;

	/**
	 * Position Y of the board
	 */
	private int Y;

	// TODO (done) fix comment (how, in which state, is the board once created?)
	/**
	 * Create a new ChineseCheckers' board using an array which contains empty
	 * positions
	 */

	public Board()
	{
		this.X=DEFAULT_X;
		this.Y=DEFAULT_Y;
		for (this.Y = 0; this.Y < this.tab.length; this.Y++)
		{
			this.tab[this.Y] = new int[this.Y + 1];
		}

		for (this.Y = 0; this.Y < this.tab.length; this.Y++)
		{
			for (this.X = 0; this.X < this.tab[this.Y].length; this.X++)
			{
				this.tab[this.X] = new int[this.X + 1];
			}

		}
	}
}
