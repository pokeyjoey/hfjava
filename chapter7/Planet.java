public class Planet {

	private String name;
	private int moons;
	private boolean isGasGiant;
	private boolean isRockyPlanet;

	public void setName(String n) {
		name = n;
	}

	public void setMoons(int numOfMoons) {
		moons = numOfMoons;
	}

	public void setIsGasGiant(boolean isGiant) {
		isGasGiant = isGiant;
	}

	public void setIsRockyPlanet(boolean isRocky) {
		isRockyPlanet = isRocky;
	}

	public String getName() {
		return name;
	}

	public int getMoons() {
		return moons;
	}

	public boolean getIsGasGiant() {
		return isGasGiant;
	}

}
