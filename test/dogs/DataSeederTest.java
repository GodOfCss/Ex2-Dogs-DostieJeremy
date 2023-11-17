package dogs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dogs.controller.SpyDogRepository;

class DataSeederTest {

	@Test
	void givenDataSeeder_canCreateDogList_whenAsked() {
		//Arrange
		SpyDogRepository spy = new SpyDogRepository();
		DataSeeder data = new DataSeeder();
		//Act
		data.createDogList(spy, 3);
		//Assert
		assertEquals(spy.amountOfDogs, 3);
		
		
	}

}
