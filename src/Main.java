// TODO (done) write comment
/**
 * It's the main class of the ChineseCheckersGame
 * @author canseva, berarddy
 *
 */
public class Main
{
	/**
	 * 
	 * It's the main method, used to create a new game by using the method play
	 * of the ChineseCheckersGame class
	 */
	public static void main(String[] args)
	{		
		//new ChineseCheckersGame().play();
		
		Board bord = new Board();
		System.out.println(""+bord.toString());
	}
}
