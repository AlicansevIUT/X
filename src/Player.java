import java.util.Scanner; 
import java.util.*;

/**
 * Player of a ChineseCheckers' Game
 * 
 * @author canseva, berarddy
 *
 */
public class Player
{
	private int number;
	
	

	/**
	 * name of the player
	 */
	private final String name;

	/**
	 * color chosen by the player
	 */
	private final int color;

	// TODO (done) write a comment *** per *** constant
	/**
	 * RED = the red color for the pawn of a player
	 */
	private final static int COLOR_RED = 1;
	
	/**
	 * YELLOW = the yellow color for the pawn of a player
	 */
	private final static int COLOR_YELLOW = 2;
	
	/**
	 * BLUE = the blue color for the pawn of a player
	 */
	private final static int COLOR_BLUE = 3;
	
	/**
	 * WHITE = the white color for the pawn of a player
	 */
	private final static int COLOR_WHITE = 4;
	
	/**
	 * GREEN = the green color for the pawn of a player
	 */
	private final static int COLOR_GREEN = 5;
	
	/**
	 * BLACK = the black color for the pawn of a player
	 */
	private final static int COLOR_BLACK = 6;

	/**
	 * create a new player with the name and the color chosen
	 * 
	 * @param name0
	 *            : name of the player
	 * @param color0
	 *            : color chosen by the player
	 * @param number0 
	 */
	public Player(String name0, int color0, int number0)
	{
		this.name = name0;
		this.color = color0;
		this.number=number0;
	}

	/**
	 * Used to get the name of the player
	 * 
	 * @return the name of the player
	 */
	public String getName()
	{
		return this.name;
	}

	// TODO (done)fix method (type mismatch)
	/**
	 * Used to get the color of the player
	 * 
	 * @return the color of the player
	 */
	public int getColor()
	{
		return this.color;
	}

	/**
	 * Used to ask to the player a position
	 * @return a position
	 */
	public Position askPosition()
	{
		int scx;
		int scy;
		Scanner scan = new Scanner(System.in);
        scx = scan.nextInt(); 
        scan.close();
        
        Scanner scan2 = new Scanner(System.in);
        scy = scan.nextInt(); 
        scan2.close();
        
		Position po = new Position(scx,scy) ;
		
		return po;
	}
	
	
	/**
	 * getter for the number of a player
	 * @return number
	 */
	public int getNumber()
	{
		return this.number;
	}
	
	/**
	 * Setter for the number of a player
	 * @param number
	 */
	public void setNumber(int number)
	{
		this.number = number;
	}
}