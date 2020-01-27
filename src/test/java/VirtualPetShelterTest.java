import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;

public class VirtualPetShelterTest {

	VirtualPetShelter virtualPetShelter = new VirtualPetShelter();

	@Test
	public void shouldBeAbleToAddPet() {
		VirtualCat cat = new VirtualCat("name", null, 0, 0, 0, false);
		virtualPetShelter.addPet(cat);
		Collection<VirtualPet> check = virtualPetShelter.getAllPets();
		assertThat(check, (contains(cat)));
	}

	@Test
	public void shouldBeAbleToAddTwoDifferentPets() {
		VirtualCat cat = new VirtualCat("1", null, 0, 0, 0, false);
		VirtualDog dog = new VirtualDog("2", null, 0, 0, 0, 0, false);
		virtualPetShelter.addPet(cat);
		virtualPetShelter.addPet(dog);
		Collection<VirtualPet> check = virtualPetShelter.getAllPets();
		assertThat(check, containsInAnyOrder(cat, dog));
	}

	@Test
	public void shouldBeAbleToRemovePet() {
		VirtualCat cat = new VirtualCat(null, null, 0, 0, 0, false);
		virtualPetShelter.addPet(cat);
		virtualPetShelter.removePet(cat);
		virtualPetShelter.getAllPets();
		assertTrue(virtualPetShelter.pets.isEmpty());
	}

	@Test
	public void shouldFeedAllPets() {
		new VirtualCat("1", null, 0, 0, 0, false);
		new VirtualDog("2", null, 0, 0, 0, 0, false);
		virtualPetShelter.getAllPets();
		int hungerBefore = virtualPetShelter.getHunger();
		virtualPetShelter.feedAllPets(30);
		int hungerAfter = virtualPetShelter.getHunger();
		assertEquals(hungerBefore - hungerAfter, 30);
	}
	@Test
	public void shouldWaterAllPets() {
		new VirtualCat("1", null, 0, 0, 0, false);
		new VirtualDog("2", null, 0, 0, 0, 0, false);
		virtualPetShelter.getAllPets();
		int thirstBefore = virtualPetShelter.getThirst();
		virtualPetShelter.waterAllPets(30);
		int thirstAfter = virtualPetShelter.getThirst();
		assertEquals(thirstBefore - thirstAfter, 30);
	}
}
