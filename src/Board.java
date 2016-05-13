import java.util.Arrays;

/**
 * Board of a ChineseCheckers' Game
 * 
 * @author canseva, berarddy
 *
 */
public class Board
{
	/**
	 * The limit number of line in the tab
	 */
	private final static int TAB_LINE = 16;

	/**
	 * The limit number of column in the tab
	 */
	private final static int TAB_COLUMN = 13;
	
	/**
	 * Array which represents position of the board
	 */
	private Case[][] tab = new Case[TAB_LINE][TAB_COLUMN];
	
	
	/**
	 * Initial value of x in order to create the board
	 */
	private final static int DEFAULT_X = 0;

	/**
	 * Initial value of y in order to create the board
	 */
	private final static int DEFAULT_Y = 0;

	// TODO (done) fix comment (how, in which state, is the board once created?)
	/**
	 * Create a new ChineseCheckers' board using an array which contains empty
	 * positions
	 */
	public Board(){
		this.tab=new Case[TAB_LINE][TAB_COLUMN];
		Initialisation();
	}

	/**
	 * Method to initialize the board
	 */
	public void Initialisation()
	{
		int i;
		int j;
	 
		// Initial filling with PAWN case
	 	for ( i=0; i<this.tab.length; i++){
	 		for (j=0; j<this.tab.length; j++){
	 			this.tab[i][j]=Case.PAWN;
	 		}
	 	}
	 	
	 	// Filling the top with DEAD and PAWN case
	 	for (i=0; i<this.tab.length;i++){
	 		j=0;
	 		this.tab[i][j]=Case.DEAD;
	 	}	
	 	
	 	this.tab[4][0]=Case.PAWN;
	 	
	 	for (i=0; i<this.tab.length;i++){
	 		j=1;
	 		this.tab[i][j]=Case.DEAD;
	 		
	 	}
	 	this.tab[4][1]=Case.PAWN;
	 	this.tab[5][1]=Case.PAWN;
	 	
	 	for (i=0; i<this.tab.length;i++){
	 		j=2;
	 		this.tab[i][j]=Case.DEAD;
	 		
	 	}
	 	this.tab[4][2]=Case.PAWN;
	 	this.tab[5][2]=Case.PAWN;
	 	this.tab[6][2]=Case.PAWN;
	 	
	 	for (i=0; i<this.tab.length;i++){
	 		j=3;
	 		this.tab[i][j]=Case.DEAD;
	 		
	 	}
	 	this.tab[4][3]=Case.PAWN;
	 	this.tab[5][3]=Case.PAWN;
	 	this.tab[6][3]=Case.PAWN;
		this.tab[7][3]=Case.PAWN;
		
		// Filling the left with DEAD case
		this.tab[0][5]=Case.DEAD;
		
		this.tab[0][6]=Case.DEAD;
		this.tab[1][6]=Case.DEAD;
		
		this.tab[0][7]=Case.DEAD;
		this.tab[1][7]=Case.DEAD;
		this.tab[2][7]=Case.DEAD;
		
		this.tab[0][8]=Case.DEAD;
		this.tab[1][8]=Case.DEAD;
		this.tab[2][8]=Case.DEAD;
		this.tab[3][8]=Case.DEAD;
	
		this.tab[0][9]=Case.DEAD;
		this.tab[1][9]=Case.DEAD;
		this.tab[2][9]=Case.DEAD;
		
		this.tab[0][10]=Case.DEAD;
		this.tab[1][10]=Case.DEAD;
	
		this.tab[0][11]=Case.DEAD;
	
		// Filling the right with DEAD and PAWN case
		this.tab[13][5]=Case.DEAD;
		
		this.tab[13][6]=Case.DEAD;
		this.tab[14][6]=Case.DEAD;
		
		this.tab[13][7]=Case.DEAD;
		this.tab[14][7]=Case.DEAD;
		this.tab[15][7]=Case.DEAD;
		
		this.tab[13][8]=Case.DEAD;
		this.tab[14][8]=Case.DEAD;
		this.tab[15][8]=Case.DEAD;
		this.tab[16][8]=Case.DEAD;
	
		this.tab[13][9]=Case.DEAD;
		this.tab[14][9]=Case.DEAD;
		this.tab[15][9]=Case.DEAD;
		
		this.tab[13][10]=Case.DEAD;
		this.tab[14][10]=Case.DEAD;
	
		this.tab[13][11]=Case.DEAD;
		
		// Filling the bottom with DEAD and PAWN case
		for (i=0; i<this.tab.length;i++){
	 		j=16;
	 		this.tab[i][j]=Case.DEAD;
	 	}	
	 	this.tab[8][13]=Case.PAWN;
	 	
	 	for (i=0; i<this.tab.length;i++){
	 		j=15;
	 		this.tab[i][j]=Case.DEAD;
	 		
	 	}
	 	this.tab[8][14]=Case.PAWN;
	 	this.tab[7][14]=Case.PAWN;
	 	
	 	for (i=0; i<this.tab.length;i++){
	 		j=14;
	 		this.tab[i][j]=Case.DEAD;
	 		
	 	}
	 	this.tab[8][15]=Case.PAWN;
	 	this.tab[7][15]=Case.PAWN;
	 	this.tab[6][15]=Case.PAWN;
	 	
	 	for (i=0; i<this.tab.length;i++){
	 		j=13;
	 		this.tab[i][j]=Case.DEAD;
	 		
	 	}
	 	this.tab[8][16]=Case.PAWN;
	 	this.tab[7][16]=Case.PAWN;
	 	this.tab[6][16]=Case.PAWN;
		this.tab[5][16]=Case.PAWN;
		
		// Filling the center with EMPTY case
		
		for(i=4; i<9; i++){
			for (j=4; j<13; j++){
				this.tab[i][j]=Case.EMPTY;					
			}
		}
		
		for(i=8; i<13; i++){
			for (j=8; j<16; j++){
				this.tab[i][j]=Case.EMPTY;					
			}
		}
			
	}
	 
		 	/*for (y = 0; y < this.tab.length; y++)
			{
				this.tab[y] = new int[y + 1];
			}
	
			for (y = 0; y < this.tab.length; y++)
			{
				for (x = 0; x < this.tab[y].length; x++)
				{
					this.tab[x] = new int[x + 1];
				{
			}
			*/
			 

	public String toString()
	{
		String res="";
		
		for ( int i=0; i<this.tab.length; i++){
	 		for (int j=0; j<this.tab[0].length; j++){
	 			switch(this.tab[i][j]){
	 			case DEAD:
	 				res+="x";
	 				break;
	 			case PAWN:
	 				res+="o";
	 				break;
	 			case EMPTY:
	 				res+="*";
	 				break;
	 			default:
	 			}
	 		res+="\n";		
		
	 		}
		}
	return res;
	}
}
