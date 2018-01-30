class Game {

	public static void main(String [] args) {
		
		// track how many guesses user makes
		int numOfGuesses = 0;

		// Knows how to get input from users
		GameHelper helper = new GameHelper();

		// make a dotcom object
		SimpleDotCom theDotCom = new SimpleDotCom();

		// make a random number for the first cell
		int randomNum = (int) (Math.random() * 5);
		int [] locations = {randomNum, randomNum+1, randomNum+2};

		// Give the dotcom its locations
		theDotCom.setLocationCells(locations);

		// booblean to track whether game is stil lalive
		boolean isAlive = true;

		while (isAlive == true) {
			//get user input
			String guess = helper.getUserInput("enter a number");

			// check the guess
			String result = theDotCom.checkYourSelf(guess);

			// increment number of guesses
			numOfGuesses++;

			// check if its a kill
			if (result.equals("kill")) {
				isAlive = false;
				System.out.println("You took " + numOfGuesses + " guesses");
			}
		}
	}
}
		
