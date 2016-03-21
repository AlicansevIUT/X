/**
 * Positions for the board of a ChineseCheckers's Game
 * @author canseva, berarddy
 */
public class Position
{

	/**
	 * Location X of the board
	 */
	private int locationx;
	
	/**
	 * Location Y of the board
	 */
	private int locationy;
	
	
	/**
	 * create a new position
	 * @param locationx0 
	 * @param locationy0 
	 */
	public Position(int locationx0, int locationy0)
	{
		if (this.locationx<17)
			this.locationx = locationx0;
		
		if(this.locationy<17)
			this.locationy = locationy0;
	}
}
