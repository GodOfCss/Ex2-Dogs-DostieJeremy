package dogs.controller;

import java.util.List;

import dogs.dto.DogCharacteristics;
import dogs.model.Dog;

public interface IDogController {
	void goToCreate();
	void addDog(DogCharacteristics dogCharacteristics);
	int getAmountOfDogs();
	List<DogCharacteristics> getDogsCharacteristics();
	void goToList();

}
