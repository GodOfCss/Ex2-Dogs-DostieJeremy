package dogs.controller;

import dogs.view.IView;
import dogs.view.WelcomeView;

public class WelcomeController implements IWelcomeController {
	
	private IDogController dogController;
	
	public WelcomeController(IDogController dogController) {
		this.dogController = dogController;
	}

	public void startApplication() {
		IView welcomeView = new WelcomeView(this);
		welcomeView.display();
	}

	@Override
	public void wantToCreateDog() {
		dogController.goToCreate();
	}

	@Override
	public void wantToListDogs() {
		dogController.goToList();
		
	}
}
