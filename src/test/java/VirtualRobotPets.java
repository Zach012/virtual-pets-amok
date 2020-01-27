
public class VirtualRobotPets {

	protected int rust;
	protected boolean isRobot;

	public VirtualRobotPets() {
		super();
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

}