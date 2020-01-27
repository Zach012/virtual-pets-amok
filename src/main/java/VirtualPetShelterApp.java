import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		VirtualPetShelter myVirtualPetShelter = new VirtualPetShelter();
		Scanner input = new Scanner(System.in);

		VirtualCat cat = new VirtualCat("Whinnie", "Oldest of three. Definately a witch.", myVirtualPetShelter.hunger,
				myVirtualPetShelter.thirst, myVirtualPetShelter.boredom, false);
		VirtualDog dog = new VirtualDog("Indiana", "Namesake of a famous archeologist.", myVirtualPetShelter.hunger,
				myVirtualPetShelter.thirst, myVirtualPetShelter.boredom, myVirtualPetShelter.waste, false);
		VirtualCat robot = new VirtualCat("#18", "A little cold on the surface.", true, myVirtualPetShelter.rust);

		myVirtualPetShelter.addPet(cat);
		myVirtualPetShelter.addPet(dog);
		myVirtualPetShelter.addPet(robot);

		System.out.println("Thank you for volunteering");

		for (int tick = 0; tick < 100; tick++) {

			myVirtualPetShelter.showAllPets();

			System.out.println("Litterbox: " + myVirtualPetShelter.litter);
			System.out.println("What would you like to do?");
			System.out.println("[1] Feed/oil pets");
			System.out.println("[2] Water pets");
			System.out.println("[3] Play with a pet");
			System.out.println("[4] Walk the dogs");
			System.out.println("[5] Clean pet space");
			System.out.println("[6] Intake a pet");
			System.out.println("[7] Adopt a pet");
			System.out.println("[8] Quit");

			myVirtualPetShelter.petBahaviors();

			myVirtualPetShelter.userChoice = input.nextInt();
			myVirtualPetShelter.userOptions();

		}
		System.out.println("Thank you for your hard work. Come back tomorrow.");
		input.close();
	}

}
