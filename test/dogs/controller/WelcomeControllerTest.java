package dogs.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeControllerTest {

	@Test
	void givenWelcomeController_canAskDogControllerToCreateDogView_ifAsked() {
		//Arrange
		SpyDogController dog = new SpyDogController();
		WelcomeController welcome = new WelcomeController(dog);
		//Act
		welcome.wantToCreateDog();
		//Assert
		assertTrue(dog.isCreated);
	}
	
	@Test
	void givenWelcomeController_canAskDogControllerToListDogView_ifAsked() {
		//Arrange
		SpyDogController dog = new SpyDogController();
		WelcomeController welcome = new WelcomeController(dog);
		//Act
		welcome.wantToListDogs();
		//Assert
		assertTrue(dog.isListed);
	}



}
