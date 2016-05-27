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
	
	
	// TODO (done) is it a single player game?
	/**
	 * player
	 */
	private Player player;
	
	/**
	 * current player
	 */
	private Player currentPlayer;

	/**
	 * Creates a new Chinese checkers game, ready to be played (board is in its
	 * starting configuration, players are ready)
	 */
	public ChineseCheckersGame()
	{
		this.board = new Board();
		this.player = new Player(null, 0, 0);
	}

	// TODO (done) zoom out algorithm steps (not detail if not needed)
	/**
	 * <current player is player 1>
	 * While <the game is not over>
	 * do
	 * 	 	<ask to the current player a position> 
	 * while <the position isn't allowed> 
	 * <the pawn is moved to the position>
	 * 
	 */
	public void play()
	{
		
		/**
		 * boolean 
		 * false when the game is running
		 * true when the game is over
		 */
		boolean gameover;
		gameover=false;
		Position posi;
		Position pawn;
		// TODO write code according to specs
			while (gameover==false)
				this.currentPlayer.setNumber(1);
			 {
			do{
				System.out.println("Quel pion voulez-vous déplacer ?");
				pawn=this.player.askPosition();
				System.out.println("Où souhaitez-vous le déplacer ?");
				posi=this.player.askPosition();
				}while (posi.isAllowed(this.board, posi.getLocationX(), posi.getLocationY())==false);
			}
	}
}
