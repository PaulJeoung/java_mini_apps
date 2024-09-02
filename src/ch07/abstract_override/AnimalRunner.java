package ch07.abstract_override;

public class AnimalRunner {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.breathe();
		dog.sound();
		
		Cat cat = new Cat();
		cat.breathe();
		cat.sound();
		
		animalSound(dog);
		animalSound(cat);

	}
	
	public static void animalSound (Animal animal) {
		animal.sound();
	}

}
