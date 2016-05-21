package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class SprzetController implements Initializable {


	public void initialize(URL location, ResourceBundle resources) {

	}

	@FXML
	private void goToDodawanieSprzetu(ActionEvent event) throws IOException {
		SwitchingStages.goToDodawanieSprzetu(event);
	}


}
