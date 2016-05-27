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
	private final static int TAB_LINE = 17;

	/**
	 * The limit number of column in the tab
	 */
	private final static int TAB_COLUMN = 17;

	/**
	 * Array which represents position of the board
	 */
	private Case[][] tab;

	// TODO (done) fix comment (how, in which state, is the board once created?)
	/**
	 * Create a new ChineseCheckers' board using an array which contains empty
	 * positions
	 */
	public Board()
	{
		this.tab = new Case[TAB_LINE][TAB_COLUMN];
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
		for (i = 0; i < TAB_LINE; i++)
		{
			for (j = 0; j < TAB_COLUMN; j++)
			{
				this.tab[i][j] = Case.DEAD;
			}
		}

		// Filling the top with DEAD and PAWN case
	
		this.tab[4][0] = Case.BLACK;

		
		this.tab[4][1] = Case.BLACK;
		this.tab[5][1] = Case.BLACK;

		
		this.tab[4][2] = Case.BLACK;
		this.tab[5][2] = Case.BLACK;
		this.tab[6][2] = Case.BLACK;

		
		this.tab[4][3] = Case.BLACK;
		this.tab[5][3] = Case.BLACK;
		this.tab[6][3] = Case.BLACK;
		this.tab[7][3] = Case.BLACK;
		
		
		this.tab[0][4]=Case.RED;
		this.tab[1][4]=Case.RED;
		this.tab[2][4]=Case.RED;
		this.tab[3][4]=Case.RED;
		
		this.tab[9][4]=Case.GREEN;
		this.tab[10][4]=Case.GREEN;
		this.tab[11][4]=Case.GREEN;
		this.tab[12][4]=Case.GREEN;
		
		this.tab[4][4]=Case.EMPTY;
		this.tab[5][4]=Case.EMPTY;
		this.tab[6][4]=Case.EMPTY;
		this.tab[7][4]=Case.EMPTY;
		this.tab[8][4]=Case.EMPTY;
		
		this.tab[1][5]=Case.RED;
		this.tab[2][5]=Case.RED;
		this.tab[3][5]=Case.RED;
		
		this.tab[10][5]=Case.GREEN;
		this.tab[11][5]=Case.GREEN;
		this.tab[12][5]=Case.GREEN;
		
		this.tab[4][5]=Case.EMPTY;
		this.tab[5][5]=Case.EMPTY;
		this.tab[6][5]=Case.EMPTY;
		this.tab[7][5]=Case.EMPTY;
		this.tab[8][5]=Case.EMPTY;
		this.tab[9][5]=Case.EMPTY;
		
		
		for (i = 4; i <=10 ; i++)
		{
			j = 6;
			this.tab[i][j] = Case.EMPTY;
		}
		this.tab[2][6]=Case.RED;
		this.tab[3][6]=Case.RED;
		this.tab[11][6]=Case.GREEN;
		this.tab[12][6]=Case.GREEN;
		
		for (i = 4; i <=11 ; i++)
		{
			j = 7;
			this.tab[i][j] = Case.EMPTY;
		}
		this.tab[3][7]=Case.RED;
		this.tab[12][7]=Case.GREEN;
		
		for (i = 4; i <=12 ; i++)
		{
			j = 8;
			this.tab[i][j] = Case.EMPTY;
		}
		
		for (i = 5; i <=12 ; i++)
		{
			j = 9;
			this.tab[i][j] = Case.EMPTY;
		}
		this.tab[4][9]=Case.YELLOW;
		this.tab[13][9]=Case.WHITE;
		
		for (i = 6; i <=12 ; i++)
		{
			j =10;
			this.tab[i][j] = Case.EMPTY;
		}
		this.tab[5][10]=Case.YELLOW;
		this.tab[4][10]=Case.YELLOW;
		this.tab[13][10]=Case.WHITE;
		this.tab[14][10]=Case.WHITE;
		
		for (i = 7; i <=12 ; i++)
		{
			j =11;
			this.tab[i][j] = Case.EMPTY;
		}
		this.tab[5][11]=Case.YELLOW;
		this.tab[4][11]=Case.YELLOW;
		this.tab[6][11]=Case.YELLOW;
		this.tab[13][11]=Case.WHITE;
		this.tab[14][11]=Case.WHITE;
		this.tab[15][11]=Case.WHITE;
		
		for (i = 8; i <=12 ; i++)
		{
			j =12;
			this.tab[i][j] = Case.EMPTY;
		}
		this.tab[5][12]=Case.YELLOW;
		this.tab[4][12]=Case.YELLOW;
		this.tab[6][12]=Case.YELLOW;
		this.tab[7][12]=Case.YELLOW;
		this.tab[13][12]=Case.WHITE;
		this.tab[14][12]=Case.WHITE;
		this.tab[15][12]=Case.WHITE;
		this.tab[16][12]=Case.WHITE;
		
		for (i = 9; i <=12 ; i++)
		{
			j =13;
			this.tab[i][j] = Case.BLUE;
		}
		
		for (i = 10; i <=12 ; i++)
		{
			j =14;
			this.tab[i][j] = Case.BLUE;
		}
		
		for (i = 11; i <=12 ; i++)
		{
			j =15;
			this.tab[i][j] = Case.BLUE;
		}
		
		for (i = 12; i <=12 ; i++)
		{
			j =16;
			this.tab[i][j] = Case.BLUE;
		}
		
	}

	public String toString()
	{
		String res = "";

		for (int i = 0; i < TAB_LINE; i++)
		{
			for (int j = 0; j < TAB_COLUMN; j++)
			{
				switch (this.tab[i][j])
				{
				case DEAD:
					res += "x";
					break;
				case BLACK:
					res += "1";
					break;
				case RED:
					res += "2";
					break;
				case GREEN:
					res += "3";
					break;
				case YELLOW:
					res += "4";
					break;
				case WHITE:
					res += "5";
					break;
				case BLUE:
					res += "6";
					break;
				case EMPTY:
					res += "*";
					break;
				default:
				}

			}
			res += "\n";
		}
		return res;
	}

	/**
	 * getter for the tab
	 * @return tab
	 */
	public Case[][] getTab()
	{
		return this.tab;
	}
}
