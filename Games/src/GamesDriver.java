import java.util.Scanner;
public class GamesDriver {

	public static void main(String[] args) {
		
		//local variables
		int userGameChoice = 0;
		Boolean stillPlaying = true;
		Scanner input = new Scanner(System.in);
		do{
			System.out.println("Please Choose a Game from Games List:\n1. Guess My Card\n2. Tic Tac Toe Game\n3. Quit Games");
			
			while(!input.hasNextInt()){						//check input for int, enter if non int input
				input.next();
				System.out.println("Please Enter a Valid Game Choice (1 to 3): ");
				input.nextLine();
			}
			
			userGameChoice = input.nextInt();
			
			while(userGameChoice <= 0 || userGameChoice > 3){			//enter if out of bounds int
				try{										//used to catch user user input runtime error	
					System.out.println("Please Enter a Valid Game Choice (1 to 3): ");
					input.nextLine();
					userGameChoice = input.nextInt();
				}
				catch(RuntimeException exception){				//runtime error output
					
					System.out.println("Invalid Input! ");
				}
			}
			
			//choose a game or exit
			switch(userGameChoice){
				case 1: GamesGuessMyCard.playGuessMyCard(); break;
				case 2: TicTacToe.TicTacToeGame(); break;
				case 3: stillPlaying = false; break;
			}
		}while(stillPlaying == true);
		
		System.out.println("See ya!");
		
		System.exit(0);
	}

}
