package dogs.dto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dogs.model.Dog;

class DogTransformerTest {

	private static final String ANY_NAME = "Snowcone";
	private static final String ANY_BREED = "Samoyed";
	
	@Test
	void DogTransformerCanTransformDogToDTO() {
		//Arrange
		DogTransformer dogTransform = new DogTransformer();
		Dog dog = new Dog(ANY_NAME, ANY_BREED);
		//Act
		DogCharacteristics dto = dogTransform.createCharacteristicsFromDog(dog);
		//Assert
		assertEquals(dog.getName(), dto.NAME);
		assertEquals(dog.getBreed(), dto.BREED);
	}
	
	@Test
	void DogTransformerCanTransformDTOToDog() {
		//Arrange
		DogTransformer dogTransform = new DogTransformer();
		DogCharacteristics dto = new DogCharacteristics(ANY_NAME, ANY_BREED);
		//Act
		Dog dog = dogTransform.createDogFromCharacteristics(dto);
		//Assert
		assertEquals(dto.NAME, dog.getName());
		assertEquals(dto.BREED, dog.getBreed());
	}

}
