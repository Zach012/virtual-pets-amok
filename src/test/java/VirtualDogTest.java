import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VirtualDogTest {

	VirtualDog underTest = new VirtualDog("Brutus", "description", 100, 100, 100, 100, true);
	VirtualDog robot = new VirtualDog("name", "description", true, 0);

	@Test
	public void shouldReturnPetName() {
		String check = underTest.getPetName();
		assertEquals(check, "Brutus");
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
	public void shouldBeAbleToGetWaste() {
		int wasteBefore = underTest.getWaste();
		underTest.cleanWaste(30);
		int wasteAfter = underTest.getWaste();
		assertEquals(wasteBefore - wasteAfter, (30));
	}

	@Test
	public void shouldReturnHealth() {
		underTest.getHealth();
		int check = underTest.getHealth();
		assertEquals(check, 400);
	}

	@Test
	public void shouldBeAbleToWalkDogs() {
		int wasteBefore = underTest.getWaste();
		int boredomBefore = underTest.getBoredom();
		underTest.walkPets(30);
		int wasteAfter = underTest.getWaste();
		int boredomAfter = underTest.getBoredom();

		assertEquals(wasteBefore - wasteAfter, (30));
		assertEquals(boredomBefore - boredomAfter, (30));
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
