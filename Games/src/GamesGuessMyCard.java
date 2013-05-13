import java.util.Random;
import java.util.Scanner;


public class GamesGuessMyCard {
	
	//declare and initialize variables
	static int count = 0;
	static int cardValueInt = 0;
	static int cardSuitInt = 0;
	static int userCardValueInt = 0;
	static int userCardSuitInt = 0;
	static String cardValue = null;
	static String cardSuit = null;
	static String userCardValue = null;
	static String userCardSuit = null;
	static String userValue = null;
	static String userSuit = null;
	static Scanner input = new Scanner(System.in);
	
	public static void playGuessMyCard() {
			
			//local declaration and initialize variables
			
			String playAgain = null;
			
			//loop to run guessing game
			do{
			
				generateCard();			//method to generate random card value and suit
				
				System.out.print("You have 4 guesses.\nAce is considered as a low value.\n" +
						"Please Guess Card Value (Ace through King): ");
				userCardValue = input.next();
				
				System.out.println();
				
				checkUserCardValueInput();		//method to check for valid input from user
				
				System.out.print("Please Guess Card Suit (Spades, Hearts, Diamonds, or Clubs): ");
				userCardSuit = input.next();
				
				System.out.println();
				
				checkUserSuitInput();			//method to check valid input from user
				
				convertUserCardValue();			//method to convert user card value input
				
				convertUserCardSuit();			//method to convert user suit input
				
				fourGuesses();					//method for user four guesses
				
				//outputs user response and correct card
				System.out.println("You Guessed the " + userValue + " of " + userSuit + ".");
				System.out.println("The Correct Guess was " + cardValue + " of " + cardSuit + ".");
				count = 0;			//resets counter
				
				
				//to continue playing
				System.out.println("Would you like to play again (Y for Yes, any other key to quit.)?");
				playAgain = input.next();
				
				if(!playAgain.equalsIgnoreCase("Y")){
					System.out.println("Thank You for Playing!");
				}
			
			}while(playAgain.equalsIgnoreCase("Y"));
			
			if(input != null){
				input.close();
			}		
	
		}
	
	/*
	 * Method: generateCard()
	 * Description: Generates a random card value and suit for a standard
	 * 			52 card deck. 
	 * Parameters: none
	 */
	
	public static void generateCard(){
		
		//local variable declaration and initialization
		final int ONE = 1;
		final int THREE = 3;
		final int ELEVEN = 11;
		final int TWELVE = 12;
		final int THIRTEEN = 13;
		
		//generates random card value from 1 to 13
		Random cardValueGenerator = new Random();
		cardValueInt = 1 + cardValueGenerator.nextInt(TWELVE);
		
		//generates random value for suit from 1 to 4
		Random cardSuitGenerator = new Random();
		cardSuitInt = 1 + cardSuitGenerator.nextInt(THREE);
		
		//converts random suit int to card suits and sets card suit variables
		switch (cardSuitInt){
			case 1: cardSuit = "Spades"; break;
			case 2: cardSuit = "Hearts"; break;
			case 3: cardSuit = "Diamonds"; break;
			case 4: cardSuit = "Clubs"; break;	
		}
		
		//converts random card values and sets card value variables
		if(cardValueInt == ONE){
			cardValue = "Ace";
		}
		else if(cardValueInt == ELEVEN){
			cardValue = "Jack";
		}
		else if(cardValueInt == TWELVE){
			cardValue = "Queen";
		}
		else if(cardValueInt == THIRTEEN){
			cardValue = "King";
		}
		else {
			
			cardValue = Integer.toString(cardValueInt);
		}
	}
	
	/*
	 * Method: checkUserCardValueInput()
	 * Description: Checks for valid input of the card value from user
	 * 			and outputs error message if input is invalid. 
	 * Parameters: none
	 */
	
	public static void checkUserCardValueInput(){
		
		//local variable declaration and initialization
		final String TWO = "2";
		final String THREE = "3";
		final String FOUR = "4";
		final String FIVE = "5";
		final String SIX = "6";
		final String SEVEN = "7";
		final String EIGHT = "8";
		final String NINE = "9";
		final String TEN = "10";
		
		//checks for valid input from user
		while(!userCardValue.equalsIgnoreCase("Ace") && !userCardValue.equalsIgnoreCase("Jack") &&
				!userCardValue.equalsIgnoreCase("Queen") && !userCardValue.equalsIgnoreCase("King") &&
				!userCardValue.equals(TWO) && !userCardValue.equals(THREE) && !userCardValue.equals(FOUR) &&
				!userCardValue.equals(FIVE) && !userCardValue.equals(SIX) && !userCardValue.equals(SEVEN) &&
				!userCardValue.equals(EIGHT) && !userCardValue.equals(NINE) && !userCardValue.equals(TEN)){
			System.out.println("Invalid Entry! Please Guess Card Value (Ace through King).");
			userCardValue = input.next();
			System.out.println();
		}
	}
	
	/*
	 * Method: checkUserSuitInput()
	 * Description: Checks for valid input of the card suit value from user
	 * 			and outputs error message if input is invalid. 
	 * Parameters: none
	 */
	
	public static void checkUserSuitInput(){
		while(!userCardSuit.equalsIgnoreCase("Spades") && !userCardSuit.equalsIgnoreCase("Hearts") &&
				!userCardSuit.equalsIgnoreCase("Diamonds") && !userCardSuit.equalsIgnoreCase("Clubs")){
			System.out.println("Invalid Entry! Please Guess Card Suit (Spades, Hearts, Diamonds, or Clubs): ");
			userCardSuit = input.next();
			System.out.println();
		}
	}
	
	/*
	 * Method: convertUserCardValue()
	 * Description: Converts valid user card input from string to int. 
	 * Parameters: none
	 */
	
