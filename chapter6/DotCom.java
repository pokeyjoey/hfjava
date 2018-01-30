import java.util.ArrayList;

public class DotCom {

	private ArrayList<String> locationCells;
	int numOfHits = 0;

	public void setLocationCells(ArrayList<String> locs) {
		locationCells = locs;
	}

	public String checkYourSelf(String userInput) {

		// variable to hold result returned
		String result = "miss";

		// test if guess is in ArrayList
		int index = locationCells.indexOf(userInput);

		// if index greater than zero, guess is in the list
		if (index >= 0) {
			locationCells.remove(index);

			if (locationCells.isEmpty()) {
				result = "kill";
			} else {
				result = "hit";
			}
		}

		return result;
	}
}
