package dogs.controller;

import java.util.List;

import dogs.dto.DogCharacteristics;

public class SpyDogController implements IDogController{
	
	public boolean isCreated = false;
	public boolean isListed = false;
	@Override
	public void goToCreate() {
		this.isCreated = true;
		
	}

	@Override
	public void addDog(DogCharacteristics dogCharacteristics) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getAmountOfDogs() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<DogCharacteristics> getDogsCharacteristics() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void goToList() {
		isListed = true;
		
	}

}