	public static void convertUserCardValue(){
		
		//local declaration and initialize variables
		final String ACE = "1";
		final String JACK = "11";
		final String QUEEN = "12";
		final String KING = "13";
		
		//converts card value from String to int for future comparison
		if(userCardValue.equalsIgnoreCase("Ace")){
			userValue = "Ace";
			userCardValue = ACE;
			userCardValueInt = Integer.parseInt(userCardValue);
		}
		else if(userCardValue.equalsIgnoreCase("Jack")){
			userValue = "Jack";
			userCardValue = JACK;
			userCardValueInt = Integer.parseInt(userCardValue);
		}
		else if(userCardValue.equalsIgnoreCase("Queen")){
			userValue = "Queen";
			userCardValue = QUEEN;
			userCardValueInt = Integer.parseInt(userCardValue);
		}
		else if(userCardValue.equalsIgnoreCase("King")){
			userValue = "King";
			userCardValue = KING;
			userCardValueInt = Integer.parseInt(userCardValue);
		}
		else{
			userValue = userCardValue;
			userCardValueInt = Integer.parseInt(userCardValue);
		}
	}
	
	/*
	 * Method: convertUserCardSuit()
	 * Description: Converts valid user card suit input from string to int. 
	 * Parameters: none
	 */
	
	public static void convertUserCardSuit(){
		
		//local declaration and initialize variables
		final String SPADES = "1";
		final String HEARTS = "2";
		final String DIAMONDS = "3";
		final String CLUBS = "4";
		
		//converts card suits from String to int for future comparison
		if(userCardSuit.equalsIgnoreCase("Spades")){
			userSuit = "Spades";
			userCardSuit = SPADES;
			userCardSuitInt = Integer.parseInt(userCardSuit);
		}
		else if(userCardSuit.equalsIgnoreCase("Hearts")){
			userSuit = "Hearts";
			userCardSuit = HEARTS;
			userCardSuitInt = Integer.parseInt(userCardSuit);
		}
		else if(userCardSuit.equalsIgnoreCase("Diamonds")){
			userSuit = "Diamonds";
			userCardSuit = DIAMONDS;
			userCardSuitInt = Integer.parseInt(userCardSuit);
		}
		else if(userCardSuit.equalsIgnoreCase("Clubs")){
			userSuit = "Clubs";
			userCardSuit = CLUBS;
			userCardSuitInt = Integer.parseInt(userCardSuit);
		}
	}
	
	
	/*
	 * Method: fourGuesses()
	 * Description: Allows user four guesses and gives them clues. 
	 * Parameters: none
	 */
	
	public static void fourGuesses(){
		
		//local declaration and initialize variables
		int cardMin = 1;
		int cardMax = 13;
		//boolean flag = false;
		final String HIGH = "High";
		final String LOW = "Low";
		
		//loop to allow user 4 guesses
		while((cardValueInt != userCardValueInt || cardSuitInt != userCardSuitInt) && count < 3){	
				if(cardValueInt == userCardValueInt){
					System.out.println("Card Value is Correct, but Suit is Incorrect.\n" +
							"Please Enter New Card Suit: ");
					userCardSuit = input.next();
					System.out.println();
					checkUserSuitInput();			//method to check valid input from user
					convertUserCardSuit();			//method to convert user suit input
					count++;						//counter for guesses
				}
				else if(cardSuitInt == userCardSuitInt){
					if(cardValueInt < userCardValueInt){
						if(userCardValueInt > cardMax){
							cardMax = cardMax;
						}
						else{
							cardMax = userCardValueInt - 1;
						}
	
						System.out.println("Card Suit is Correct, but Value is Incorrect.\n" +
							"Your guess is too " + HIGH + ".\nEnter Value Between " +
								cardMin + " and " + cardMax + ".\nPlease Enter New Card Value: ");
					}
					else if(cardValueInt > userCardValueInt){
						if(userCardValueInt < cardMin){
							cardMin = cardMin;
						}
						else{
							cardMin = userCardValueInt + 1;
						}
		
						System.out.println("Card Suit is Correct, but Value is Incorrect.\n" +
								"Your guess is too " + LOW + ".\nEnter Value Between " +
								cardMin + " and " + cardMax + ".\nPlease Enter New Card Value: ");
					}
					userCardValue = input.next();
					System.out.println();
					checkUserCardValueInput();			//method to check for valid input from user
					convertUserCardValue();				//method to convert user card value input
					count++;							//counter for guesses
				}
				else{
					System.out.println("Both Card Value and Suit are Incorrect");
					if(cardValueInt < userCardValueInt){
						if(userCardValueInt > cardMax){
							cardMax = cardMax;
						}
						else{
							cardMax = userCardValueInt - 1;
						}
	
						System.out.println("Your Card Value Guess is too " + HIGH +
								".\nEnter Value Between " + cardMin + " and " + cardMax + 
								".\nPlease Enter New Card Value: ");
					}
					else if(cardValueInt > userCardValueInt){
						if(userCardValueInt < cardMin){
							cardMin = cardMin;
						}
						else{
							cardMin = userCardValueInt + 1;
						}
	
						System.out.println("Your Card Value Guess is too " + LOW + 
								".\nEnter Value Between " + cardMin + " and " + cardMax + 
								".\nPlease Enter New Card Value: ");
				}
					userCardValue = input.next();
					System.out.println();
					checkUserCardValueInput();			//method to check for valid input from user
					convertUserCardValue();				//method to convert user card value input
					
					System.out.println("Please Enter New Card Suit: ");
					userCardSuit = input.next();
					System.out.println();
					checkUserSuitInput();				//method to check valid input from user
					convertUserCardSuit();				//method to convert user suit input
					count++;							//counter for guesses
			}
		}
	}
}
