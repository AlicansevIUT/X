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
	private final string name;
	
	
	/**
	 * color chosen by the player
	 */
	private final string color;
	
	/** 
	 * create a new player
	 * @param name : name of the player
	 * @param color : color of the player
	 */
	public Player(string name, string color)
	{
		this.name = name;
		this.color = color;
	}


	/**
	 * @return the name of the player
	 */
	public string getName()
	{
		return name;
	}

	/**
	 * @return the color of the player
	 */
	public string getColor()
	{
		return color;
	}
	}
