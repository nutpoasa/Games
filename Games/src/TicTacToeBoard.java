import java.util.Scanner;


/*
 * Program: Tic Tac Toe Game Class Board
 * Author: Sharon Davis
 * Date: 5/08/2013
 * Description: CS161 Lab 6
 * 		This class determines if a win has occurred.
 * Inputs: none
 * Outputs: @returns String if win occurs
 * 			@returns title 
 */

public class TicTacToeBoard {
		//global variables
		public Boolean currentBoardCount = false;
		private String title = "\nTic Tac Toe Game\n";
		private String[] boardProgress = new String[9];
			
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
		
		public void play(){
			
			//local variables
			String playAgain = null;
			Scanner input = new Scanner(System.in);
			
			do{
				TicTacToeHelper.updateBoard();			//method to draw board
			
				TicTacToeHelper.playGame();				//method to play game
				
				//to continue playing
				System.out.println("\nWould you like to play again (Y for Yes, any other key to quit.)?");
				playAgain = input.next();
				
				if(!playAgain.equalsIgnoreCase("Y")){					//not play again
					System.out.println("\nThank You for Playing!\n");
				}
				else{
					for(int i = 1; i < 10; i++){
						TicTacToeComponent.setUserChoice(Integer.toString(i), i);		//resets board for next game
					}
					
					currentBoardCount = false;						//reset counter
					TicTacToeHelper.playerSymbolCount = 1;						//resets counter for TicTacToeHelper.playerSymbol()
					TicTacToeHelper.winner = "0";					//reset winner variable in TicTacToeHelper.playGame() for new game
				}		
				
			}while(playAgain.equalsIgnoreCase("Y"));
			
			
			TicTacToeHelper.frame.setVisible(false);				//close window, end game
		}
		
		public String currentBoard(String boardSymbol, int boardSquare){
			
			//local variables
			String winYet = "0";
			
			//initializes boardProgress array, first time in
			if(currentBoardCount == false){
				for(int i = 0; i < 9; i++){
					boardProgress[i] = " ";
				}
				currentBoardCount = true;			//used to stop unwanted re-initialization
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
