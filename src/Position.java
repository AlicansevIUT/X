/**
 * Positions for the board of a ChineseCheckers's Game
 * @author canseva, berarddy
 */
public class Position
{

	// TODO rename field (not compliant with coding conventions)
	/**
	 * Location X of the board
	 */
	private int locationx;
	
	// TODO rename field (not compliant with coding conventions)
	/**
	 * Location Y of the board
	 */
	private int locationy;
	
	
	// TODO fix comment (give detail on position's state, add parameters doc)
	/**
	 * create a new position
	 * @param locationx0 
	 * @param locationy0 
	 */
	public Position(int locationx0, int locationy0)
	{
		
		// TODO declare a constant instead of using an hardcoded value
		if (this.locationx<17)
			this.locationx = locationx0;
		
		if(this.locationy<17)
			this.locationy = locationy0;
	}
}
