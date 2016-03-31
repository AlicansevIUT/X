/**
 * A Chinese checkers game
 * (http://www.mastersgames.com/rules/chinese-checkers-rules.htm)
 * @author canseva, berarddy
 */

public class ChineseCheckersGame
{

	// TODO (done)write comment
	
	/**
	 * it represents a board of a ChineseCheckersGame
	 */
	private final Board board;
	
	// TODO (done)write comment
	
	/**
	 * it represents a player of a ChineseCheckersGame
	 */
	private final Player player;
	
	/**
	 * Creates a new Chinese checkers game, ready to be played (board is in its starting configuration, players are ready)
	 */
	public ChineseCheckersGame()
	{
		this.board = new Board();
		this.player = new Player(); 
	}
	
	
	/**
	 * 
	 * While nobody put all his pawns in the opposite side
	 * 		then ask to the actual player his move
	 * 			while the move isn't allowed
	 * 				then ask to the same player a new move
	 *		    the pawn is moved
	 * 				
	 */
	public void play()
	{// TODO write code according to specs
		
	}
	
}