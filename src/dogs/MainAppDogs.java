package dogs;

import dogs.controller.IWelcomeController;
import dogs.controller.WelcomeController;

public class MainAppDogs {

	
	public static void main(String[] args) {
		new MainAppDogs();
	}

	public MainAppDogs() {
		this.createControllers();
	}
	
	private void createControllers() {
		IWelcomeController appController = new WelcomeController();
		appController.startApplication();
	}

}
