package dogs.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dogs.model.Dog;

public class DogMemoryRepository implements IDogRepository {
	public static final int FIRST_DOG_ID = 1;
	public static final int ID_INCREMENT_VALUE = 1;
	
	private Map<Integer, Dog> dogs;
	private int nextId = FIRST_DOG_ID;
	
	
	public DogMemoryRepository() {
		this.dogs = new HashMap<Integer, Dog>();
	}
	
	@Override
	public void add(Dog dog) {
		dogs.put(nextId, dog);
		dog.setId(nextId);
		updateId();
	}

	@Override
	public int size() {
		return dogs.size();
	}

	@Override
	public List<Dog> getList() {
		List<Dog> dogList = new ArrayList<Dog>();
		for(Map.Entry<Integer, Dog> entries : dogs.entrySet()) {
			dogList.add(entries.getValue());
		}
		
		return dogList;
	}

	@Override
	public Dog searchById(int id) {
		return dogs.get(id);
	}
	
	private void updateId() {
		nextId += ID_INCREMENT_VALUE;
	}

}
