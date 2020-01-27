import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class VirtualPetShelter extends VirtualPet {

	Random random = new Random();
	Scanner input = new Scanner(System.in);
	int litter = 0;
	int waste = 0;
	int userChoice = 0;

	int hunger = random.nextInt(100);
	int thirst = random.nextInt(100);
	int boredom = random.nextInt(100);

	int DEFAULT_ATTRIBUTE_HUNGER = random.nextInt(100);
	int DEFAULT_ATTRIBUTE_THIRST = random.nextInt(100);
	int DEFAULT_ATTRIBUTE_BOREDOM = random.nextInt(100);
	int DEFAULT_ATTRIBUTE_RUST = random.nextInt(100);

	int ammount = random.nextInt(100);

	public int getLitter() {
		return litter;
	}

	public void cleanBox(int ammount) {
		litter = 0;
	}

	Map<String, VirtualPet> pets = new HashMap<>();
	private int startingHunger;
	private int startingThirst;
	private int startingBoredom;
	private int startingRust;

	public void addPet(VirtualPet virtualPet) {
		pets.put(virtualPet.getPetName(), virtualPet);
	}

	public Collection<VirtualPet> getAllPets() {
		return pets.values();
	}

	public void removePet(VirtualPet virtualPet) {
		pets.remove(getPetName());
	}

	public int feedAllPets(int ammount) {
		ammount = 60;
		return hunger -= ammount;
	}

	public int waterAllPets(int ammount) {
		return thirst -= ammount;
	}

	public void showAllPets() {
		for (VirtualPet virtualPets : pets.values()) {

			if (virtualPets instanceof VirtualDogs)
				System.out.println(virtualPets.getPetName() + " " + virtualPets.getPetDescription() + " "
						+ DEFAULT_ATTRIBUTE_HUNGER + " " + DEFAULT_ATTRIBUTE_THIRST + " " + DEFAULT_ATTRIBUTE_BOREDOM
						+ " " + waste + " " + healthDog + " " + happinessDog);
			if (virtualPets instanceof VirtualCats)
				System.out.println(virtualPets.getPetName() + " " + virtualPets.getPetDescription() + " "
						+ DEFAULT_ATTRIBUTE_HUNGER + " " + DEFAULT_ATTRIBUTE_THIRST + " " + DEFAULT_ATTRIBUTE_BOREDOM
						+ " " + healthCat + " " + happinessCat);
			if (virtualPets instanceof RobotPet) {
				System.out.println(virtualPets.getPetName() + virtualPets.getPetDescription() + DEFAULT_ATTRIBUTE_RUST);
			}
		}
	}

	public void petBahaviors() {
		int hungerIncrease = random.nextInt(50);
		int thirstIncrease = random.nextInt(30);
		int boredomIncrease = random.nextInt(40);
		int wasteIncrease = random.nextInt(10);
		int litterIncrease = random.nextInt(10);
		int rustIncrease = random.nextInt(20);

		hunger += hungerIncrease;
		thirst += thirstIncrease;
		boredom += boredomIncrease;
		waste += wasteIncrease;
		litter += litterIncrease;
		rust += rustIncrease;
	}

	public void userOptions() {
		if (userChoice == 1) {
			System.out.println("What do you want to do?");
			System.out.println("[1] Feed organic pets");
			System.out.println("[2] oil robot pets");
			userChoice = input.nextInt();
			if (userChoice == 1 && isRobot == false) {
				feedAllPets(ammount);
			}
			if (userChoice == 2 && isRobot == true) {
				oilPet(ammount);
			}
		}
		if (userChoice == 2 && isRobot == false)

		{
			waterAllPets(2);
		}
		if (userChoice == 3 && isRobot == false) {
			System.out.println("Which pet would you like to play with?");
			for (VirtualPet virtualPets : pets.values()) {
				String petChoice = input.next();
				if (petChoice == virtualPets.petName)
					playWithPet(3);
			}
			if (userChoice == 4) {
				walkPets(4);
			}
			if (userChoice == 5) {
				System.out.println("Which space will you be cleaning?");
				System.out.println("[1] Dog cages");
				System.out.println("[2] Litter box");
				{
					if (userChoice == 1) {
						cleanWaste(1);
					}
					if (userChoice == 2) {
						cleanBox(2);
					}
				}
			}
			if (userChoice == 6) {
				System.out.println("What kind of pet are you taking in?");
				System.out.println("[1] A dog");
				System.out.println("[2] A cat");
				System.out.println("[3} A robot");
				if (userChoice == 1 || userChoice == 2 || userChoice == 3) {
					System.out.println("What is the pet's name?");
					petName = input.nextLine();
					System.out.println("What is this pet like?");
					petDescription = input.nextLine();
				}
				if (userChoice == 1 || userChoice == 2) {
					startingHunger = random.nextInt(100);
					startingThirst = random.nextInt(100);
					startingBoredom = random.nextInt(100);
				}
				if (userChoice == 1) {
					waste = 0;
				}
				if (userChoice == 3) {
					startingRust = random.nextInt(100);
				}
			}
			if (userChoice == 7) {
				System.out.println("Which pet is being adopted?");
				removePet(pets.get(petName));
				petName = input.nextLine();
			}
			if (userChoice == 8) {
				System.out.println("Thank you for your help today!");
				System.exit(8);
			}
		}

	}
}
