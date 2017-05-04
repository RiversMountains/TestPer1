
public class Game {

	public Game()
	{
		
	}

	// post: controls the game 
	public void playGame()
	{
		boolean playAgain = false;
		do {
			do {
				Result move = processMove();
				if (move == X_WON || move == O_WON || move == TIE)
					display.displayWinner(move);
				else
//					switch whose turn
				} while (game not over)
//			tell UI to display winner (or tie) and ask whether to play again
			if (playAgain == true)
			{
//				reset game
			}
		} while (playAgain == true)

	// pre: called by UI to indicate that a square was clicked on; ‘loc’ is a valid location
	// post: sets flag ‘pressed’; sets ‘pressedLoc’ to ‘loc’
	}
	
	public void pressed (Location loc)
	{
	// pre:	‘pressed’ is false
	// post: waits for UI to indicate that a square was clicked (by detecting that pressed == true),
//		then tells board to either record the move or indicate if it was an invalid move;
//	 	if invalid, waits for another move; if valid, returns Result
//		also resets ‘pressed’
	}
		
	private Result processMove()

	// post: clears board and resets player to ‘X’
	private void resetGame()
	{}
	// post: sets the UI data field
	//public void setDisplay(UI ui)
	{}

}
