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
	
	
	// TODO (done) write a comment per constant
	/**
	 * RED = the red color for the pawn of a player
	 * YELLOW = the yellow color for the pawn of a player
	 * BLUE = the blue color for the pawn of a player
	 * WHITE = the white color for the pawn of a player
	 * GREEN = the green color for the pawn of a player
	 * BLACK = the black color for the pawn of a player
	 */
	
	// TODO (done) rename constants (not compliant with naming conventions)
	private final static int RED = 1;
	private final static int YELLOW = 2;
	private final static int BLUE = 3;
	private final static int WHITE = 4;
	private final static int GREEN = 5;
	private final static int BLACK = 6;
	
	// TODO (done) detail comment: how (in which stated)is the player once created?
	/** 
	 * create a new player with the name and the color chosen
	 * @param name : name of the player
	 * @param color0 : color chosen by the player
	 */
	
	public Player(String name, int color0)
	{
		this.name = name;
		this.color = color0;
	}

	// TODO (done) fix comment (add a general description before @return)
	/**
	 * Using to get the name of the player
	 * @return the name of the player
	 */
	public String getName()
	{
		return name;
	}

	// TODO (done) fix comment (add a general description before @return)
	/**
	 * Using to get the color of the player
	 * @return the color of the player
	 */
	public String getColor()
	{
		return color;
	}
}