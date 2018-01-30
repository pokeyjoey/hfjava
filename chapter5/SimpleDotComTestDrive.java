class SimpleDotComTestDrive {

	public static void main(String [] args) {
		// instantiated SimpleDotCom object
		SimpleDotCom dot = new SimpleDotCom();

		// make an int array representing the location of the dot.com
		int[] locations = {2,3,4};

		// invoke the setter method on the dotcom
		dot.setLocationCells(locations);

		// make a fake guess
		String userGuess = "2";

		// invoke the checkYourself method
		String result = dot.checkYourSelf(userGuess);
	}
}
