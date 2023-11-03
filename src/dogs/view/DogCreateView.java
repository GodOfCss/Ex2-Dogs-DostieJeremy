
package dogs.view;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dogs.controller.IDogController;


public class DogCreateView extends JDialog implements IView, ActionListener {
	
	private static final String VIEW_TITLE = "Inscription d'un chien";
	private static final String NAME_LABEL = "Nom:";
	private static final String RACE_LABEL = "Race:";
	private static final String INSCRIPTION_LABEL = "Inscrire";
	private static final String INSCRIPTION_ACTION = "INSCRIPTION";
	
	private static final int PANEL_COLUMNS = 1;
	private static final int PANEL_ROWS = 2;
	

	private JTextField name = new JTextField(15);
	private JTextField breed = new JTextField(20);

	private IDogController controller;


	public DogCreateView(IDogController controller) {
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
		this.setUpInputDataPanel();
		this.setUpActionPanel();		
	}

	private void setUpInputDataPanel() {
		// container interm�diaire JPanel qui contient les �tiquettes (JLabel) et les zones de textes (JTextField)
		JPanel dogCreationPanel = new JPanel();
		this.add(dogCreationPanel, BorderLayout.CENTER);
		// utiliser un GridLayout comme LayoutManager
		dogCreationPanel.setLayout(new GridLayout(PANEL_ROWS, PANEL_COLUMNS));
		//Ajouts des texts fields
		addTextField(dogCreationPanel, NAME_LABEL, this.name);
		addTextField(dogCreationPanel, RACE_LABEL, this.breed);
	}
	
	private void addTextField(JPanel panel, String labelText, JTextField textField) {
		// Pour ajouter successivement une �tiquette et une zone de texte au panel
		JLabel label = new JLabel();
		label.setText(labelText);
		panel.add(label);
		panel.add(textField);
	}

	private void setUpActionPanel() {
		JPanel inscriptionPanel = new JPanel();
		this.add(inscriptionPanel, BorderLayout.SOUTH);
		addButton(inscriptionPanel, INSCRIPTION_LABEL, INSCRIPTION_ACTION);
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
	
	private void createDog() {
		System.out.println("Creation d'un chien");
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// intercepter l'�v�nement sur le bouton Inscrire et appeler la m�thode createDog
		switch(event.getActionCommand()) {
			case INSCRIPTION_ACTION:
				createDog();
				break;
			default:
				break;
		}
	}

}
