
/*
 * Program: Tic Tac Toe Game Class Board
 * Author: Sharon Davis
 * Date: 5/08/2013
 * Description: CS161 Lab 6
 * 		This class determines if a win has occurred.
 * Inputs: @parameters boardSquare
 * 		   @parameters boardSymbol
 * Outputs: @returns String if win occurs 
 */

public class TicTacToeBoard {
	//global variables
		public static int currentBoardCount = 0;
		private int boardSquare;
		private String boardSymbol;
		private String title = "Tic Tac Toe Game";
		private String[] boardProgress = new String[9];
		
		/* constructor method for creating Board object
		* @param boardSymbol, 'X' or 'O'
		* @param boardSquare, board location for symbol
		*/
		
		public TicTacToeBoard(String nextBoardSymbol, int nextBoardSquare){
			boardSymbol = null;
			boardSquare = 0;	
		}
		
		/*
		 * Method: getTitle()
		 * 		This method sends title to caller.
		 * Inputs: none
		 * Outputs: @returns String title if called 
		 */
		
		public String getTitle(){
			return title;
		}
		
		/*
		 * Method: currentBoard()
		 * 		This method determines if a win has occurred.
		 * Inputs: @parameters boardSquare
		 * 		   @parameters boardSymbol
		 * Outputs: @returns String if win occurs 
		 */
		
		public String currentBoard(String boardSymbol, int boardSquare){
			
			//local variables
			String winYet = "0";
			
			//initializes boardProgress array, first time in
			if(currentBoardCount == 0){
				for(int i = 0; i < 9; i++){
					boardProgress[i] = " ";
				}
				currentBoardCount = 1;			//used to stop unwanted re-initialization
			}
			
			//protects array from out of bounds ints
			if(boardSquare >= 1 && boardSquare <= 9){
				boardProgress[boardSquare - 1] = boardSymbol;
			}
			
			//checks if win has occurred
			if(boardProgress[0].equalsIgnoreCase("X") && boardProgress[1].equalsIgnoreCase("X") && boardProgress[2].equalsIgnoreCase("X") ||
				boardProgress[0].equalsIgnoreCase("O") && boardProgress[1].equalsIgnoreCase("O") && boardProgress[2].equalsIgnoreCase("O") ||
				boardProgress[3].equalsIgnoreCase("X") && boardProgress[4].equalsIgnoreCase("X") && boardProgress[5].equalsIgnoreCase("X") ||
				boardProgress[3].equalsIgnoreCase("O") && boardProgress[4].equalsIgnoreCase("O") && boardProgress[5].equalsIgnoreCase("O") ||
				boardProgress[6].equalsIgnoreCase("X") && boardProgress[7].equalsIgnoreCase("X") && boardProgress[8].equalsIgnoreCase("X") ||
				boardProgress[6].equalsIgnoreCase("O") && boardProgress[7].equalsIgnoreCase("O") && boardProgress[8].equalsIgnoreCase("O") ||
				boardProgress[0].equalsIgnoreCase("X") && boardProgress[4].equalsIgnoreCase("X") && boardProgress[8].equalsIgnoreCase("X") ||
				boardProgress[0].equalsIgnoreCase("O") && boardProgress[4].equalsIgnoreCase("O") && boardProgress[8].equalsIgnoreCase("O") ||
				boardProgress[2].equalsIgnoreCase("X") && boardProgress[4].equalsIgnoreCase("X") && boardProgress[6].equalsIgnoreCase("X") ||
				boardProgress[2].equalsIgnoreCase("O") && boardProgress[4].equalsIgnoreCase("O") && boardProgress[6].equalsIgnoreCase("O") ||
				boardProgress[0].equalsIgnoreCase("X") && boardProgress[3].equalsIgnoreCase("X") && boardProgress[6].equalsIgnoreCase("X") ||
				boardProgress[0].equalsIgnoreCase("O") && boardProgress[3].equalsIgnoreCase("O") && boardProgress[6].equalsIgnoreCase("O") ||
				boardProgress[1].equalsIgnoreCase("X") && boardProgress[4].equalsIgnoreCase("X") && boardProgress[7].equalsIgnoreCase("X") ||
				boardProgress[1].equalsIgnoreCase("O") && boardProgress[4].equalsIgnoreCase("O") && boardProgress[7].equalsIgnoreCase("O") ||
				boardProgress[2].equalsIgnoreCase("X") && boardProgress[5].equalsIgnoreCase("X") && boardProgress[8].equalsIgnoreCase("X") ||
				boardProgress[2].equalsIgnoreCase("O") && boardProgress[5].equalsIgnoreCase("O") && boardProgress[8].equalsIgnoreCase("O")){
				
				winYet = "\nTic Tac Toe, Three in a Row!!";
			//	for(int j = 0; j < 9; j++){										//used for test
			//		System.out.println(boardProgress[j]);
			//	}
			}
			return winYet;			//returns string to caller
		}

}
