// TODO (done) write comment
/**
 * Board of a ChineseCheckers' Game
 * @author canseva, berarddy
 *
 */
public class Board
{
	

	// TODO(done) write comment
	/**
	 * Location X of the board
	 */
	private final int locationx;
	
	// TODO(done) write comment
	/**
	 * Location Y of the board
	 */
	private final int locationy;

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

