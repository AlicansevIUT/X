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
	
	
	// TODO consider representing color as int constants, or (better) enumeration
	/**
	 * color chosen by the player
	 */
	private final String color;
	
	/** 
	 * create a new player
	 * @param name : name of the player
	 * @param color : color of the player
	 */
	public Player(String name, String color)
	{
		this.name = name;
		this.color = color;
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
