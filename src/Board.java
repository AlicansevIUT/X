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

	// TODO (done) write comment
	// TODO (done) rename constant (not compliant with coding conventions)
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

	// TODO fix comment (how, in which state, is the board once created?)
	/**
	 * Create a new ChineseCheckers' board using an array which contains
	 * positions
	 */

	public Board()
	{
		for (Y = 0; Y < tab.length; Y++)
		{
			tab[Y] = new int[Y + 1];
		}

		for (Y = 0; Y < tab.length; Y++)
		{
			for (int X = 0; X < tab[Y].length; ++X)
			{
				tab[X] = new int[X + 1];
			}

		}
	}
}
