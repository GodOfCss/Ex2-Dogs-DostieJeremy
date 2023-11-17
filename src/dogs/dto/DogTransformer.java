package dogs.dto;

import dogs.model.Dog;

public class DogTransformer {
	public Dog createDogFromCharacteristics(DogCharacteristics dto) {
		return new Dog(dto.NAME, dto.BREED);
	}
	 
	public DogCharacteristics createCharacteristicsFromDog(Dog dog) {
		return new DogCharacteristics(dog.getName(), dog.getBreed());
	}
}
