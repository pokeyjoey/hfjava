import java.utils.*;

class DotComBust {

	private GameHelper helper = new GameHelper();
	private ArrayList<DotCom> dotComList = new ArrayList<DotCom>;
	private int numOfGuesses = 0;

	private void setUpGame() {
		// make some dotcoms and give them locations
		DotCom one = new DotCom();
		one.setName("Pets.com");
		DotCom Two = new DotCom();
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

		for (Dotcom dotComToSet : dotComList) {
			ArrayList<String> newLocation = helper.placeDotCom(3);
			dotComToSet.setLocationCells(newLocation);
		}
	}

	private void stratPlaying() {
		while (!dotComList.isEmpty()) {
			String userGuess = helper.getUserInput("Enter a Guess:");
			checkUserGuess(userGuess);
		}
		finishGame();
	}
}
