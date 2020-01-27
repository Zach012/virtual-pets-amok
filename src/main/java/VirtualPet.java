
public abstract class VirtualPet {

	protected String petName;
	protected String petDescription;
	protected int hunger;
	protected int thirst;
	protected int boredom;
	protected int waste;
	protected boolean isRobot;
	protected int rust;

	int litter = 0;
	int healthDog = (100 - hunger) + (100 - thirst) + (100 - boredom) + (100 - waste);
	int happinessDog = (100 - hunger) + (100 - thirst) + (100 - boredom) + (100 - waste) + (healthDog);
	int healthCat = (100 - hunger) + (100 - thirst) + (100 - boredom) + (100 - litter);
	int happinessCat = (100 - hunger) + (100 - thirst) + (100 - boredom) + (100 - litter) + (healthCat);

	public String getPetName() {
		return petName;
	}

	public String getPetDescription() {
		return petDescription;
	}

	public int getHunger() {
		return hunger;
	}

	public int getThirst() {
		return thirst;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getHappinessCat() {
		return happinessCat;
	}

	public int getHappinessDog() {
		return happinessDog;
	}

	public boolean isRobot() {
		return isRobot;
	}

	public void feedPet(int ammount) {
		hunger -= ammount;
	}

	public void waterPet(int ammount) {
		thirst -= ammount;
	}

	public void playWithPet(int ammount) {
		System.out.println("What pet do you want to play with?");
		boredom -= ammount;
	}

	public void walkPets(int ammount) {
		waste -= ammount;
		boredom -= ammount;
	}

	public void cleanWaste(int ammount) {
		waste -= ammount;
	}

	public void cleanBox(int ammount) {
		litter -= ammount;
	}

	public int getRust() {
		return rust;
	}

	public void oilPet(int ammount) {
		rust -= ammount;
	}
}