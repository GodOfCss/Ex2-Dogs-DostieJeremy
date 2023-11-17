
package dogs.view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dogs.controller.IDogController;
import dogs.dto.DogCharacteristics;


public class DogListView extends JDialog implements IView, ActionListener {
	
	private static final String VIEW_TITLE = "Listes des chiens";
	private static final String NAME_LABEL = "NOM";
	private static final String RACE_LABEL = "RACE";
	private static final String ID_LABEL = "ID";
	
	private static final String CLOSE_ACTION = "Close list tab";


	private IDogController controller;


	public DogListView(IDogController controller) {
		super();
		
		this.controller = controller;
		
		this.initialize();
		this.setUpComponents();
		this.pack();
	}

	@Override
	public void display() {
		this.setVisible(true);
	}
	
	private void initialize() {
		this.setTitle(VIEW_TITLE);		
		this.setModalityType(DEFAULT_MODALITY_TYPE);
	}

	private void setUpComponents() {
		this.setUpListPanel();
		this.setUpButtonPanel();		
	}

	private void setUpListPanel() {
		// container interm�diaire JPanel qui contient les �tiquettes (JLabel) et les zones de textes (JTextField)
		JPanel dogListPanel = new JPanel();
		this.add(dogListPanel, BorderLayout.CENTER);

		// utiliser un GridLayout comme LayoutManager
		int amountOfDogs = controller.getAmountOfDogs();
		dogListPanel.setLayout(new GridLayout(amountOfDogs,2));
		
		addTextField(dogListPanel, ID_LABEL);
		addTextField(dogListPanel, NAME_LABEL);
		addTextField(dogListPanel, RACE_LABEL);
		
		List<DogCharacteristics> dogs = controller.getDogsCharacteristics();
		
		for(DogCharacteristics dog : dogs) {
			
			addTextField(dogListPanel, ID_LABEL);
			addTextField(dogListPanel, dog.NAME);
			addTextField(dogListPanel, dog.BREED);
		}
	}
	
	private void setUpButtonPanel() {
		JPanel buttonPanel = new JPanel();
		this.add(buttonPanel, BorderLayout.SOUTH);
		
		addButton(buttonPanel, "OK", CLOSE_ACTION);
	}
	
	private void addTextField(JPanel panel, String labelText) {
		// Pour ajouter successivement une �tiquette et une zone de texte au panel
		JLabel label = new JLabel();
		label.setText(labelText);
		panel.add(label);
	}

	// m�me m�thode que dans WelcomeView
	// DRY -> m�thode utilitaire � extraire dans une classe utilitaire util.view.ViewUtil 
	private void addButton(JPanel actionPanel, String buttonText, String buttonAction) {   
		// Pour ajouter un bouton au panel	
		JButton button = new JButton();
		button.setText(buttonText);
		button.setActionCommand(buttonAction);
		button.addActionListener(this);
		actionPanel.add(button);
	}
	
	private void close() {
		this.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// intercepter l'�v�nement sur le bouton Inscrire et appeler la m�thode createDog
		switch(event.getActionCommand()) {
			case CLOSE_ACTION:
				close();
				break;
			default:
				break;
		}
	}

}
