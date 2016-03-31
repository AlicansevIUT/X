/**
 * Positions for the board of a ChineseCheckers's Game
 * @author canseva, berarddy
 */
public class Position 
{
	


	// TODO (done) write comment
	// TODO (done) rename constant (not compliant with coding conventions)
	/**
	 * The limit x of the board
	 */
	public final static int DEFAULT_LIMITX = 17;

	// TODO (done) write comment
	// TODO (done) rename constant (not compliant with coding conventions)
	/**
	 * The limit y of the board
	 */
	public final static int DEFAULT_LIMITY = 17;
	
	// TODO (done) rename field (not compliant with coding conventions)
	/**
	 * Location X of the board
	 */
	private int locationX;
	
	// TODO (done) rename field (not compliant with coding conventions)
	/**
	 * Location Y of the board
	 */
	private int locationY;
	
	
	// TODO (done) fix comment (give detail on position's state, add parameters doc)
	/**
	 * create a new position with an x and an y given to the constructor
	 * @param locationX0 
	 * @param locationY0 
	 */
	public Position(int locationX0, int locationY0)
	{
		
		// TODO (done) declare a constant instead of using an hardcoded value
		if (this.locationX<DEFAULT_LIMITX)
			this.locationX = locationX0;
		
		if(this.locationY<DEFAULT_LIMITY)
			this.locationY = locationY0;
	}
}
