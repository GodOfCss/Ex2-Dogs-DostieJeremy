package dogs.controller;

import java.util.ArrayList;
import java.util.List;

import dogs.dto.DogCharacteristics;
import dogs.model.Dog;
import dogs.repository.IDogRepository;

public class SpyDogRepository implements IDogRepository {
	public boolean isDogAdded = false;
	public int amountOfDogs = 0;
	ArrayList<Dog> dogs = new ArrayList<Dog>();
	
	@Override
	public void add(Dog dog) {
		this.isDogAdded = true;
		amountOfDogs++;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return amountOfDogs;
	}

	@Override
	public List<Dog> getList() {
		return dogs;
	}

	@Override
	public Dog searchById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
