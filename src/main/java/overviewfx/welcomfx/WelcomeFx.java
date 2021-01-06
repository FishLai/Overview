package overviewfx.welcomfx;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WelcomeFx extends Application {
	private ObservableList<String> test;

	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent fxmlRoot = FXMLLoader.load(getClass().getResource("FxmlWelcome.fxml"));
		
		Scene scene = new Scene(fxmlRoot);
		primaryStage.setTitle("JavaFX Hello World");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public void main(String[] args) {
		launch(args);
	}
}
