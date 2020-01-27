
public class VirtualDog extends VirtualPet implements VirtualDogs {

	int health = (100 - hunger) + (100 - thirst) + (100 - boredom) + (100 - waste);
	private int rust;

	public VirtualDog(String petName, String petDescription, int hunger, int thirst, int boredom, int waste,
			boolean isRobot) {
		this.petName = petName;
		this.petDescription = petDescription;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
		this.waste = waste;
		this.isRobot = isRobot;
	}

	public VirtualDog(String petName, String petDescription, boolean isRobot, int rust) {
		this.petName = petName;
		this.petDescription = petDescription;
		this.isRobot = isRobot;
		this.rust = rust;
	}

	@Override
	public int getWaste() {
		return waste;
	}

	public int getHealth() {
		return health;
	}

	@Override
	public void cleanWaste(int ammount) {
		waste -= ammount;
	}

	@Override
	public void walkPets(int ammount) {
		waste -= ammount;
		boredom -= ammount;
	}

	public int getRust() {
		return rust;
	}

	public void oilPet(int ammount) {
		rust -= ammount;
	}

}
