public class PlanetTestDriver {

	public static void main(String [] args) {

		Planet one = new Planet();
		one.setName("Mars");
		one.setMoons(2);

		//Planet two = new GasGiant();
		GasGiant two = new GasGiant();
		two.setName("Jupiter");
		two.setMoons(69);
		two.setIsGasGiant(true);
		two.setGiantPlanetProperty("Europa Air can get you there !!");

		System.out.println("Name: " + one.getName());
		System.out.println("Moons: " + one.getMoons());

		System.out.println("Name: " + two.getName());
		System.out.println("Moons: " + two.getMoons());
		System.out.println("isGasGiant: " + two.getIsGasGiant());
	}
}
