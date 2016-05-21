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

public class DodawanieSprzetuController implements Initializable {

	@FXML
	private Button dodajTylkoSprzetButton;

	@FXML
	private Button wyszukajSprzetButton;

	@FXML
	private Button dalejButton;

	@FXML
	private void goToDodawanieNaprawy(ActionEvent event) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource("/view/DodawanieNaprawy.fxml"));
		Scene scene = new Scene(parent);
		Stage stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	private void wyszukajSprzet(ActionEvent event) throws IOException {
		SwitchingStages.goToSprzet(event);
	}

	@FXML
	private void dodajTylkoSprzet(ActionEvent event) throws IOException {
		SwitchingStages.goToNaprawy(event);
	}

	
	public void initialize(URL location, ResourceBundle resources) {

	}

}
