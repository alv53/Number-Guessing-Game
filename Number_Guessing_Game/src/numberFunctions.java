
public class numberFunctions {
	//This function will calculate the player's score after they complete the game
	public static int calcScore(int time, int guesses){
		return (100*time)/guesses;
	}
	//This function generates a random number with unique digits, and cannot start with 0
	public static String generateNumber(int digits){
		return "1234";
	}
	public static boolean checkGuess(String guess, String answer){
		return true;
	}
}
