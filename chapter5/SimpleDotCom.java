public class SimpleDotCom {

	int[] locationCells;
	int numOfHits = 0;

	public void setLocationCells(int[] locs) {
		locationCells = locs;
	}

	public String checkYourSelf(String stringGuess) {

		// convert the string to an int
		int guess = Integer.parseInt(stringGuess);

		// variable to hold result returned
		String result = "miss";

		// loop through locationCells array looking for a hit.
		for (int cell: locationCells) {

			// compare user guess to this cell element
			// - get oout of loop if have a hit
			if (guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}
		}

		// check to see if all hits have been registered
		if (numOfHits == locationCells.length) {
			result = "kill";
		}

		// display result for the user
		System.out.println(result);
		
		return result;
	}
}
