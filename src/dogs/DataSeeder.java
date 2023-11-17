package dogs;

import java.util.Random;

import dogs.model.Dog;
import dogs.repository.IDogRepository;

public class DataSeeder {
	
	private static final String[] names = {"Caramel", "Jasper", "Chocolat", "Whiskey", "Luna", "Maya"};
	private static final String[] race = {"Chihuahua", "YorkShire", "Great Dane", "Belgian Shepherd", "German Shepard", "Golden Retriever"};
	
	public DataSeeder() {
		
	}
	
	public void createDogList(IDogRepository dogs, int amount) {
		Random rand = new Random();
		for(int i = 0; i < amount; i++) {
			int random = rand.nextInt(names.length);
			int random2 = rand.nextInt(race.length);
			Dog dog = new Dog(names[random], race[random2]);
			dogs.add(dog);
		}
	}
}
