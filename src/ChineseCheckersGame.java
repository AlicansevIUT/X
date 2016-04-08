/**
 * A Chinese checkers game
 * (http://www.mastersgames.com/rules/chinese-checkers-rules.htm)
 * 
 * @author canseva, berarddy
 */

public class ChineseCheckersGame
{

	/**
	 * game board
	 */
	private final Board board;
	
	/**
	 * position
	 */
	private Position position;
	
	/**
	 * boolean 
	 * false when the game is running
	 * true when the game is over
	 */
	private boolean gameover;


	// TODO (done) is it a single player game?
	/**
	 * player
	 */
	private Player player;

	/**
	 * Creates a new Chinese checkers game, ready to be played (board is in its
	 * starting configuration, players are ready)
	 */
	public ChineseCheckersGame()
	{
		this.board = new Board();
		this.player = new Player(null, 0);
	}

	// TODO (done) zoom out algorithm steps (not detail if not needed)
	/**
	 * While the game is not over
	 * 		for all the players in the game
	 * 			ask to the actual player a position 
	 * 				while the position isn't allowed 
	 *           		then ask to the same player a new position 
	 *         		the pawn is moved to the position
	 */
	public void play()
	{
		// TODO write code according to specs
			while (this.gameover==false)
			 {
				this.position
			 }
	}
}