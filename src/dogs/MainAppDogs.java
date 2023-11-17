package dogs;

import dogs.controller.DogController;
import dogs.controller.IDogController;
import dogs.controller.IWelcomeController;
import dogs.controller.WelcomeController;
import dogs.repository.DogMemoryRepository;
import dogs.repository.IDogRepository;

public class MainAppDogs {

	
	public static void main(String[] args) {
		new MainAppDogs();
	}

	public MainAppDogs() {
		this.createControllers();
	}
	
	private void createControllers() {
		IDogRepository dogs = new DogMemoryRepository();
		DataSeeder data = new DataSeeder();
		data.createDogList(dogs, 5);
		
		IDogController dogController = new DogController(dogs);
		IWelcomeController appController = new WelcomeController(dogController);
		
		
		appController.startApplication();
	}

}
