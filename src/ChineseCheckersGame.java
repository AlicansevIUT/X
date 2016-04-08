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

	// TODO (done)write comment

	// TODO is it a single player game?
	/**
	 * player
	 */
	private final Player player;

	/**
	 * Creates a new Chinese checkers game, ready to be played (board is in its
	 * starting configuration, players are ready)
	 */
	public ChineseCheckersGame()
	{
		this.board = new Board();
		this.player = new Player();
	}

	// TODO zoom out algorithm steps (not detail if not needed)
	/**
	 * 
	 * While nobody put all his pawns in the opposite side then ask to the
	 * actual player his move while the move isn't allowed then ask to the same
	 * player a new move the pawn is moved
	 * 
	 */
	public void play()
	{// TODO write code according to specs

	}

}