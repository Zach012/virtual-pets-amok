
public class VirtualCat extends VirtualPet implements VirtualCats {

	private boolean isRobot;
	private int rust;

	public VirtualCat(String petName, String petDescription, int hunger, int thirst, int boredom, boolean isRobot) {
		this.petName = petName;
		this.petDescription = petDescription;
		this.isRobot = isRobot;
	}

	public VirtualCat(String petName, String petDescription, boolean isRobot, int rust) {
		this.petName = petName;
		this.petDescription = petDescription;
		this.isRobot = isRobot;
		this.rust = rust;
	}

	public boolean isRobot() {
		return isRobot;
	}

	public int getRust() {
		return rust;
	}

	public void oilPet(int ammount) {
		rust -= ammount;
	}

	@Override
	public int getLitter() {
		// TODO Auto-generated method stub
		return 0;
	}

}
