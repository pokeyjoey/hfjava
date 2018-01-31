import java.util.*;

class DotComBust {

	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
	private int numOfGuesses = 0;

	private void setUpGame() {
		// make some dotcoms and give them locations
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom two = new DotCom();
		two.setName("eToys.com");
		DotCom three = new DotCom();
		three.setName("Go2.com");

		// Add the Dotcoms to the ArrayList
		dotComList.add(one);
		dotComList.add(two);
		dotComList.add(three);

		// Display game instructions
		System.out.println("Your goal is to sink three dotcoms.");
		System.out.println("Pets.com, eTyoys.com, Go2.com");
		System.out.println("Try to sink them all in the fewest number of guesses.");

		for (DotCom dotComToSet : dotComList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}

	private void startPlaying() {
		while (!dotComList.isEmpty()) {
			String userGuess = helper.getUserInput("Enter a Guess:");
			checkUserGuess(userGuess);
		}
		finishGame();
	}

	private void checkUserGuess(String userGuess) {

		// increment # of guess user has made
		numOfGuesses++;

		// Assume is a miss
		String result = "miss";

		// check all dotcoms in the list
		for(int x=0; x < dotComList.size(); x++) {
			// ask the dotcom to check the guess
			result = dotComList.get(x).checkYourSelf(userGuess);

			if (result.equals("hit")) {
				break;
			}
			if (result.equals("kill")) {
				dotComList.remove(x);
				break;
			}
		}
		System.out.println(result);
	}

	private void finishGame() {
		System.out.println("All dot coms are de4ad! Your stock  is now worthless.");
		if (numOfGuesses <= 18) {
			System.out.println("It only took you " + numOfGuesses + " guesses");
			System.out.println("You got out before youor options sank.");
		} else {
			System.out.println("Took you long enough. " + numOfGuesses + " guesses.");
			System.out.println("Fish are dancing with your options");
		}
	}

	public static void main(String [] args) {
		// create the game object
		DotComBust game = new DotComBust();

		// set up the game
		game.setUpGame();

		// strat playing
		game.startPlaying();
	}
}
