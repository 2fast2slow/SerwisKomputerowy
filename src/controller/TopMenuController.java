package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import app.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class TopMenuController implements Initializable {

	@FXML
	private AnchorPane mainContent;

	@FXML
	private Button naprawyButton;

	@FXML
	private Button klienciButton;

	@FXML
	private Button sprzetButton;

	@FXML
	private Button wylogujButton;

	@FXML
	private Button zakonczButton;

	@FXML
	private void goToNaprawy(ActionEvent event) throws IOException {
		SwitchingStages.goToNaprawy(event);
	}

	@FXML
	private void goToKlienci(ActionEvent event) throws IOException {
		SwitchingStages.goToKlienci(event);
	}

	@FXML
	private void goToSprzet(ActionEvent event) throws IOException {
		SwitchingStages.goToSprzet(event);

	}

	@FXML
	private void goToLogowanie(ActionEvent event) throws IOException {
		SwitchingStages.goToLogowanie(event);
	}

	@FXML
	private void zamknijProgram(ActionEvent event) throws IOException {
		System.out.println("Naci�ni�to przycisk zamknij");
		Main.entityManager.close();
		Main.entityManagerFactory.close();

	}

	
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

}
