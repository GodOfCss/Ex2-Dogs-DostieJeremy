package dogs.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DogTest {
	
	private static final String ANY_NAME = "Snowcone";
	private static final String ANY_BREED = "Samoyed";
	private static final String NEW_NAME = "Bonhomme";

	@Test
	void canCreateDog(){
		//Act
		Dog dog = new Dog(ANY_NAME, ANY_BREED);
	}
	
	@Test
	void dogCanReturnName(){
		//Arrange
		Dog dog = new Dog(ANY_NAME, ANY_BREED);
		//Act
		String dogName = dog.getName();
		//Assert
		assertEquals(ANY_NAME, dogName);
	}
	
	@Test
	void dogCanReturnBreed(){
		//Arrange
		Dog dog = new Dog(ANY_NAME, ANY_BREED);
		//Act
		String dogBreed = dog.getBreed();
		//Assert
		assertEquals(ANY_BREED, dogBreed);
	}
	
	@Test
	void givenDog_CanSetName(){
		//Arrange
		Dog dog = new Dog(ANY_NAME, ANY_BREED);
		//Act
		dog.setName(NEW_NAME);
		//Assert
		String resultingName = dog.getName();
		assertEquals(NEW_NAME, resultingName);
	}
	
	@Test
	void givenDog_CanSetBreed(){
		//Arrange
		Dog dog = new Dog(ANY_NAME, ANY_BREED);
		//Act
		dog.setBreed(NEW_NAME);
		//Assert
		String resultingBreed = dog.getBreed();
		assertEquals(NEW_NAME, resultingBreed);
	}
	
	@Test
	void givenDog_CanGetId() {
		
	}


}
