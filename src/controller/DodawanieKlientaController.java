package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class DodawanieKlientaController implements Initializable {

	@FXML
	private Button dalejButton;

	@FXML
	private Button dodajTylkoKlientaButton;

	@FXML
	private void dodajTylkoKlienta(ActionEvent event) throws IOException {
		SwitchingStages.goToNaprawy(event);
	}

	@FXML
	private void goToDodawanieSprzetu(ActionEvent event) throws IOException {
		SwitchingStages.goToDodawanieSprzetu(event);
	}

	public void initialize(URL location, ResourceBundle resources) {
		
	}

}
