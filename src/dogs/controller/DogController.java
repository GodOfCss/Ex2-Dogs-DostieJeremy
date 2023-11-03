package dogs.controller;

import dogs.view.DogCreateView;

public class DogController implements IDogController {

	public DogController() {
		
	}
	
	@Override
	public void goToCreate() {
		DogCreateView createDogView = new DogCreateView(this);
		createDogView.display();
	}

}
