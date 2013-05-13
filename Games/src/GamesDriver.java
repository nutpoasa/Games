import java.util.Scanner;
public class GamesDriver {

	public static void main(String[] args) {
		
		int userGameChoice = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Choose a Game from Games List:\n1. Guess My Card");
		userGameChoice = input.nextInt();
		
		switch(userGameChoice){
		case 1: GamesGuessMyCard.playGuessMyCard(); break;
		}

	}

}
