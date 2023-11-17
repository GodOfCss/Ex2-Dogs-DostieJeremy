package dogs.repository;

import java.util.Collection;
import java.util.List;

import dogs.model.Dog;

public interface IDogRepository {
	void add(Dog dog);
	int size();
	
	List<Dog> getList();
	Dog searchById(int id);
}
