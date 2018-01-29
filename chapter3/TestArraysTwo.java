class TestArraysTwo {

	public static void main(String [] args) {

		int familyAges [] = new int[4];
		familyAges[0] = 50;
		familyAges[1] = 48;
		familyAges[2] = 23;
		familyAges[3] = 22;

		int x = 0;
		System.out.print("Our family ages are: ");
		while(x < 4) {
			System.out.print(familyAges[x]);
			x = x + 1;

			if (x < familyAges.length) {
				System.out.print(", ");
			}
		}

		System.out.println();
	}
}

