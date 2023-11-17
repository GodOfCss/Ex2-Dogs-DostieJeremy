package dogs.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import dogs.model.Dog;

class DogMemoryRepositoryTest {
	
	private static final String ANY_NAME = "Snowcone";
	private static final String ANY_BREED = "Samoyed";

	@Test
	void DogMemoryRepositoryCanBeCreated() {
		//Act
		new DogMemoryRepository();
	}
	
	@Test
	void GivenDogMemoryRepositoryCanAddDog() {
		//Arrange
		DogMemoryRepository dogs = new DogMemoryRepository();
		Dog dog = new Dog(ANY_NAME, ANY_BREED);
		//Act
		dogs.add(dog);
		//Assert
		assertEquals(dogs.searchById(DogMemoryRepository.FIRST_DOG_ID), dog);
		
	}
	
	@Test
	void GivenDogMemoryRepositoryCanReturnAllDogs() {
		//Arrange
		DogMemoryRepository dogs = new DogMemoryRepository();
		Dog dog = new Dog(ANY_NAME, ANY_BREED);
		Dog dog2 = new Dog(ANY_NAME, ANY_BREED);
		dogs.add(dog);
		dogs.add(dog2);
		//Act
		List<Dog> dogList = dogs.getList();
		//Assert
		assertEquals(dogList.get(0).getId(), dog.getId());
		assertEquals(dogList.get(1).getId(), dog2.getId());
		
	}

	@Test
	void GivenDogMemoryRepositoryCanReturnAmountOfDogs() {
		//Arrange
		DogMemoryRepository dogs = new DogMemoryRepository();
		Dog dog = new Dog(ANY_NAME, ANY_BREED);
		Dog dog2 = new Dog(ANY_NAME, ANY_BREED);
		dogs.add(dog);
		dogs.add(dog2);
		//Act
		int amountOfDogs = dogs.size();
		//Assert
		int expectedSize = 2;
		assertEquals(expectedSize, amountOfDogs);
		
	}

}
