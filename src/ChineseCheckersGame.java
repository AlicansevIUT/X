/**
 * A Chinese checkers game
 * (http://www.mastersgames.com/rules/chinese-checkers-rules.htm)
 * @author canseva, berarddy
 */

public class ChineseCheckersGame
{

	// TODO write comment
	private final Board board;
	
	// TODO write comment
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
	 * 
	 * While nobody put all his pawns in the opposite side
	 * 		then ask to the actual player his move
	 * 			if the move is allowed
	 * 				then the pawn is moved
	 *			else ask to the same player a new move
	 * 				
	 */
	public void play()
	{
		// TODO write code according to specs
		
	}
	
}
