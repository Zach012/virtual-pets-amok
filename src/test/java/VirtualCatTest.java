import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VirtualCatTest implements RobotPet {

	VirtualCat underTest = new VirtualCat("Whinnie", "description", 100, 100, 100, true);

	VirtualCat robot = new VirtualCat("name", "description", true, 100);

	@Test
	public void shouldReturnPetName() {
		String check = underTest.getPetName();
		assertEquals(check, "Whinnie");
	}

	@Test
	public void shouldBeAbleToGetPetDescription() {
		String check = underTest.getPetDescription();
		assertEquals(check, "description");
	}

	@Test
	public void shouldBeAbleToFeedPet() {
		int hungerBefore = underTest.getHunger();
		underTest.feedPet(30);
		int hungerAfter = underTest.getHunger();
		assertEquals(hungerBefore - hungerAfter, (30));
	}

	@Test
	public void shouldBeAbleToWaterPet() {
		int thirstBefore = underTest.getThirst();
		underTest.waterPet(30);
		int thirstAfter = underTest.getThirst();
		assertEquals(thirstBefore - thirstAfter, (30));
	}

	@Test
	public void shouldBeAbleToPlayWithPet() {
		int boredomBefore = underTest.getBoredom();
		underTest.playWithPet(30);
		int boredomAfter = underTest.getBoredom();
		assertEquals(boredomBefore - boredomAfter, 30);
	}

	@Test
	public void shouldReturnLitterBox() {
		int litterBefore = underTest.getLitter();
		underTest.cleanBox(30);
		int litterAfter = underTest.getLitter();
		assertEquals(litterBefore - litterAfter, 30);
	}

	@Test
	public void shouldReturnRobot() {
		boolean check = underTest.isRobot();
		assertTrue(check);
	}

	@Test
	public void shouldBeAbleToOil() {
		int rustBefore = robot.getRust();
		robot.oilPet(30);
		int rustAfter = robot.getRust();
		assertEquals(rustBefore - rustAfter, 30);
	}
}
