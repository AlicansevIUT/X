/**
 * Positions for the board of a ChineseCheckers's Game
 * 
 * @author canseva, berarddy
 */
public class Position
{

	/**
	 * The limit x of the board
	 */
	public final static int DEFAULT_LIMITX = 13;

	/**
	 * The limit y of the board
	 */
	public final static int DEFAULT_LIMITY = 16;

	/**
	 * Location X of the board
	 */
	private int locationX;

	/**
	 * Location Y of the board
	 */
	private int locationY;

	/**
	 * create a new position with an x and an y given to the constructor
	 * 
	 * @param locationX0
	 * @param locationY0
	 */
	public Position(int locationX0, int locationY0)
	{
		if (this.locationX <= DEFAULT_LIMITX)
			this.locationX = locationX0;

		if (this.locationY <= DEFAULT_LIMITY)
			this.locationY = locationY0;
	}

	/**
	 * @return
	 */
	public static boolean isAllowed(int posix, int posiy)
	{
		if (posix <= DEFAULT_LIMITX)
		if (posiy <= DEFAULT_LIMITY);
			
	}
}
