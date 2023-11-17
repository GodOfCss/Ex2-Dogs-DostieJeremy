package dogs.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import dogs.dto.DogCharacteristics;
import dogs.model.Dog;
import dogs.repository.DogMemoryRepository;
import dogs.repository.IDogRepository;

class DogControllerTest {

	@Test
	void DogControllerCanBeInstantiated() {
		//Act
		IDogRepository dogRepo = new DogMemoryRepository();
		DogController dog = new DogController(dogRepo);
	}

	@Test
	void DogControllerCanAddDog() {
		//Arrange
		SpyDogRepository dogRepo = new SpyDogRepository();
		DogController dogControl = new DogController(dogRepo);
		DogCharacteristics dog = new DogCharacteristics(null,null);
		//Act
		dogControl.addDog(dog);
		//Assert
		assertTrue(dogRepo.isDogAdded);
	}
	
	@Test
	void DogControllerCanReturnAmountOfDogs() {
		//Arrange
		SpyDogRepository dogRepo = new SpyDogRepository();
		DogController dogControl = new DogController(dogRepo);
		//Act
		int expectedAmount = dogControl.getAmountOfDogs();
		//Assert
		assertEquals(expectedAmount,dogRepo.amountOfDogs);
	}
	
	@Test
	void DogControllerCanReturnAllDogCharacteristics() {
		//Arrange
		SpyDogRepository dogRepo = new SpyDogRepository();
		DogController dogControl = new DogController(dogRepo);
		Dog dog = new Dog("hi","hello");
		dogRepo.dogs.add(dog);
		//Act
		List<DogCharacteristics> dogs = dogControl.getDogsCharacteristics();
		//Assert
		assertEquals(dogs.get(0).NAME,"hi");
		assertEquals(dogs.get(0).BREED,"hello");
	}
}
