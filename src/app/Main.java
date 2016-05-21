package app;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	public static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("SerwisKomputerowyTest");
	public static EntityManager entityManager = entityManagerFactory.createEntityManager();
	//entityManager.close();
	//entityManagerFactory.close();


	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent parent = FXMLLoader.load(getClass().getResource("/view/Logowanie.fxml"));
		Scene scene = new Scene(parent);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Serwis Komputerowy v1.0");
		primaryStage.show();

	}
}
