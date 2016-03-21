/**
 * Board of a ChineseCheckers' Game
 * @author canseva, berarddy
 *
 */
public class Board
{
	

	// TODO gather x and y in a class called position
	/**
	 * Location X of the board
	 */
	private final int locationx;
	
	/**
	 * Location Y of the board
	 */
	private final int locationy;

	// TODO fix comment
	/** Create a new ChineseCheckers' board
	 * @param locationx
	 * @param locationy
	 */
	public Board(int locationx, int locationy)
	{
		while (locationx<17)
		this.locationx = locationx;
		this.locationy = locationy;
	}

}

