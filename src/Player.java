/**
 * Player of a ChineseCheckers' Game
 * @author canseva, berarddy
 *
 */
public class Player
{

	
	/**
	 * name of the player
	 */
	private final String name;
	
	/**
	 * color chosen by the player
	 */
	private final int color;
	
	
	// TODO (done)consider representing color as int constants, or (better) enumeration
	/**
	 * list of color available
	 */
	private final static int red = 1;
	private final static int yellow = 2;
	private final static int blue = 3;
	private final static int white = 4;
	private final static int green = 5;
	private final static int black = 6;
	
	/** 
	 * create a new player
	 * @param name : name of the player
	 * @param color0 : color chosen by the player
	 */
	
	public Player(String name, int color0)
	{
		this.name = name;
		this.color = color0;
	}


	/**
	 * @return the name of the player
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @return the color of the player
	 */
	public String getColor()
	{
		return color;
	}
}