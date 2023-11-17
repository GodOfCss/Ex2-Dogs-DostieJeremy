package dogs.controller;

import java.util.ArrayList;
import java.util.List;

import dogs.dto.DogCharacteristics;
import dogs.dto.DogTransformer;
import dogs.model.Dog;
import dogs.repository.IDogRepository;
import dogs.view.DogCreateView;
import dogs.view.DogListView;

public class DogController implements IDogController {
	
	private IDogRepository dogRepository;
	private DogTransformer dogTransformer;
	
	public DogController(IDogRepository dogs) {
		this.dogRepository = dogs;
		this.dogTransformer = new DogTransformer();
	}
	
	@Override
	public void goToCreate() {
		DogCreateView createDogView = new DogCreateView(this);
		createDogView.display();
	}
	
	@Override
	public void goToList() {
		DogListView listDogView = new DogListView(this);
		listDogView.display();
	}

	@Override
	public void addDog(DogCharacteristics dto) {
		Dog dog = dogTransformer.createDogFromCharacteristics(dto);
		
		dogRepository.add(dog);
	}
	
	@Override
	public int getAmountOfDogs() {
		return dogRepository.size();
	}

	@Override
	public List<DogCharacteristics> getDogsCharacteristics() {
		List<DogCharacteristics> dogs = new ArrayList<DogCharacteristics>();
		
		for(Dog dog : dogRepository.getList()) {
			dogs.add(dogTransformer.createCharacteristicsFromDog(dog));
		}
		return dogs;
	}
	

	


}
