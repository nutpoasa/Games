/*
 * Program: Tic Tac Toe Game
 * Author: Sharon Davis
 * Date: 5/08/2013
 * Description: CS161 Lab 6
 * 		This program will plays a tic tac toe game.
 * Inputs: User chooses a square.
 * Outputs: Prompts for user to choose a square, error messages if user input is invalid and
 * 		uses GUI for board display and play. 
 */


import java.util.Scanner;

public class TicTacToe {

	public static void TicTacToeGame(){
		
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
				
				TicTacToeBoard.currentBoardCount = 0;						//reset counter
				TicTacToeHelper.playerSymbolCount = 1;						//resets counter for TicTacToeHelper.playerSymbol()
				TicTacToeHelper.winner = "0";					//reset winner variable in TicTacToeHelper.playGame() for new game
			}		
			
		}while(playAgain.equalsIgnoreCase("Y"));
		
		
		TicTacToeHelper.frame.setVisible(false);				//close window, end game
	}
}
